package com.sardeiro.escritorio.mapper;

import com.sardeiro.escritorio.domain.Funcionalidade;
import com.sardeiro.escritorio.dtos.FuncionalidadeDTO;

public class FuncionalidadeMapper {

    public static FuncionalidadeDTO toFuncionalidadeDTO(Funcionalidade funcionalidade) {
        if (funcionalidade == null) {
            return null;
        }

        return new FuncionalidadeDTO(
            funcionalidade.getId(),
            funcionalidade.getNome(),
            funcionalidade.getNomeLegivel(),
            funcionalidade.getModulo()
        );
    }

    public static Funcionalidade toFuncionalidade(FuncionalidadeDTO funcionalidadeDTO) {
        if (funcionalidadeDTO == null) {
            return null;
        }

        return new Funcionalidade(
            funcionalidadeDTO.id(),
            funcionalidadeDTO.nome(),
            funcionalidadeDTO.nomeLegivel(),
            funcionalidadeDTO.modulo()
        );
    }
}
