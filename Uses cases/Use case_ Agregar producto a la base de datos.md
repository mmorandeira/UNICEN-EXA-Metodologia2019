# ReciclARG
## Sistema de apoyo a los Puntos Limpios

## Uses case specification: Agregar producto a la base de datos

### 1. Brief description
El caso de uso permite a un administrador agregar un producto en la base de datos. Actor primario: administrador municipal.

### 2. Basic flow of events
1.  El caso de uso comienza cuando un administrador quiere agregar un producto a la base de datos.   
2.  [Punto de extension] PTO2 el administrador se acaba de ingresar.
3.  El sistema solicita la información del producto (nombre, código de barra, tipo de material, volumen, util.).
4.  El administrador ingresa los datos.
5.  <include> Verificar producto.
6.  Si el producto no existe en la base de datos, se agrega.
7.  El caso de uso termina.

### 3. Alternative flow
#### 3.1 Dato incorrecto
4. El administrador ingresa un dato incorrecto.
4.1 El sistema notifica el error.
4.2 Ir a 3.
#### 3.2  Producto existente
5. El producto ya existe en la base de datos.
5.1  El sistema notifica de la existencia del producto.
5.2  El caso de uso termina.

### 4. Key scenarios
Un administrador recibe una petición para agregar un nuevo producto a la base de datos. Éste se ingresa al sistema y escribe la información del producto en la interfaz de “Agregar Producto”. Finalmente el producto se registra en la base de datos.

### 5. Preconditions
No aplica.
### 6. Postconditions
No aplica.
### 7. Extension Points
Extiende el caso de uso Login. Es insertado en el punto de extensión PTO2, cuando se cumple la condición [Usuario no logueado].
### 8. Special requirements
No aplica.

### 9. Aditional information
No aplica.
