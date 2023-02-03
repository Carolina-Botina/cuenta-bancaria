CREATE TABLE cliente (
  cedula varchar(12) PRIMARY KEY NOT NULL,
  primer_nombre varchar(45) NOT NULL,
  segundo_nombre varchar(45),
  primer_apellido varchar(45) NOT NULL,
  segundo_apellido varchar(45),
  fecha_nacimiento date NOT NULL,
  correo varchar(45),
  telefono varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE login (
  id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  cliente_cedula varchar(12) NOT NULL,
  contrasena varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE login
  ADD KEY fk_login_cliente_idx (cliente_cedula);

ALTER TABLE login
  ADD CONSTRAINT fk_cedula_cliente_cedula FOREIGN KEY (cliente_cedula) REFERENCES cliente (cedula) ON DELETE RESTRICT ON UPDATE CASCADE;

CREATE TABLE cuenta (
  numero_cuenta varchar(12) PRIMARY KEY NOT NULL,
  saldo_total float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE cliente_cuenta (
  cliente_cedula varchar(12) NOT NULL,
  cuenta_numero_cuenta varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE cliente_cuenta
  ADD PRIMARY KEY (cliente_cedula,cuenta_numero_cuenta),
  ADD KEY fk_cliente_cuenta_cuenta_idx (cuenta_numero_cuenta),
  ADD KEY fk_cliente_cuenta_cliente_idx (cliente_cedula);

ALTER TABLE cliente_cuenta
  ADD CONSTRAINT fk_cliente_cuenta_cliente FOREIGN KEY (cliente_cedula) REFERENCES cliente (cedula) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT fk_cliente_cuenta_cuenta FOREIGN KEY (cuenta_numero_cuenta) REFERENCES cuenta (numero_cuenta) ON DELETE RESTRICT ON UPDATE CASCADE;

CREATE TABLE transaccion (
  id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  tipo_transaccion varchar(45) NOT NULL,
  monto float NOT NULL,
  fecha date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE cuenta_transaccion (
  cuenta_numero_cuenta varchar(12) NOT NULL,
  transaccion_id int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE cuenta_transaccion
  ADD PRIMARY KEY (cuenta_numero_cuenta,transaccion_id),
  ADD KEY fk_cuenta_transaccion_transaccion_idx (transaccion_id),
  ADD KEY fk_cuenta_transaccion_cuenta_idx (cuenta_numero_cuenta);

ALTER TABLE cuenta_transaccion
  ADD CONSTRAINT fk_cuenta_transaccion_cuenta FOREIGN KEY (cuenta_numero_cuenta) REFERENCES cuenta (numero_cuenta) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT fk_cuenta_transaccion_transaccion FOREIGN KEY (transaccion_id) REFERENCES transaccion (id) ON DELETE RESTRICT ON UPDATE CASCADE;
