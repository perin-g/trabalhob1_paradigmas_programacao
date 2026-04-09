package Classes;

import Interfaces.Especial;

public class Clerigo extends Personagem implements Especial {
    private int fe;
    private int oracoes;

        public Clerigo(String nome, int fe, int oracoes) {
            super(nome);
            this.fe = fe;
            this.oracoes = oracoes;
        }

        public Clerigo (String nome, int hp, int hpMax, int defesaBase, int destreza, int flechas) {
            super(nome, hp, hpMax, defesaBase);
            this.fe = destreza;
            this.oracoes = flechas;
        }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public int getOracoes() {
        return oracoes;
    }

    public void setOracoes(int oracoes) {
        this.oracoes = oracoes;
    }

    @Override
    protected int getPoderAtaque() {
            if (fe > 0){
                return fe;
            } else {

            }
    }


    @Override
    public void exibirStatus() {
        System.out.println("Nome: " + this.getNome() + " | HP atual: " + this.getHp() + " | HP máximo: " + this.getHpMax() +
                " | Defesa base:" + this.getDefesaBase() + " | Fé: " + this.getFe() +
                " | Oracoes: " + this.getOracoes());
    }

    @Override
    public void usarHabilidadeEspecial (Personagem alvo) {
        if ( oracoes >= 1){
            this.oracoes-=1;
        alvo.receberDano(fe);
        } else {
            System.out.println("não foi possível usar a habilidade. Não há orações disponíveis");
        }
    }







}