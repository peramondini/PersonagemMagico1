import java.util.Scanner;

public class Menu {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PersonagemMagico personagem = new PersonagemMagico();
        int op;
        do {
            System.out.println("Escolha uma opcão: \n1-Cadastrar Personagem \n2-Exibir Personagem " +
                    "\n3-Atacar \n4-Aumentar energia \n5-Ativar habilidade especial \n6- Habilitar a habilidade especial; \n0-Sair");
            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("Digite o nome do personagem:");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o poder do personagem");
                    String poder = sc.next() + sc.nextLine();
                    System.out.println("Digite o nivel de energia");
                    int energia = sc.nextInt();
                    personagem.nome = nome;
                    personagem.nivelEnergia = energia;
                    personagem.porderMagico = poder;

                    System.out.println("Digite o nome da habilidade especial:");
                    String nomeHabilidade = sc.next() + sc.nextLine();
                    System.out.println("Digite o custo de energia para usar a habilidade especial:");
                    int nivelEnergia = sc.nextInt();
                    System.out.println("A habilidade esta ativada (true/false):");
                    boolean ativada = sc.nextBoolean();

                    //Criando o objeto que representa a habilidade especial com os valores informados pelo usuario
                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, nivelEnergia, ativada);
                    //Atribuindo o objeto habilidade especial personagem
                    personagem.habilidadeEspecial = habilidadeEspecial;
                    break;
                case 2:
                    System.out.println("Nome: " + personagem.nome + " Poder: " + personagem.porderMagico + " Nivel de energia: " + personagem.nivelEnergia);
                    System.out.println("Habilidade: " + personagem.habilidadeEspecial.nome + " Custo energia: " + personagem.habilidadeEspecial.custoEnergia + " Habilitada: " + personagem.habilidadeEspecial);
                    break;
                case 3:
                    System.out.println("Digite o nome do ataque:");
                    String ataque = sc.next() + sc.nextLine();
                    personagem.atacar(ataque);
                    break;
                case 4:
                    System.out.println("Digite a quantidade de energia:");
                    int qtd = sc.nextInt();
                    int nivelAtual = personagem.aumentarEnergia(qtd);
                    System.out.println("Nivel atual de energia: " + nivelAtual);
                    break;
                case 5:
                    personagem.ativarHabilidadeEspecial();
                    break;
                case 6:
                    personagem.habilidadeEspecial.ativarHabilidade();
                    break;
                case 0:
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Opcao invalida");

            }
        }while(op != 0);

        sc.close();

    }
}
