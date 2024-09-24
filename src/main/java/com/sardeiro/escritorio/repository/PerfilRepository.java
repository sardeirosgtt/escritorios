package com.sardeiro.escritorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sardeiro.escritorio.domain.Perfil;



public interface PerfilRepository extends JpaRepository<Perfil,Long> {
    
}
