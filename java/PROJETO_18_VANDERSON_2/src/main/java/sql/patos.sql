CREATE DATABASE patos;
USE patos;

SELECT * FROM patos;

CREATE TABLE patos(
	pato_ID INT PRIMARY KEY AUTO_INCREMENT,
    pato_nome VARCHAR(50) NOT NULL,
    pato_descicao VARCHAR(50) NOT NULL
    );
    
INSERT INTO patos(pato_nome,pato_descicao)
	VALUES("Patolino","Fala e Cospe"),
          ("Patolinildo","PLATIna na ultima olimpiada"),
          ("Patolino Louco","Revelação na PATInação"),
          ("Pato DDS","Recordista Patonal")
          ;