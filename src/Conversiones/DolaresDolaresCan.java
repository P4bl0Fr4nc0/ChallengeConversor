package Conversiones;

import Conexion.Conexion_API;

import java.util.Scanner;

public class DolaresDolaresCan {
    //Clase para realizar la conversion de dolares a dolares canadienses y viceversa
    public static void DolaraDolarCanadiense(){
        double conversion;
        String espacio;

        System.out.println("Ingrese el valor en Dolares USD que desea convertir a Dolar Canadiense CAD");
        Scanner valor = new Scanner(System.in);
        conversion = valor.nextDouble();
        String divisas ="/USD/CAD/";

        Conexion_API conexion = new Conexion_API();

        conexion.ConexionyConversion(conversion, divisas);
        System.out.println("La conversion de "+ conversion + " Dólares a Dolar Canadiense de: C$"+conexion.ConexionyConversion(conversion, divisas));
        System.out.println("\nHaga clic para continuar...");
        Scanner pausa = new Scanner(System.in);
        espacio =pausa.nextLine();

    }

    public static void  DolarCanadienseaDolar(){
        double conversion;
        String espacio;

        System.out.println("Ingrese el valor en Dolares Canadienses CAD que desea convertir a Dolar USD");
        Scanner valor = new Scanner(System.in);
        conversion = valor.nextDouble();
        String divisas ="/CAD/USD/";

        Conexion_API conexion = new Conexion_API();

        conexion.ConexionyConversion(conversion, divisas);
        System.out.println("La conversion de " + conversion + " Dólares Canadienses CAD a Dólares es de: $"+conexion.ConexionyConversion(conversion, divisas));
        System.out.println("\nHaga clic para continuar...");
        Scanner pausa = new Scanner(System.in);
        espacio =pausa.nextLine();
    }
}
