CREATE TABLE IF NOT EXISTS p0d32vg8zd2lkpmq.Produto_Servico (
                                                                id INT(11) NOT NULL AUTO_INCREMENT,
                                                                nome VARCHAR(45) NULL,
                                                                `desc` VARCHAR(45)  NULL,
                                                                valor_atual FLOAT NULL,
                                                                definicao CHAR NULL,
                                                                PRIMARY KEY (id))
    ENGINE = InnoDB
    AUTO_INCREMENT = 1
    DEFAULT CHARACTER SET = utf8;

INSERT INTO p0d32vg8zd2lkpmq.Produto_Servico (nome, `desc`, valor_atual, definicao)
VALUES ('manutenção de ar', 'limpar o aparelho', 100, 'm');
INSERT INTO p0d32vg8zd2lkpmq.Produto_Servico (nome, `desc`, valor_atual, definicao)
VALUES ('instalação de ar','instalação de aparelho', 200, 'i');
INSERT INTO p0d32vg8zd2lkpmq.Produto_Servico (nome, `desc`, valor_atual, definicao)
VALUES ('manutenção de ar','encher o gás', 100, 'g');
