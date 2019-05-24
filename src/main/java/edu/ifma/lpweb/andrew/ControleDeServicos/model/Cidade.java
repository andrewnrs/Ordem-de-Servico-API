package edu.ifma.lpweb.andrew.ControleDeServicos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Cidade {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotNull
    String nome;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_estado")
    Estado estado;

    @JsonIgnore
    @OneToMany(mappedBy = "cidade")
    private Set<Endereco> enderecos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
