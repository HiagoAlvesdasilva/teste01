package teste.felps.br.polimorfismo;

public class Gato extends Animal {

    private Gato(Builder builder) {
        this.setNome(builder.nome);
        this.setEspecie(builder.especie);
        this.setCor(builder.cor);
        this.setRaca(builder.raca);
        this.setAcordado(builder.acordado);
    }

    @Override
    public void fazerSom(){
        System.out.println("O "+this.getEspecie() +" Esta Miando : Miau miau miau");
    }

    public void arranhar(){
        System.out.println(this.getEspecie()+ "Arranhando");
    }

    @Override
    public void exibir() {
        super.exibir();
        fazerSom();
        arranhar();
    }

    public static class Builder{
        private String nome;
        private String especie;
        private String cor;
        private String raca;
        private boolean acordado;

        public Builder nome(String nome){
            this.nome = nome;
            return this;
        }

        public Builder especie(String especie){
            this.especie = especie;
            return this;
        }

        public Builder cor(String cor){
            this.cor = cor;
            return this;
        }

        public Builder raca(String raca){
            this.raca = raca;
            return this;
        }

        public Builder acordado(boolean acordado){
            this.acordado = false;
            return this;
        }

        public Gato build(){
            return new Gato(this);
        }
    }

}
