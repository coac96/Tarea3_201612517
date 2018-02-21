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
        int menuU = 0;
        int menuP = 0;
        boolean aceptar = false;
        // Creacion de USUARIOS
        String[] usuario = new String[5]; 
 
        //MENU PRINCIPAL
        do{
        System.out.println("[IPC1]Tarea3_201612517");
        System.out.println("");
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de Digitos");
        System.out.println("3. Tres numeros mayor a menor");
        System.out.println("4. Calcular Promedio");
        System.out.println("5. Salir");
        switch(lector.nextInt()){
            case 1:
                menuU = 0;
                contadorU = 0;
                while(menuU != 4){
                // Menu Usuarios
                System.out.println("1. Ingresar Usuarios");
                System.out.println("2. Mostrar  Usuarios Ascendentes");
                System.out.println("3. Mostrar Usuarios Descendente");
                System.out.println("4. Menu Principal");
                switch(lector.nextInt()){
                    //INGRESAR USUARIOS
                    case 1:
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
                    case 2:
                        for(int c = 0; c < usuario.length;c++){
                            System.out.println(usuario[c]);
                        }
                        break;
                        //MOSTRAR USUARIOS DESCENDEMENTE
                    case 3:
                        for(int c = 0; c < usuario.length;c++){
                            System.out.println(usuario[4-c]);
                        }
                        break;
                    case 4:
                            menuU = 4;
                        break;
                    default:
                }            
                }
                break;
            case 2:
                menuU = 0;
                do{
                System.out.println("--------CONTADOR DE DIGITOS--------------");
                System.out.println("1. Ingresar Numero");
                System.out.println("2. Mostrar numero de digitos");
                System.out.println("4. Menu Principal");
                menuU = lector.nextInt();
                switch(menuU){
                    case 1:
                        do{
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
                    case 2:
                        System.out.println("EL NUMERO DE DIGITOS: "+contadorD);
                        break;
                    case 4:
                        break;
                        
                    default:
                          System.out.println("OPCION INCORRECTA");  
                }
                }while(menuU != 4);
                break;
            case 3:
                
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("Hasta Pronto");
                menuP = 5;
                break;
            default:    
                
                break;
                
                
        }
        }while(menuP != 5);
    }
    
}
