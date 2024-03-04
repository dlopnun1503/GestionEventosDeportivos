# GESTION EVENTOS DEPORTIVOS

## David López Núñez
## Juan Antonio Rodríguez

### **Descripción del proyecto**
Descripción del proyecto dada por David

### Sistema de clases/Herencia/Interfaces implementadas en el proyecto
Hemos creado una aplicación de gestión de eventos deportivos donde encontramos una serie de clases.

Empezamos creando una clase llamada Participante donde encontramos 3 atributos de tipo String y uno tipo int, con los que crearemos
el constructor y los getters y setters. Además va a tener un método toString, que devuelve información acerca de los participantes, 
y un método equals que compara si dos participantes son iguales por su dni.

Seguimos creando una nueva clase llamada ParticipanteCarrera, que hereda de la clase anterior, y que aparte de contener los atributos anteriores, 
va a contener un atributo propio de tipo double, además del constructor, getters y setters y el método toString.

A continuación creamos una interface llamada Ganador que va a tener un método obtenerGanador que va a devolver un objeto de tipo Participante.

Creamos una nueva clase, en este caso abstracta, llamada EventoDeportivo, que va a implementar la interface Ganador, 
y que aparte va a tener sus propios atributos con el constructor y getters y setter, el método obtenerGanador de la interface sobreescrito y un propio método que se usará
para inscribir participantes, que recibirá por parámetro un objeto Participante y devolverá un boolen.

Seguimos creando dos clases más, TorneoDeFutbol y ParticipanteCarrera, ambas heredarán de EventoDeportivo e implementarán el método obtenerGanador. 
Estas clases tendrán sus propios atributos y constructor, además de los getters y setters. Además la clase TorneoDeFutbol tendrá un método inscribirEquipo.

Para ir terminando creamos una nuevla clase llamada Equipo que implementará la interfaz comparable, 
además tendrá sus propios métodos y atributos. 

Para terminar creamos un main donde comprobaremos las pruebas necesarias para la realización del proyecto. Estas pruebas las realizaremos llamando a los métodos de las clases que hemos creado.
