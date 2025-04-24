package com.example.tamagotchi;

import com.example.tamagotchi.model.Tamagotchi;
import com.example.tamagotchi.controller.Jogador;
import java.util.Scanner;


/**
 * Classe principal que tem o metodo main
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
        Scanner scanner = new Scanner(System.in);
        Jogador jogador = new Jogador();

        // Criação do Tamagotchi
        System.out.println("Bem-vindo ao Tamagotchi Virtual!");
        String nomeTamagotchi = jogador.obterNomeTamagotchi();
        Tamagotchi tamagotchi = new Tamagotchi(nomeTamagotchi);

        while (true) {
            int acao = jogador.escolherAcao();

            switch (acao) {
                case 1:
                    tamagotchi.alimentar();
                    break;
                case 2:
                    tamagotchi.brincar();
                    break;
                case 3:
                    tamagotchi.dormir();
                    break;
                case 4:
                    tamagotchi.verificarStatus();
                    break;
                case 5:
                    System.out.println("Até logo!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ação inválida. Tente novamente.");
            }

            // Atualiza o estado do Tamagotchi automaticamente
            tamagotchi.atualizarEstado();
            tamagotchi.envelhecer();

            // Verifica se o Tamagotchi morreu
            if (tamagotchi.getSaude().getEstado() == 0) {
                System.out.println(tamagotchi.getNome() + " morreu...");
                scanner.close();
                return;
            }
        }
    }
}