package teste.felps.br.heranca;

public class MotocicletaBuilder {

    private Motocicleta motocicleta;

    public MotocicletaBuilder( ) {
        this.motocicleta = new Motocicleta();
    }

    public static MotocicletaBuilder builder() {
        return new MotocicletaBuilder();
    }

    public MotocicletaBuilder marca(String marca){
        this.motocicleta.setMarca(marca);
        return this;
    }

    public MotocicletaBuilder modelo(String modelo) {
        this.motocicleta.setModelo(modelo);
        return this;
    }

    public MotocicletaBuilder ano(int ano) {
        this.motocicleta.setAno(ano);
        return this;
    }

    public MotocicletaBuilder cilindradas(int cilindradas) {
        this.motocicleta.setCilindradas(cilindradas);
        return this;
    }

    public Motocicleta build() {
        return this.motocicleta;
    }
}
