package com.sardeiro.escritorio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sardeiro.escritorio.domain.Perfil;
import com.sardeiro.escritorio.repository.PerfilRepository;




@Service
public class PerfilService {

    @Autowired
    private PerfilRepository repository;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<Perfil> listarTodos() {
        return repository.findAll();
    }

    @org.springframework.transaction.annotation.Transactional
    public Perfil salvar(Perfil novoPerfil) {
        return repository.save(novoPerfil);
    }

    public Optional<Perfil> GetById(Long id) {
        return repository.findById(id);
    }

    @org.springframework.transaction.annotation.Transactional
    public Perfil atualizar(Long id, Perfil perfilAtualizado) {
        return repository.findById(id)
                .map(perfil -> {
                    perfil.setNome(perfilAtualizado.getNome());
                    perfil.setFuncionalidades(perfilAtualizado.getFuncionalidades());
                    repository.save(perfil);
                    return perfil;
                })
                .orElse(null);
    }

    @org.springframework.transaction.annotation.Transactional
    public boolean deletar(Long id) {
        return repository.findById(id)
                .map(perfil -> {
                    repository.delete(perfil);
                    return true;
                })
                .orElse(false);
    }

}
