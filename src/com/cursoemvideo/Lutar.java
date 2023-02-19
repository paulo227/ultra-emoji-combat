package com.cursoemvideo;

import java.util.Random;

public class Lutar {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
        }else {
            aprovada = false;
            desafiante = null;
            desafiado = null;
        }
    }
    public void luta(){
        if (this.aprovada){
            System.out.println("------ Desafiado ------");
            this.desafiado.apresentar();
            System.out.println("------ Desafiante ------");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            System.out.println("=======================");
            switch (vencedor){

                case 0:
                    System.out.println("Empatou");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória para " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Viória para " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }else System.out.println("A luta não pode acontecer");
        System.out.println("=======================");
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
