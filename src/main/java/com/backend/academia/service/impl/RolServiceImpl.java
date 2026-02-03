package com.backend.academia.service.impl;

import com.backend.academia.aggregates.request.RolRequest;
import com.backend.academia.entity.RolEntity;
import com.backend.academia.repository.RolRepository;
import com.backend.academia.service.RolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RolServiceImpl implements RolService {

    private final RolRepository rolRepository;

    @Override
    public List<RolEntity> all() {
        return rolRepository.findAll();
    }

    @Override
    public RolEntity store(RolRequest rolRequest){
        return rolRepository.save(RolEntity.builder()
                .name(rolRequest.getNombreRol())
                .build()
        );
    }
}
