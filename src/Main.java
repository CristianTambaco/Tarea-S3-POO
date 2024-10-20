import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciar un objeto de la clase Empleado con datos quemados
        Empleado empleado1 = new Empleado("Gabriel", 26, 4500);

        // Mostrar los datos del primer empleado
        System.out.println("Empleado #1");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Edad: " + empleado1.getEdad());
        System.out.println("Salario: " + empleado1.getSalario());

        // Ingresar datos del segundo empleado
        Scanner ingreso = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = ingreso.nextLine();

        System.out.print("Ingrese la edad del empleado: ");
        int edad = ingreso.nextInt();

        System.out.print("Ingrese el salario del empleado: ");
        double salario = ingreso.nextDouble();

        // Instanciar o crear otro objeto de la clase Empleado con datos ingresados por el usuario
        Empleado empleado2 = new Empleado(nombre, edad, salario);

        // Mostrar datos del segundo empleado
        System.out.println("\nEmpleado #2");
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Edad: " + empleado2.getEdad());
        System.out.println("Salario: " + empleado2.getSalario());


        ingreso.close();
    }
}
