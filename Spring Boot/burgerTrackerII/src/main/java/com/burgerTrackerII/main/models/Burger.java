package com.burgerTrackerII.main.models;

import java.util.Date;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity

public class Burger {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 @NotNull(message = "Burger Name is required")
	 @Size(min = 3, max = 200, message = "Burger Name must be between 3 and 200 characters")
	 private String burgerName;

	 @NotNull(message = "Restaurant Name is required")
	 @Size(min = 3, max = 200, message = "Restaurant Name must be between 3 and 200 characters")
	 private String restaurantName;

	 @NotNull(message = "Rating is required")
	 @Min(value = 0, message = "Rating must be at least 0")
	 @Max(value = 5, message = "Rating must be at must 5")
	 private Integer rating;
	 
	 @NotNull(message = "Notes must not be blank")
	 @Size(min = 3 , message = "Notes must be at least 3 characters length")
	 private String notes;

	 @Column(updatable = false)
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 private Date createdAt;

	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 private Date updatedAt;
	 
	 public Burger() {}

	    public Burger(String burgerName, String restaurantName, Integer rating, String notes) {
	        this.burgerName = burgerName;
	        this.restaurantName = restaurantName;
	        this.rating = rating;
	        this.notes = notes;
	    }

	    @PrePersist
	    protected void onCreate() {
	        this.createdAt = new Date();
	    }

	    @PreUpdate
	    protected void onUpdate() {
	        this.updatedAt = new Date();
	    }

	    // Getters and setters
	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }

	    public String getBurgerName() { return burgerName; }
	    public void setBurgerName(String burgerName) { this.burgerName = burgerName; }

	    public String getRestaurantName() { return restaurantName; }
	    public void setRestaurantName(String restaurantName) { this.restaurantName = restaurantName; }

	    public Integer getRating() { return rating; }
	    public void setRating(Integer rating) { this.rating = rating; }
	    
	    public String getNotes( ) { return notes; }
	    public void setNotes (String notes) {this.notes = notes;}

	    public Date getCreatedAt() { return createdAt; }
	    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

	    public Date getUpdatedAt() { return updatedAt; }
	    public void setUpdatedAt(Date updatedAt) { this.updatedAt = updatedAt; }
	}