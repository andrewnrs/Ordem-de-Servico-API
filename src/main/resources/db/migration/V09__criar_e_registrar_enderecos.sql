CREATE TABLE IF NOT EXISTS p0d32vg8zd2lkpmq.Endereco
(
    id          INT         NOT NULL AUTO_INCREMENT,
    logradouro  VARCHAR(45) NULL,
    bairro      VARCHAR(45) NULL,
    cep         BIGINT(45)  NULL,
    numero      INT         NULL,
    complemento VARCHAR(45) NULL,
    id_cidade   INT(11)     NOT NULL,
    id_cliente  INT(11)     NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_Endereco_Cidade1
        FOREIGN KEY (id_cidade)
            REFERENCES p0d32vg8zd2lkpmq.Cidade (id)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT fk_Endereco_Cliente1
        FOREIGN KEY (id_cliente)
            REFERENCES p0d32vg8zd2lkpmq.Cliente (id)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB
    AUTO_INCREMENT = 1;

CREATE INDEX fk_Endereco_Cidade1_idx ON Endereco (id_cidade ASC);

CREATE INDEX fk_Endereco_Cliente1_idx ON Endereco (id_cliente ASC);

INSERT INTO p0d32vg8zd2lkpmq.Endereco (logradouro, bairro, cep, numero, id_cidade, id_cliente)
VALUES ('Rua Brasília', 'Niteroi', '92130700', '808', '1', '1');
INSERT INTO p0d32vg8zd2lkpmq.Endereco (logradouro, bairro, cep, numero, id_cidade, id_cliente)
VALUES ('Rua Amazonas', 'Jardim Aureny I (Taquaralto)', '77060154', '760', '2', '2');
INSERT INTO p0d32vg8zd2lkpmq.Endereco (logradouro, bairro, cep, numero, id_cidade, id_cliente)
VALUES ('Rua São João', 'Boné Azul', '68909513', '109', '3', '3');
