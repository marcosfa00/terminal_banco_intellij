package com.marcos.angel.Libreria;

import javax.swing.*;

public class EscogerDatoPedido <T>{

    public Integer enteroBucle(String msg) {
        Integer datoEntero;
        do {
            datoEntero = PedirDatos.pedirEntero(msg);
            if(datoEntero == null)
                System.out.println("**DATO INVALIDO**");
        } while(datoEntero == null);
        return datoEntero;
    }
}
