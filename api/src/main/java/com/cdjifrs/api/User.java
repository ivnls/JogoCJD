package com.cdjifrs.api;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String institutional_email;

    @Column(nullable = false)
    private String psswd_hash;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstitutional_email() {
        return institutional_email;
    }

    public void setInstitutional_email(String institutional_email) {
        this.institutional_email = institutional_email;
    }

    public String getPsswd_hash() {
        return psswd_hash;
    }

    public void setPsswd_hash(String psswd_hash) {
        this.psswd_hash = psswd_hash;
    }
}

