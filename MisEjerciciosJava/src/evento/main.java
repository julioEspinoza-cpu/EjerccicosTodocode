package evento;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Evento> evento = new ArrayList<>();

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

        evento.get(2).cancelarReserva();

        System.out.println(
                "Evento: " + evento.get(2).getNombreEvento() + " | ¿Está reservado?: "
                        + evento.get(2).isReservado());

        for (Evento ev : evento) {
            if (ev.isReservado()) {
                System.out.println(" los reservados son: " + ev.getNombreEvento());
            }

        }

        Evento eventoMayor = evento.get(0);

        for (Evento ev1 : evento) {

            if (ev1.getCatidadInvitados() > eventoMayor.getCatidadInvitados()) {
                eventoMayor = ev1;

            }

        }
        System.out.println("el  mayor evento es: " + eventoMayor.getCatidadInvitados());
    }
}
