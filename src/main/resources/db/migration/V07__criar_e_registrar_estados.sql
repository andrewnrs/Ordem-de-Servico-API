CREATE TABLE IF NOT EXISTS `Estado` (
            `id` INT NOT NULL AUTO_INCREMENT,
            `nome` VARCHAR(45) NULL,
            #`regiao` VARCHAR(45) NULL,
            PRIMARY KEY (`id`))
    ENGINE = InnoDB
    AUTO_INCREMENT = 1;

INSERT INTO `estado` (`nome`) VALUES ('Maranhão');
INSERT INTO `estado` (`nome`) VALUES ('Piauí');
INSERT INTO `estado` (`nome`) VALUES ('Ceará');
INSERT INTO `estado` (`nome`) VALUES ('Bahia');
INSERT INTO `estado` (`nome`) VALUES ('Tocantins');
INSERT INTO `estado` (`nome`) VALUES ('Rio Grande do Norte');
