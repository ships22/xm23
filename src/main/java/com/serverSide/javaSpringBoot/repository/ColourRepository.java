package com.serverSide.javaSpringBoot.repository;

import com.serverSide.javaSpringBoot.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColourRepository  extends  JpaRepository<ColourRepository, Long>{
}

