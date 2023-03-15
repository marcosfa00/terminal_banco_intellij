package com.marcos.angel.Libreria;

import javax.swing.*;

public class PedirDatos {
    /*
   To do:
   Escribir en fichero un string ?
   Leer del Fichero ?
   ingresar dinero
   Validar DNI
   validar Correo

    */
    static String msg;
    static Integer entero = Integer.parseInt(JOptionPane.showInputDialog(msg));
    static String cadena_texto = JOptionPane.showInputDialog(msg);
    static Double decimal = Double.parseDouble(JOptionPane.showInputDialog(msg));

    /**
     *
     * @param msg
     * @return
     */
    public static Integer pedirEntero(String msg) {
        try {
            if(entero < 0) {
                System.out.println("No puedes introducir numeros negativos");
                return null;
            } else {
                return entero;
            }
        } catch(Exception ex) {
            ex.getMessage();
            ex.printStackTrace();
            return null;
        }
    }
    /*
    public static String pedirCadena(String msg) {
        try {
            //SI ES Ñ o con acento
            return cadena_texto;
        } catch(Exception ex) {
            ex.getMessage();
            ex.printStackTrace();
            return null;
        }
    }

    public static decimal pedirCadena(String msg) {
        try {
            if(decimal < 0.0) {
                System.out.println("No puedes introducir numeros negativos");
                return null;
            } else {
                return decimal;
            }
        } catch(Exception ex) {
            ex.getMessage();
            ex.printStackTrace();
            return null;
        }
    }
    */


}
