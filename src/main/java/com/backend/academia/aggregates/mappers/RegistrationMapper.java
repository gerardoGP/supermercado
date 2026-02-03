package com.backend.academia.aggregates.mappers;

import com.backend.academia.aggregates.response.RegistrationResponse;
import com.backend.academia.entity.RegistrationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RegistrationMapper {
    // source = Entidad, target = Response
    @Mapping(source = "user.id", target = "user_id")
    @Mapping(source = "user.name", target = "user_name")
    @Mapping(source = "user.lastName", target = "user_last_name")
    @Mapping(source = "user.email", target = "user_email")
    RegistrationResponse toResponse(RegistrationEntity registrationEntity);
}
