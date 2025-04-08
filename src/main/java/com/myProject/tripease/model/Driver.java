package com.myProject.tripease.model;

import com.myProject.tripease.model.Booking;
import com.myProject.tripease.model.Cab;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "driver_info") // for change the table name
@Builder
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;

    @Column(name = "First_Name")    // for change the cols=umn name
    private String name;
    private int age;

    @Column(unique = true, nullable = false)
    private String emailId;

    @OneToMany(cascade =  CascadeType.ALL)
            @JoinColumn(name = "driver_id")
    List<Booking> bookings = new ArrayList<>();

    @OneToOne(cascade =  CascadeType.ALL)
            @JoinColumn(name = "cab_id")
    Cab cab;
}


