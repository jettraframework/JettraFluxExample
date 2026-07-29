package com.flux.plugin.example.factura.restclient;

import com.flux.plugin.example.factura.entity.Cliente;
import io.jettra.rest.annotations.DELETE;
import io.jettra.rest.annotations.GET;
import io.jettra.rest.annotations.POST;
import io.jettra.rest.annotations.Path;
import io.jettra.rest.annotations.PathParam;
import io.jettra.rest.client.RestClient;
import java.util.List;

@RestClient(baseUri = "/api/factura/clientes")
public interface ClienteRestClient {

    @GET
    List<Cliente> findAll();

    @POST
    void save(Cliente model);

    @DELETE
    @Path("/{id}")
    void delete(@PathParam("id") String id);
}
