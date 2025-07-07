package com.forohub.infrastructure.persistence.bd.repository;

import com.forohub.infrastructure.persistence.bd.entity.TopicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<TopicoEntity, Long> {
}
