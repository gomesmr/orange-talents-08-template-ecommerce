package com.zup.mercado.produtos;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Entity
public class CaracteristicaProduto {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String nome;
    private String descricao;
    @ManyToOne
    private @Valid Produto produto;

    public CaracteristicaProduto(String nome, String descricao, Produto produto) {
        this.nome = nome;
        this.descricao = descricao;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "CaracteristicaProduto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
