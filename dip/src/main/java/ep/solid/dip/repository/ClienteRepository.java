package ep.solid.dip.repository;

import ep.solid.dip.entity.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static ep.solid.dip.util.DbConstants.*;

@Repository
public class ClienteRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClienteRepository.class);
    public void adicionarCliente(Cliente cliente) {
        try {
            Class.forName(DRIVER_CLASS_NAME);
            Connection connection = DriverManager.getConnection(URL_CONNECTION + DATABASE, USERNAME, PASSWORD);
            connection.setAutoCommit(false);

            String sql = "INSERT INTO tb_cliente (nome, email, cpf, datacadastro) VALUES (?, ?, ?, ?)";
            PreparedStatement insert = connection.prepareStatement(sql);

            insert.setString(1, cliente.getNome());
            insert.setString(2, cliente.getEmail());
            insert.setString(3, cliente.getCpf());
            insert.setString(4, cliente.getDataCadastro().toString());

            insert.execute();
            connection.commit();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            LOGGER.error("ERRO AO ADICIONAR CLIENTE -> " + e.getMessage());
        }
    }
}
