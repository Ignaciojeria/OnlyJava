# Conceptos:

## Clase: 
- Es la estructura desde la que nace el objeto. "Campo" es un ejemplo de clase.


## Objeto:
- Es una "instancia" o "ejemplar de clase". Por ejemplo: "Campo instanciaCampo = new Campo()" dónde "instanciaCampo" es el objeto

## Polimorfismo: 
- Permite asignar una instancia de tipo hija en una instancia de tipo padre. Ejemplo: "Animal animal = new Vaca();" Esto es posible porque la clase Vaca hereda de la clase Animal. 

## Clase abstracta: 
- permite definir métodos abtractos. "Animal" es una clase abstracta que define un método abstracto llamado "emitirSonido();" las clases hijas deben obligatoriamente definir el comportamiento de este método. Si quieres instancias una clase abstracta debes hacer uso de clases anonimas de la siguiente manera: instanciaAnimal= new Animal(){
@Override public void emitirSonido(){
System.out.println("Me instancié con una clase anonima para sobre escribir mi metodo abstracto")} }

## Interfaz: 
- Sólo pueden definir métodos abstractos y las clases que implementan estas interfaces deben sobre-escribirlas de forma obligatoria.

## Método estatico:
un método estatico se define dentro de una clase de la siguiente manera: public static miMetodoEstatido(){
System.out.println("Me he definido de forma estatica");}.
Para llamar a un método estatico no necesitas una instancia o ejemplar de clase. Estos métodos se llaman de la siguiente manera: Clase.miMetodoEstatico();

## atributo estatico
- Un atributo estatico se comparte con todo los objetos o instancias de la clase que contenga este atributo,es decir, el valor es el mismo y si cambia en alguna de las intancias, entonces, el valor de ese atributo de tipo "static" será el mismo para toda las instancias provenientes de la clase que hace definición de ese atributo estatico.

# Dominio:
- Animal: Es una clase abstracta que contiene las caracteristicas generales de los animales
- Cabra: Hereda las caracteristicas generales de un 'Animal' y sobre-escribe el método abstracto de emitirSonido();
- Oveja : Hereda las caracteristicas generales de un 'Animal' y sobre-escribe el método abstracto de emitirSonido();
- Vaca: Hereda las caracteristicas generales de un 'Animal' y sobre-escribe el método abstracto de emitirSonido();
- Campo: Define una lista de animales por "agregación" y está ubicado en una determinada latitud,longitud.
- Establo: Define una lista de animales por "agregación" y el nombre de dicho establo.

# Repositorio (Singletons):
- AnimalRepository: Es un banco de datos de animales que contiene una lista de Animales. hace uso del patron de diseño "Singleton", esto significa que es un objeto unico y global, tiene una única instancia que se define dentro de sí mismo y no puede ser instanciado por fuera pero sí accedido por fuera desde su método estatico "getInstance()".

- CampoRepository: Es un banco de datos para la clase "Campo".

- EstabloRepository: Es un banco de datos para la clase "Establo"

# Detalles de la aplicación:

- La aplicación tiene un conjunto de animales con su correspondiente banco de datos. Cada banco de datos trabaja con su correspondiente objeto de dominio, es decir, "AnimalRepository" es un banco de datos de animales, "CampoRepository"  es un banco de datos de "Campo" y EstabloRepository es un banco de datos de "Establo".
Cada banco de datos tiene su servicio correspondiente, A estos servicios se les hace una "inyección de dependencias" del Repositorio(Banco de datos) dentro de la definición del constructor. Cada Servicio implementa una interfaz que define 2 métodos abstractos "recogerAnimales();" y "AgregarAnimales();". Estos métodos abstractos tienen la responsabilidad de quitar animales del banco de datos asociados a ese servicio o agregar animales a un determinado banco de datos dependiendo de cual se use.

# Topicos
- clases
- clases abstractas
- Interfaces
- herencia
- polimorfismo
- Listas
- modificadores de acceso (private, static, public)
- patrón de diseño singleton
- patrón inyección de dependencias
- estructura general de una aplicación decentemente acoplada y con responsabilidades independientes.

# Método main:

- Se le inyecta a cada uno de los servicios su correspondiente banco de datos.
- Sacamos animales de un banco de datos para pasarlo a otro banco de datos.


## Ejercicio 1
- Agregar un Objeto de dominio "Cerdo"
- Añadir un conjunto de cerdos al banco de datos "AnimalRepository" inicial.
- Ejecutar aplicación y observar comportamiento.

## Ejercicio 2
- Agregar un Objeto de dominio que se llame "Matadero"
- crear un banco de datos para Matadero(MataderoRepository) 
