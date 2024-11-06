package teste.felps.br.abstracao_encapsulamento;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    public void desligar() {
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
        if (ano < 0) {
            throw new IllegalArgumentException("Ano inválido."); }
        this.ano = ano; }
}
