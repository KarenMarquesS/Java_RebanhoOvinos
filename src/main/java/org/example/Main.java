package org.example;

import org.example.Operacional.Menu;
import org.example.Modelo.Registro;
import org.example.Operacional.MenuPrincipal;
//import org.glassfish.grizzly.http.server.HttpServer;
//import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
//import org.glassfish.jersey.server.ResourceConfig;
//
//import java.io.IOException;
//import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main class.
 *
 */
public class Main {
//    // Base URI the Grizzly HTTP server will listen on
//    public static final String BASE_URI = "http://localhost:8090/";
//
//    /**
//     * Starts Grizzly HTTP server exposing JAX-RS resources defined in this application.
//     * @return Grizzly HTTP server.
//     */
//    public static HttpServer startServer() {
//        // create a resource config that scans for JAX-RS resources and providers
//        // in org.example package
//        final ResourceConfig rc = new ResourceConfig().packages("org.example");
//
//        // create and start a new instance of grizzly http server
//        // exposing the Jersey application at BASE_URI
//        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
//    }
//
//    /**
//     * Main method.
//     * @param args
//     * @throws IOException
//     */
//    public static void main(String[] args) throws IOException {
//        final HttpServer server = startServer();
//        System.out.println(String.format("Jersey app started with endpoints available at "
//                + "%s%nHit Ctrl-C to stop it...", BASE_URI));
//        System.in.read();
//        server.stop();
//    }
//}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.menuPrincipal(scanner);
        scanner.close();

    }

}