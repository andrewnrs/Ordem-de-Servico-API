CREATE TABLE IF NOT EXISTS `Cliente` (
                 `id` INT(11) NOT NULL  AUTO_INCREMENT,
                 `nome` VARCHAR(45) NULL DEFAULT NULL,
                 PRIMARY KEY (`id`))
    ENGINE = InnoDB
    AUTO_INCREMENT = 1
    DEFAULT CHARACTER SET = utf8;

INSERT INTO `ordemdeservicodb`.`cliente` (`nome`) VALUES ('Andrew');
INSERT INTO `ordemdeservicodb`.`cliente` (`nome`) VALUES ('João');
INSERT INTO `ordemdeservicodb`.`cliente` (`nome`) VALUES ('Israel');
