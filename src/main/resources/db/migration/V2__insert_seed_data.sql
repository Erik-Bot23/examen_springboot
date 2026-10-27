--Insertar 50 domicilios
INSERT INTO domicilios (calle, numero_exterior, numero_interior, colonia, codigo_postal, ciudad)
SELECT 'Calle ' || i,
        (100 + i)::text,
        'Int' || i,
        'Colonia ' || i,
        'CP ' || i,
        'Ciudad ' || i 
        FROM generate_series(1, 50) AS i;

--Insertar 50 usuarios
INSERT INTO usuarios (nombre, apellido_paterno, apellido_materno, nombre_usuario, contrasena, nacimiento, domicilio_id)
SELECT 'Nombre ' || i,
        'Paterno ' || i,
        'Materno ' || i,
        'user ' || i,
        'pass',
        DATE '1990-01-01' + (i * INTERVAL '1 day'),
        i
        FROM generate_series(1, 50) AS i;