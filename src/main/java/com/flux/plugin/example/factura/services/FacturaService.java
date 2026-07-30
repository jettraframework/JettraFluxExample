package com.flux.plugin.example.factura.services;

import com.flux.plugin.example.factura.entity.Factura;
import com.flux.plugin.example.factura.restclient.FacturaRestClient;
import io.jettra.core.inject.annotation.Inject;
import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.flux.plugin.example.factura.entity.Cliente;
import com.flux.plugin.example.factura.entity.ItemDetalle;
import com.flux.plugin.example.factura.entity.EstadoFactura;
import com.flux.plugin.example.factura.entity.Cotizacion;

public class FacturaService {

    @Inject
    private FacturaRestClient client;

    public List<Factura> findAll() {
        List<Factura> records = client.findAll();
        if (records == null) return List.of();
        return records;
    }

    public void save(Factura record) {
        client.save(record);
    }

    public void delete(String id) {
        client.delete(id);
    }

    public List<Factura> findByNumeroFactura(String numeroFactura) {
        List<Factura> records = client.findByNumeroFactura(numeroFactura);
        if (records == null) return List.of();
        return records;
    }

    public List<Factura> findByFechaEmision(LocalDate fechaEmision) {
        List<Factura> records = client.findByFechaEmision(fechaEmision);
        if (records == null) return List.of();
        return records;
    }

    public List<Factura> findByCliente(Cliente cliente) {
        List<Factura> records = client.findByCliente(cliente);
        if (records == null) return List.of();
        return records;
    }

    public List<Factura> findByItems(List<ItemDetalle> items) {
        List<Factura> records = client.findByItems(items);
        if (records == null) return List.of();
        return records;
    }

    public List<Factura> findByTasaImpuesto(BigDecimal tasaImpuesto) {
        List<Factura> records = client.findByTasaImpuesto(tasaImpuesto);
        if (records == null) return List.of();
        return records;
    }

    public List<Factura> findByEstado(EstadoFactura estado) {
        List<Factura> records = client.findByEstado(estado);
        if (records == null) return List.of();
        return records;
    }

    public List<Factura> findByCotizacionOrigen(Cotizacion cotizacionOrigen) {
        List<Factura> records = client.findByCotizacionOrigen(cotizacionOrigen);
        if (records == null) return List.of();
        return records;
    }
}
