package examen1_rodrigovasquez;

import java.util.ArrayList;
import java.util.Scanner;

public class Examen1_RodrigoVasquez {

    public static void main(String[] args) {
        Scanner scMain = new Scanner(System.in);
        ArrayList<Object> arrayList = new ArrayList();
        char opcion = 'a';
        do {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("                                       [ M E N U ]");
            System.out.print("""
                               a -> Probrar Método Recursivo
                               b -> Agregar Al ArrayList Un Nuevo Conjunto De Complejos Y n Elementos A Dicho Conjunto
                               c -> Simplificar El Racional De Un Imaginario De Algún Complejo De Uno De Los Conjuntos 
                               d -> Unir Dos Conjuntos Del ArrayList Y Guardar Dicho Conjunto En El Mismo ArrayList
                               e -> Sumar Dos Números Complejos De Cualquier Conjunto Del ArrayList
                               f -> Imprimir Todos Los Conjuntos Del ArrayList
                               g -> Salir
                               """);
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("Ingrese la acción a realizar: ");
            opcion = scMain.next().charAt(0);
            switch (opcion) {
                case 'a':
                    int[][] matriz = new int[5][3];
                    int filas = 0;
//                    System.out.println(matriz.length - 1);
//                    System.out.println(matriz[filas].length - 1);
                    matriz[0][0] = 5;
                    matriz[1][0] = 7;
                    matriz[2][0] = 9;
                    matriz[3][0] = 10;
                    matriz[4][0] = 11;
                    matriz[0][1] = 6;
                    matriz[1][1] = 4;
                    matriz[2][1] = 3;
                    matriz[3][1] = 2;
                    matriz[4][1] = 7;
                    matriz[0][2] = 9;
                    matriz[1][2] = 20;
                    matriz[2][2] = 30;
                    matriz[3][2] = 25;
                    matriz[4][2] = 19;
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            System.out.print(matriz[i][j]);
                            System.out.print(" ");
                        }
                        System.out.println("");
                    }
                    ArrayList<Integer> arrayMatriz = metodoRecursivo(matriz, 0, 0);
                    for (Integer integer : arrayMatriz) {
                        System.out.print(integer + " ");
                    }
                    break;
                case 'b':
                    break;
                case 'c':
                    break;
                case 'd':
                    break;
                case 'e':
                    break;
                case 'f':
                    break;
                case 'g':
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (opcion != 'g');
    }

    public static ArrayList<Integer> metodoRecursivo(int[][] matriz, int filas, int columnas) {
        ArrayList<Integer> arrayList = new ArrayList();
        int filasLength = matriz.length - 1;
        int columnasLength = matriz[filasLength - 1].length - 1;
        System.out.println(filasLength + " " + columnasLength);
        System.out.println(filas + " " + columnas);
        do {
            if (columnas == columnasLength) {
                if (filas == filasLength) {
                    arrayList.add(matriz[filas][columnas]);
                    return arrayList;
                } else {
                    int num = metodoRecursivo(matriz, filas + 1, columnas).get(columnas);
                    if (matriz[filas][columnas] < num) {
                        arrayList.remove(columnas);
                        arrayList.add(columnas, matriz[filas][columnas]);
                    }
                }
            } else {
                if (filas == filasLength) {
                    arrayList.add(matriz[filas][columnas]);
                    return arrayList;
                } else {
                    int num = metodoRecursivo(matriz, filas + 1, columnas).get(columnas);
                    if (matriz[filas][columnas] < num) {
                        arrayList.remove(columnas);
                        arrayList.add(columnas, matriz[filas][columnas]);
                    }
                }
            }
            filas = 0;
            metodoRecursivo(matriz, filas, columnas + 1);
        } while (columnas != columnasLength && filas == filasLength);
        return arrayList;
    }

}
