///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Notas;
//
///**
// *
// * @author ACER1
// */
//public class Notas {
//    
//    :
//
//System.out.println("Has elegido Alquilar pelicula.");: Mostramos un mensaje para indicar al usuario que ha elegido la opción de alquilar una película.
//
//System.out.println("Ingrese los datos del alquiler:");: Solicitamos al usuario que ingrese los datos necesarios para el alquiler de la película.
//
//scanner.nextLine();: Limpiamos el buffer del scanner para evitar problemas de lectura.
//
//System.out.println("Ingrese el título de la película:");: Solicitamos al usuario que ingrese el título de la película que desea alquilar.
//
//String tituloPelicula = scanner.nextLine();: Capturamos el título de la película ingresado por el usuario.
//
//Pelicula peliculaAlquilada = sp.BuscarPeliculaTitulo(tituloPelicula);: Utilizamos el servicio de películas para buscar la película correspondiente al título ingresado. Si se encuentra la película, se asigna a la variable peliculaAlquilada.
//
//if (peliculaAlquilada != null) {: Verificamos si se encontró una película con el título ingresado.
//
//System.out.println("Ingrese la fecha de inicio del alquiler (formato dd/MM/yyyy):");: Solicitamos al usuario que ingrese la fecha de inicio del alquiler en formato "dd/MM/yyyy".
//
//String fechaInicioStr = scanner.nextLine();: Capturamos la cadena de texto de la fecha de inicio ingresada por el usuario.
//
//SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");: Creamos un objeto SimpleDateFormat para poder convertir la cadena de fecha en un objeto Date válido.
//
//Date fechaInicio = dateFormat.parse(fechaInicioStr);: Convertimos la cadena de fecha en un objeto Date utilizando el formato especificado.
//
//System.out.println("Ingrese la fecha de fin del alquiler (formato dd/MM/yyyy):");: Solicitamos al usuario que ingrese la fecha de fin del alquiler en formato "dd/MM/yyyy".
//
//String fechaFinStr = scanner.nextLine();: Capturamos la cadena de texto de la fecha de fin ingresada por el usuario.
//
//Date fechaFin = dateFormat.parse(fechaFinStr);: Convertimos la cadena de fecha de fin en un objeto Date utilizando el formato especificado.
//
//System.out.println("Ingrese el precio del alquiler:");: Solicitamos al usuario que ingrese el precio del alquiler.
//
//double precio = scanner.nextDouble();: Capturamos el valor numérico del precio ingresado por el usuario.
//
//sa.crearAlquiler(peliculaAlquilada, fechaInicio, fechaFin, precio);: Llamamos al método crearAlquiler del servicio de alquileres, pasando como argumentos la película alquilada, las fechas de inicio y fin, y el precio.
//
//    
//    
//}
