package com.serverSide.javaSpringBoot.services;

import com.serverSide.javaSpringBoot.model.RolesModel;
import com.serverSide.javaSpringBoot.model.UsersModel;
import com.serverSide.javaSpringBoot.repository.RolesRepository;
import com.serverSide.javaSpringBoot.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RolesServiceImpl implements RolesService{

    @Autowired
    RolesRepository mRolesRepository;

    @Override
    public RolesModel create(RolesModel rolesModel){

        return  mRolesRepository.save(rolesModel);
    }
    @Override
    public Optional<RolesModel> findById(Long roles_id){

        return mRolesRepository.findById(roles_id);
    }

    @Override
    public List<RolesModel> findAll(){

        return mRolesRepository.findAll();
    }

    @Override
    public RolesModel update(RolesModel rolesModel){

        return  mRolesRepository.save(rolesModel);
    }

    @Override
    public void delete(long roles_id) {
        mRolesRepository.deleteById(roles_id);
    }
    @Override
    public List<RolesModel> findAllById(List<Long> ids) {

        return mRolesRepository.findAllById(ids);
    }

}
