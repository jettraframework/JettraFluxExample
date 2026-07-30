package com.flux.plugin.example.factura.restclient;

import com.flux.plugin.example.factura.entity.ItemDetalle;
import io.jettra.rest.annotations.DELETE;
import io.jettra.rest.annotations.GET;
import io.jettra.rest.annotations.POST;
import io.jettra.rest.annotations.PUT;
import io.jettra.rest.annotations.Path;
import io.jettra.rest.annotations.PathParam;
import io.jettra.rest.client.RestClient;
import java.util.List;
import java.math.BigDecimal;

@RestClient(baseUri = "/api/factura/itemdetalles")
public interface ItemDetalleRestClient {

    @GET
    List<ItemDetalle> findAll();

    @POST
    void save(ItemDetalle itemdetalle);

    @PUT
    void update(ItemDetalle itemdetalle);

    @DELETE
    @Path("/{id}")
    void delete(@PathParam("id") String id);

    @GET
    @Path("/idproducto/{idProducto}")
    List<ItemDetalle> findByIdProducto(@PathParam("idProducto") String idProducto);

    @GET
    @Path("/descripcion/{descripcion}")
    List<ItemDetalle> findByDescripcion(@PathParam("descripcion") String descripcion);

    @GET
    @Path("/cantidad/{cantidad}")
    List<ItemDetalle> findByCantidad(@PathParam("cantidad") int cantidad);

    @GET
    @Path("/preciounitario/{precioUnitario}")
    List<ItemDetalle> findByPrecioUnitario(@PathParam("precioUnitario") BigDecimal precioUnitario);
}
