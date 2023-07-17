/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ACER1
 */
public class CapturarDatos {

    private static Scanner scanner = new Scanner(System.in);
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static String capturarString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
    
    

    public static Date capturarFecha(String titulo) {

        Date fechaValida = null;

        while (fechaValida == null) {
            System.out.println(titulo);
            String fechaStr = scanner.nextLine();

            try {
                fechaValida = dateFormat.parse(fechaStr);
            } catch (ParseException e) {
                System.out.println("Error al analizar la fecha. Inténtelo nuevamente.");
            }
        }

        return fechaValida;

    }

    
    
    
//    public static Date capturarFecha(String mensaje) {
//
//        System.out.println("ingrese la fecha");
//        String fechaStr = scanner.nextLine();
//
//        try {
//            return dateFormat.parse(fechaStr);
//        } catch (ParseException e) {
//            System.out.println("Fecha inválida. Inténtalo nuevamente.");
//            return capturarFecha(mensaje);
//        }
//    }


}

