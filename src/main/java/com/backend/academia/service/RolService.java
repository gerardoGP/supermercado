package com.backend.academia.service;

import com.backend.academia.aggregates.request.RolRequest;
import com.backend.academia.entity.RolEntity;

import java.util.List;

public interface RolService {
    List<RolEntity> all();
    RolEntity store(RolRequest rolRequest);

}
