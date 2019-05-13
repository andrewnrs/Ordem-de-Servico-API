CREATE TABLE IF NOT EXISTS `Telefone` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `numero` BIGINT(20) NULL,
  `operadora` VARCHAR(15) NULL,
  `id_cliente` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_telefone_cliente`
    FOREIGN KEY (`id_cliente`)
    REFERENCES `Cliente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 1;

CREATE INDEX `fk_telefone_cliente_idx` ON `Telefone` (`id_cliente` ASC);

INSERT INTO `ordemdeservicodb`.`Telefone` (`numero`, `operadora`, `id_cliente`) VALUES ('9883647526', 'bye', '1');
INSERT INTO `ordemdeservicodb`.`Telefone` (`numero`, `operadora`, `id_cliente`) VALUES ('9886528402', 'bye', '2');
INSERT INTO `ordemdeservicodb`.`Telefone` (`numero`, `operadora`, `id_cliente`) VALUES ('9834537997', 'bye', '3');
INSERT INTO `ordemdeservicodb`.`Telefone` (`numero`, `operadora`, `id_cliente`) VALUES ('9897237468', 'bye', '3');

