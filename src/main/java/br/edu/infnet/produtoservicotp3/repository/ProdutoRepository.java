package br.edu.infnet.produtoservicotp3.repository;

import br.edu.infnet.produtoservicotp3.model.Produto;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends ReactiveCrudRepository<Produto, Long> {
}