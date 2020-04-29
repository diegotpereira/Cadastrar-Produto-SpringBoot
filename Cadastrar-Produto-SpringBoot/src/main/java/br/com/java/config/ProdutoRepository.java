package br.com.java.config;


import org.springframework.data.jpa.repository.JpaRepository;



public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findAllById(long id);
}
