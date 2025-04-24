/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tamagotchi;

import com.example.tamagotchi.model.Tamagotchi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TamagotchiTest {

    private Tamagotchi tamagotchi;

    @BeforeEach
    void setUp() {
        tamagotchi = new Tamagotchi("Test");
    }

    @Test
    void testAlimentar() {
        tamagotchi.alimentar();
        assertTrue(tamagotchi.getFome().getEstado() > 80, "O nível de fome deve aumentar após alimentar.");
    }

    @Test
    void testBrincar() {
        tamagotchi.brincar();
        assertTrue(tamagotchi.getFelicidade().getEstado() > 80, "O nível de felicidade deve aumentar após brincar.");
        assertTrue(tamagotchi.getEnergia().getEstado() < 100, "O nível de energia deve diminuir após brincar.");
    }

    @Test
    void testDormir() {
        tamagotchi.dormir();
        assertTrue(tamagotchi.getEnergia().getEstado() > 90, "O nível de energia deve aumentar após dormir.");
    }

    @Test
    void testEnvelhecer() {
        int idadeInicial = tamagotchi.getIdade();
        tamagotchi.envelhecer();
        assertEquals(idadeInicial + 1, tamagotchi.getIdade(), "A idade deve aumentar após envelhecer.");
    }

    @Test
    void testVerificarStatus() {
        assertNotNull(tamagotchi.verificarStatus(), "O método verificarStatus deve retornar informações válidas.");
    }
}