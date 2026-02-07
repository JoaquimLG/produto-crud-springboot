package com.joaquimlg.produto_crud_springboot.controller;

import com.joaquimlg.produto_crud_springboot.model.Produto;
import com.joaquimlg.produto_crud_springboot.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> listarProdutos(){
        return produtoService.listarProdutos();
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto){
        return produtoService.cadastrarProduto(produto);
    }
}
