package com.josuesantos.controleestoque.domain.dto.request.produto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FornecedorRequestDTO {
    @JsonProperty("fornecedor_id")
    private Long id;
    @JsonProperty("nome_do_fornecedor")
    private String nome;
    @JsonProperty("endereco_do_fornecedor")
    private EnderecoResponseDTO endereco;
    @JsonProperty("telefone_do_fornecedor")
    private String telefone;
    @JsonProperty("email_do_fornecedor")
    private String email;
}
