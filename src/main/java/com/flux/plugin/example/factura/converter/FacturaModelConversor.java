package com.flux.plugin.example.factura.converter;

import com.flux.plugin.example.factura.entity.Factura;
import com.flux.plugin.example.factura.model.FacturaModel;
import io.jettra.scoped.ApplicationScoped;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import com.flux.plugin.example.factura.entity.Cliente;
import com.flux.plugin.example.factura.entity.ItemDetalle;
import com.flux.plugin.example.factura.entity.EstadoFactura;
import com.flux.plugin.example.factura.entity.Cotizacion;

@ApplicationScoped
public class FacturaModelConversor {
  public FacturaModel toModel(Factura record) {
    if (record == null) {
      return null;
    }
    FacturaModel model = new FacturaModel();
    model.setNumeroFactura(record.numeroFactura());
    model.setFechaEmision(record.fechaEmision());
    model.setCliente(record.cliente());
    model.setItems(record.items());
    model.setTasaImpuesto(record.tasaImpuesto());
    model.setEstado(record.estado());
    model.setCotizacionOrigen(record.cotizacionOrigen());
    return model;
  }

  public Factura toRecord(FacturaModel model) {
    if (model == null) {
      return null;
    }
    return new Factura(
          model.getNumeroFactura(),
          model.getFechaEmision(),
          model.getCliente(),
          model.getItems(),
          model.getTasaImpuesto(),
          model.getEstado(),
          model.getCotizacionOrigen()
        );
  }
}
