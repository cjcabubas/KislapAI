package com.kislap.booking.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Email;

import java.time.LocalDateTime;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 11, unique = true)
    @Size(min = 11, max = 11, message = "Phone number must be 11 characters.")
    private String phoneNumber;

    @Column(nullable = false, length = 50)
    @Size(min = 8, max = 50, message = "Name cannot be longer than 50 and less than 8.")
    private String password;

    @Column(nullable = false)
    private String address;

    private String profilePhotoUrl;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private String status = "active";

    public User () {}

    public Long getUser_id() { return user_id; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getPassword() { return password; }
    public String getAddress() { return address; }
    public String getProfilePhotoUrl() { return profilePhotoUrl; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public String getStatus() { return status; }

    public void setUser_id(Long user_id) { this.user_id = user_id; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setPassword(String password) { this.password = password; }
    public void setAddress(String address) { this.address = address; }
    public void setProfilePhotoUrl(String profilePhotoUrl) { this.profilePhotoUrl = profilePhotoUrl; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public void setStatus(String status) { this.status = status; }

}
