CREATE TABLE IF NOT EXISTS `Cliente` (
                 `id` INT(11) NOT NULL  AUTO_INCREMENT,
                 `nome` VARCHAR(45) NULL DEFAULT NULL,
                 `cpf` VARCHAR(15)  NULL,
                 `rg` VARCHAR(15) NULL,
                 PRIMARY KEY (`id`))
    ENGINE = InnoDB
    AUTO_INCREMENT = 1
    DEFAULT CHARACTER SET = utf8;


INSERT INTO `cliente` (`nome`, `cpf`, `rg`)
VALUES ('Elias Márcio Cavalcanti', '03927225266', '453842355');

INSERT INTO `cliente` (`nome`, `cpf`, `rg`)
VALUES ('Elza Helena Baptista','15076254130', '374085018');

INSERT INTO `cliente` (`nome`, `cpf`, `rg`)
VALUES ('Samuel Márcio Lima','74534806639', '435631792');
