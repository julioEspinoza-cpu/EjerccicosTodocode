package claseGym;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Gym> clase = new ArrayList<>();

        clase.add(new Gym("aero", "juan", 10, 5.5, true));
        clase.add(new Gym("box", "albert", 25, 10.5, false));
        clase.add(new Gym("tae", "manu", 35, 11.20, true));
        clase.add(new Gym("run", "isma", 50, 8.50, false));

        clase.get(2).suspenderClase();
        System.out.println("la clase " + clase.get(2).getNombreClase() + " esta activa? " + clase.get(2).isActiva());

        // String claseMayor = "le asigno la clase 0 " + clase.get(0).getNombreClase();

        Gym claseMayor = clase.get(0);

        for (Gym g1 : clase) {
            if (g1.getCapacidadMaxima() > claseMayor.getCapacidadMaxima()) {

                claseMayor = g1;

            }

        }
        System.out.println(" La clase se llama : " + claseMayor.getNombreClase() + " con la mayor capacidad de "
                + claseMayor.getCapacidadMaxima());
        for (Gym g : clase) {

            // 2. El 'if' revisa si la clase de la vuelta actual está activa (true)
            if (g.isActiva()) {

                // 3. Si está activa, imprimimos su nombre en la pantalla
                System.out.println("Clase activa: " + g.getNombreClase());
            }
        }

    }

}
// ERROR: Declarar la variable como String solo guarda el texto del nombre.
// Al hacer eso, pierdes el acceso a la capacidad máxima y no podrás compararla
// en el bucle.
// String claseMayor = "le asigno la clase 0 " + clase.get(0).getNombreClase();

// CORRECCIÓN: Declarar la variable como tipo 'Gym' guarda el objeto completo.
// De esta manera, el programa recordará todos sus atributos (nombre, capacidad,
// precio, etc.).
// Gym claseMayor = clase.get(0);
// =================================================================
// 🚩 TUTORÍA DE JAVA: CONTINUAR AQUÍ CON EL BUCLE DEL NÚMERO MAYOR
// =================================================================
