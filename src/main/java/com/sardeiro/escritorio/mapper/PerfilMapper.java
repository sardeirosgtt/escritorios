package com.sardeiro.escritorio.mapper;



import java.util.stream.Collectors;
import com.sardeiro.escritorio.domain.Perfil;
import com.sardeiro.escritorio.dtos.PerfilDTO;

public class PerfilMapper {

    public static PerfilDTO toPerfilDTO(Perfil perfil) {
        if (perfil == null) {
            return null;
        }

        return new PerfilDTO(
            perfil.getId(),
            perfil.getNome(),
            perfil.getFuncionalidades().stream()
                .map(FuncionalidadeMapper::toFuncionalidadeDTO)
                .collect(Collectors.toSet())
        );
    }

    public static Perfil toPerfil(PerfilDTO perfilDTO) {
        if (perfilDTO == null) {
            return null;
        }

        return new Perfil(
            perfilDTO.id(),
            perfilDTO.nome(),
            perfilDTO.funcionalidades().stream()
                .map(FuncionalidadeMapper::toFuncionalidade)
                .collect(Collectors.toSet())
        );
    }
}
