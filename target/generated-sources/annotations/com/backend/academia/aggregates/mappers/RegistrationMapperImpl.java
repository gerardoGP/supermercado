package com.backend.academia.aggregates.mappers;

import com.backend.academia.aggregates.response.RegistrationResponse;
import com.backend.academia.entity.RegistrationEntity;
import com.backend.academia.entity.UserEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-02T11:02:23-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.17 (Eclipse Adoptium)"
)
@Component
public class RegistrationMapperImpl implements RegistrationMapper {

    @Override
    public RegistrationResponse toResponse(RegistrationEntity registrationEntity) {
        if ( registrationEntity == null ) {
            return null;
        }

        RegistrationResponse registrationResponse = new RegistrationResponse();

        registrationResponse.setUser_id( registrationEntityUserId( registrationEntity ) );
        registrationResponse.setUser_name( registrationEntityUserName( registrationEntity ) );
        registrationResponse.setUser_last_name( registrationEntityUserLastName( registrationEntity ) );
        registrationResponse.setUser_email( registrationEntityUserEmail( registrationEntity ) );
        registrationResponse.setRol( registrationEntity.getRol() );

        return registrationResponse;
    }

    private Long registrationEntityUserId(RegistrationEntity registrationEntity) {
        if ( registrationEntity == null ) {
            return null;
        }
        UserEntity user = registrationEntity.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String registrationEntityUserName(RegistrationEntity registrationEntity) {
        if ( registrationEntity == null ) {
            return null;
        }
        UserEntity user = registrationEntity.getUser();
        if ( user == null ) {
            return null;
        }
        String name = user.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String registrationEntityUserLastName(RegistrationEntity registrationEntity) {
        if ( registrationEntity == null ) {
            return null;
        }
        UserEntity user = registrationEntity.getUser();
        if ( user == null ) {
            return null;
        }
        String lastName = user.getLastName();
        if ( lastName == null ) {
            return null;
        }
        return lastName;
    }

    private String registrationEntityUserEmail(RegistrationEntity registrationEntity) {
        if ( registrationEntity == null ) {
            return null;
        }
        UserEntity user = registrationEntity.getUser();
        if ( user == null ) {
            return null;
        }
        String email = user.getEmail();
        if ( email == null ) {
            return null;
        }
        return email;
    }
}
