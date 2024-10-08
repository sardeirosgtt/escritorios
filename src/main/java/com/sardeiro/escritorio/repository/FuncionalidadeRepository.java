package com.sardeiro.escritorio.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sardeiro.escritorio.domain.Funcionalidade;



public interface FuncionalidadeRepository extends JpaRepository<Funcionalidade,Long> {

    boolean existsByNome(String nome);

    List<Funcionalidade> findByNomeIn(Set<String> nomes);
    
}
