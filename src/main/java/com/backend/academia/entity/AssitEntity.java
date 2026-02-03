package com.backend.academia.entity;

import com.backend.academia.aggregates.enums.AssitsState;
import com.backend.academia.aggregates.enums.AssitsType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "assits")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AssitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "registration_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_registration")
    )
    private RegistrationEntity registratioId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AssitsType type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AssitsState state;

    /*@CreationTimestamp*/
    private LocalDateTime createdAt;
}
