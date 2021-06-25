package com.example.gym.model;

import javax.persistence.*;

@Entity
@Table(name="greetings")
public class Greetings {

    // Fields
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column
    private String adminGreeting;

    @Column
    private String userGreeting;

    // Constructor
    public Greetings() {};

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdminGreeting() {
        return adminGreeting;
    }

    public void setAdminGreeting(String adminGreeting) {
        this.adminGreeting = adminGreeting;
    }

    public String getUserGreeting() {
        return userGreeting;
    }

    public void setUserGreeting(String userGreeting) {
        this.userGreeting = userGreeting;
    }
}