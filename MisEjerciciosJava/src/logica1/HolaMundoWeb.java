package logica1;

// Estas librerías le dicen a Java que prepare un plato para la Web

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Esta anotación le dice a Tomcat en qué dirección del navegador va a responder
@WebServlet("/hola")
public class HolaMundoWeb extends HttpServlet {

    // En la web no usamos "main", usamos "doGet" (para peticiones del navegador)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Configuramos que vamos a responder con texto HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // ¡Cocinamos el HTML que va a ver el usuario!
        out.println("<h1>¡Hola Mundo desde Apache Tomcat 9!</h1>");
    }
}
