CREATE TABLE IF NOT EXISTS `Estado` (
            `id` INT NOT NULL AUTO_INCREMENT,
            `nome` VARCHAR(45) NULL,
            `regiao` VARCHAR(45) NULL,
            PRIMARY KEY (`id`))
    ENGINE = InnoDB
    AUTO_INCREMENT = 1;

INSERT INTO `ordemdeservicodb`.`estado` (`nome`, `regiao`) VALUES ('RS', 'Sul');
INSERT INTO `ordemdeservicodb`.`estado` (`nome`, `regiao`) VALUES ('TO', 'Norte');
INSERT INTO `ordemdeservicodb`.`estado` (`nome`, `regiao`) VALUES ('AP', 'Norte');
