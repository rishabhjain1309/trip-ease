package com.myProject.tripease.model;

import com.myProject.tripease.Enum.Gender;
import com.myProject.tripease.model.Booking;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String name;
    private int age;

    @Column(unique = true, nullable = false)
    private String emailId;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(cascade = CascadeType.ALL )
            @JoinColumn(name = "customer_id")
    List<Booking> bookings = new ArrayList<>();
}
