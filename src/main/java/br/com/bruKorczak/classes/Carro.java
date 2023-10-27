package br.com.bruKorczak.classes;
public class Carro extends Veiculo{
    public Carro(String marca, int ano) {
        super(marca, ano);
    }

    @Override
    public String acelerar() {
        return "vrum vrummmm";
    }
}