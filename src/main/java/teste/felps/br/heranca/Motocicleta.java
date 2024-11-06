package teste.felps.br.heranca;

public class Motocicleta extends Veiculo {
    private int cilindradas;

    protected Motocicleta () {
    }

    public void empinar() {
        if (this.isLigado()) {
            System.out.println("Empinando a motocicleta.");
        } else {
            System.out.println("Não é possível empinar a motocicleta com ela desligada.");
        }
    }

    public int getCilindradas() {
        return cilindradas;
    }

    protected void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
