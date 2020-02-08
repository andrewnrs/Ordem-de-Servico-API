CREATE TABLE p0d32vg8zd2lkpmq.Emails (
                        email VARCHAR(45) NOT NULL,
                        id_cliente INT(11) NOT NULL,
                        PRIMARY KEY (id_cliente, email),
                        CONSTRAINT fk_Emails_Cliente1
                            FOREIGN KEY (id_cliente)
                                REFERENCES p0d32vg8zd2lkpmq.Cliente (id)
                                ON DELETE NO ACTION
                                ON UPDATE NO ACTION)
    ENGINE = InnoDB
    AUTO_INCREMENT = 1;

CREATE INDEX fk_Emails_Cliente1_idx ON Emails (id_cliente ASC);

INSERT INTO p0d32vg8zd2lkpmq.Emails (email, id_cliente)
VALUES ('eliasmarciocavalcanti@agaxtur.com.br', '1');
INSERT INTO p0d32vg8zd2lkpmq.Emails (email, id_cliente)
VALUES ('elias_cavalcanti@agaxtur.com.br', '1');
INSERT INTO p0d32vg8zd2lkpmq.Emails (email, id_cliente)
VALUES ('elzahelenabaptista_@dr.com', '2');
INSERT INTO p0d32vg8zd2lkpmq.Emails (email, id_cliente)
VALUES ('samuelmarciolima@arteche.com.br', '3');