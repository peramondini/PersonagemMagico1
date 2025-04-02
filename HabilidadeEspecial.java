// classe
public class HabilidadeEspecial {


    // atributos
    String nome;
    int custoEnergia;
    boolean habilitada;

    // construtor
    public HabilidadeEspecial(String nome, int custoEnergia, boolean habilitada){
        this.nome = nome;
        this.custoEnergia = custoEnergia;
        this.habilitada = habilitada;
    }
    public void ativarHabilidade(){
        habilitada = true;
    }

}
