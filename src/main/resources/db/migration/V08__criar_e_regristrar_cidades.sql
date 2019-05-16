CREATE TABLE IF NOT EXISTS `Cidade` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `id_estado` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_Cidade_Estado1`
    FOREIGN KEY (`id_estado`)
    REFERENCES `Estado` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 1;

CREATE INDEX `fk_Cidade_Estado1_idx` ON `Cidade` (`id_estado` ASC);

INSERT INTO `ordemdeservicodb`.`cidade` (`nome`, `id_estado`) VALUES ('Canoas', '1');
INSERT INTO `ordemdeservicodb`.`cidade` (`nome`, `id_estado`) VALUES ('Palmas', '2');
INSERT INTO `ordemdeservicodb`.`cidade` (`nome`, `id_estado`) VALUES ('Macapá', '3');
