package teste.felps.br.polimorfismo;

public class Cachorro extends Animal {

    @Override
    public void fazerSom(){
        System.out.println("O "+this.getEspecie() +" Esta Latindo : Au au au.");
    }

    public void abanarRabo(){
        System.out.println(this.getEspecie()+ " Abanando o rabo");
    }

    @Override
    public void exibir() {
        super.exibir();
        fazerSom();
        abanarRabo();
        comer();
    }


}
