package com.flux.plugin.example.factura.restclient;

import com.flux.plugin.example.factura.entity.Cotizacion;
import io.jettra.rest.annotations.DELETE;
import io.jettra.rest.annotations.GET;
import io.jettra.rest.annotations.POST;
import io.jettra.rest.annotations.PUT;
import io.jettra.rest.annotations.Path;
import io.jettra.rest.annotations.PathParam;
import io.jettra.rest.client.RestClient;
import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.flux.plugin.example.factura.entity.Cliente;
import com.flux.plugin.example.factura.entity.ItemDetalle;
import com.flux.plugin.example.factura.entity.EstadoCotizacion;

@RestClient(baseUri = "/api/factura/cotizacions")
public interface CotizacionRestClient {

    @GET
    List<Cotizacion> findAll();

    @POST
    void save(Cotizacion cotizacion);

    @PUT
    void update(Cotizacion cotizacion);

    @DELETE
    @Path("/{id}")
    void delete(@PathParam("id") String id);

    @GET
    @Path("/numerocotizacion/{numeroCotizacion}")
    List<Cotizacion> findByNumeroCotizacion(@PathParam("numeroCotizacion") String numeroCotizacion);

    @GET
    @Path("/fechaemision/{fechaEmision}")
    List<Cotizacion> findByFechaEmision(@PathParam("fechaEmision") LocalDate fechaEmision);

    @GET
    @Path("/fechavencimiento/{fechaVencimiento}")
    List<Cotizacion> findByFechaVencimiento(@PathParam("fechaVencimiento") LocalDate fechaVencimiento);

    @GET
    @Path("/cliente/{cliente}")
    List<Cotizacion> findByCliente(@PathParam("cliente") Cliente cliente);

    @GET
    @Path("/items/{items}")
    List<Cotizacion> findByItems(@PathParam("items") List<ItemDetalle> items);

    @GET
    @Path("/estado/{estado}")
    List<Cotizacion> findByEstado(@PathParam("estado") EstadoCotizacion estado);
}
