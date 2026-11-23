import java.util.Scanner;

/**
 * Clase con métodos de utilidad para la entrada de datos por teclado y el manejo de días de la semana.
 */
// Pasa los test
public class Utilidades {
    public static String leerCadena(Scanner teclado, String s) {
        System.out.print(s);
        return teclado.nextLine();// @todo MODIFICAR PARA DEVOLVER LA CADENA LEÍDA
    }

    public static int leerNumero(Scanner teclado, String mensaje, int minimo, int maximo) {
        int num = minimo-1;
        do {
            System.out.print(mensaje);
            try {
                num = Integer.parseInt(teclado.nextLine());
            }catch (NumberFormatException e){}

        }while (num < minimo || num > maximo);
        return num; // @todo MODIFICAR PARA DEVOLVER EL NÚMERO LEÍDO
    }

    public static int leerDiaDeLaSemana(Scanner teclado, String mensaje) {
        // Muestra un mensaje, lee un día de la semana por teclado (L, M, X, J, V, S, D) y devuelve su posición
        // dentro de la semana (0-6). Si la entrada no es válida, vuelve a solicitarla
        int resultado;
        do {
            System.out.print(mensaje);
            resultado = diaSemanaAPosicion(teclado.nextLine());
        }while (resultado == -1);

        return resultado; // @todo MODIFICAR PARA DEVOLVER EL DÍA DE LA SEMANA LEÍDO
    }

    public static int diaSemanaAPosicion(String dia) {
        // Devuelve la posición de un día de la semana (L, M, X, J, V, S, D) dentro de la semana (0-6),
        // o -1 si no es un día válido

        int resultado = -1;

        if (dia != null && dia.length() == 1){
            switch (dia.toUpperCase()){
                case "L": resultado = 0;
                    break;
                case "M": resultado = 1;
                    break;
                case "X": resultado = 2;
                    break;
                case "J": resultado = 3;
                    break;
                case "V": resultado = 4;
                    break;
                case "S": resultado = 5;
                    break;
                case "D": resultado = 6;
            }
        }


        return resultado; // @todo MODIFICAR PARA DEVOLVER LA POSICIÓN DEL DÍA DE LA SEMANA
    }

    public static String posicionADiaSemana(int pos) {
        // Devuelve el día de la semana (Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo)
        // correspondiente a una posición dentro de la semana (0-6), o "Desconocido" si no es válida

        String resultado;

        switch (pos){
            case 0:
                resultado = "Lunes";
                break;
            case 1:
                resultado = "Martes";
                break;
            case 2:
                resultado = "Miércoles";
                break;
            case 3:
                resultado = "Jueves";
                break;
            case 4:
                resultado = "Viernes";
                break;
            case 5:
                resultado = "Sábado";
                break;
            case 6:
                resultado = "Domingo";
                break;
            default:
                resultado = "Desconocido";
        }

        return resultado; // @todo MODIFICAR PARA DEVOLVER EL DÍA DE LA SEMANA
    }
}
