package teste.felps.br.polimorfismo;

public class Gato extends Animal {

    @Override
    public void fazerSom(){
        System.out.println("O "+this.getEspecie() +" Esta Miando : Miau miau miau");
    }

    public void arranhar(){
        System.out.println(this.getEspecie()+ "Arranhando");
    }

    @Override
    public void exibir() {
        super.exibir();
        fazerSom();
        arranhar();
    }

}
