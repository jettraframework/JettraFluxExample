package com.flux.plugin.example.factura.model;

import com.flux.plugin.example.factura.entity.Factura;
import io.jettra.flux.annotations.JettraViewModel;
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
import com.flux.plugin.example.factura.entity.EstadoFactura;
import com.flux.plugin.example.factura.entity.Cotizacion;

@JettraViewModel
public class FacturaModel {

    @PropertiesInRecord
    @PropertiesLabel(value = "factura.numeroFactura", label = "NumeroFactura")
    @NotNull
    private String numeroFactura;

    @PropertiesInRecord
    @PropertiesLabel(value = "factura.fechaEmision", label = "FechaEmision")
    private LocalDate fechaEmision;

    @PropertiesInRecord
    @PropertiesLabel(value = "factura.cliente", label = "Cliente")
    @ViewSelectOne(label = "name", source = "com.flux.plugin.example.factura.services.ClienteService", method = "findAll")
    private Cliente cliente;

    @PropertiesInRecord
    @PropertiesLabel(value = "factura.items", label = "Items")
    @ViewSelectMany(label = "name", source = "com.flux.plugin.example.factura.services.ItemDetalleService", method = "findAll")
    @TableColumnField(field = "name")
    private List<ItemDetalle> items;

    @PropertiesInRecord
    @PropertiesLabel(value = "factura.tasaImpuesto", label = "TasaImpuesto")
    private BigDecimal tasaImpuesto;

    @PropertiesInRecord
    @PropertiesLabel(value = "factura.estado", label = "Estado")
    @ViewSelectOne(label = "name", source = "com.flux.plugin.example.factura.services.EstadoFacturaService", method = "findAll")
    private EstadoFactura estado;

    @PropertiesInRecord
    @PropertiesLabel(value = "factura.cotizacionOrigen", label = "CotizacionOrigen")
    @ViewSelectOne(label = "name", source = "com.flux.plugin.example.factura.services.CotizacionService", method = "findAll")
    private Cotizacion cotizacionOrigen;

    public FacturaModel() {}

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
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

    public BigDecimal getTasaImpuesto() {
        return tasaImpuesto;
    }

    public void setTasaImpuesto(BigDecimal tasaImpuesto) {
        this.tasaImpuesto = tasaImpuesto;
    }

    public EstadoFactura getEstado() {
        return estado;
    }

    public void setEstado(EstadoFactura estado) {
        this.estado = estado;
    }

    public Cotizacion getCotizacionOrigen() {
        return cotizacionOrigen;
    }

    public void setCotizacionOrigen(Cotizacion cotizacionOrigen) {
        this.cotizacionOrigen = cotizacionOrigen;
    }

}
