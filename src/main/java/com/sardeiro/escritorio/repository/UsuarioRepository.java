package com.sardeiro.escritorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import com.sardeiro.escritorio.domain.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    UserDetails findByEmail(String email);
    
}
