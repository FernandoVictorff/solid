package ep.solid.srp.violacao;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.Properties;

public class Cliente {
    public Integer clienteId;
    public String nome;
    public String email;
    public String cpf;
    public LocalDate dataCadastro;

    public Cliente() {}

    public String AdicionarCliente () throws Exception{
        if (!email.contains("@"))
            return "Cliente com e-mail inválido";

        if (cpf.length() != 11)
            return "Cliente com CPF inválido";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/solid", "root", "root");
        connection.setAutoCommit(false);

        String sql = "INSERT INTO tb_cliente (nome, email, cpf, datacadastro) VALUES (?, ?, ?, ?)";
        PreparedStatement insert = connection.prepareStatement(sql);

        insert.setString(1, nome);
        insert.setString(2, email);
        insert.setString(3, cpf);
        insert.setString(4, dataCadastro.toString());

        insert.execute();
        connection.commit();
        connection.close();

        Properties properties = new Properties();
        properties.put("mail.smtp.ssl.trust", "*");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("jhon@gmail.com", "password");
            }
        });

        Address[] toUser = InternetAddress.parse("jhon@gmail.com");
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("jhon@gmail.com"));
        message.setRecipients(Message.RecipientType.TO, toUser);
        message.setSubject("Bem Vindo.");
        message.setText("Parabéns! Você está cadastrado.");

        Transport.send(message);

        return "Cliente cadastrado com sucesso!";
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

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}

