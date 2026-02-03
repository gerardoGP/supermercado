package com.backend.academia.aggregates.request;

import com.backend.academia.aggregates.enums.CourseState;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CourseRequest {
    @NotBlank(message="El campo TITLE es necesario")
    @NotBlank(message = "El campo TITLE no debe tener espacios en blanco")
    @Size(min=1, max=100, message="El titulo debe de tener entre 1 y 100 caracteres")
    private String titulo;
    
    @NotEmpty(message = "El id de; usuario es obligatorio")
    private Long usuarioId;

    private CourseState estado = CourseState.ACTIVE;
}
