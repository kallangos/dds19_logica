USE ESCOlASENAI2;

-- MOSTRA QUAL USUARIO ESTA CONCENCTADO NO MOMENTO
SELECT session_user();

-- MOSTRA QUAL USUARIO ESTA CONCENCTADO NO MOMENTO
SELECT * from MYSQL.USER;
SELECT * from MYSQL.DB;
SELECT * from MYSQL.tables_priv;
SELECT * from MYSQL.columns_priv;

CREATE USER 'vanderson'@'localhost';
CREATE USER 'vanderson'@'localhost' IDENTIFIED BY '1234';

-- Mostra privilegios de um usuario
SHOW GRANTS FOR 'vanderson'@'localhost';

-- autoriza acessar TODO um banco especifico
GRANT ALL ON escolasenai.* TO 'vanderson'@'localhost';

-- Retira privilegios
REVOKE ALL PRIVILEGES, GRANT OPTION FROM 'vanderson'@'localhost';

-- recarrega os previlegios
FLUSH PRIVILEGES;

-- deletar usuario da tabela
DROP USER 'vanderson'@'localhost';

-- PERMITE QUE USUARIO CRIE TABELAS EM UM BANCO
GRANT CREATE ON escolasenai.* TO 'vanderson'@'localhost';

-- PERMITE QUE USUARIO SELECIONE E INSIRA DADOS EM TABELAS DE UM BANCO ESPECIFICO
GRANT SELECT, INSERT ON escolasenai.* TO 'vanderson'@'localhost';

-- PERMITE QUE USUARIO DELETE DADOS DENTRO DE TABELAS DE UM BANCO ESPECIFICO
GRANT DELETE ON escolasenai.* TO 'vanderson'@'localhost';

-- TRANFORMA UM USER EM ROOT
GRANT ALL ON *.* TO 'vanderson'@'localhost' WITH GRANT OPTION;