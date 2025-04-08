package com.myProject.tripease.model;

import com.myProject.tripease.Enum.TripStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
    String pickup;
    String destination;
    double tripDistanceInKm;
    TripStatus tripStatus;
    double billAmount;
    @CreationTimestamp
    Date bookedAt;
    @UpdateTimestamp
    Date lastUpdateAt;
}
