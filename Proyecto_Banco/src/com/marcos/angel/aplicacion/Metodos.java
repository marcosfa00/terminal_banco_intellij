package com.marcos.angel.aplicacion;

import com.marcos.angel.imagenes.ImagenLogo;

import javax.swing.*;

public class Metodos {



    /*
    To do:
    Escribir en fichero un string ?
    Leer del Fichero ?
    ingresar dinero
    Validar DNI
    validar Correo


 System.out.println("La ruta actual es: " + System.getProperty("user.dir"));


            // Mostrar el JOptionPane con la imagen como icono



     */


    /*
    Dentro de un paquete llamado validaciones

        1- Validar DNI
                        -->Excepciones Validacion
                            -Errro al validar DNI
                -comprobar longitud
                -comprobar letra
                -comprobar que los 8 primeros dígitos sean números


     */
   private static final char[]LetrasDNI= new char[]{'T','R','W','A','G','M', 'Y','F','P','D','X','B','N','J','Z','S','O','V','H','L','C','K','E'};

    public static Boolean comprobarLongitudDNI(String dni)throws ExcepcionesValidacion{
        if(dni.length()==9){
            return true;
        }else{
            throw new ExcepcionesValidacion("La longitud del DNI es diferente de 9","ERROR EN LA LONGITUD DEL DNI");


        }
    }

    public static char devolverLetra(int numeros){
        int resto = numeros % 23;
        char letra = LetrasDNI[resto];
        return letra;

    }

    public static Boolean comprobarLetraDNI(String dni) throws ExcepcionesValidacion{
        char letra = dni.charAt(dni.length()-1);
        System.out.println(letra);//Muestro la última posición del String pasado
        int numeros = Integer.parseInt(dni.substring(0, dni.length() - 1)); //substring permite coger una parte de un strind desde lo que le indicamos hasta loq ue le indicamos
        System.out.println(numeros);
       char letra_correcta = devolverLetra(numeros);
       if (letra_correcta == letra){
           return true;
       }else {
           throw new ExcepcionesValidacion("La letra del DNI no es correcta","ERROR LETRA DNI");
       }


    }

    public static void comprobarDNI(String dni){
        try {
            if(comprobarLongitudDNI(dni)){
                if(comprobarLetraDNI(dni)){
                    System.out.println("El DNI Esta correcto");
                }
            }
        } catch (ExcepcionesValidacion e) {
            throw new RuntimeException(e.getMessage());
        }
    }




}
