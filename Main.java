//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Criando um objeto do tipo personagem magico
        PersonagemMagico mago = new PersonagemMagico( "Gandalf", 100 , "Magia");

        //Atribuindo valores aos atributos do objeto
        mago.nome = "Gandalf";
        mago.nivelEnergia = 100;
        mago.porderMagico = "Magia";


        //Exibindo valores dos atributos dos objetos
        System.out.println(mago.nome + " Energia: " + mago.nivelEnergia + " Poder: " + mago.porderMagico);

        PersonagemMagico elfo = new PersonagemMagico( "Herold", 80, "Arqueira");

        elfo.nome = "Herold";
        elfo.nivelEnergia = 80;
        elfo.porderMagico = "Arqueira";

        System.out.println(elfo.nome + " Energia: " + elfo.nivelEnergia + " Poder: " + elfo.porderMagico);
    }
}