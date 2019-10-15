package e_clases;
public class PersonaPrueba2 {
    public static void main(String[] args) {
        Persona persona1 = new Persona ();
        persona1.nombre = "Fabian";
        persona1.apellidoPaterno = "Zabala";
        persona1.apellidoMaterno = "Pardo";
        System.out.println ("Persona 1");
        persona1.desplegarNombre ();

        Persona persona2 = new Persona ();
        persona2.nombre = "ROI";
        System.out.println (" \nPersona 2");
        persona2.desplegarNombre ();
    }
}
