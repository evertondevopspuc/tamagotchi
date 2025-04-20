/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tamagotchi.model;

public class Tamagotchi {
    public final String nome;
    private EstagioDeVida estagioDeVida;
    private int idade;
    private final Necessidade fome;
    private final Necessidade felicidade;
    private final Necessidade energia;
    public final Necessidade saude;

    public Tamagotchi(String nome) {
        this.nome = nome;
        this.idade = 0;
        this.estagioDeVida = EstagioDeVida.BEBE;
        this.fome = new Fome();
        this.felicidade = new Felicidade();
        this.energia = new Energia();
        this.saude = new Saude();
    }

    public void alimentar() {
        System.out.println("Você alimentou o " + nome + ".");
        fome.alterarEstado(20);
    }

    public void brincar() {
        System.out.println("Você brincou com o " + nome + ".");
        felicidade.alterarEstado(15);
        energia.alterarEstado(-10);
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
        energia.alterarEstado(30);
    }

    public void verificarStatus() {
        System.out.println("Status do " + nome + ":");
        System.out.println("Estágio de Vida: " + estagioDeVida);
        System.out.println("Idade: " + idade + " dias");
        System.out.println("Fome: " + fome.getEstado());
        System.out.println("Felicidade: " + felicidade.getEstado());
        System.out.println("Energia: " + energia.getEstado());
        System.out.println("Saúde: " + saude.getEstado());
    }

    public void envelhecer() {
        idade++;
        if (idade >= 10 && idade < 20) {
            estagioDeVida = EstagioDeVida.ADOLESCENTE;
        } else if (idade >= 20) {
            estagioDeVida = EstagioDeVida.ADULTO;
        }
        System.out.println(nome + " envelheceu! Está agora no estágio " + estagioDeVida + ".");
    }

    public void atualizarEstado() {
        fome.alterarEstado(-5); // Diminui a fome naturalmente
        felicidade.alterarEstado(-3); // Diminui a felicidade naturalmente
        energia.alterarEstado(-7); // Diminui a energia naturalmente
        saude.alterarEstado(-2); // Diminui a saude naturalmente

        // Verifica se o Tamagotchi precisa de atenção especial
        if (fome.getEstado() <= 0) {
            System.out.println(nome + " está com muita fome!");
        }
        if (felicidade.getEstado() <= 0) {
            System.out.println(nome + " está infeliz!");
        }
        if (energia.getEstado() <= 0) {
            System.out.println(nome + " está exausto!");
        }
        if (saude.getEstado() <= 0) {
            System.out.println(nome + " está doente!");
        }
    }
}
