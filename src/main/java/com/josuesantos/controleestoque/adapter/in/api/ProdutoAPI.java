package com.josuesantos.controleestoque.adapter.in.api;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/produto")
@SecurityRequirement(name = "X-API-KEY")
@Tag(name = "PDV", description = "APIs para integração do PDV com a Arckpay")
public interface ProdutoAPI {
//    @PostMapping("/criar/produto")
//    @PostMapping("/criar/produto/estoque")
//    @PostMapping("/atualizar/produto/fornecedor")
//    @PostMapping("/atualizar/produto/estoque")
//    @PostMapping("/atualizar/produto/descricoes")
//    @PostMapping("/atualizar/produto/fornecedor")


}
