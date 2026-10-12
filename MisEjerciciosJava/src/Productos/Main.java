package Productos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ProductoPanaderia> ListaProductos = new ArrayList<ProductoPanaderia>();

        ListaProductos.add(new ProductoPanaderia(1, "Cañoncito", "Panaderia", 11.20, 10));
        ListaProductos.add(new ProductoPanaderia(2, "Sesamo", "Panaderia", 12.20, 5));
        ListaProductos.add(new ProductoPanaderia(3, "PanAmasado", "Panaderia", 14.10, 6));
        ListaProductos.add(new ProductoPanaderia(4, "JamonQueso", "Panaderia", 13.10, 7));
        ListaProductos.add(new ProductoPanaderia(5, "ChurrosDulces", "Panaderia", 8.13, 20));

        ListaProductos.get(2).setPrecio(8.3);
        ListaProductos.get(1).setPrecio(8.9);

        for (int i = 0; i < ListaProductos.size(); i++) {

            if (ListaProductos.get(i).getPrecio() > 8.5) {
                System.out.println(ListaProductos.get(i));

            }
        }
        for (int i = 0; i < ListaProductos.size(); i++) {
            if (ListaProductos.get(i).getCantidad() <= 10) {

            }
        }
        System.out.println("mi prodcuto Favorito es: " + ListaProductos.get(3).getNombre());
    }

}
