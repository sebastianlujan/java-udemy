package clases;

public class PruebaPersona {
    // psvm + tab yeahhh!
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.nombre = "Juan";
        // persona1.apellido = "Perez";

        persona1.setApellido("Perez");
        persona1.desplegarInformacion();

        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona1);
        // persona1 = clases.Persona@5674cd4d

        System.out.println("persona2 = " + persona2);
        var mistery = Integer.toHexString(persona2.hashCode());
        System.out.println("mistery = " + mistery);
        // persona2 = clases.Persona@63961c42

        persona2.desplegarInformacion();

        persona2.nombre = persona1.nombre;
        persona2.setApellido("cito");
        persona2.desplegarInformacion();

    }

}
