
package herencia;

abstract class Plan {
    private String numeroTelefono;
    private String nombreCliente;

    public Plan(String numeroTelefono, String nombreCliente) {
        this.numeroTelefono = numeroTelefono;
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public abstract double pagoMensual(int mins, int msgs);

    public void imprimir() {
        System.out.println("Número de Teléfono: " + numeroTelefono);
        System.out.println("Nombre del Cliente: " + nombreCliente);
    }
}

class PlanEjemplo extends Plan {
    public PlanEjemplo(String numeroTelefono, String nombreCliente) {
        super(numeroTelefono, nombreCliente);
    }

    public double pagoMensual(int mins, int msgs) {
        double costoPorMinuto = 0.1;
        double costoPorMensaje = 0.05;

        return mins * costoPorMinuto + msgs * costoPorMensaje;
    }
}
