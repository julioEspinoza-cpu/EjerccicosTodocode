package evento;

public class Evento {

    int id = 0;
    String nombreEvento = "";
    String tipoEvento = "";
    int cantidadInvitados = 0;
    double precio = 0;
    boolean estado = true;

    public Evento() {

    }

    public Evento(int id, String nombreEvento, String tipoEvento, int catidadInvitados, double precio, boolean estado) {
        this.id = id;
        this.nombreEvento = nombreEvento;
        this.tipoEvento = tipoEvento;
        this.cantidadInvitados = catidadInvitados;
        this.precio = precio;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getCatidadInvitados() {
        return cantidadInvitados;
    }

    public void setCatidadInvitados(int catidadInvitados) {
        this.cantidadInvitados = catidadInvitados;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    };

    public double calcularPrecioTotal() {

        double total = precio / cantidadInvitados;
        return total;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", nombreEvento='" + nombreEvento + '\'' +
                ", tipoEvento='" + tipoEvento + '\'' +
                ", catidadInvitados=" + cantidadInvitados +
                ", precio=" + precio +
                ", estado=" + estado +
                '}';
    }

}
