package com.marcos.angel.aplicacion;

import com.marcos.angel.imagenes.ImagenLogo;

import javax.swing.*;

public class ExcepcionesValidacion extends Exception{

    /**
     * Constructor por defecto
     */
    public ExcepcionesValidacion() {
        JOptionPane.showMessageDialog(null, "hubo un error al validar", "ERROR VALIDACION", JOptionPane.INFORMATION_MESSAGE, ImagenLogo.icon);

    }

    public ExcepcionesValidacion(String message,String titulo) {
        super(message);
        JOptionPane.showMessageDialog(null, message, titulo, JOptionPane.INFORMATION_MESSAGE, ImagenLogo.icon);

    }
    }


