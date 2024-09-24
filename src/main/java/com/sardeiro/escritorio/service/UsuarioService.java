package com.sardeiro.escritorio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sardeiro.escritorio.domain.Usuario;
import com.sardeiro.escritorio.dtos.UsuarioDTO;
import com.sardeiro.escritorio.mapper.UsuarioMapper;
import com.sardeiro.escritorio.repository.UsuarioRepository;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @org.springframework.transaction.annotation.Transactional
    public Usuario salvar(UsuarioDTO novoUsuario) {
        return repository.save(UsuarioMapper.toUsuario(novoUsuario));
    }
}
