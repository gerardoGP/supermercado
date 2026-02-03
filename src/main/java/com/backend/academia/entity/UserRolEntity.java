package com.backend.academia.entity;

import com.backend.academia.aggregates.enums.UserRolState;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "users_rols")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserRolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "user_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_users_rols")
    )
    private UserEntity userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "rol_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_rols")
    )
    private RolEntity rolId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRolState state;

    /*@CreationTimestamp*/
    private LocalDateTime createdAt;
    /*@UpdateTimestamp*/
    private LocalDateTime updatedAt;
}
