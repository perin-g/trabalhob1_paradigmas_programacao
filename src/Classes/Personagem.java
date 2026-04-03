package Classes;

public abstract class Personagem {

    private String nome;
    private int hp;
    private int hpMax;
    private int defesaBase;

    public Personagem(String nome) {
        this.nome = nome;
        this.hp = 10;
        this.defesaBase = 10;
    }

    public Personagem(String nome, int hp, int hpMax, int defesaBase) {
        this.nome = "Padrão";
        this.hp = 10;
        this.hpMax = hpMax;
        this.defesaBase = 10;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDefesaBase() {
        return defesaBase;
    }

    public void setDefesaBase(int defesaBase) {
        this.defesaBase = defesaBase;
    }

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    /*
    * TODO: implementar método
    * Descrição: Executa um ataque básico no personagem alvo. O método deve:
    * Calcular o dano base chamando o método abstrato protected abstract int getPoderAtaque().
    * Subtrair a defesaBase do alvo do dano calculado (garantindo que o dano final não seja negativo).
    * Invocar alvo.receberDano(danoFinal);
    * */
    public void atacar(Personagem alvo) {
    int valorAtaque = this.getPoderAtaque();
    int defesaPersonagemAlvo = alvo.getDefesaBase();
    valorAtaque - defesaPersonagemAlvo
    alvo.receberDano
    }

    /*
    * TODO: implementar método
    * Descrição: Subtrai o valor de quantidade do HP; se o HP ficar abaixo de 0, ajusta para 0.
    * */
    public void receberDano(int quantidade) {

    }

    /*
    *  TODO: implementar método
    *  Descrição: Sobrecarga de receberDano. Se o parâmetro critico for true, dobra o valor de quantidade antes de subtrair do HP.
    * */
    public void receberDano(int quantidade, boolean critico){

    }

    /*
    * TODO: implementar método
    * Descrição: Incrementa o HP em quantidade, sem ultrapassar hpMax.
    * */
    public void receberCura(int quantidade) {

    }

    /*
    * Descrição: Cada subclasse deverá implementar este método
    * para exibir seus atributos e efeitos especiais de forma personalizada.
    * */
    public abstract void exibirStatus();

    /*
    * Descrição: Método que deve retornar o valor do ataque básico do personagem com base em seus atributos específicos
    * */
    protected abstract int getPoderAtaque();
}
