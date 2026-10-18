package claseGym;

public class Gym {

    String nombreClase = "";
    String profesor = "";
    int capacidadMaxima = 0;
    double precioMensual = 0;
    boolean activa = true;

    public Gym(String nombreClase, String profesor, int capacidadMaxima, double precioMensual, boolean activa) {
        this.nombreClase = nombreClase;
        this.profesor = profesor;
        this.capacidadMaxima = capacidadMaxima;
        this.precioMensual = precioMensual;
        this.activa = activa;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(double precioMensual) {
        this.precioMensual = precioMensual;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    @Override
    public String toString() {
        return "Gym [nombreClase=" + nombreClase + ", profesor=" + profesor + ", capacidadMaxima=" + capacidadMaxima
                + ", precioMensual=" + precioMensual + ", activa=" + activa + ", getNombreClase()=" + getNombreClase()
                + ", getProfesor()=" + getProfesor() + ", getCapacidadMaxima()=" + getCapacidadMaxima()
                + ", getPrecioMensual()=" + getPrecioMensual() + ", isActiva()=" + isActiva()
                + ", calcularIngresoMaximo()=" + calcularIngresoMaximo() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

    public void suspenderClase() {

        this.activa = false;
    }

    public double calcularIngresoMaximo() {

        double Total = capacidadMaxima / precioMensual;
        return Total;

    }

}
