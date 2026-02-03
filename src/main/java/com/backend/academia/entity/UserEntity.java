package com.backend.academia.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 45)
    private String name;
    @Column(nullable = false, length = 45)
    private String lastName;
    @Column(nullable = false, length = 45, unique = true)
    private String email;
    private Boolean emailVerified;
    @Column(nullable = false, length = 50)
    private String password;
    /*@CreationTimestamp*/
    @Column(nullable = false)
    private LocalDateTime createdAt;
}