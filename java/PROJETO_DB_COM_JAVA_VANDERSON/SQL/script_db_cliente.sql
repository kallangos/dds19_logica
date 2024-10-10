-- Criando banco

CREATE DATABASE cad_cli;

use cad_cli;

CREATE TABLE cliente(
	cli_id INT PRIMARY KEY AUTO_INCREMENT,
    cli_nome VARCHAR(100) NOT NULL,
    cli_cpf VARCHAR(11) NOT NULL UNIQUE,
    cli_sobrenome VARCHAR(100)
    );

SELECT cli_id as ID, cli_nome as NOME, cli_cpf as CPF from cliente;    

INSERT INTO cliente(cli_nome, cli_cpf)
VALUES	("Maria"	, "22548410765"),
		("Josefina"	, "58235234750"),
		("Thamires"	, "52184865745"),
		("Carol"	, "69011647777"),
		("Amanda"	, "77220884737"),
		("Jorge"	, "91723860700"),
		("Lucas"	, "28563300709"),
		("Paulo"	, "88353179750"),
		("Maxmilian", "57805756732"),
		("Vanderson", "69072479769");