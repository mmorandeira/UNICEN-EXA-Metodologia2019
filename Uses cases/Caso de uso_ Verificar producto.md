# ReciclARG
## Sistema de apoyo a los Puntos Limpios

## Uses case specification: Verificar producto

### 1. Brief description
El caso de uso permite comprobar si un producto existe en la base de datos.

### 2. Basic flow of events
1. El caso de uso comienza cuando se requiere verificar la existencia de un producto en la base de datos.
2. El sistema recibe el código de un producto y verifica su existencia dentro de la base de datos.
3. El sistema responde la consulta.
4. El caso de uso finaliza.

### 3. Alternative flow
No aplica.

### 4. Key scenarios
Se recibe el código de un producto. El sistema lo busca dentro de la base de datos existente y como no lo encuentra, responde avisando de lo acontecido.

Respuesta positiva: Se recibe el código de un producto, el sistema responde que el producto existe en la base de datos a quien haya solicitado la consulta.

### 5. Preconditions
Un usuario o administrador ingresado envía un código de un producto a través del sistema.

### 6. Postconditions
El sistema responde la solicitud (positiva o negativamente) a quien la haya realizado.

### 7. Extension Points
No aplica.

### 8. Special requirements
No aplica.

### 9. Aditional information
No aplica.

