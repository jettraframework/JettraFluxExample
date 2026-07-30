package com.flux.plugin.example.factura.services;

import com.flux.plugin.example.factura.entity.Cotizacion;
import com.flux.plugin.example.factura.restclient.CotizacionRestClient;
import io.jettra.core.inject.annotation.Inject;
import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.flux.plugin.example.factura.entity.Cliente;
import com.flux.plugin.example.factura.entity.ItemDetalle;
import com.flux.plugin.example.factura.entity.EstadoCotizacion;

public class CotizacionService {

    @Inject
    private CotizacionRestClient client;

    public List<Cotizacion> findAll() {
        List<Cotizacion> records = client.findAll();
        if (records == null) return List.of();
        return records;
    }

    public void save(Cotizacion record) {
        client.save(record);
    }

    public void delete(String id) {
        client.delete(id);
    }

    public List<Cotizacion> findByNumeroCotizacion(String numeroCotizacion) {
        List<Cotizacion> records = client.findByNumeroCotizacion(numeroCotizacion);
        if (records == null) return List.of();
        return records;
    }

    public List<Cotizacion> findByFechaEmision(LocalDate fechaEmision) {
        List<Cotizacion> records = client.findByFechaEmision(fechaEmision);
        if (records == null) return List.of();
        return records;
    }

    public List<Cotizacion> findByFechaVencimiento(LocalDate fechaVencimiento) {
        List<Cotizacion> records = client.findByFechaVencimiento(fechaVencimiento);
        if (records == null) return List.of();
        return records;
    }

    public List<Cotizacion> findByCliente(Cliente cliente) {
        List<Cotizacion> records = client.findByCliente(cliente);
        if (records == null) return List.of();
        return records;
    }

    public List<Cotizacion> findByItems(List<ItemDetalle> items) {
        List<Cotizacion> records = client.findByItems(items);
        if (records == null) return List.of();
        return records;
    }

    public List<Cotizacion> findByEstado(EstadoCotizacion estado) {
        List<Cotizacion> records = client.findByEstado(estado);
        if (records == null) return List.of();
        return records;
    }
}
