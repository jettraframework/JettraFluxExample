package com.flux.plugin.example.factura.restclient;

import com.flux.plugin.example.factura.entity.Factura;
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
import com.flux.plugin.example.factura.entity.EstadoFactura;
import com.flux.plugin.example.factura.entity.Cotizacion;

@RestClient(baseUri = "/api/factura/facturas")
public interface FacturaRestClient {

    @GET
    List<Factura> findAll();

    @POST
    void save(Factura factura);

    @PUT
    void update(Factura factura);

    @DELETE
    @Path("/{id}")
    void delete(@PathParam("id") String id);

    @GET
    @Path("/numerofactura/{numeroFactura}")
    List<Factura> findByNumeroFactura(@PathParam("numeroFactura") String numeroFactura);

    @GET
    @Path("/fechaemision/{fechaEmision}")
    List<Factura> findByFechaEmision(@PathParam("fechaEmision") LocalDate fechaEmision);

    @GET
    @Path("/cliente/{cliente}")
    List<Factura> findByCliente(@PathParam("cliente") Cliente cliente);

    @GET
    @Path("/items/{items}")
    List<Factura> findByItems(@PathParam("items") List<ItemDetalle> items);

    @GET
    @Path("/tasaimpuesto/{tasaImpuesto}")
    List<Factura> findByTasaImpuesto(@PathParam("tasaImpuesto") BigDecimal tasaImpuesto);

    @GET
    @Path("/estado/{estado}")
    List<Factura> findByEstado(@PathParam("estado") EstadoFactura estado);

    @GET
    @Path("/cotizacionorigen/{cotizacionOrigen}")
    List<Factura> findByCotizacionOrigen(@PathParam("cotizacionOrigen") Cotizacion cotizacionOrigen);
}
