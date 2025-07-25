package com.forohub.infrastructure.persistence.bd.repository;

import com.forohub.infrastructure.persistence.bd.entity.RespuestaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaRepository extends JpaRepository<RespuestaEntity, Long> {
}
