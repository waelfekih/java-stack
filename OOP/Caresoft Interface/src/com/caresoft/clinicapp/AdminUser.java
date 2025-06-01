package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;

    //Constructor
    public AdminUser(Integer employeeID, String role) {
        this.employeeID = employeeID;
        this.role = role;
        this.id = employeeID; // assign to inherited 'id' from User
        this.securityIncidents = new ArrayList<String>();
    }

    //Implement HIPAACompliantUser
    @Override
    public boolean assignPIN(int pin) {
        if (String.valueOf(pin).length() >= 6) {
            this.pin = pin;
            return true;
        }
        return false;
    }

    //Implement HIPAACompliantUser
    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (this.employeeID.equals(confirmedAuthID)) {
            return true;
        } else {
            this.authIncident();
            return false;
        }
    }

    //Implement HIPAACompliantAdmin
    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return this.securityIncidents;
    }

    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s\nReported By ID: %s\nNotes: %s\n",
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }

    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s\nID: %s\nNotes: AUTHORIZATION ATTEMPT FAILED FOR THIS USER\n",
            new Date(), this.id
        );
        securityIncidents.add(report);
    }

    //Setters & Getters
    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
        this.id = employeeID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<String> getSecurityIncidents() {
        return securityIncidents;
    }

    public void setSecurityIncidents(ArrayList<String> securityIncidents) {
        this.securityIncidents = securityIncidents;
    }
}

