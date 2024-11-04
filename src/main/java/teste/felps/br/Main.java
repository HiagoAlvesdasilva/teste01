package teste.felps.br;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Fiat");
        carro.setModelo("Uno");
        carro.setAno(2010);

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());

        carro.ligar();
        carro.desligar();
    }
}
