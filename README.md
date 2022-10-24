# OOP - princípios SOLID

## Tecnologias:
### Docker, Java, Mysql.

## Para testar, utilize o seguinte comando no docker:
`docker run --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -d mysql:latest`

## Execute o seguinte comando sql para criar o banco e a tabela:
    CREATE DATABASE solid;

    CREATE TABLE `solid`.`tb_cliente` (
    `cliente_id` BIGINT NOT NULL AUTO_INCREMENT,
    `nome` VARCHAR(255) NOT NULL,
    `email` VARCHAR(255) NOT NULL,
    `cpf` VARCHAR(255) NOT NULL,
    `dataCadastro` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`cliente_id`)
    );


#### Esses projetos foram criados apenas para estudo.
#### Tentei fazer um clone do projeto original do Eduardo Pires, mudando a linguagem de C# para Java.
#### Link -> https://github.com/EduardoPires/SOLID

#### Obs: Os únicos projetos testáveis são o srp e o dip.