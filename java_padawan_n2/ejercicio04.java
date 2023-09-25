public class ejercicio04 {
    public static void main(String[] args) {
        // Datos de personas: nombres y edades
        String[] nombres = {"fran", "tami", "nati", "rocio", "tani"};
        int[] edades = {32, 29, 30, 29, 25};

        // Calcular el promedio de edades sin bucles
        int promedioEdades = (edades[0] + edades[1] + edades[2] + edades[3] + edades[4]) / edades.length;

        // Mostrar los nombres y edades de las personas
        System.out.println("Nombres y edades de las personas:");
        System.out.println(nombres[0] + ": " + edades[0] + " años");
        System.out.println(nombres[1] + ": " + edades[1] + " años");
        System.out.println(nombres[2] + ": " + edades[2] + " años");
        System.out.println(nombres[3] + ": " + edades[3] + " años");
        System.out.println(nombres[4] + ": " + edades[4] + " años");

        // Mostrar el promedio de edades
        System.out.println("El promedio de edades es: " + promedioEdades + " años");
    }
}
