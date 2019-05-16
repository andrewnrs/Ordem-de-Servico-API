package edu.ifma.lpweb.andrew.ControleDeServicos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Produto_Servico")
public class ProdutoServico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String nome;

    String desc;

    Float valor;

    Character definicao;

    @OneToMany(mappedBy = "produtoServico")
    private Set<Item> itens = new LinkedHashSet<>();

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getNome() {  return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getDesc() { return desc; }

    public void setDesc(String desc) { this.desc = desc; }

    public Float getValor() { return valor; }

    public void setValor(Float valor) { this.valor = valor; }

    public Character getDefinicao() { return definicao; }

    public void setDefinicao(Character definicao) { this.definicao = definicao; }

    public Set<Item> getItens() { return itens; }

    public void setItens(Set<Item> itens) { this.itens = itens; }

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
