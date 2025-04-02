// Classe
public class PersonagemMagico {

    //Atributos
    String nome; // Atributo da classe
    int nivelEnergia; // Atributo da classe
    String porderMagico; // Atributo da classe
    HabilidadeEspecial habilidadeEspecial; // Atributo da classe

    // Construtor com três parâmetros
    public PersonagemMagico(String nome, int nivelEnergia, String porderMagico) {
        this.nome = nome; // Inicializa o atributo 'nome'
        this.nivelEnergia = nivelEnergia; // Inicializa o atributo 'nivelEnergia'
        this.porderMagico = porderMagico; // Inicializa o atributo 'porderMagico'
    }

    // Construtor com um parâmetro
    public PersonagemMagico(String nome) {
        this.nome = nome; // Inicializa o atributo 'nome'
    }

    // Construtor padrão (sem parâmetros)
    public PersonagemMagico() {}

    // Metodo para realizar um ataque
    public void atacar(String ataque) {
        if (nivelEnergia >= 10) {
            System.out.println(nome + " realizou um ataque: " + ataque + "!");
            nivelEnergia -= 10; // Reduz o nível de energia após o ataque
        } else {
            System.out.println(nome + " está sem energia para atacar.");
        }
    }

    // Metodo para aumetar energia
    public int aumentarEnergia(int energia) {
        nivelEnergia = nivelEnergia + energia; // Aumenta o nível de energia
        return nivelEnergia; // Retorna o novo nível de energia
    }

    // Metodo para ativar a habilidade especial
    public void ativarHabilidadeEspecial() {
        if (!habilidadeEspecial.habilitada) { // Verifica se a habilidade especial está habilitada
            System.out.println("Habilidade especial não está ativada");
        } else if (nivelEnergia >= habilidadeEspecial.custoEnergia) { // Verifica se há energia suficiente
            System.out.println("Ativando a habilidade: " + habilidadeEspecial.nome);
            nivelEnergia -= habilidadeEspecial.custoEnergia; // Reduz a energia pelo custo da habilidade
        } else {
            System.out.println(nome + " está sem energia para a habilidade especial");
        }

        }

}
