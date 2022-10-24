package ep.solid.srp.solucao.entity;

import ep.solid.srp.solucao.service.CpfService;
import ep.solid.srp.solucao.service.EmailService;

import java.time.LocalDate;

public class Cliente {

    private Integer clienteId;
    private String nome;
    private String email;
    private String cpf;
    private LocalDate dataCadastro;

    public Cliente() {}

    public boolean isValid() {
        return EmailService.isValid(email) && CpfService.isValid(cpf);
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataCadastro() {
        return dataCadastro.toString();
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
