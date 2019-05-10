# ReciclARG
## Sistema de apoyo a los Puntos Limpios

## Uses case specification: Agregar producto a la base de datos

### 1. Brief description
El caso de uso permite que un usuario registrado inicie sesión. El actor primario: usuario
### 2. Basic flow of events
	1. El caso de uso inicia cuando un usuario quiere iniciar sesion.
	2. El usuario ingresa su email.
	3. [PTO.EXT] PTO2/Usuario no registrado.
	4. El sistema solicita la contraseña.
	5. El sistema verifica que los datos sean válidos y correctos.
	6. El sistema concede acceso a la cuenta del usuario.
	7. Fin del caso de uso.

### 3. Alternative flow
####  Contraseña incorrecta
		5. El usuario ingresa una contraseña incorrecta.
		5.1 El sistema notifica el error.
		5.2 Ir a 4.

### 4. Key scenarios
El usuario ingresa sus datos <JuanPerez@gmail.com, contraseña123>. El sistema verifica que los datos sean correctos y le concede el acceso a su cuenta.
El usuario <MartinS@gmail.com> contraseña <1234Jj> ingresa sus datos para poder acceder a su cuenta. Como el sistema al verificar los mismos detecta que la contraseña es incorrecta, le muestra un mensaje de error y le solicita que ingrese nuevamente la misma.

### 5. Preconditions
	No aplica
	
### 6. Postconditions
	El usuario se encuentra logueado.
	
### 7. Extension Points
Extiende el caso de uso Registrar Usuario. Es insertado en el punto de extensión PTO2, cuando se cumple la condición [El usuario no se encuentra registrado].

### 8. Special requirements

### 9. Aditional information

