package com.backend.academia.entity;

import com.backend.academia.aggregates.enums.ActivitiesState;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "activities")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ActivityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "course_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_course")
    )
    private CourseEntity courseId;
    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ActivitiesState state;

    private Long maxQualif;
    /*@CreationTimestamp*/
    private LocalDateTime createdAt;
}
