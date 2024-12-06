package com.automercado.automercado;

import com.automercado.db.Conexion;
import com.automercado.ui.FrmIndex;

public class MainAutomercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conexion c = new Conexion();
        c.getConnection();
        
        FrmIndex index = new FrmIndex();
        index.setVisible(true);
    }
}
