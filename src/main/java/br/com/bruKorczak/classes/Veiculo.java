package br.com.bruKorczak.classes;
import lombok.Data;

@Data
public abstract class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public abstract String acelerar();
}