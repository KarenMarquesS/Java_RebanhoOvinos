package org.example.Controle;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import jakarta.ws.rs.core.Response;
import org.example.Modelo.Registro;
import org.example.Repositorio.RegistroRepositorio;


import java.util.List;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("Registro")
public class registroResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Registro> getIt(@QueryParam("mae_brinco") Integer mae_brinco) {
        if (mae_brinco == null) {
            throw new WebApplicationException("Parâmetro número do brinco da mãe não fornecido", Response.Status.BAD_REQUEST);
        }
        RegistroRepositorio registroRepositorio = new RegistroRepositorio();

        return registroRepositorio.GetByMaeBrinco(mae_brinco);
    }
}
