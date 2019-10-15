package p_encapsulamiento;

public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Persona persona1 = new Persona ("Fabian", "Zabala", true);
        System.out.println ("Nombre = " + persona1.getNombre ());
        persona1.setNombre ("Dany");
        System.out.println ("Nombre = " + persona1.getNombre ());

        System.out.println (persona1);

        persona1.setBorrado (false);
        System.out.println (persona1);
    }
}
