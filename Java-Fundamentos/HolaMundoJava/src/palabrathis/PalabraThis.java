package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona me = new Persona("Sebas", "Lujan");
        System.out.println("Objeto " + me);
    }
}

//segunda clase
// la primera es publica , y las demas se pueden usar en este archivo en el el packete

// si omitimos public e va a ser default o package
// persona es expone en PalabraThis y en pasoPor ref
// pero NO se puede acceder desde paso por valor o clases u otro paquete.
// package visibility means local las clases de mi paquete.
class Persona {
    String nombre, apellido;
    
    Persona(String nombre, String apellido){
        //super();   hace una llamada al constructor por defecto de la clase padre
        // en este caso Object
        // reserva la memoria para mi objeto, y retorna la referencia
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("this: " + this);  // ahora que reserve memoria puedo mostrarla
        new Imprimir().imprimir(this); 
        
        
    }
    
}

class Imprimir {
    
    public Imprimir(){
        super();
    }
    
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir" + persona );
        System.out.println("this desde imprimir" + this );
      // se imprime el objeto que se esta ejecutando en este momento 
      // contexto de la clase Imprimir


    }
}