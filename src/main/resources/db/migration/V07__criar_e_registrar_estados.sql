CREATE TABLE Estado (
                        id INT NOT NULL AUTO_INCREMENT,
                        nome VARCHAR(45) NULL,
    #regiao VARCHAR(45) NULL,
                        PRIMARY KEY (id))
    ENGINE = InnoDB
    AUTO_INCREMENT = 1;

INSERT INTO Estado (nome) VALUES ('Maranhão');
INSERT INTO Estado (nome) VALUES ('Piauí');
INSERT INTO Estado (nome) VALUES ('Ceará');
INSERT INTO Estado (nome) VALUES ('Bahia');
INSERT INTO Estado (nome) VALUES ('Tocantins');
INSERT INTO Estado (nome) VALUES ('Rio Grande do Norte');
