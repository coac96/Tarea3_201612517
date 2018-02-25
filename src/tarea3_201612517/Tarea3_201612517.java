/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201612517;

import java.util.Scanner;

/**
 *
 * @author coac_96
 */
public class Tarea3_201612517 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector de TECLADO
        Scanner lector = new Scanner(System.in);
        // Inicializacion de Variables
        String teclado = "";
        String aux;
        int contadorU = 0;
        int contadorD = 0;
        int verificador = 0;
        int numero = 0;
        int burbuja = 0;
        String menuU;
        String menuP;
        boolean aceptar = false;
        // Creacion de USUARIOS
        String[] usuario = new String[5]; 
        int[] l_numeros = new int[3];
        int[][] notas = new int[6][6];
 
        //MENU PRINCIPAL
        do{
        menuP = "";
        System.out.println("[IPC1]Tarea3_201612517");
        System.out.println("");
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de Digitos");
        System.out.println("3. Tres numeros mayor a menor");
        System.out.println("4. Calcular Promedio");
        System.out.println("5. Salir");
        menuP = lector.next(); 
        switch(menuP){
            case "1":
                contadorU = 0;
                do{
                // Menu Usuarios
                System.out.println("1. Ingresar Usuarios");
                System.out.println("2. Mostrar  Usuarios Ascendentes");
                System.out.println("3. Mostrar Usuarios Descendente");
                System.out.println("4. Menu Principal");
                menuU = lector.next(); 
                switch(menuU){
                    //INGRESAR USUARIOS
                    case "1":
                        //ALGORITMO PARA VERIFICAR USUARIOS
                        while (contadorU != 5){
                            System.out.println("Ingresar Usuario: "+(1+contadorU));
                            verificador = 0;
                            teclado = lector.next();
                            for(int a = 0; a <= contadorU; a++){
                                if(teclado.equals(usuario[a])){
                                    verificador++;
                                }
                            }
                            if(verificador == 0){
                                usuario[contadorU] = teclado;
                                contadorU++;
                            }else{
                                System.out.println("ERROR USUARIO INCORRECTO");
                            }
                        }
                        break;
                        // MOSTRAR USUARIOS ASCENDENTEMENTE
                    case "2":
                        for(int c = 0; c < usuario.length;c++){
                            System.out.println(usuario[c]);
                        }
                        break;
                        //MOSTRAR USUARIOS DESCENDEMENTE
                    case "3":
                        for(int c = 0; c < usuario.length;c++){
                            System.out.println(usuario[4-c]);
                        }
                        break;
                        //OPCION DE SALIDA A MENU PRINCIPAL
                    case "4":
                            menuU = "4";
                        break;
                    default:
                        break;
                }            
                }while(menuU != "4");
                break;
            case "2":
                do{
                    //MENU CONTADOR DE DIGITOS
                System.out.println("--------CONTADOR DE DIGITOS--------------");
                System.out.println("1. Ingresar Numero");
                System.out.println("2. Mostrar numero de digitos");
                System.out.println("4. Menu Principal");
                menuU = lector.next();
                switch(menuU){
                    case "1":
                        do{
                            //VERIFICADOR DEL INTERVALO DEL NUMERO
                        System.out.println("Ingresar un numero entre 0 y 100000 que desea: ");
                        numero = lector.nextInt();
                        if((numero > 0)){
                            if(numero < 100000){
                                while(numero > 0.1){
                                    numero = numero/10;
                                    contadorD++;
                                }
                                aceptar = true;
                            }else{
                                System.out.println("ERROR DE NUMERO, FUERA DE INTERVALO");
                                aceptar = false;
                                
                            }
                        }else{
                            System.out.println("ERROR DE NUMERO, FUERA DE INTERVALO");
                            aceptar = false;
                        }
                        }while(aceptar != true);
                        break;
                    case "2":
                        System.out.println("EL NUMERO DE DIGITOS: "+contadorD);
                        break;
                    case "4":
                        menuU = "4";
                        break;
                        
                    default:
                          System.out.println("OPCION INCORRECTA");  
                }
                //CICLADOR DE MENU EN CASO DE UN NUMERO DIFERENTE DEL MENU
                }while(menuU != "4");
                break;
            case "3":
                do{
                    //MENU NUMEROS DE MAYOR A MENOR
                    System.out.println("-----------NUMEROS DE MAYOR A MENOR--------------");
                    System.out.println("1. Ingresar Numero");
                    System.out.println("2. Mostrar Ordenados");
                    System.out.println("4. Menu Principal");
                    menuP = lector.next();
                    switch(menuP){
                    case "1":
                        numero = 0;
                        while(contadorU != 3){
                        verificador = 0;
                        numero = lector.nextInt();
                        //VERIFICADOR DE NUMERO YA INGRESADO
                        if(contadorU == 0){
                            l_numeros[contadorU] = numero;
                            contadorU++;
                        }else{
                            for(int a = 0; a < l_numeros.length; a++){
                                if(l_numeros[a] == numero){
                                    verificador++;
                                }
                            }
                            if(verificador == 0){
                                //INGRESA NUMERO 
                                l_numeros[contadorU] = numero;
                                contadorU++;
                            }else{
                                //SE RECHAZA EL NUMERO
                                System.out.println("numero ya ingresado");
                            }
                        }
                    }                        
                    break;
                    case "2":
                        // ALGORITMO PARA ORDENAR LOS NUMEROS
                        for(int f = 0; f < l_numeros.length; f++){
                            for(int g = 0; g< l_numeros.length;g++){
                                if(l_numeros[g] < l_numeros[f]){
                                    burbuja = l_numeros[f];
                                    l_numeros[f] = l_numeros[g];
                                    l_numeros[g] = burbuja;
                                }
                            }
                        }
                        //IMPRESION DE NUMEROS
                        System.out.println("NUMEROS ORDENADOS");
                        for(int imprimir = 0; imprimir < l_numeros.length; imprimir++){
                            System.out.println(l_numeros[imprimir]);
                        }
                    break;
                    case "4":
                        //SALIDA DE MENU "ORDENAR NUMEROS"
                        menuP = "4";
                    break;
                    default:
                        System.out.println("ERROR DE SELECCION EN MENU");
                    }
                }while(menuP != "4");
                break;
            case "4":
                do{
                    //MENU CALCULAR PROMEDIO
                    System.out.println("------------CALCULAR PROMEDIO----------");
                    System.out.println("1. Ingresar notas de los 6 alumnos");
                    System.out.println("2. Mostrar notas y promedios");
                    System.out.println("4. Menu Principal");
                    menuU = lector.next();
                    switch(menuU){
                        case "1":
                            // VERIFICADOR PARA EVITAR UN ID DE ALUMNO IGUAL
                            contadorU = 0;
                            while (contadorU != 6){
                            System.out.println("Ingresar ID del alumno: "+(1+contadorU));
                            verificador = 0;
                            numero = lector.nextInt();
                            for(int a = 0; a <= contadorU; a++){
                                if(numero == notas[a][0]){
                                    verificador++;
                                }
                            }
                            if(verificador == 0){
                                //VERIFICADOR E INGRESADOR DE NOTAS, NO ACEPTA LETRAS.
                                notas[contadorU][0] = numero;
                                contadorU++;
                                for(int b = 1; b < 5; b++){
                                    System.out.println("Ingresar Nota "+b+":");
                                    notas[contadorU][b] = lector.nextInt();
                                }
                                //CALCULAR PROMEDIO
                                notas[contadorU][5] = (notas[contadorU][1]+notas[contadorU][2]+notas[contadorU][3]+notas[contadorU][4])/4;
                            }else{
                                //SE RECHAZA EL ID YA REPETIDO
                                System.out.println("ERROR ID YA INGRESADO");
                            }
                        }
                            break;
                        case "2": 
                            //IMPRESION DE LA LISTA DE ALUMNO, COMO DE SUS NOTAS
                            for(int fila = 0; fila < 6; fila++){
                                for(int columna = 0; columna < 6; columna++){
                                    System.out.print("  |  "+notas[fila][columna]+"  |  ");
                                }
                                System.out.println("");
                            }
                            break;
                        case "4":
                            // SALIDA DE MENU PROMEDIO
                            menuU = "4";
                            break;
                        default:
                            System.out.println("ERROR");
                            break;

                    }
                }while (menuU != "4");
                break;
            case "5":
                // SALIDA DEL PROGRAMA
                System.out.println("Hasta Pronto");
                menuP = "5";
                break;
            default:    
                System.out.println("ERROR EN SELECCION MENU PRINCIPAL");
                 
        }
        // VERIFICACION DE CICLO.
        }while(menuP != "5" );
    }
    
}
