package ep.solid.dip.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {

    private Integer clienteId;
    private String nome;
    private String email;
    private String cpf;
    private LocalDate dataCadastro;

    public Cliente(Builder builder) {
        clienteId = builder.clienteId;
        nome = builder.nome;
        email = builder.email;
        cpf = builder.cpf;
        dataCadastro = builder.dataCadastro;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    @Override
    public String toString() {
        return (
            "Cliente{" +
            "clienteId=" + clienteId +
            ", nome='" + nome + '\'' +
            ", email='" + email + '\'' +
            ", cpf='" + cpf + '\'' +
            ", dataCadastro=" + dataCadastro +
            '}'
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return (
            Objects.equals(clienteId, cliente.clienteId) &&
            Objects.equals(nome, cliente.nome) &&
            Objects.equals(email, cliente.email) &&
            Objects.equals(cpf, cliente.cpf) &&
            Objects.equals(dataCadastro, cliente.dataCadastro)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(clienteId, nome, email, cpf, dataCadastro);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private Integer clienteId;
        private String nome;
        private String email;
        private String cpf;
        private LocalDate dataCadastro;

        private Builder() {}

        public Builder clienteId(Integer clienteId) {
            this.clienteId = clienteId;
            return this;
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder dataCadastro(LocalDate dataCadastro) {
            this.dataCadastro = dataCadastro;
            return this;
        }

        public Cliente build() {
            return new Cliente(this);
        }
    }
}
