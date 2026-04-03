package Classes;

import Interfaces.Especial;

public class Arqueiro extends Personagem implements Especial {
        private int  destreza;
        private int flechas;


    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
    public int getDestreza() {
        return destreza;
    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }
    public void exibirStatus() {
        System.out.println("Nome: " + this.getNome() + " | HP atual: " + this.getHp() + " | HP máximo: " + this.getHpMax() +
                " | Defesa base:" + this.getDefesaBase() + " | Flechas: " + this.getFlechas() +
                " | Destreza: " + this.getDestreza());
    }

}
