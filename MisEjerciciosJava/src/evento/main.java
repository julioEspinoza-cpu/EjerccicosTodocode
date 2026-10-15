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

        // Cancelamos el primer evento (el casamiento que está en el índice 0)
        evento.get(3).setReservado(false);

        // Mostramos por pantalla su nombre junto con su nuevo estado (falso/cancelado)
        System.out.println(
                "Evento: " + evento.get(3).getNombreEvento() + " | ¿Está reservado?: " + evento.get(3).isReservado());

    }
}

/*
 * REQUISITOS DEL TRABAJO - EVENTOS:
 * 
 * - Crear una ArrayList de tipo Evento. Crear 5 eventos diferentes y guardarlos
 * en la collection.
 * - Recorrer la ArrayList y mostrar por pantalla el nombre, tipo de evento y
 * cantidad de invitados de cada uno.
 * - Crear un método llamado calcularCostoPorInvitado() que retorne el precio
 * del evento dividido por la
 * cantidad de invitados. Utilizar el método para mostrar por pantalla el costo
 * por invitado de cada evento.
 * - Crear un método llamado cancelarReserva() que permita cambiar el estado de
 * reserva del evento a cancelado.
 * - Cancelar uno de los eventos y mostrar por pantalla su nombre junto con su
 * nuevo estado.
 * - Recorrer la ArrayList y mostrar únicamente los eventos que continúan
 * reservados.
 * - Buscar y mostrar el evento que tenga la mayor cantidad de invitados.
 */
