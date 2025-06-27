package com.saveTravel.main.models;

import java.util.Date;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.DecimalMin;


@Entity
public class saveTravel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Expense is required")
    @Size(min = 3, max = 200, message = "Expense must be between 3 and 200 characters")
    private String expense;

    @NotNull(message = "Vendor is required")
    @Size(min = 3, max = 200, message = "Vendor must be between 3 and 200 characters")
    private String vendor;

    @NotNull(message = "Amount is required")
    @DecimalMin(value = "0.0", inclusive = true, message = "Amount must be at least 0.0")
    private Double amount; 

    @NotNull(message = "Description must not be blank")
    @Size(min = 3, message = "Description must be at least 3 characters length")
    private String description;

    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    public saveTravel() {}

    public saveTravel(String expense, String vendor, Double amount, String description) {
        this.expense = expense;
        this.vendor = vendor;
        this.amount = amount;
        this.description = description;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getExpense() { return expense; }
    public void setExpense(String expense) { this.expense = expense; }

    public String getVendor() { return vendor; }
    public void setVendor(String vendor) { this.vendor = vendor; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

    public Date getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Date updatedAt) { this.updatedAt = updatedAt; }
}
