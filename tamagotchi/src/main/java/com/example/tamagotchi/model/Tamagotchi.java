/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tamagotchi.model;

public class Tamagotchi {
    private String nome;
    private EstagioDeVida estagioDeVida;
    private int idade;
    private Necessidade fome;
    private Necessidade felicidade;
    private Necessidade energia;
    private Necessidade saude;

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
        System.out.println("Você alimentou o " + getNome() + ".");
        getFome().alterarEstado(20);
    }

    public void brincar() {
        System.out.println("Você brincou com o " + getNome() + ".");
        getFelicidade().alterarEstado(15);
        getEnergia().alterarEstado(-10);
    }

    public void dormir() {
        System.out.println(getNome() + " está dormindo.");
        getEnergia().alterarEstado(30);
    }

    public String verificarStatus() {
        String status = "";
        status += "Status do " + getNome() + ":\n";
        status +="Estágio de Vida: " + getEstagioDeVida() + "\n";
        status +="Idade: " + getIdade() + " dias" + "\n";
        status +="Fome: " + getFome().getEstado() + "\n";
        status +="Felicidade: " + getFelicidade().getEstado() + "\n";
        status +="Energia: " + getEnergia().getEstado() + "\n";
        status +="Saúde: " + getSaude().getEstado() + "\n";
        System.out.println(status);
        return status;
    }

    public void envelhecer() {
        setIdade(getIdade() + 1);
        if (getIdade() >= 10 && getIdade() < 20) {
            setEstagioDeVida(EstagioDeVida.ADOLESCENTE);
        } else if (getIdade() >= 20) {
            setEstagioDeVida(EstagioDeVida.ADULTO);
        }
        System.out.println(getNome() + " envelheceu! Está agora no estágio " + getEstagioDeVida() + ".");
    }

    public void atualizarEstado() {
        getFome().alterarEstado(-5); // Diminui a fome naturalmente
        getFelicidade().alterarEstado(-3); // Diminui a felicidade naturalmente
        getEnergia().alterarEstado(-7); // Diminui a energia naturalmente
        getSaude().alterarEstado(-2); // Diminui a saude naturalmente

        // Verifica se o Tamagotchi precisa de atenção especial
        if (getFome().getEstado() <= 0) {
            System.out.println(getNome() + " está com muita fome!");
        }
        if (getFelicidade().getEstado() <= 0) {
            System.out.println(getNome() + " está infeliz!");
        }
        if (getEnergia().getEstado() <= 0) {
            System.out.println(getNome() + " está exausto!");
        }
        if (getSaude().getEstado() <= 0) {
            System.out.println(getNome() + " está doente!");
        }
    }

   
    /**
     *
     * @return
     */
    public Necessidade getFome() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.fome;
    }

    public Necessidade getFelicidade() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.felicidade;
    }

    public Necessidade getEnergia() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.energia;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the estagioDeVida
     */
    public EstagioDeVida getEstagioDeVida() {
        return estagioDeVida;
    }

    /**
     * @param estagioDeVida the estagioDeVida to set
     */
    public void setEstagioDeVida(EstagioDeVida estagioDeVida) {
        this.estagioDeVida = estagioDeVida;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @param fome the fome to set
     */
    public void setFome(Necessidade fome) {
        this.fome = fome;
    }

    /**
     * @param felicidade the felicidade to set
     */
    public void setFelicidade(Necessidade felicidade) {
        this.felicidade = felicidade;
    }

    /**
     * @param energia the energia to set
     */
    public void setEnergia(Necessidade energia) {
        this.energia = energia;
    }

    /**
     * @return the saude
     */
    public Necessidade getSaude() {
        return saude;
    }

    /**
     * @param saude the saude to set
     */
    public void setSaude(Necessidade saude) {
        this.saude = saude;
    }
}
