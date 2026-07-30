package com.flux.plugin.example.factura.model;

import com.flux.plugin.example.factura.entity.ItemDetalle;
import io.jettra.flux.annotations.JettraViewModel;
import io.jettra.flux.annotations.PropertiesInRecord;
import io.jettra.flux.annotations.PropertiesLabel;
import io.jettra.flux.annotations.ViewSelectOne;
import io.jettra.flux.annotations.ViewSelectMany;
import io.jettra.flux.annotations.TableColumnField;
import io.jettra.rules.validations.NotNull;
import java.math.BigDecimal;

@JettraViewModel
public class ItemDetalleModel {

    @PropertiesInRecord
    @PropertiesLabel(value = "itemdetalle.idProducto", label = "IdProducto")
    @NotNull
    private String idProducto;

    @PropertiesInRecord
    @PropertiesLabel(value = "itemdetalle.descripcion", label = "Descripcion")
    @NotNull
    private String descripcion;

    @PropertiesInRecord
    @PropertiesLabel(value = "itemdetalle.cantidad", label = "Cantidad")
    private int cantidad;

    @PropertiesInRecord
    @PropertiesLabel(value = "itemdetalle.precioUnitario", label = "PrecioUnitario")
    private BigDecimal precioUnitario;

    public ItemDetalleModel() {}

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

}
