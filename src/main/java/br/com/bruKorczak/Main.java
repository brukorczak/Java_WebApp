package br.com.bruKorczak;

import br.com.bruKorczak.classes.Carro;
import br.com.bruKorczak.classes.Moto;
import br.com.bruKorczak.classes.Veiculo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "VeiculoAntigoServlet", urlPatterns = {"/veiculomaisantigo"})
public class Main extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println("---------Veiculos---------");
        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("Chevrolet Opala", 1968));
        veiculos.add(new Moto("Suzuki", 1952));

        Veiculo veiculoMaisAntigo = veiculos.stream()
                .min((v1, v2) -> Integer.compare(v1.getAno(), v2.getAno()))
                .orElse(null);

        if (veiculoMaisAntigo != null) {
            System.out.println("\n Veiculo mais antigo ");
            System.out.println("Marca: " + veiculoMaisAntigo.getMarca());
            System.out.println("Ano de: " + veiculoMaisAntigo.getAno() + "\n");
            veiculoMaisAntigo.acelerar();
        } else {
            System.out.println("Nenhum veículo na lista.");
        }

        request.setAttribute("veiculoMaisAntigo", veiculoMaisAntigo);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
}