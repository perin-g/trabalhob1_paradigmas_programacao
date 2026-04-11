package Classes;

import Interfaces.Especial;

public class Guerreiro extends Personagem implements Especial {
    private int forca;
    private int stamina;
    private boolean gritoUsado;
    private int bonusForca;

    public Guerreiro(String nome, int hp, int hpMax, int defesaBase, int forca, int stamina) {
        super(nome, hp, hpMax, defesaBase);
        this.forca = forca;
        this.stamina = stamina;
        this.gritoUsado = false;
        this.bonusForca = 5;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public boolean isGritoUsado() {
        return gritoUsado;
    }

    public void setGritoUsado(boolean gritoUsado) {
        this.gritoUsado = gritoUsado;
    }

    public int getBonusForca() {
        return bonusForca;
    }

    public void setBonusForca(int bonusForca) {
        this.bonusForca = bonusForca;
    }

    /*
    * Descrição: Exibe o nome, HP, hpMax, defesaBase, forca, stamina e bônus de força.
    * */
    @Override
    public void exibirStatus() {
        System.out.println("Nome: " + this.getNome() + " | HP atual: " + this.getHp() + " | HP máximo: " + this.getHpMax() + " | Defesa base:" + this.getDefesaBase() + " | Força: " + this.getForca()
                            + " | Stamina: " + this.getStamina() + " | Bônus de força: " + this.getBonusForca());
    }

    /*
    * Descrição: Retorna o valor de ataque básico como a soma de forca e bonusForca.
    * */
    @Override
    protected int getPoderAtaque() {
        return 0;
    }

    /*
    * TODO: implementar método
    * Descrição: Implementa a habilidade “Espadada Mortal”. Deve:
    *   Verificar se a stamina é suficiente (mínimo 20 pontos).
    *   Consumir 20 pontos de stamina.
    *   Causar dano igual a 2 * (poder de ataque) no alvo.
    * */
    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        if (this.getStamina() >= 20) {
            setStamina(this.getStamina() - 20);
            alvo.receberDano(2 * this.getPoderAtaque());
        }
    }

    /*
    * Descrição: Aumenta bonusForca em +5 para o próximo ataque. Só pode ser usado uma vez por batalha.
    * */
    public void gritoDeGuerra(Personagem alvo) {
        if (!gritoUsado) {
            System.out.println("Habilidade já usada. Realizando ataque normal.");
            atacar(alvo);
        } else {
            this.setForca(this.getBonusForca() + 5);
            atacar(alvo);
            this.setBonusForca(this.getBonusForca() - 5);
        }
    }
}
