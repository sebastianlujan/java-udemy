package clases;

public class Persona {
    //Atributos de la clase
    public  String nombre;
    private String apellido;
    
    // visible desde afuera de la clase
    // no regreso nada
    // no recibo argumentos
    public void desplegarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    // psvm
    // en vez de crear esta clase usamos una clase externa para test

    /**
     * public static void main(String[] args) {
     * <p>
     * }
     **/
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String str) {
        apellido = str;
    }

}
