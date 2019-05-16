package edu.ifma.lpweb.andrew.ControleDeServicos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Orcamento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    Float valor;

    LocalDate data;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    Cliente cliente;

    @OneToMany(mappedBy = "orcamento")
    private Set<Item> itens = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValor() { return valor; }

    public void setValor(Float valor) { this.valor = valor; }

    public LocalDate getData() { return data; }

    public void setData(LocalDate data) { this.data = data; }

    public Set<Item> getItens() { return itens; }

    public void setItens(Set<Item> itens) { this.itens = itens; }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orcamento orcamento = (Orcamento) o;
        return Objects.equals(id, orcamento.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
