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



    boolean turno = true;
    while (turno) {
        int contadorTurnos = 1;
        System.out.println("--- " + contadorTurnos + "º TURNO ---");
        System.out.println("Lista de heróis:");
        int aux = 0;
        for (Personagem p : time) {
            aux += 1;
            System.out.println(aux);
            p.exibirStatus();
        }

        System.out.println("Selecione o personagem que deve agir agora");
        int personagem = Integer.parseInt(sc.nextLine());

        System.out.println("Selecione o alvo");
        int alvoAtaque = Integer.parseInt(sc.nextLine());

        if (personagem >= 0 && personagem < time.size() && alvoAtaque >= 0 & alvoAtaque <= time.size()) {
            Personagem atacante = time.get(personagem);
            Personagem alvo = time.get(alvoAtaque);

            System.out.println("Ações do personagem:");
            System.out.println("1 - Atacar");
            System.out.println("2 - Usar habilidade' especial");
            System.out.println("3 - Curar um aliado");
            System.out.println("4 - Passar a vez");
            System.out.println("Qual ação deseja fazer?");
            int acao = Integer.parseInt(sc.nextLine());

            switch (acao) {
                case 1:
                    if (atacante instanceof Guerreiro) {
                        Guerreiro g = (Guerreiro) atacante;

                        System.out.println("Usar Grito de Guerra? (s/n) \nGrito de guerra: Adiciona +5 no ataque, só pode ser usado uma vez por combate.");
                        String usarGrito = sc.nextLine().toLowerCase();

                        if (usarGrito.equals("s")) {
                            g.gritoDeGuerra(alvo);
                        } else {
                            g.atacar(alvo);
                        }
                    } else if (atacante instanceof Mago) {
                        Mago m = (Mago) atacante;

                        System.out.println("Usar Raio Congelante? (s/n) \nRaio de gelo: Consome 20 de mana, causa 12 de dano e imprime um efeito de “congelamento” no alvo.");
                        String raioCongelante = sc.nextLine().toLowerCase();
                        if (raioCongelante.equals("s")) {
                            m.raioCongelante(alvo);
                        } else {
                            m.atacar(alvo);
                        }
                    } else if (atacante instanceof Arqueiro) {
                        Arqueiro a = (Arqueiro) atacante;

                        System.out.println("Usar Flehca Venenosa? (s/n) \nFlecha Venenosa: causa dano imediato (igual a destreza) e aplica envenenamento");
                        String flechaVenenosa = sc.nextLine().toLowerCase();

                        if (flechaVenenosa.equals("s")) {
                            a.flechaVenenosa(alvo);
                        } else {
                            a.atacar(alvo);
                        }
                    } else {
                        atacante.atacar(alvo);
                    }
                    break;
                case 2:
                    atacante.usarHabilidadeEspecial(alvo);
                    break;
                case 3:
                    if (atacante instanceof Clerigo) {
                        Clerigo c = (Clerigo) atacante;
                        c.curar(alvo);
                    } else {
                        System.out.println("Sua classe não pode curar!");
                        break;
                    }
                case 4:
                    System.out.println("Pulando turno...");
                    break;
                default:
                    System.out.println("Opção inválida, pulando turno...");
                    break;
            }

            if (atacante.getHp() == 0) {
                System.out.println("O herói " + atacante.getNome() + " acaba de morrer, combate encerrado.");
                turno = false;
                break;
            } else if (alvo.getHp() == 0) {
                System.out.println("O herói " + atacante.getNome() + " acaba de morrer, combate encerrado.");
                turno = false;
                break;
            }
        }
    }

    System.out.println("Encerrando a sessão de Masmorras & Dragões... ");
    sc.close();
}

private static Personagem criarPersonagem(String nome, int classe, Scanner sc) {
//    Deixado setado valores padrão para facilitar o teste e correção, mas desenvolvida a lógica para pegar os dados do usuário.
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