package Conversiones;

import Conexion.Conexion_API;
import java.util.Scanner;

//Clase para realizar la conversion de dolares a pesos y viceversa
public class DolaresPesos {

    public static void DolaresaPesos()  {
        double conversion;
        String espacio;

            System.out.println("Ingrese el valor en Dolares USD que desea convertir a Pesos Mexicanos MXN");
            Scanner valor = new Scanner(System.in);
            conversion = valor.nextDouble();
            String divisas ="/USD/MXN/";

        Conexion_API conexion = new Conexion_API();

        conexion.ConexionyConversion(conversion, divisas);
        System.out.println("La conversion de "+ conversion + " Dólares a Pesos Mexicanos de: $"+conexion.ConexionyConversion(conversion, divisas));
        System.out.println("\nHaga clic para continuar...");
        Scanner pausa = new Scanner(System.in);
        espacio =pausa.nextLine();

        }

        public static void PesosaDolares(){
            double conversion;
            String espacio;

            System.out.println("Ingrese el valor en pesos Mexicanos MXN que desea convertir a Dolares USD");
            Scanner valor = new Scanner(System.in);
            conversion = valor.nextDouble();
            String divisas ="/MXN/USD/";

            Conexion_API conexion = new Conexion_API();

            conexion.ConexionyConversion(conversion, divisas);
            System.out.println("La conversion de "+ conversion + " Pesos Mexicanos a Dolares USD es de: $"+conexion.ConexionyConversion(conversion, divisas));
            System.out.println("\nHaga clic para continuar...");
            Scanner pausa = new Scanner(System.in);
            espacio =pausa.nextLine();


        }
    }
