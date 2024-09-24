package com.sardeiro.escritorio.mapper;

import com.sardeiro.escritorio.domain.Usuario;
import com.sardeiro.escritorio.dtos.UsuarioDTO;

public class UsuarioMapper {

    public static UsuarioDTO toUsuarioDTO(Usuario usuario) {
        if (usuario == null) {
            return null;
        }

        return new UsuarioDTO(
            usuario.getId(),
            usuario.getNome(),
            usuario.getEmail(),
            usuario.getPassword(),
            usuario.getTelefone(),
            usuario.getCpf(),
            PerfilMapper.toPerfilDTO(usuario.getPerfil())
        );
    }

    public static Usuario toUsuario(UsuarioDTO usuarioDTO) {
        if (usuarioDTO == null) {
            return null;
        }

        return new Usuario(
            usuarioDTO.id(),
            usuarioDTO.nome(),
            usuarioDTO.email(),
            usuarioDTO.password(),
            usuarioDTO.telefone(),
            usuarioDTO.cpf(), 
            PerfilMapper.toPerfil(usuarioDTO.perfil())
        );
    }
}
