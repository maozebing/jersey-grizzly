package com.example;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.moxy.json.MoxyJsonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

/**
 * Main class.
 *
 */
public class Main {
    // Base URI the Grizzly HTTP server will listen on
    public static final String BASE_URI = "http://localhost:8080/myapp/";

    /**
     * Main method.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        final ResourceConfig rc = new ResourceConfig();
        rc.packages("com.example");
        rc.register(MoxyJsonFeature.class);

        final HttpServer server = GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);

        System.in.read();
        server.shutdownNow();
    }

}

