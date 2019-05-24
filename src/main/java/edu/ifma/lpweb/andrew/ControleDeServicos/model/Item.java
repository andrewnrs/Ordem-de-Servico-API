package edu.ifma.lpweb.andrew.ControleDeServicos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotNull
    @Positive
    Float valor;

    @NotNull
    @Positive
    Integer quantidade;

    @NotNull
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_servicoproduto")
    private ProdutoServico produtoServico;

    @NotNull
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_orcamento")
    private Orcamento orcamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValor() { return valor; }

    public void setValor(Float valor) { this.valor = valor; }

    public Integer getQuantidade() { return quantidade; }

    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

    public ProdutoServico getProdutoServico() { return produtoServico; }

    public void setProdutoServico(ProdutoServico produtoServico) { this.produtoServico = produtoServico; }

    public Orcamento getOrcamento() { return orcamento; }

    public void setOrcamento(Orcamento orcamento) { this.orcamento = orcamento; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
