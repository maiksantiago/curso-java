package com.maiksantiago.hilos.ejemploexecutor;

import com.maiksantiago.hilos.ejemplosync.Panaderia;
import com.maiksantiago.hilos.ejemplosync.runnable.Consumidor;
import com.maiksantiago.hilos.ejemplosync.runnable.Panadero;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class EjemploExecutorProductorConsumidor {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        Panaderia p = new Panaderia();
        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);

        Future<?> futuro1 = executor.submit(consumidor);
        Future<?> futuro2 = executor.submit(productor);

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        executor.shutdown();
        System.out.println("Continuando con la ejecución del método main");

    }

}