-- Insertar clientes
INSERT INTO cliente (nombre, correo) VALUES ('Juan Pérez', 'juan.perez@example.com');
INSERT INTO cliente (nombre, correo) VALUES ('María Gómez', 'maria.gomez@example.com');
INSERT INTO cliente (nombre, correo) VALUES ('Carlos López', 'carlos.lopez@example.com');
INSERT INTO cliente (nombre, correo) VALUES ('Ana Martínez', 'ana.martinez@example.com');
INSERT INTO cliente (nombre, correo) VALUES ('Luis Torres', 'luis.torres@example.com');
INSERT INTO cliente (nombre, correo) VALUES ('Laura Hernández', 'laura.hernandez@example.com');
INSERT INTO cliente (nombre, correo) VALUES ('Pedro Sánchez', 'pedro.sanchez@example.com');
INSERT INTO cliente (nombre, correo) VALUES ('Sofía Díaz', 'sofia.diaz@example.com');
INSERT INTO cliente (nombre, correo) VALUES ('Javier Ruiz', 'javier.ruiz@example.com');
INSERT INTO cliente (nombre, correo) VALUES ('Elena Castro', 'elena.castro@example.com');

-- Insertar productos
-- Alimentos
INSERT INTO producto (nombre, precio) VALUES ('Manzanas', 2.99);
INSERT INTO producto (nombre, precio) VALUES ('Peras', 3.50);
INSERT INTO producto (nombre, precio) VALUES ('Pan integral', 1.80);
INSERT INTO producto (nombre, precio) VALUES ('Leche', 1.20);
INSERT INTO producto (nombre, precio) VALUES ('Yogur', 0.99);
INSERT INTO producto (nombre, precio) VALUES ('Arroz', 0.89);
INSERT INTO producto (nombre, precio) VALUES ('Pollo', 5.99);
INSERT INTO producto (nombre, precio) VALUES ('Pasta', 1.50);
INSERT INTO producto (nombre, precio) VALUES ('Aceite de oliva', 4.50);
INSERT INTO producto (nombre, precio) VALUES ('Sal', 0.50);
INSERT INTO producto (nombre, precio) VALUES ('Azúcar', 1.20);
INSERT INTO producto (nombre, precio) VALUES ('Cereal', 3.00);
INSERT INTO producto (nombre, precio) VALUES ('Galletas', 2.50);

-- Bebidas
INSERT INTO producto (nombre, precio) VALUES ('Agua mineral', 1.00);
INSERT INTO producto (nombre, precio) VALUES ('Jugo de naranja', 2.00);
INSERT INTO producto (nombre, precio) VALUES ('Cerveza', 1.50);
INSERT INTO producto (nombre, precio) VALUES ('Vino tinto', 8.00);
INSERT INTO producto (nombre, precio) VALUES ('Refresco', 1.25);

-- Productos de limpieza
INSERT INTO producto (nombre, precio) VALUES ('Detergente', 4.00);
INSERT INTO producto (nombre, precio) VALUES ('Suavizante', 3.00);
INSERT INTO producto (nombre, precio) VALUES ('Limpiador multiusos', 2.50);
INSERT INTO producto (nombre, precio) VALUES ('Jabón de mano', 1.50);
INSERT INTO producto (nombre, precio) VALUES ('Esponjas', 0.75);

-- Electrodomésticos
INSERT INTO producto (nombre, precio) VALUES ('Licuadora', 29.99);
INSERT INTO producto (nombre, precio) VALUES ('Tostadora', 19.50);
INSERT INTO producto (nombre, precio) VALUES ('Microondas', 99.99);
INSERT INTO producto (nombre, precio) VALUES ('Cafetera', 45.75);
INSERT INTO producto (nombre, precio) VALUES ('Batidora', 35.20);

-- Ropa
INSERT INTO producto (nombre, precio) VALUES ('Camisa', 25.00);
INSERT INTO producto (nombre, precio) VALUES ('Pantalones', 40.00);
INSERT INTO producto (nombre, precio) VALUES ('Zapatos', 60.00);
INSERT INTO producto (nombre, precio) VALUES ('Vestido', 50.00);
INSERT INTO producto (nombre, precio) VALUES ('Chaqueta', 80.00);

-- Insertar ventas (usando ids de cliente y producto existentes)
INSERT INTO venta (cliente_id, producto_id, fecha_venta) VALUES (1, 1, NOW());
INSERT INTO venta (cliente_id, producto_id, fecha_venta) VALUES (2, 2, NOW());
INSERT INTO venta (cliente_id, producto_id, fecha_venta) VALUES (3, 3, NOW());
INSERT INTO venta (cliente_id, producto_id, fecha_venta) VALUES (4, 4, NOW());
INSERT INTO venta (cliente_id, producto_id, fecha_venta) VALUES (5, 5, NOW());
INSERT INTO venta (cliente_id, producto_id, fecha_venta) VALUES (6, 6, NOW());
INSERT INTO venta (cliente_id, producto_id, fecha_venta) VALUES (7, 7, NOW());
INSERT INTO venta (cliente_id, producto_id, fecha_venta) VALUES (8, 8, NOW());
INSERT INTO venta (cliente_id, producto_id, fecha_venta) VALUES (9, 9, NOW());
INSERT INTO venta (cliente_id, producto_id, fecha_venta) VALUES (10, 10, NOW());
