package com.kislap.booking.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String password;
    private String address;
    private String profilePhotoUrl;
    private String createdAt;
    private String status = "active";

    public User () {}

    public Long getUser_id() { return user_id; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getPassword() { return password; }
    public String getAddress() { return address; }
    public String getProfilePhotoUrl() { return profilePhotoUrl; }
    public String getCreatedAt() { return createdAt; }
    public String getStatus() { return status; }

}
