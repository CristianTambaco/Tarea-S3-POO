public class Persona {
    private String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre() + ", Edad: " + edad);
    }


    public static void main(String[] args) {
        // Crear un objeto Persona
        Persona persona1 = new Persona("Juan", 25);
        persona1.mostrarInfo(); // Mostrar información de la persona

        // Modificar el nombre
        persona1.setNombre("Carlos");
        persona1.mostrarInfo(); // Mostrar información actualizada
    }


}
