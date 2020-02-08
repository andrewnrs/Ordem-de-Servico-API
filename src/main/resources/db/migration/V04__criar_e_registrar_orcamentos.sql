CREATE TABLE p0d32vg8zd2lkpmq.Orcamento (
                                            id INT(11) NOT NULL AUTO_INCREMENT,
                                            data DATE NULL,
                                            valor FLOAT  NULL,
                                            id_cliente INT(11) NOT NULL,
                                            PRIMARY KEY (id),
                                            CONSTRAINT fk_orcamento_cliente
                                                FOREIGN KEY (id_cliente)
                                                    REFERENCES p0d32vg8zd2lkpmq.Cliente (id)
                                                    ON DELETE NO ACTION
                                                    ON UPDATE NO ACTION)
    ENGINE = InnoDB
    AUTO_INCREMENT = 1
    DEFAULT CHARACTER SET = utf8;

CREATE INDEX fk_orcamento_cliente_idx ON p0d32vg8zd2lkpmq.Orcamento (id_cliente ASC);

INSERT INTO p0d32vg8zd2lkpmq.Orcamento (data, valor, id_cliente)
VALUES ('2019-05-13', '100', '1');
INSERT INTO p0d32vg8zd2lkpmq.Orcamento (data, valor, id_cliente)
VALUES ('2019-03-05','200', '2');
INSERT INTO p0d32vg8zd2lkpmq.Orcamento (data, valor, id_cliente)
VALUES ('2019-07-08','100', '3');

