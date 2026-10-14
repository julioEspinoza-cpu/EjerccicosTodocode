package evento;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Evento> evento = new ArrayList<Evento>();

        evento.add(new Evento(1, "casamiento", "casorio", 60, 128.20, true));
        evento.add(new Evento(2, "cumpleaños", "cumple", 25, 80.10, false));
        evento.add(new Evento(3, "Bautismo", "Bauti ", 100, 158.50, true));
        evento.add(new Evento(4, "finDeAño", "Empresa", 50, 80.20, true));
        evento.add(new Evento(5, "Aniversario", "Escuela", 160, 528.30, true));

        for (int i = 0; i < evento.size(); i++) {

            System.out.println(evento.get(i).getNombreEvento() + " - " + evento.get(i).getTipoEvento() + " - "
                    + evento.get(i).getCatidadInvitados());

        }

        System.out.println("El precio del evento Bautismo por invitado : " + evento.get(2).calcularPrecioTotal());

    }
}
// faltan los