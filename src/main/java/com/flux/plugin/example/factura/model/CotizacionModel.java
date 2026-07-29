package com.flux.plugin.example.factura.model;

import com.flux.plugin.example.factura.entity.Cotizacion;
import io.jettra.flux.annotations.JettraViewModel;
import io.jettra.core.flux.FluxModelToRecordConversor;
import io.jettra.flux.annotations.PropertiesInRecord;
import io.jettra.flux.annotations.PropertiesLabel;
import io.jettra.flux.annotations.ViewSelectOne;
import io.jettra.flux.annotations.ViewSelectMany;
import io.jettra.flux.annotations.TableColumnField;
import io.jettra.rules.validations.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import com.flux.plugin.example.factura.entity.Cliente;
import com.flux.plugin.example.factura.entity.ItemDetalle;
import com.flux.plugin.example.factura.entity.EstadoCotizacion;

@JettraViewModel
@FluxModelToRecordConversor(goal = Cotizacion.class)
public class CotizacionModel {

    @PropertiesInRecord
    @PropertiesLabel(value = "cotizacion.numeroCotizacion", label = "NumeroCotizacion")
    @NotNull
    private String numeroCotizacion;

    @PropertiesInRecord
    @PropertiesLabel(value = "cotizacion.fechaEmision", label = "FechaEmision")
    @ViewSelectOne(label = "name", source = "com.flux.plugin.example.factura.services.LocalDateService", method = "findAll")
    private LocalDate fechaEmision;

    @PropertiesInRecord
    @PropertiesLabel(value = "cotizacion.fechaVencimiento", label = "FechaVencimiento")
    @ViewSelectOne(label = "name", source = "com.flux.plugin.example.factura.services.LocalDateService", method = "findAll")
    private LocalDate fechaVencimiento;

    @PropertiesInRecord
    @PropertiesLabel(value = "cotizacion.cliente", label = "Cliente")
    @ViewSelectOne(label = "name", source = "com.flux.plugin.example.factura.services.ClienteService", method = "findAll")
    private Cliente cliente;

    @PropertiesInRecord
    @PropertiesLabel(value = "cotizacion.items", label = "Items")
    @ViewSelectMany(label = "name", source = "com.flux.plugin.example.factura.services.ItemDetalleService", method = "findAll")
    @TableColumnField(field = "name")
    private List<ItemDetalle> items;

    @PropertiesInRecord
    @PropertiesLabel(value = "cotizacion.estado", label = "Estado")
    @ViewSelectOne(label = "name", source = "com.flux.plugin.example.factura.services.EstadoCotizacionService", method = "findAll")
    private EstadoCotizacion estado;

    public CotizacionModel() {}

    public String getNumeroCotizacion() {
        return numeroCotizacion;
    }

    public void setNumeroCotizacion(String numeroCotizacion) {
        this.numeroCotizacion = numeroCotizacion;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemDetalle> getItems() {
        return items;
    }

    public void setItems(List<ItemDetalle> items) {
        this.items = items;
    }

    public EstadoCotizacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoCotizacion estado) {
        this.estado = estado;
    }

}
