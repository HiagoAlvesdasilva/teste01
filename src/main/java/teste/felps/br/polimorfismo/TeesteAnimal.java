package teste.felps.br.polimorfismo;

public class TeesteAnimal {
    public static void main(String[] args) {

        Cachorro cao01 = new Cachorro.Builder()
                .nome("Rex")
                .especie("Cachorro")
                .cor("Preto")
                .raca("Pitbull")
                .acordado(true)
                .build();
        cao01.exibir();

        Gato gato01 = new Gato.Builder()
                .nome("Mingau")
                .especie("Gato")
                .cor("Branco")
                .raca("Siames")
                .acordado(true)
                .build();
        gato01.exibir();

    }
}
