package com.flux.plugin.example.factura.services;

import com.flux.plugin.example.factura.entity.ItemDetalle;
import com.flux.plugin.example.factura.restclient.ItemDetalleRestClient;
import io.jettra.core.inject.annotation.Inject;
import java.util.List;
import java.math.BigDecimal;

public class ItemDetalleService {

    @Inject
    private ItemDetalleRestClient client;

    public List<ItemDetalle> findAll() {
        List<ItemDetalle> records = client.findAll();
        if (records == null) return List.of();
        return records;
    }

    public void save(ItemDetalle record) {
        client.save(record);
    }

    public void delete(String id) {
        client.delete(id);
    }

    public List<ItemDetalle> findByIdProducto(String idProducto) {
        List<ItemDetalle> records = client.findByIdProducto(idProducto);
        if (records == null) return List.of();
        return records;
    }

    public List<ItemDetalle> findByDescripcion(String descripcion) {
        List<ItemDetalle> records = client.findByDescripcion(descripcion);
        if (records == null) return List.of();
        return records;
    }

    public List<ItemDetalle> findByCantidad(int cantidad) {
        List<ItemDetalle> records = client.findByCantidad(cantidad);
        if (records == null) return List.of();
        return records;
    }

    public List<ItemDetalle> findByPrecioUnitario(BigDecimal precioUnitario) {
        List<ItemDetalle> records = client.findByPrecioUnitario(precioUnitario);
        if (records == null) return List.of();
        return records;
    }
}
