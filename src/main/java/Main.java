import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Danilo", "Perez"));
        personas.add(new Persona("Juliana", "Santos"));
        personas.add(new Persona("Margarita", "Aguilar"));
        personas.add(new Persona("Arturo", "Zapata"));
        personas.add(new Persona("Wilmar", "Botero"));

        System.out.println("Orden inicial: ");
        personas.forEach(p ->
                System.out.println(p.toString()
                ));

        System.out.println("---------------------------------------------");

        //Ordenando por nombre
        System.out.println("Orden por nombre: ");
        personas.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        personas.forEach(p ->
                System.out.println(p.toString()
                ));

        System.out.println("---------------------------------------------");

        //Ordenando por apellido
        System.out.println("Orden por apellido: ");
        personas.sort((p1, p2) -> p1.getApellido().compareTo(p2.getApellido()));
        personas.forEach(p ->
                System.out.println(p.toString()
                ));

        System.out.println("---------------------------------------------");

        //Ordenando inversamente por apellido
        System.out.println("Orden inverso por apellido: ");
        personas.sort((p1, p2) -> p2.getApellido().compareTo(p1.getApellido()));
        personas.forEach(p ->
                System.out.println(p.toString()
                ));
    }
}
