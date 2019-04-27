CREATE TABLE IF NOT EXISTS `ordemdeservicodb`.`cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `ordemdeservicodb`.`cliente` (`nome`) VALUES ('Andrew');
INSERT INTO `ordemdeservicodb`.`cliente` (`nome`) VALUES ('João');
INSERT INTO `ordemdeservicodb`.`cliente` (`nome`) VALUES ('Israel');
