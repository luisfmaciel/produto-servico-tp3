package br.edu.infnet.produtoservicotp3.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("produtos")
@Data
public class Produto {
    @Id
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
}
