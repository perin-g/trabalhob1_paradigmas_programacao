import Classes.Arqueiro;
import Classes.Guerreiro;
import Classes.Mago;
import Classes.Personagem;

/*
* Integrantes dupla:
*   Nome: Gabriel Augusto Perin
*   RA: 2015012222
*
*   Nome: Paola Machado
*   RA: 2025024741
* */
void main() {

    Scanner sc = new Scanner(System.in);
    int menu1 = 0;

    do {
        System.out.println("Masmorras & Dragões - uma aventura épica.");
        System.out.println("Vamos iniciar nossa aventura criando nossos heróis.");
        System.out.println("Me diga, quem é você?");
        String nome = sc.nextLine();
        System.out.println("Qual a sua classe? (Guerreiro, Mago, Arqueiro, Clérigo)");
        String classe = sc.nextLine().toLowerCase();
        Personagem p1 = criarPersonagem(nome, classe, sc);

    } while (menu1 == 5);

    do {
        System.out.println("opcoes de jogo:");
        System.out.println("digite a opcao desejada para essa rodada.");
        System.out.println("1-atacar");
        System.out.println("2- usar habilidade especial");
        System.out.println("3- curar um aliado");
        System.out.println("4-passar a vez");

    } while ();

}

private static Personagem criarPersonagem(String nome, String classe, Scanner sc) {
    System.out.println("Informe seu HP máximo: ");
    int hp = Integer.parseInt(sc.nextLine());
    System.out.println("Informe sua defesa: ");
    int defesaBase = Integer.parseInt(sc.nextLine());

    switch (classe) {
        case "guerreiro":
            System.out.println("Informe sua força: ");
            int forca = Integer.parseInt(sc.nextLine());
            System.out.println("Informe sua stamina: ");
            int stamina = Integer.parseInt(sc.nextLine());
            Guerreiro guerreiro = new Guerreiro(nome, hp, defesaBase, forca, stamina);
            return guerreiro;
        case "mago":
            System.out.println("Informe seu poder mágico: ");
            int poderMagico = Integer.parseInt(sc.nextLine());
            System.out.println("Informe sua mana: ");
            int mana = Integer.parseInt(sc.nextLine());
            Mago mago = new Mago(nome, hp, defesaBase, poderMagico, mana);
            return mago;
        case "arqueiro":
            System.out.println("Informe sua destreza: ");
            int destreza = Integer.parseInt(sc.nextLine());
            System.out.println("Informe sua quantidade de flechas: ");
            int flechas = Integer.parseInt(sc.nextLine());
            Arqueiro arqueiro = new Arqueiro(nome, hp, defesaBase, destreza, flechas);
            return arqueiro;
        case "clérigo":
            //TODO: implementar
        default:
            System.out.println("Classe não encontrada");
            return null;
    }
}