package com.forohub.infrastructure.persistence.bd.repository;

import com.forohub.infrastructure.persistence.bd.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
