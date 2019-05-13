CREATE TABLE IF NOT EXISTS `Email` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(45) NULL,
  `id_cliente` INT(11) NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_Email_Cliente1`
    FOREIGN KEY (`id_cliente`)
    REFERENCES `Cliente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 1;

CREATE INDEX `fk_Email_Cliente1_idx` ON `Email` (`id_cliente` ASC);

INSERT INTO `ordemdeservicodb`.`email` (`email`, `id_cliente`) VALUES ('andrew@coldmail.com', '1');
INSERT INTO `ordemdeservicodb`.`email` (`email`, `id_cliente`) VALUES ('andrew@yepa.com', '1');
INSERT INTO `ordemdeservicodb`.`email` (`email`, `id_cliente`) VALUES ('joao@coldmail.com', '2');
INSERT INTO `ordemdeservicodb`.`email` (`email`, `id_cliente`) VALUES ('israel@coldmail.com', '3');
