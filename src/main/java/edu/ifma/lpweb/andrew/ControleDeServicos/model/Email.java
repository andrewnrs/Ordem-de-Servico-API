package edu.ifma.lpweb.andrew.ControleDeServicos.model;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Email {

    String email;

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email öEmail = (Email) o;
        return Objects.equals(email, öEmail.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
