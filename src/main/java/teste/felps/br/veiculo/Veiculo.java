package teste.felps.br.veiculo;

public class Veiculo {
    public String marca;
    public String modelo;
    public int ano;
    public boolean ligado = false;

    public void exibir(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Ligado: " + this.ligado);
    }

    public void ligar(){
        if(this.ligado == false){
            this.setLidado(true);
            System.out.println("O veículo está ligado.");
        }
    }

    public void desligar(){
        if (this.ligado == true){
            this.setLidado(false);
            System.out.println("O veículo está desligado.");
        }
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

    public boolean isLidado() {
        return ligado;
    }

    public void setLidado(boolean lidado) {
        this.ligado = lidado;
    }

}
