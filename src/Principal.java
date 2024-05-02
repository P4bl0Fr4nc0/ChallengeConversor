import Conversiones.DolarYenes;
import Conversiones.DolaresDolaresCan;
import Conversiones.DolaresPesos;

import java.util.Scanner;



public class Principal {

    public static void main(String[] args) {


        int opcion = 0;
          //Mientras while sea diferente de 7 repetir menú
           while (opcion != 7) {

               //try para errores de formato
               try {

                   String menu = "******************************************\n" +
                           "Bienvenido al sistema de conversión de monedas\n" +
                           "Seleccione la opción deseada \n" +
                           "1) Dólar -> Peso Mexicano \n" +
                           "2) Peso Mexicano -> Dólar\n" +
                           "3) Dolar -> Dolar Canadiense\n" +
                           "4) Dolar Canadiense -> Dólar\n" +
                           "5) Dolar -> Yenes \n" +
                           "6) Yenes -> Dolar \n " +
                           "7) Salir\n" +
                           "******************************************\n";
                   System.out.println(menu);
                   Scanner teclado = new Scanner(System.in);
                   System.out.println("Seleccione la opcion deseada");
                   opcion = teclado.nextInt();

                   //Switch de opciones
                   switch (opcion) {

                       case 1:
                           DolaresPesos.DolaresaPesos();


                           break;
                       case 2:
                           DolaresPesos.PesosaDolares();

                           break;
                       case 3:
                           DolaresDolaresCan.DolaraDolarCanadiense();


                           break;
                       case 4:
                           DolaresDolaresCan.DolarCanadienseaDolar();

                           break;
                       case 5:
                           DolarYenes.DolaresaYenes();

                           break;

                       case 6:
                           DolarYenes.YenesaDolares();

                           break;

                       case 7:
                           System.out.println("Gracias por acceder al programa");
                           break;

                       default:
                           System.out.println("Opcion no existente, favor de elegir opcion correcta");

                   }


                   System.out.println("Finalizando el programa...");
               }
                // Catch para error de formato y cualquier error en general.
               catch   (Exception e){
                   System.out.println("Error, solo se permiten numeros");
                   System.out.println(e);
               }
           }

    }
}