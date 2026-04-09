package Classes;

import Interfaces.Especial;

public class Arqueiro extends Personagem implements Especial {
    private int destreza;
    private int flechas;

    public Arqueiro(String nome, int destreza, int flechas) {
        super(nome);
        this.destreza = destreza;
        this.flechas = flechas;
    }

    public Arqueiro(String nome, int hp, int hpMax, int defesaBase, int destreza, int flechas) {
        super(nome, hp, hpMax, defesaBase);
        this.destreza = destreza;
        this.flechas = flechas;
    }


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

    @Override
    protected int getPoderAtaque() {
            if( flechas > 0){
                return destreza;
            } else {
                int destrezaAtt = (destreza / 2);
                return destrezaAtt;
            }
    }

    @Override
    public void exibirStatus() {
        System.out.println("Nome: " + this.getNome() + " | HP atual: " + this.getHp() + " | HP máximo: " + this.getHpMax() +
                " | Defesa base:" + this.getDefesaBase() + " | Flechas: " + this.getFlechas() +
                " | Destreza: " + this.getDestreza());
    }


    @Override
    public void usarHabilidadeEspecial (Personagem alvo) {
        int danoAtaque;
        if (flechas >= 2) {
            danoAtaque = destreza * 2;
            alvo.receberDano(danoAtaque);
            this.flechas-= 2;
            System.out.println("Habilidade especial usada com sucesso, voce causou "
                    + danoAtaque + " ao inimigo. | você possui "
                    + this.flechas + " flechas.");
        } else {
            danoAtaque = destreza / 2;
            alvo.receberDano(danoAtaque);
            System.out.println("Habilidade especial foi usada, dano reduzido devido a quantidade de flechas. Você causou"
            + danoAtaque + " ao inimigo. | você possui " + this.flechas + "flechas ");
        }

    }
    public void flechaVenenosa (Personagem alvo){
        alvo.receberDano(destreza);
        this.flechas-=1;
        System.out.println(" Habilidade especial foi usada com sucesso!  Você causou " + destreza + " de dano. | você" +
                "possui " + this.flechas + "flechas"   +
                alvo.getNome() + " envenenado, sofrerá +5 de dano nos próximos 2 turnos. ");
    }


}