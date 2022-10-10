public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setNombre("Fulano Florez");
        persona1.setEdad(33);
        persona1.setTelefono("+573555555555");

        System.out.println(
            "Nombre: "+persona1.getNombre()
            +"\nEdad: "+persona1.getEdad()
            +"\nTeléfono: "+persona1.getTelefono());
    }
}
