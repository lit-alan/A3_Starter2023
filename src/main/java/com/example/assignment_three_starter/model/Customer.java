package com.example.assignment_three_starter.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "customers")
public class Customer implements Serializable {

    @Id
    @NotNull
    @Column(name = "customer_id")
    private Integer customerId;

    @Size(max = 50)
    @Column(name = "first_name")
    private String firstName;

    @Size(max = 50)
    @Column(name = "last_name")
    private String lastName;

    @Size(max = 255)
    @Column(name = "email")

    private String email;

    @Size(max = 20)
    @Column(name = "phone")
    private String phone;

    @Size(max = 255)
    @Column(name = "address")
    private String address;

    @Size(max = 50)
    @Column(name = "city")
    private String city;

    @Size(max = 50)
    @Column(name = "country")
    private String country;

    @Size(max = 10)
    @Column(name = "postcode")
    private String postcode;

}
