package com.flux.plugin.example.factura.restclient;

import com.flux.plugin.example.factura.entity.Cliente;
import io.jettra.rest.annotations.DELETE;
import io.jettra.rest.annotations.GET;
import io.jettra.rest.annotations.POST;
import io.jettra.rest.annotations.PUT;
import io.jettra.rest.annotations.Path;
import io.jettra.rest.annotations.PathParam;
import io.jettra.rest.client.RestClient;
import java.util.List;

@RestClient(baseUri = "/api/factura/clientes")
public interface ClienteRestClient {

    @GET
    List<Cliente> findAll();

    @POST
    void save(Cliente cliente);

    @PUT
    void update(Cliente cliente);

    @DELETE
    @Path("/{id}")
    void delete(@PathParam("id") String id);

    @GET
    @Path("/id/{id}")
    List<Cliente> findById(@PathParam("id") String id);

    @GET
    @Path("/nombre/{nombre}")
    List<Cliente> findByNombre(@PathParam("nombre") String nombre);

    @GET
    @Path("/rucoidentificacion/{rucOIdentificacion}")
    List<Cliente> findByRucOIdentificacion(@PathParam("rucOIdentificacion") String rucOIdentificacion);

    @GET
    @Path("/email/{email}")
    List<Cliente> findByEmail(@PathParam("email") String email);

    @GET
    @Path("/direccion/{direccion}")
    List<Cliente> findByDireccion(@PathParam("direccion") String direccion);
}
