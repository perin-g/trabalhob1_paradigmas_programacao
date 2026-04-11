package Classes;

import Interfaces.Especial;

public class Mago extends  Personagem implements Especial {
        private int poderMagico;
        private int mana;

    public Mago(String nome, int poderMagico, int mana) {
        super(nome);
        this.poderMagico = poderMagico;
        this.mana = mana;
    }

    public Mago(String nome, int hp, int hpMax, int defesaBase, int poderMagico, int mana) {
        super(nome, hp, hpMax, defesaBase);
        this.poderMagico = poderMagico;
        this.mana = mana;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void exibirStatus() {
        System.out.println("Nome: " + this.getNome() + " | HP atual: " + this.getHp() + " | HP máximo: " + this.getHpMax() + " | Defesa base:" + this.getDefesaBase()
                            + " | Poder mágico: " + this.getPoderMagico() + " | Mana: " + this.getMana());
    }

    @Override
    protected int getPoderAtaque() {
        return 0;
    }


    /*
    * TODO: implementar método
    * Descrição: Implementa “Bola de Fogo”. Deve:
    *   Verificar se há mana suficiente (mínimo 30 pontos).
    *   Consumir 30 pontos de mana.
    *  Causar dano igual a 3 * poderMagico.
    * */
    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {

    }

    /*
    * Descrição: Consome 20 pontos de mana, causa 12 de dano e imprime um efeito de “congelamento”
    * (redução temporária no poder de ataque do alvo – efeito apenas impresso).
    * */
    public void raioCongelante(Personagem alvo) {

    }
}
