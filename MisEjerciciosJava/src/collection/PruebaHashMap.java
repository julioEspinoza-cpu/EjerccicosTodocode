package collection;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {

    public static void main(String[] args) {

        Map<Integer, String> mapaEmpleados = new HashMap<>();

        mapaEmpleados.put(1523, "Suscribite a TodoCode");
        mapaEmpleados.put(1524, "Ibra El Yorkie");
        mapaEmpleados.put(1525, "Juan Perez");
        mapaEmpleados.put(1526, "Ibai");
        mapaEmpleados.put(1527, "Juan ");

        boolean estaono = mapaEmpleados.containsValue("Gabriel Gomez");

        if (estaono == true) {
            System.out.println("El valor buscado está");
        } else {
            System.out.println("El valor buscado no está");
        }
        // Metodos que pueden llegar a servir puede llegar a servir
        System.out.println(mapaEmpleados.values());
        System.out.println(mapaEmpleados.keySet());

        // Mas ejemplo de otros metodos
        String nombre = mapaEmpleados.get(1524);
        System.out.println("El empleado buscado es : " + nombre);

        // remove
        mapaEmpleados.remove(1527);
        System.out.println(mapaEmpleados);

    }

}

/*
 * Es importante que te acuerde de la clave valor de cada cosa por que es lo
 * que funciona para buscar, lo podes
 * cabiar con los diferentes metodos en el ejemplo see utiliza containsVAlue,
 * pero lo poder hacer el con el key tambien.
 * revisa el codio y fijate cual es mejor para practicar .
 */