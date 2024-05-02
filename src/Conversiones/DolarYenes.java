package Conversiones;

import Conexion.Conexion_API;

import java.util.Scanner;

//Clase para realizar la conversion de dolares a yenes y viceversa
public class DolarYenes {

    public static void DolaresaYenes(){

        double conversion;
        String espacio;

        System.out.println("Ingrese el valor en Dolares USD que desea convertir a YEN Japónes");
        Scanner valor = new Scanner(System.in);
        conversion = valor.nextDouble();
        String divisas ="/USD/JPY/";

        Conexion_API conexion = new Conexion_API();

        conexion.ConexionyConversion(conversion, divisas);
        System.out.println("La conversion de "+ conversion + " Dólares USD a Yen  es de: ¥"+conexion.ConexionyConversion(conversion, divisas));
        System.out.println("\nHaga clic para continuar...");
        Scanner pausa = new Scanner(System.in);
        espacio =pausa.nextLine();
    }


    public static void YenesaDolares(){

        double conversion;
        String espacio;

        System.out.println("Ingrese el valor en YEN  que desea convertir a Dólares USD");
        Scanner valor = new Scanner(System.in);
        conversion = valor.nextDouble();
        String divisas ="/JPY/USD/";

        Conexion_API conexion = new Conexion_API();

        conexion.ConexionyConversion(conversion, divisas);
        System.out.println("La conversion de " + conversion + " YEN Japónes a USD es de: $"+conexion.ConexionyConversion(conversion, divisas));
        System.out.println("\nHaga clic para continuar...");
        Scanner pausa = new Scanner(System.in);
        espacio =pausa.nextLine();
    }
}
