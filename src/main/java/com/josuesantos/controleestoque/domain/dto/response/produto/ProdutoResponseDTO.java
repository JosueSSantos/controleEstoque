package com.josuesantos.controleestoque.domain.dto.response.produto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.josuesantos.controleestoque.domain.dto.request.produto.CategoriaProdutoResponseDTO;
import com.josuesantos.controleestoque.domain.dto.request.produto.FornecedorRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonRootName("Content")
public class ProdutoResponseDTO {
    @JsonProperty("produto_id")
    private Long id;
    @JsonProperty("nome_do_produto")
    private String nome;
    @JsonProperty("descricao_do_produto")
    private String descricao;
    @JsonProperty("preco_do_produto")
    private BigDecimal preco;
    @JsonProperty("quantidade_em_estoque")
    private int quantidadeEmEstoque;
    @JsonProperty("codigo_de_barras")
    private String codigoDeBarras;
    @JsonProperty("fabricante")
    private String fabricante;
    @JsonProperty("categoria")
    private CategoriaProdutoResponseDTO categoria;
    @JsonProperty("fornecedor")
    private FornecedorRequestDTO fornecedor;
    @JsonProperty("data_de_validade")
    private LocalDate dataDeValidade;

}