package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cabina> cabinas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("CABINAS TELEFONICAS");
            System.out.println("1. CREAR CABINA");
            System.out.println("2. LLAMADA");
            System.out.println("3. INFO CABINA");
            System.out.println("4. TOTAL CABINAS");
            System.out.println("5. REINICIAR CABINA");
            System.out.println("6. SALIR");
            System.out.print("INGRESE SU OPCION: ");
            opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    System.out.print("INGRESAR NOMBRE CABINA: ");
                    scanner.nextLine();
                    String nombreCabina = scanner.nextLine();
                    cabinas.add(new Cabina(nombreCabina));
                    System.out.println("CABINA CREADA");
                    break;

                case 2:
                    if (cabinas.isEmpty()) {
                        System.out.println("NO HAY CABINAS");
                        break;
                    }
                    System.out.println("SELECCIONE UNA CABINA:");
                    for (int i = 0; i < cabinas.size(); i++) {
                        System.out.println((i + 1) + ". " + cabinas.get(i).getNombre());
                    }
                    System.out.print("INGRESE EL NO DE CABINA: ");
                    int numerocabina = scanner.nextInt() ;

                    System.out.println("TIPO DE LLAMADA:");
                    System.out.println("1. LOCAL");
                    System.out.println("2. LARGA DISTANCIA");
                    System.out.println("3. CELULAR");
                    System.out.print("SELLECIONE: ");
                    int tipoLlamada = scanner.nextInt();


                    String tipo = switch (tipoLlamada) {
                        case 1 -> "LOCAL";
                        case 2 -> "LARGA DISTANCIA";
                        case 3 -> "CELULAR";
                        default -> {
                            System.out.println("NO VALIDA.");
                            yield null;
                        }
                    };
                    if (tipo == null) break;

                    System.out.print("DURACION DE LLLAMADAS: ");
                    int duracion = scanner.nextInt();

                    cabinas.get(numerocabina).registrarLlamada(duracion, tipo);
                    System.out.println("LLAMADA REGISTRADA");
                    break;

                case 3:
                    if (cabinas.isEmpty()) {
                        System.out.println("NO HAY CABINAS");
                        break;
                    }
                    for (Cabina  cabina : cabinas) {
                        cabina.mostrarInformacion();

                    }


                case 6:
                    System.out.println("SALIR");
                    break;
            }

        } while (opcion != 6);

    }
}
