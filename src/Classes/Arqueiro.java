package Classes;

import Interfaces.Especial;

public class Arqueiro extends Personagem implements Especial {
        private int  destreza;
        private int flechas;

        public Arqueiro (String nome, int destreza, int flechas){
            super(nome);
            this.destreza = destreza;
            this.flechas = flechas;
        }
        public Arqueiro ( String nome, int hp, int hpMax, int defesaBase, int destreza, int flechas){
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
        return 0;
    }

    @Override
    public void exibirStatus() {
        System.out.println("Nome: " + this.getNome() + " | HP atual: " + this.getHp() + " | HP máximo: " + this.getHpMax() +
                " | Defesa base:" + this.getDefesaBase() + " | Flechas: " + this.getFlechas() +
                " | Destreza: " + this.getDestreza());
    }
    @Override
    public void usarHabilidadeEspecial(Personagem alvo){
            int danoAtaque;
            if( flechas > 0){
                danoAtaque = destreza * 2;
                alvo.receberDano(danoAtaque);
                this.flechas--;
                System.out.println("Habilidade especial usada com sucesso, voce causou "
                        + danoAtaque + " ao inimigo. | voce possui "
                        + this.flechas + " flechas.");
            } else {
                System.out.println("não é possivel realizar a habilidade especial sem flechas.");

            }
    }

    @Override
    public void atacar(Personagem alvo) {
            getPoderAtaque();
            alvo.getDefesaBase();
        super.atacar(alvo);
            if()
        super.atacar(alvo);

    }


    public void receberDano(int quantidade){
            super.receberDano();
    }

    @Override
    public void receberDano(int quantidade, boolean critico) {
        super.receberDano(quantidade, critico);
    }

    @Override
    public void receberCura(int quantidade) {
        super.receberCura(quantidade);
    }
}
