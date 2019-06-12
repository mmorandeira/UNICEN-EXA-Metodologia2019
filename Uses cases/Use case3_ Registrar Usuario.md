# ReciclARG 
## Sistema de apoyo a los Puntos Limpios

## Uses case specification: Registrar Usuario

### 1. Brief description
El caso de uso permite registrar un usuario nuevo en el sistema ReciclARG.Actor primario : Usuario
### 2. Basic flow of events

1. El caso de uso comienza cuando el usuario quiere registrarse.
2. El usuario ingresa el email y la contraseña.
3. El usuario ingresa nombre, apellido y dirección.
4. El sistema verifica que los datos y la contraseña ingresados tengan el formato correcto.
5. El sistema verifica que el mail no se encuentre registrado.
6. El sistema guarda la información.
7. Fin del caso de uso.

### 3. Alternative flow
#### 5 - Email ya esta registrado

3.1.1 El sistema avisa que el email ya se encuentra asociado a una cuenta existente.

3.1.2 Fin del caso de uso
#### 4 - Los datos ingresados no cumplen con el formato requerido

3.2.1. El sistema marca las casillas donde los datos ingresados no fueron los correctos

3.2.2 El flujo vuelve al punto 2 del curso basico.

### 4. Key scenarios
-   Un usuario decide registrarse al sistema. Ingresa el mail "[morandeiramatias@gmail.com](mailto:morandeiramatias@gmail.com)", contraseña "12345678" su nombre "Matias" su apellido es "morandeira" su dirección es "alem 674" y si no hay errores de formato se crea el nuevo usuario.
- Un nuevo usuario quiere registrarse en el sistema. Para ello ingresa el email "[luis-a@gmail.com](mailto:luis-a@gmail.com)" y la contraseña "Metodologias2019". Luego de ésto completa sus otros datos: Nombre "Luis", Apellido "Alvarez", dirección "Sarmiento 671".
Como el sistema, al verificar los datos ingresados constata que el email ya se encuentra registrado, le avisa a Luis que no se puede realizar el registro debido a lo ocurrido.
### 5. Preconditions
El email no se encuentra registrado en el sistema.
Los datos utilizados en el registro son válidos.
### 6. Postconditions
No aplica
### 7. Extension Points
No aplica
### 8. Special requirements
No aplica
### 9. Aditional information
No aplica
