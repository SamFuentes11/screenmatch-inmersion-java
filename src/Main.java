import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión de Java");
        //System.out.println("Película Matrix");

        // Declaración de variables
        String nombre = "Star Wars Ep. III: La Venganza de los Sith";
        String sinopsis = """
                La mejor película de ciencia ficción y acción intergaláctica de todos los tiempos.
                """;
        int fechaDeLanzamiento = 2005;
        double evaluacion = 4.7;
        boolean incluidaEnElPlanBasico = true;

        System.out.println("Película: " + nombre);
        System.out.println("Sinópsis: " + sinopsis);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println(incluidaEnElPlanBasico);

        double mediaEvaluacion = (5 + 4.5 + 3) / 3;
        System.out.println("Media de evaluación de " + nombre + ": " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Película popular del momento.");
        } else {
            System.out.println("Película Retro que vale la pena ver.");
        }

        double mediaEvaluacionUsuario = 0;
        // Utilizando ciclo While
        int i = 0;
        while (i < 3) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a " + nombre);
            double notaPelicula = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaPelicula;
            i++;
        }

        /*
        // Utilizando ciclo For
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a " + nombre);
            double notaPelicula = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaPelicula;
        }*/
        System.out.println("La media de la película " +
                nombre + " calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}