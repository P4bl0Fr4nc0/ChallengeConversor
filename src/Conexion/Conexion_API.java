package Conexion;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

//Clase para relizar conexion a la API y recepcion de respuesta
public class Conexion_API {

    public Object ConexionyConversion(double conversion, String divisas) {

        try {

            URL enlace = new URL("https://v6.exchangerate-api.com/v6/6ac86d20dbdca6714ff2df5b/pair"+divisas+conversion);

            HttpURLConnection connection = (HttpURLConnection) enlace.openConnection();
            connection.setRequestMethod("GET");

            // Respuesta y respuesta exitosa
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {

               //Construccion y lectura de respuesta
                BufferedReader entrada = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = entrada.readLine()) != null) {
                    response.append(inputLine);
                }
                entrada.close();

                // CConversion a String para poder leer los datos
                String responseBody = response.toString();
                Gson gson = new Gson();
                JsonObject objetoJson = gson.fromJson(responseBody, JsonObject.class);

                // Extrayendo Strings necesarios del JSON
                String conversion_result = objetoJson.get("conversion_result").getAsString();
                String conversion_rate = objetoJson.get("conversion_rate").getAsString();

                //Retorno de valores deseados
                return conversion_result + " a un valor de conversion de: " +  conversion_rate;




            } else {
                // Error de conexion fllida
                System.out.println(" Error de conexion a la API: " + responseCode);
            }
            // Cerrando conexion
            connection.disconnect();


            //Excepcion del try catch atrapando cualquier tipo de excpecion que se presente
        } catch (Exception e) {
            System.out.println("Ocurrio un error inesperado");
        }

        //Retorno en caso de que falle algun codigo en el programa
        return "No es posible ejecutar el programa debido a un error inesperado";
    }
}
