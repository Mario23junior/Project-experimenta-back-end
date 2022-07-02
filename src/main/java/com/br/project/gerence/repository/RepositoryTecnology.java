package com.br.project.gerence.repository;

import com.br.project.gerence.model.Technology;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTecnology extends JpaRepository<Technology, Long>{

}
