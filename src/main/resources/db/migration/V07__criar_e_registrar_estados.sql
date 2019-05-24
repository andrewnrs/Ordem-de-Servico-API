CREATE TABLE IF NOT EXISTS `Estado` (
            `id` INT NOT NULL AUTO_INCREMENT,
            `nome` VARCHAR(45) NULL,
            #`regiao` VARCHAR(45) NULL,
            PRIMARY KEY (`id`))
    ENGINE = InnoDB
    AUTO_INCREMENT = 1;

INSERT INTO `ordemdeservicodb`.`estado` (`nome`) VALUES ('Maranhão');
INSERT INTO `ordemdeservicodb`.`estado` (`nome`) VALUES ('Piauí');
INSERT INTO `ordemdeservicodb`.`estado` (`nome`) VALUES ('Ceará');
INSERT INTO `ordemdeservicodb`.`estado` (`nome`) VALUES ('Bahia');
INSERT INTO `ordemdeservicodb`.`estado` (`nome`) VALUES ('Tocantins');
INSERT INTO `ordemdeservicodb`.`estado` (`nome`) VALUES ('Rio Grande do Norte');
