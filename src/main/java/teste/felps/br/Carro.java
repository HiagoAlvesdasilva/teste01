package teste.felps.br;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    void ligar() {
        System.out.println("O carro está ligado.");
    }

    void desligar() {
        System.out.println("O carro está desligado.");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
