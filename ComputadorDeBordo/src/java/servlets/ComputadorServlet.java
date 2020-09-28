package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.OperacaoDeCalculo;


@WebServlet(name = "ComputadorServlet", urlPatterns = {"/ComputadorServlet"})
public class ComputadorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Obtendo os dados
        float total = Float.parseFloat(request.getParameter("total"));
        float preco = Float.parseFloat(request.getParameter("preco"));
        float consumo = Float.parseFloat(request.getParameter("consumo"));
        
        //Tratando os dados (chamando classe OperacaoDeCalculo)
        float valor = new OperacaoDeCalculo().calcularValor(total, preco);
        float distancia = new OperacaoDeCalculo().calcularDistancia(total, consumo);
       
        //Atribuindo os dados tratado na requisição
        request.setAttribute("valor", valor);
        request.setAttribute("distancia", distancia);
        
        //Dispachando a requisição para outra página
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

}