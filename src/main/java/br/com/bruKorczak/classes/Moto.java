package br.com.bruKorczak.classes;
public class Moto extends Veiculo{
    public Moto(String marca, int ano){
        super(marca, ano);
    }

    @Override
    public String acelerar() {
        return "rampampamapampmapamapa pa pa";
    }
}