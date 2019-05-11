# ReciclARG
## Sistema de apoyo a los Puntos Limpios

## Uses case specification: Ver estadísticas

### 1. Brief description
El caso de uso permite a un usuario ver sus estadisticas de reciclaje. Actor primario: Usuario.

### 2. Basic flow of events
1. El caso de uso comienza cuando un usuario desea ver sus estadísticas personales.
2. [punto de extensión] PTO3 Usuario no logueado.
3. El sistema pide al usuario que ingrese un periodo de tiempo.
4. El sistema busca en la base de datos los acopios realizados en el lapso de tiempo seleccionado.
5. El sistema calcula las estadísticas y crea las gráficas correspondientes.
6. El sistema muestra por pantalla las estadísticas y gráficas.
7. Fin de caso de uso.

### 3. Alternative flow
No aplica.

### 4. Key scenarios
Un usuario ingresa a la sección de estadísticas y selecciona para ver las estadísticas de los últimos 40 días. El sistema muestra por pantalla las estadísticas de del usuario en el lapso de tiempo seleccionado junto con las gráficas correspondientes.

### 5. Preconditions
No aplica.

### 6. Postconditions
No aplica.

### 7. Extension Points
Extiende el caso de uso Login. Es insertado en el punto de extensión PTO3, cuando se cumple la condición [El usuario no se encuentra logueado].

### 8. Special requirements
No aplica.

### 9. Aditional information
No aplica.

