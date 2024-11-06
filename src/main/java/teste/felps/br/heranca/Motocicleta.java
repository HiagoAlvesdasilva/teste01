package teste.felps.br.heranca;

public class Motocicleta extends Veiculo {
    private int cilindradas;

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

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }


}
