package com.booking.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    private Integer id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String emailId;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Booking> booking;
    
}
