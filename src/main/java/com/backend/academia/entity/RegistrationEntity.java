package com.backend.academia.entity;

import com.backend.academia.aggregates.enums.RegistrationRolEnum;
import com.backend.academia.aggregates.enums.StateRegistrations;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "registrations")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class RegistrationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "user_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_user_id")
    )
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "course_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_course_id")
    )
    private CourseEntity course;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RegistrationRolEnum rol;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StateRegistrations state;

    /*@CreationTimestamp*/
    @Column(nullable = false)
    private LocalDateTime created_at;

    /*@UpdateTimestamp*/
    private LocalDateTime updated_at;

}
