package edu.ifma.lpweb.andrew.ControleDeServicos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    private String nome;

    @NotNull
    private String rg;

    @CPF @NotNull
    private String cpf;

    @ElementCollection
    @CollectionTable(
            name = "Emails",
            joinColumns = @JoinColumn(name = "id_cliente")
    )
    @Column(name = "email")
    private Set<@NotEmpty @Email String> emails = new LinkedHashSet<>();

    @ElementCollection
    @CollectionTable(
            name = "Telefones",
            joinColumns = @JoinColumn(name = "id_cliente")
    )
    @Column(name = "telefone")
    private Set<@NotEmpty String> telefones = new LinkedHashSet<>();

    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    private Set<Orcamento> orcamentos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Endereco> enderecos = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { this.nome = nome; }

    public Set<String> getEmails() { return emails; }

    public void setEmails(Set<String> emails) { this.emails = emails; }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getRg() { return rg; }

    public void setRg(String rg) { this.rg = rg; }

    public Set<String> getTelefones() { return telefones; }

    public void setTelefones(Set<String> telefones) { this.telefones = telefones; }

    public Set<Orcamento> getOrcamentos() { return orcamentos; }

    public void setOrcamentos(Set<Orcamento> orcamentos) { this.orcamentos = orcamentos; }

    public Set<Endereco> getEnderecos() { return enderecos; }

    public void setEnderecos(Set<Endereco> enderecos) { this.enderecos = enderecos; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
