
DROP table if exists producto;
DROP table if exists usuario;
CREATE TABLE producto (
  Nombre varchar(50) NOT NULL ,
  Precio varchar(3) NOT NULL,
  Imagen varchar(50),
  Id varchar (2) NOT NULL PRIMARY KEY
);

CREATE TABLE usuario (
  Nombre varchar(50)  NOT NULL PRIMARY KEY,
  Pass varchar(8) NOT NULL,
  Email varchar(50) NOT NULL,
  Direccion varchar(50) NOT NULL,
  Telefono varchar(50) NOT NULL
);
insert into producto (Nombre,Precio,Imagen,ID) values ('Pienso para perro. 1 kg','10','/resources/img/1.jpg','1');
insert into producto (Nombre,Precio,Imagen,ID) values ('Atun para gatos. 0.5 kg','5','/resources/img/2.jpg','2');
insert into producto (Nombre,Precio,Imagen,ID) values ('Alpiste para pajaro. 1 kg','4','/resources/img/3.jpg','3');
insert into producto (Nombre,Precio,Imagen,ID) values ('Comida para peces. Bote de 0.5 kg','12','/resources/img/4.jpg','4');
insert into producto (Nombre,Precio,Imagen,ID) values ('Masticador para perro','25','/resources/img/5.jpg','5');
insert into producto (Nombre,Precio,Imagen,ID) values ('Arenero para gatos','30','/resources/img/6.jpg','6');
insert into producto (Nombre,Precio,Imagen,ID) values ('Pecera','50','/resources/img/7.jpg','7');
insert into producto (Nombre,Precio,Imagen,ID) values ('Jaula para pajaros','40','/resources/img/8.jpg','8');
select * from usuario;
select * from producto;
