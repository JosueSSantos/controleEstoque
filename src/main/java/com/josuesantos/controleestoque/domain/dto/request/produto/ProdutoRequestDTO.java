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
public class ProdutoRequestDTO {
    @JsonProperty("nome_do_produto")
    private String nome;
    @JsonProperty("preco_do_produto")
    private double preco;
    @JsonProperty("quantidade_em_estoque")
    private int quantidadeEmEstoque;

}