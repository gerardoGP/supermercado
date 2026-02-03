package com.backend.academia.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rols")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class RolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 45)
    private String name;
}
