package teste.felps.br.polimorfismo;

public class Animal {

    private String nome;
    private String especie;
    private String cor;
    private String raca;
    private boolean acordado = false;

    public void fazerSom(){
        if (this.acordado){
            System.out.println("Som de animal.");
        } else {
            System.out.println("O animal está dormindo.");
        }
    }

    public void comer(){
        if (this.acordado){
            System.out.println("Comendo.");
        } else {
            System.out.println("O animal está dormindo.");
        }
    }

    public void dormir(){
        if (!this.acordado){
            System.out.println("O animal já está dormindo");
        } else {
            System.out.println("Dormindo");
        }
    }

    public void exibir(){
        System.out.println("#####################");
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Cor: " + this.cor);
        System.out.println("Raça: " + this.raca);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isAcordado() {
        return acordado;
    }

    public void setAcordado(boolean acordado) {
        this.acordado = acordado;
    }
}
