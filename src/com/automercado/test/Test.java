package com.automercado.test;

import com.automercado.bo.ClienteBO;
import com.automercado.entity.Cliente;
import java.util.Date;

public class Test {

    ClienteBO cbo = new ClienteBO();
    Cliente cli = new Cliente();
    String mensaje = "";

    public void insertar() {
        cli.setNombre("Kevin Calvo Brenes");
        cli.setDireccion("Cartago, Caballo Blanco");
        cli.setTelefono("8416-1395");
        cli.setCorrero_Electronico("kcb@cliente.com");
        cli.setFecha_registro(new Date());
        mensaje = cbo.agregarCliente(cli);
        System.out.println(mensaje);
    }

    public void modificar() {
        cli.setId_Cliente(4);
        cli.setNombre("Keevin Calvo Brenes");
        cli.setDireccion("Cartago, Caballo Blanco");
        cli.setTelefono("8888-9999");
        cli.setCorrero_Electronico("kcb@cliente.com");
        cli.setFecha_registro(new Date());
        System.out.println("Datos antes de modificar: " + cli);
        mensaje = cbo.modificarCliente(cli);
        System.out.println(mensaje);
    }
    
    public void eliminar() {
        mensaje = cbo.eliminarCliente(4);
        System.out.println(mensaje);
    }
    
//    public static void main(String[] args) {
//        Test test = new Test();
//        //test.insertar();
//        //test.modificar();
//        //test.eliminar();
//    }
}
