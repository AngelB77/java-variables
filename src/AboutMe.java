public class AboutMe {
    public static void main(String[] args) {
        //inicializar una variable (del tipo que veas conveniente) para cada uno de los siguentes datos: nombre, edad, país, lenguaje de programación, horas, pasatiempo, lugar y reemplaza en el texto de impresión, la variable que corresponda.

        //Escribe tu código aquí
String nombre = "Angel";
byte edad = 47;
String país = "España";
String lenguajeDeProgramación = "Java";
double horas = 5.50;
String pasatiempo = "Astronomia";
String lugar = "el campo";

        //Reemplaza <name> y <age> concatenando el String con las variables creadas. 
        System.out.println ("Mi nombre es "+ nombre +" tengo "+ edad +" años y soy de " + país + "." );

        //Reemplaza <programmingLanguage> y <hours> concatenando el String con las variables creadas. 
        System.out.println("Estoy estudiando " +lenguajeDeProgramación+ " y practico " +horas+ " horas al día.");

        //Reemplaza <hobby> y <place> concatenando el String con las variables creadas.
        System.out.println("Mi pasatiempo favorito es " +pasatiempo+ " y lo practico en " +lugar+ ".");
    }
}
