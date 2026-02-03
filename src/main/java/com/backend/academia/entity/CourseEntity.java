package com.backend.academia.entity;

import com.backend.academia.aggregates.enums.CourseState;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "courses")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(unique = true, length = 100, nullable = false)
    private String urlSeo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "user_id",
            nullable = false,
            foreignKey = @ForeignKey(name="fk_users")
    )
    private UserEntity userId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CourseState statusCourse;

    /*@CreationTimestamp*/
    private Date createdAt;

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private List<RegistrationEntity> registrations;
}

