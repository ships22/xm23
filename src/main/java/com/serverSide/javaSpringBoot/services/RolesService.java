package com.serverSide.javaSpringBoot.services;

import com.serverSide.javaSpringBoot.model.RolesModel;
import java.util.List;
import java.util.Optional;

public interface RolesService {

    public RolesModel create(RolesModel rolesModel);
    public Optional<RolesModel> findById(long roles_id);

    public List<RolesModel> findAll();

    public RolesModel update(RolesModel rolesModel);

    public  void delete(long roles_id);

//    List<RolesModel> findAllById(List<Long>ids);
}
