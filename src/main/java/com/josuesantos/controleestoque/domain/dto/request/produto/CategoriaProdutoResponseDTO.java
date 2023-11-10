package com.josuesantos.controleestoque.domain.dto.request.produto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonRootName("Content")
public class CategoriaProdutoResponseDTO {
    @JsonProperty("categoria_id")
    private Long id;
    @JsonProperty("nome_da_categoria")
    private String nome;
    @JsonProperty("descricao_da_categoria")
    private String descricao;
}
