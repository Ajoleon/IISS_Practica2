

CREATE TABLE productos (
  Nombre varchar(50) NOT NULL,
  Precio int(11) NOT NULL,
  Imagen int(11) NOT NULL,
  Id int (2) NOT NULL
);

CREATE TABLE usuario (
  Nombre varchar(50)  NOT NULL,
  Pass varchar(8) NOT NULL,
  Email int(11) NOT NULL,
  Direccion int(11) NOT NULL,
  Telefono int(11) NOT NULL,
  Imagen varchar(50) NOT NULL
);
