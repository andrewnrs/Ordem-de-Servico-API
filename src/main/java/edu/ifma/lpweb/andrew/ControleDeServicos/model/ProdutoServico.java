package edu.ifma.lpweb.andrew.ControleDeServicos.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Produto_Servico")
public class ProdutoServico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotNull
    String nome;

    String desc;

    @NotNull
    @Positive
    @Column(name = "valor_atual")
    Float valorAtual;

    // TODO Checar necessidade deste campo
    Character definicao;

    @OneToMany(mappedBy = "produtoServico")
    private Set<Item> itens = new LinkedHashSet<>();

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getNome() {  return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getDesc() { return desc; }

    public void setDesc(String desc) { this.desc = desc; }

    public Float getValorAtual() { return valorAtual; }

    public void setValorAtual(Float valorAtual) { this.valorAtual = valorAtual; }

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
