package com.joaquimlg.produto_crud_springboot.repository;

import com.joaquimlg.produto_crud_springboot.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{
}
