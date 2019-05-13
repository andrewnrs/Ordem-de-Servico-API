package edu.ifma.lpweb.andrew.ControleDeServicos.model;

import javax.persistence.Embeddable;
import java.math.BigInteger;
import java.util.Objects;

@Embeddable
public class Telefone {

    BigInteger numero;
    String operadora;

    public BigInteger getNumero() { return numero; }

    public void setNumero(BigInteger numero) { this.numero = numero; }

    public String getOperadora() { return operadora; }

    public void setOperadora(String operadora) { this.operadora = operadora; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return Objects.equals(numero, telefone.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
