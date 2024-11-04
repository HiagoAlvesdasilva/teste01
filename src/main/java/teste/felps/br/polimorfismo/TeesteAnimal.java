package teste.felps.br.polimorfismo;

public class TeesteAnimal {
    public static void main(String[] args) {

        Cachorro cao01 = new Cachorro();
        cao01.setNome("Rex");
        cao01.setEspecie("Cachorro");
        cao01.setCor("Marrom");
        cao01.setRaca("Vira-lata");
        cao01.setAcordado(true);

        Gato gato01 = new Gato();
        gato01.setNome("Mingau");
        gato01.setEspecie("Gato");
        gato01.setCor("Branco");
        gato01.setRaca("Siames");
        gato01.setAcordado(true);


        cao01.exibir();
        gato01.exibir();

    }
}
