package com.forohub.infrastructure.persistence.bd.repository;

import com.forohub.infrastructure.persistence.bd.entity.PerfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {
}
