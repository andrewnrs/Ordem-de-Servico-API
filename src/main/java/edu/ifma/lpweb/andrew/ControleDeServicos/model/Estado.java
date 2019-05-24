package edu.ifma.lpweb.andrew.ControleDeServicos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Estado {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotNull
    String nome;

    @NotNull
    @JsonIgnore
    @OneToMany(mappedBy = "estado")
    private Set<Cidade> cidades = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(Set<Cidade> cidades) {
        this.cidades = cidades;
    }
}
