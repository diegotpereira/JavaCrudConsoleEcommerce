CREATE TABLE `tb_usuario` (
  `login` VARCHAR(100) NOT NULL,
  `senha` VARCHAR(80) NULL,
  `nome` VARCHAR(150) NULL,
  `cpf` VARCHAR(45) NULL,
  `telefone` VARCHAR(50) NULL,
  `endereco` VARCHAR(150) NULL,
  PRIMARY KEY (`login`))
ENGINE = InnoDB

insert into tb_usuario(login, senha, nome, cpf, telefone, endereco) values ("fulano", "123", "fulano de tal", "987", "564789", "Flores da cunha");

CREATE TABLE tb_produto (
  `idProduto` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(150) NULL,
  `valor` DOUBLE NULL,
  `descricao` VARCHAR(200) NULL,
  PRIMARY KEY (`idProduto`))
ENGINE = InnoDB


insert into tb_produto(idProduto, nome, valor, descricao) values (123, "Coca-Cola", 5.0, "refrigerante");


CREATE TABLE `tb_vendas` (
  `idVenda` INT NOT NULL AUTO_INCREMENT,
  `data` VARCHAR(45) NULL,
  `nomeComprador` VARCHAR(150) NOT NULL,
  `cartaoComprador` VARCHAR(20) NOT NULL,
  `codSegurancaComprador` VARCHAR(5) NOT NULL,
  `valor` DOUBLE NOT NULL,
  `idProdutoFk` INT NOT NULL,
  PRIMARY KEY (`idVenda`),
  INDEX `fk_Vendas_Produto_idx` (`idProdutoFk` ASC) VISIBLE,
  CONSTRAINT `fk_Vendas_Produto`
    FOREIGN KEY (`idProdutoFk`)
    REFERENCES `dbJavaCrudConsoleEcommerce`.`tb_produto` (`idProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
