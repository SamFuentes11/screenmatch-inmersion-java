import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión de Java");
        //System.out.println("Película Matrix");

        // Declaración de variables
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película de ciencia ficción y tecnología del último milenio.
                """;
        int fechaDeLanzamiento = 1999;
        double evaluacion = 5;
        boolean incluidaEnElPlanBasico = true;
        double mediaEvaluacionUsuario = 0;

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

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaPelicula = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaPelicula;
        }
        System.out.println("La media de la película " +
                nombre + " calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}