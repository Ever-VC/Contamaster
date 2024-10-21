## CONSULTAS PARA CREAR LA BASE DE DATOS Y LOS ROLES POR DEFECTO
```
-- Crear la tabla de empresas
CREATE TABLE empresa (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(255),
    email VARCHAR(100)
);

-- Crear la tabla de roles
CREATE TABLE rol (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

-- Crear la tabla de usuarios
CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    --sexo VARCHAR(25) NOT NULL,
    fecha_nacimiento DATE,
    direccion VARCHAR(255),
    email VARCHAR(100),
    username VARCHAR(25) NOT NULL,
    password TEXT NOT NULL,
    id_rol_fk INT REFERENCES rol(id) ON DELETE CASCADE
);

-- Crear la tabla de seguimiento de sesiones
CREATE TABLE session_log (
    id SERIAL PRIMARY KEY,
    login_timestamp TIMESTAMP NOT NULL,
    logout_timestamp TIMESTAMP,
    id_usuario_fk INT REFERENCES usuario(id) ON DELETE CASCADE
);

-- Crear la tabla de cuentas contables
CREATE TABLE cuenta (
    id SERIAL PRIMARY KEY,
    codigo VARCHAR(50) NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    saldo DECIMAL(10, 2),
    id_empresa_fk INT REFERENCES empresa(id) ON DELETE CASCADE
);

-- Crear la tabla de asientos contables (movimientos de cuentas)
CREATE TABLE movimiento (
    id SERIAL PRIMARY KEY,
    fecha DATE NOT NULL,
    descripcion VARCHAR(100),
    debe DECIMAL(10, 2) NOT NULL,
    haber DECIMAL(10, 2) NOT NULL,
    id_cuenta_fk INT REFERENCES cuenta(id) ON DELETE CASCADE
);

-- Crear la tabla del libro mayor para almacenar lo cálculos de cada cuenta mensualmente
CREATE TABLE mayor (
    id SERIAL PRIMARY KEY,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    total_debe DECIMAL(10, 2) NOT NULL,
    total_haber DECIMAL(10, 2) NOT NULL,
    saldo_anterior DECIMAL(10, 2) NOT NULL,
    saldo DECIMAL(10, 2) NOT NULL,
    id_cuenta_fk INT REFERENCES cuenta(id) ON DELETE CASCADE
);

-- Crear tabla de asientos (transacciones, es decir varios movimientos pertenecientes a una transacción) para almacenar los movimientos de las cuentas
CREATE TABLE asiento (
    id SERIAL PRIMARY KEY,
    fecha DATE NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    total_debe DECIMAL(10, 2) NOT NULL,
    total_haber DECIMAL(10, 2) NOT NULL,
    id_usuario_fk INT REFERENCES usuario(id) ON DELETE CASCADE
);

-- Crear tabla de detalle de asientos (movimientos de cuentas pertenecientes a un asiento)
CREATE TABLE detalle_asiento (
    id SERIAL PRIMARY KEY,
    id_movimiento_fk INT REFERENCES movimiento(id) ON DELETE CASCADE,
    id_asiento_fk INT REFERENCES asiento(id) ON DELETE CASCADE
);

-- Insertar los roles por defecto
INSERT INTO rol (nombre) VALUES ('Administrador'), ('Contador'), ('Auxiliar'), ('Gerente');
```
