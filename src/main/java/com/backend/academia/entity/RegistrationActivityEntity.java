package com.backend.academia.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "registrations_activities")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class RegistrationActivityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "registration_id",
            nullable = false,
            foreignKey = @ForeignKey(name="fk_registrations")
    )
    private RegistrationEntity registrationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "activity_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_activity")
    )
    private ActivityEntity activityId;

    private Long qualitification;
    private Double percentage;
    /*@CreationTimestamp*/
    private LocalDateTime createdAt;

}
