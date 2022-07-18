package co.edu.udea.terialenguajelab;

import java.util.Scanner;

/**
 * @author Wilmar Mosquera Lozano y Doris Mosquera Lozano
 */
public class Practica1Teoria {

    public static void main(String[] args) {
        System.out.println("Ingrese el numero romano a evaluar: ");
        Scanner leer = new Scanner(System.in);
        String cadena = leer.nextLine().toUpperCase();
        int i = 0;
        int estado = 0;
        char dato;
        do {
            dato = cadena.charAt(i);
            switch (estado) {
                case 0 -> {
                    if (dato == 'I') {
                        estado = 1;
                        break;
                    }
                    if (dato == 'V') {
                        estado = 4;
                        break;
                    }
                    if (dato == 'X') {
                        estado = 5;
                        break;
                    }
                    if (dato == 'L') {
                        estado = 8;
                        int contadorL = 1;
                        break;
                    } else {
                        System.out.println("Se introdujo un caracter invalido: " + dato);
                        estado = 9;
                    }
                    break;
                }
                case 1 -> {
                    if (dato == 'I') {
                        estado = 2;
                        break;
                    }
                    if (dato == 'V') {
                        estado = 4;
                        break;
                    }
                    if (dato == 'X') {
                        estado = 5;
                        break;
                    }
                    if (dato == 'L') {
                        estado = 9;
                        System.out.println("la 'L' no puede estar precedida por un 'I' \n" +
                                "El valor ingresado " + cadena + " en la posicion " + (i + 1) + " genera el error.\n"+
                                "Por lo tanto, el numero ingresado NO es un numero romano valido");
                        break;
                    } else {
                        System.out.println("Se introdujo un caracter invalido: "+ dato);
                        estado = 9;
                    }break;
                }
                case 2 -> {
                    if (dato == 'I') {
                        estado = 3;
                        break;
                    }
                    if (dato == 'V') {
                        estado = 9;
                        System.out.println("De 'II' no puede seguir 'V' \n" +
                                "El valor ingresado " + cadena + " en la posicion " + (i + 1) + " genera el error.\n"+
                                "Por lo tanto, el numero ingresado NO es un numero romano valido");
                        break;
                    }
                    if (dato == 'X') {
                        estado = 9;
                        System.out.println("De 'II' no puede seguir 'X' \n" +
                                "El valor ingresado " + cadena + " en la posicion " + (i + 1) + " genera el error.\n"+
                                "Por lo tanto, el numero ingresado NO es un numero romano valido");
                        break;
                    }
                    if (dato == 'L') {
                        estado = 9;
                        System.out.println("De 'II' no puede seguir 'L' \n" +
                                "El valor ingresado " + cadena + " en la posicion " + (i + 1) + " genera el error.\n"+
                                "Por lo tanto, el numero ingresado NO es un numero romano valido");
                        break;
                    } else {
                        System.out.println("Se introdujo un caracter invalido: " + dato);
                        estado = 9;
                    }
                    break;
                }
                case 3 -> {
                    if (dato == 'I') {
                        estado = 9;
                        System.out.println("De 'III' no puede seguir 'I' \n" +
                                "El valor ingresado " + cadena + " en la posicion " + (i + 1) + " genera el error.\n"+
                                "Por lo tanto, el numero ingresado NO es un numero romano valido");
                        break;
                    }
                    if (dato == 'V') {
                        estado = 9;
                        System.out.println("De 'III' no puede seguir 'V' \n" +
                                "El valor ingresado " + cadena + " en la posicion " + (i + 1) + " genera el error.\n"+
                                "Por lo tanto, el numero ingresado NO es un numero romano valido");
                        break;
                    }
                    if (dato == 'X') {
                        estado = 9;
                        System.out.println("De 'III' no puede seguir 'X' \n" +
                                "El valor ingresado " + cadena + " en la posicion " + (i + 1) + " genera el error.\n"+
                                "Por lo tanto, el numero ingresado NO es un numero romano valido");
                        break;
                    }
                    if (dato == 'L') {
                        estado = 9;
                        System.out.println("De 'III' no puede seguir 'L' \n" +
                                "El valor ingresado " + cadena + " en la posicion " + (i + 1) + " genera el error.\n"+
                                "Por lo tanto, el numero ingresado NO es un numero romano valido");
                        break;
                    } else {
                        System.out.println("Se introdujo un caracter invalido: " + dato);
                        estado = 9;
                    }
                    break;
                }
                case 4 -> {
                    if (dato == 'I') {
                        estado = 1;
                        break;
                    }
                    if (dato == 'V') {
                        estado = 9;
                        System.out.println("De 'V' no puede seguir 'V' \n" +
                                "El valor ingresado " + cadena + " en la posicion " + (i + 1) + " genera el error.\n"+
                                "Por lo tanto, el numero ingresado NO es un numero romano valido");
                        break;
                    }
                    if (dato == 'X') {
                        estado = 9;
                        System.out.println("De 'V' no puede seguir 'X' \n" +
                                "El valor ingresado " + cadena + " en la posicion " + (i + 1) + " genera el error.\n"+
                                "Por lo tanto, el numero ingresado NO es un numero romano valido");
                        break;
                    }
                    if (dato == 'L') {
                        estado = 9;
                        System.out.println("De 'V' no puede seguir 'L' \n" +
                                "El valor ingresado " + cadena + " en la posicion " + (i + 1) + " genera el error.\n"+
                                "Por lo tanto, el numero ingresado NO es un numero romano valido");
                        break;
                    } else {
                        System.out.println("Se introdujo un caracter invalido: " + dato);
                        estado = 9;
                    }
                    break;
                }
                case 5 -> {
                    if (dato == 'I') {
                        estado = 1;
                        break;
                    }
                    if (dato == 'V') {
                        estado = 4;
                        break;
                    }
                    if (dato == 'X') {
                        estado = 6;
                        break;
                    }
                    if (dato == 'L') {
                        estado = 8;
                        break;
                    } else {
                        System.out.println("Se introdujo un caracter invalido: " + dato);
                        estado = 9;
                    }
                    break;
                }
                case 6 -> {
                    if (dato == 'I') {
                        estado = 1;
                        break;
                    }
                    if (dato == 'V') {
                        estado = 4;
                        break;
                    }
                    if (dato == 'X') {
                        estado = 7;
                        break;
                    }
                    if (dato == 'L') {
                        estado = 9;
                        System.out.println("De 'XX' no puede seguir una 'L' \n" +
                                "El valor ingresado " + cadena + " en la posicion " + (i + 1) + " genera el error.\n"+
                                "Por lo tanto, el numero ingresado NO es un numero romano valido");
                        break;
                    } else {
                        System.out.println("Se introdujo un caracter invalido: " + dato);
                        estado = 9;
                    }
                    break;
                }
                case 7 -> {
                    if (dato == 'I') {
                        estado = 1;
                        break;
                    }
                    if (dato == 'V') {
                        estado = 4;
                        break;
                    }
                    if (dato == 'X') {
                        estado = 9;
                        System.out.println("De 'XXX' no puede seguir 'X' \n" +
                                "El valor ingresado " + cadena + " en la posicion " + (i + 1) + " genera el error.\n"+
                                "Por lo tanto, el numero ingresado NO es un numero romano valido");
                        break;
                    }
                    if (dato == 'L') {
                        estado = 9;
                        System.out.println("De 'XXX' no puede seguir 'L' \n" +
                                "El valor ingresado " + cadena + " en la posicion " + (i + 1) + " genera el error.\n"+
                                "Por lo tanto, el numero ingresado NO es un numero romano valido");
                        break;
                    } else {
                        System.out.println("Se introdujo un caracter invalido: " + dato);
                        estado = 9;
                    }
                    break;
                }
                case 8 -> {
                    if (dato == 'I') {
                        estado = 1;
                        break;
                    }
                    if (dato == 'V') {
                        estado = 4;
                        break;
                    }
                    if (dato == 'X') {
                        estado = 5;
                        break;
                    }
                    if (dato == 'L') {
                        estado = 9;
                        System.out.println("De 'L' no puede seguir 'L' \n" +
                                "El valor ingresado " + cadena + " en la posicion " + (i + 1) + " genera el error.\n"+
                                "Por lo tanto, el numero ingresado NO es un numero romano valido");
                        break;
                    } else {
                        System.out.println("Se introdujo un caracter invalido: " + dato);
                        estado = 9;
                    }
                    break;
                }
                default -> {}
            }
            i = i + 1;
        }
        while ((i + 1) <= cadena.length());
        if (estado != 9 && (i == cadena.length())) {
            System.out.println("El numero romano ingresado: " + cadena + " es valido!");
        }
    }
}