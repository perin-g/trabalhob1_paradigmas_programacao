import Classes.*;

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
    List<Personagem> time = new ArrayList<>();
    int opcao = -1;

    System.out.println("Masmorras & Dragões - uma aventura épica.");
    System.out.println("Vamos iniciar nossa aventura criando nossos heróis.");
    System.out.println("Quantos heróis deseja criar?");
    int quantidade = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < quantidade; i++) {
        System.out.println("Digite o nome do herói:");
        String nome = sc.nextLine();
        System.out.println("Escolha a classe: \n1 - Guerreiro \n2 - Mago \n3 - Arqueiro \n 4 - Clérigo");
        int classe = Integer.parseInt(sc.nextLine());

        Personagem p = criarPersonagem(nome, classe, sc);

        if (p != null) {
            time.add(criarPersonagem(nome, classe, sc));
        } else {
            System.out.println("Classe inválida, tente novamente.");
            i--;
        }
    }

    do {
        System.out.println("opcoes de jogo:");
        System.out.println("digite a opcao desejada para essa rodada.");
        System.out.println("1-atacar");
        System.out.println("2- usar habilidade especial");
        System.out.println("3- curar um aliado");
        System.out.println("4-passar a vez");

    } while ();

}

private static Personagem criarPersonagem(String nome, int classe, Scanner sc) {
//    Deixado setado valores padrão para facilitar o teste e correção, mas desenvolvida a lógica para pegar os dados dos usuário.
//    System.out.println("Informe seu HP máximo: ");
//    int hp = Integer.parseInt(sc.nextLine());
//    System.out.println("Informe sua defesa: ");
//    int defesaBase = Integer.parseInt(sc.nextLine());

    switch (classe) {
        case 1:
//            System.out.println("Informe sua força: ");
//            int forca = Integer.parseInt(sc.nextLine());
//            System.out.println("Informe sua stamina: ");
//            int stamina = Integer.parseInt(sc.nextLine());
            int forca = 20;
            int stamina =100;
            int defesaBase = 30;
            int hp = 30;
            Guerreiro guerreiro = new Guerreiro(nome, hp, hp, defesaBase, forca, stamina);
            return guerreiro;
        case 2:
//            System.out.println("Informe seu poder mágico: ");
//            int poderMagico = Integer.parseInt(sc.nextLine());
//            System.out.println("Informe sua mana: ");
//            int mana = Integer.parseInt(sc.nextLine());
            int defesa = 15;
            int poderMagico = 30;
            int hpMago = 30;
            int mana = 100;
            Mago mago = new Mago(nome, hpMago, hpMago, defesa, poderMagico, mana);
            return mago;
        case 3:
 //           System.out.println("Informe sua destreza: ");
 //         int destreza = Integer.parseInt(sc.nextLine());
 //          System.out.println("Informe sua quantidade de flechas: ");
 //           int flechas = Integer.parseInt(sc.nextLine());
            int defesaArqueiro = 15;
            int destreza = 20;
            int flechas=100;
            int hpArqueiro= 70;
            Arqueiro arqueiro = new Arqueiro(nome, hpArqueiro, hpArqueiro, defesaArqueiro, destreza, flechas);
            return arqueiro;
        case 4:
//            System.out.println("Informe sua fé: ");
//            int fe = Integer.parseInt(sc.nextLine());
//            System.out.println("Informe sua quantidade de flechas: ");
//            int oracoes = Integer.parseInt(sc.nextLine());
            int fe = 5;
            int oracoes = 50;
            int hpClerigo = 80;
            int defesaClerigo = 18;
            Clerigo clerigo = new Clerigo(nome, hpClerigo, hpClerigo, defesaClerigo, fe, oracoes);
        default:
            System.out.println("Classe não encontrada");
            return null;
    }
}