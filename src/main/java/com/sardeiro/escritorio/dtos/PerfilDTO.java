package com.sardeiro.escritorio.dtos;

import java.util.Set;

public record PerfilDTO(
    Integer id,
    String nome,
    Set<FuncionalidadeDTO> funcionalidades
) {}   

