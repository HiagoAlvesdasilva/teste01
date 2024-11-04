package teste.felps.br.heranca;

public class TesteMoto {
    public static void main(String[] args) {
        Motocicleta moto = new Motocicleta();
        moto.setMarca("Honda");
        moto.setModelo("CB 500");
        moto.setAno(2018);
        moto.setCilindradas(500);
        moto.ligar();
        moto.empinar();
        moto.desligar();
        moto.empinar();
        moto.exibir();
    }
}
