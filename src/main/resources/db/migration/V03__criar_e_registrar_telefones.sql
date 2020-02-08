CREATE TABLE p0d32vg8zd2lkpmq.Telefones (
                                            telefone VARCHAR(45) NOT NULL,
                                            id_cliente INT(11) NOT NULL,
                                            PRIMARY KEY (id_cliente, telefone),
                                            CONSTRAINT fk_telefones_cliente
                                                FOREIGN KEY (id_cliente)
                                                    REFERENCES p0d32vg8zd2lkpmq.Cliente (id)
                                                    ON DELETE NO ACTION
                                                    ON UPDATE NO ACTION)
    ENGINE = InnoDB
    AUTO_INCREMENT = 1;

CREATE INDEX fk_telefones_cliente_idx ON p0d32vg8zd2lkpmq.Telefones (id_cliente ASC);

INSERT INTO p0d32vg8zd2lkpmq.Telefones (telefone, id_cliente)
VALUES ('51991501889', '1');
INSERT INTO p0d32vg8zd2lkpmq.Telefones (telefone, id_cliente)
VALUES ('63995602618', '2');
INSERT INTO p0d32vg8zd2lkpmq.Telefones (telefone, id_cliente)
VALUES ('96994696347', '3');
INSERT INTO p0d32vg8zd2lkpmq.Telefones (telefone, id_cliente)
VALUES ('96995268414', '3');
