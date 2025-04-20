/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tamagotchi.controller;

import java.util.Scanner;

public class Jogador {
    private final Scanner scanner;

    public Jogador() {
        this.scanner = new Scanner(System.in);
    }

    public String obterNomeTamagotchi() {
        System.out.print("Digite o nome do seu Tamagotchi: ");
        return scanner.nextLine();
    }

    /**
     *
     * @return
     */
    public int escolherAcao() {
        System.out.println("Escolha uma ação:");
        System.out.println("1. Alimentar");
        System.out.println("2. Brincar");
        System.out.println("3. Dormir");
        System.out.println("4. Verificar Status");
        System.out.println("5. Sair");
        return scanner.nextInt();
    }
}
