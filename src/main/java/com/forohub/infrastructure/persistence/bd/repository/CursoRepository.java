package com.forohub.infrastructure.persistence.bd.repository;

import com.forohub.infrastructure.persistence.bd.entity.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<CursoEntity, Long> {
}
