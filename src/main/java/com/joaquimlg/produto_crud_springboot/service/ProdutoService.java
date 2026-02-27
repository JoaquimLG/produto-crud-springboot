package com.joaquimlg.produto_crud_springboot.service;

import com.joaquimlg.produto_crud_springboot.model.Produto;
import com.joaquimlg.produto_crud_springboot.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos(){
        return  produtoRepository.findAll();
    }

    public Optional<Produto> buscarProdutoPorId(Long id){
        return produtoRepository.findById(id);
    }

    public Produto cadastrarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public Optional<Produto> atualizarProduto(Long id, Produto produtoAtualizado){
        return produtoRepository.findById(id)
                .map(produtoExistente ->
                {
                    produtoExistente.setNome(produtoAtualizado.getNome());
                    produtoExistente.setPreco(produtoAtualizado.getPreco());
                    produtoExistente.setQuantidade(produtoAtualizado.getQuantidade());

                    return produtoRepository.save(produtoExistente);
                }
        );
    }

}
