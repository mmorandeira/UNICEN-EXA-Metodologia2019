# ReciclARG
## Sistema de apoyo a los Puntos Limpios

## Uses case specification: Registrar Acopio

### 1. Brief description
Este caso de uso provee al usuario la funcionalidad de registrar un producto reciclable. Actor primario: Usuario.

### 2. Basic flow of events
1. El caso de uso comienza cualdo el usuario quiere registrar un acopio.
2. [punto de extension] PTO1/ El usuario no se encuentra logueado.
3. El sistema da opción de cómo ingresar los datos.
4. El usuario ingresa los datos (código de barra, cantidad).
5. [include] Verificar producto.
6. Se guarda el acopio en la base de datos.
7. Fin de caso de uso.

### 3. Alternative flow

#### 3. El sistema no encuentra el producto en la base de datos.
3.1 El sistema avisa al usuario que el producto no está registrado y se rechaza el acopio.
3.2 El sistema genera una petición para agregar un nuevo producto a la base de datos.
3.3 El caso de uso finaliza.

### 4. Key scenarios
Juan Lopez desea registrar un nuevo acopio en su cuenta. Para eso ingresa los datos del mismo y como el sistema comprueba que el producto no es valido, le avisa al usuario que no se puede realizar el registro.

### 5. Preconditions
No aplica.

### 6. Postconditions
No aplica.

### 7. Extension Points
Extiende el caso de uso Login. Es insertado en el punto de extension PTO1, cuando se cumple la condición [El usuario no se encuentra logueado].

### 8. Special requirements
No aplica.

### 9. Aditional information
No aplica.
