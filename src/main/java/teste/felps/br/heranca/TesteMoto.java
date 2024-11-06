package teste.felps.br.heranca;

public class TesteMoto {
    public static void main(String[] args) {
        Motocicleta moto = new Motocicleta.Builder()
                .marca("Honda")
                .modelo("CG 160")
                .ano(2019)
                .cilindradas(160)
                .build();

        moto.exibir();
        moto.ligar();
        moto.empinar();
        moto.desligar();
        moto.empinar();
    }
}
