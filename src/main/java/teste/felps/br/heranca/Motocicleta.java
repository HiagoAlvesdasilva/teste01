package teste.felps.br.heranca;

public class Motocicleta extends Veiculo {
    private int cilindradas;

    private Motocicleta (Builder builder) {
        this.setMarca(builder.marca);
        this.setModelo(builder.modelo);
        this.setAno(builder.ano);
        this.cilindradas = builder.cilindradas;
    }

    public void empinar() {
        if (this.isLigado()) {
            System.out.println("Empinando a motocicleta.");
        } else {
            System.out.println("Não é possível empinar a motocicleta com ela desligada.");
        }
    }

    public static class Builder {
        private String marca;
        private String modelo;
        private int ano;
        private int cilindradas;

        public Builder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder modelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Builder ano(int ano) {
            this.ano = ano;
            return this;
        }

        public Builder cilindradas(int cilindradas) {
            this.cilindradas = cilindradas;
            return this;
        }

        public Motocicleta build() {
            return new Motocicleta(this);
        }
    }


}
