package com.planner.planner.participant;

import java.util.UUID;

import org.hibernate.annotations.ManyToAny;

import com.planner.planner.trip.Trip;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "participants")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "is_confirmed", nullable = false)
    private Boolean isConfirmed;

    @Column(name = "participant_name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @ManyToAny
    @JoinColumn(name = "trip_id", nullable = false)
    private Trip tip;
}
