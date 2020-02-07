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

INSERT INTO `cidade` (`nome`, `id_estado`) VALUES (''São Luís'', ''1'');
INSERT INTO `cidade` (`nome`, `id_estado`) VALUES (''Imperatriz'', ''1'');
INSERT INTO `cidade` (`nome`, `id_estado`) VALUES (''São Bento'', ''1'');
INSERT INTO `cidade` (`nome`, `id_estado`) VALUES (''Caxias'', ''1'');
INSERT INTO `cidade` (`nome`, `id_estado`) VALUES (''Teresina'', ''2'');
INSERT INTO `cidade` (`nome`, `id_estado`) VALUES (''Picos'', ''2'');
INSERT INTO `cidade` (`nome`, `id_estado`) VALUES (''Fortaleza'', ''3'');
INSERT INTO `cidade` (`nome`, `id_estado`) VALUES (''Sobral'', ''3'');
INSERT INTO `cidade` (`nome`, `id_estado`) VALUES (''Salvador'', ''4'');
INSERT INTO `cidade` (`nome`, `id_estado`) VALUES (''Juazeiro'', ''4'');
INSERT INTO `cidade` (`nome`, `id_estado`) VALUES (''Barreiras'', ''4'');
INSERT INTO `cidade` (`nome`, `id_estado`) VALUES (''Palmas'', ''5'');
INSERT INTO `cidade` (`nome`, `id_estado`) VALUES (''Natal'', ''6'');
