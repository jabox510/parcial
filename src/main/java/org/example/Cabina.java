package org.example;

public class Cabina {
    private String nombre;
    private int totalLlamadas;
    private int totalDuracion;
    private int totalCosto;



    public Cabina(String nombre) {
        this.nombre = nombre;
        this.totalLlamadas = 0;
        this.totalDuracion = 0;
        this.totalCosto = 0;
    }


    public int getTotalLlamadas() {
        return totalLlamadas;
    }

    public int getTotalDuracion() {
        return totalDuracion;
    }

    public int getTotalCosto() {
        return totalCosto;
    }

    public String getNombre() {
        return nombre;
    }


    public void registrarLlamada(int duracion, String tipo) {
        int costo = 0;

        switch (tipo) {
            case "LOCAL":
                costo = 50;
                break;
            case "LARGA DISTANCIA":
                costo = 350;
                break;
            case "CELULAR":
                costo = 150;
                break;
            default:
                System.out.println("NO VALIDA");
                return;
        }

        totalDuracion += duracion;
        totalCosto += costo * duracion;
        totalLlamadas++;
    }


    public void mostrarInformacion() {
        System.out.println("CABINA: " + nombre);
        System.out.println("TOTAL LLAMADAS: " + totalLlamadas);
        System.out.println("DURACION: " + totalDuracion );
        System.out.println("COSTO: $" + totalCosto);
    }


}
