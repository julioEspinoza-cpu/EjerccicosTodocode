import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Esta anotación le dice a Tomcat la dirección exacta en el navegador (URL)
@WebServlet("/hola")
public class HolaMundoWeb extends HttpServlet {

    // El navegador hace una petición "GET" al entrar a una página
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Configuramos el tipo de respuesta (texto HTML)
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // ¡Cocinamos el HTML que va a ver el usuario en su pantalla!
        out.println("<html><body>");
        out.println("<h1>¡Hola Mundo desde Apache Tomcat 9 usando Maven!</h1>");
        out.println("<p>Tu entorno web está configurado y funcionando al 100%.</p>");
        out.println("</body></html>");
    }
}
