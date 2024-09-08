package br.edu.infnet.produtoservicotp3.service;

import br.edu.infnet.produtoservicotp3.model.Produto;
import br.edu.infnet.produtoservicotp3.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Mono<Produto> criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Flux<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Mono<Produto> atualizarProduto(Long id, Produto produto) {
        return produtoRepository.findById(id)
                .flatMap(existingProduto -> {
                    existingProduto.setNome(produto.getNome());
                    existingProduto.setDescricao(produto.getDescricao());
                    existingProduto.setPreco(produto.getPreco());
                    return produtoRepository.save(existingProduto);
                });
    }

    public Mono<Void> deletarProduto(Long id) {
        return produtoRepository.deleteById(id);
    }
}