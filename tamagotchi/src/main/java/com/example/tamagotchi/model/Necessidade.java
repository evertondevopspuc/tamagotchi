/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tamagotchi.model;

public abstract class Necessidade {
    protected int estado;

    public Necessidade() {
        this.estado = 100; // Estado inicial
    }

    public void alterarEstado(int valor) {
        estado += valor;
        if (estado > 100) estado = 100;
        if (estado < 0) estado = 0;
    }

    public int getEstado() {
        return estado;
    }
}
