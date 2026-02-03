package com.backend.academia.aggregates.mappers;

import com.backend.academia.aggregates.response.CourseResponse;
import com.backend.academia.aggregates.response.RegistrationResponse;
import com.backend.academia.entity.CourseEntity;
import com.backend.academia.entity.RegistrationEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-02T11:02:23-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.17 (Eclipse Adoptium)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Autowired
    private RegistrationMapper registrationMapper;

    @Override
    public CourseResponse toResponse(CourseEntity courseEntity) {
        if ( courseEntity == null ) {
            return null;
        }

        CourseResponse courseResponse = new CourseResponse();

        courseResponse.setCourse_id( courseEntity.getId() );
        courseResponse.setCourse_title( courseEntity.getTitle() );
        courseResponse.setCourse_url_seo( courseEntity.getUrlSeo() );
        if ( courseEntity.getStatusCourse() != null ) {
            courseResponse.setCourse_status( courseEntity.getStatusCourse().name() );
        }
        courseResponse.setRegistrations( registrationEntityListToRegistrationResponseList( courseEntity.getRegistrations() ) );

        return courseResponse;
    }

    @Override
    public List<CourseResponse> toResponseList(List<CourseEntity> courseEntity) {
        if ( courseEntity == null ) {
            return null;
        }

        List<CourseResponse> list = new ArrayList<CourseResponse>( courseEntity.size() );
        for ( CourseEntity courseEntity1 : courseEntity ) {
            list.add( toResponse( courseEntity1 ) );
        }

        return list;
    }

    protected List<RegistrationResponse> registrationEntityListToRegistrationResponseList(List<RegistrationEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RegistrationResponse> list1 = new ArrayList<RegistrationResponse>( list.size() );
        for ( RegistrationEntity registrationEntity : list ) {
            list1.add( registrationMapper.toResponse( registrationEntity ) );
        }

        return list1;
    }
}
