package com.maiksantiago.hilos.ejemplosync;

import com.maiksantiago.hilos.ejemplosync.runnable.Consumidor;
import com.maiksantiago.hilos.ejemplosync.runnable.Panadero;

public class EjemploProductorConsumidor {

    public static void main(String[] args) {

        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();

    }

}