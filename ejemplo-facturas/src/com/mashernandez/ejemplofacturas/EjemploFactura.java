package com.mashernandez.ejemplofacturas;

import com.mashernandez.ejemplofacturas.modelo.Cliente;
import com.mashernandez.ejemplofacturas.modelo.Factura;
import com.mashernandez.ejemplofacturas.modelo.ItemFactura;
import com.mashernandez.ejemplofacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Miguel");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingresa la descripción de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingresa el producto no. " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingresa el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingresa la cantidad: ");
            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }

        System.out.println(factura);

    }

}