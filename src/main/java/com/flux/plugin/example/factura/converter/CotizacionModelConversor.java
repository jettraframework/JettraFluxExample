package com.flux.plugin.example.factura.converter;

import com.flux.plugin.example.factura.entity.Cotizacion;
import com.flux.plugin.example.factura.model.CotizacionModel;
import io.jettra.scoped.ApplicationScoped;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import com.flux.plugin.example.factura.entity.Cliente;
import com.flux.plugin.example.factura.entity.ItemDetalle;
import com.flux.plugin.example.factura.entity.EstadoCotizacion;

@ApplicationScoped
public class CotizacionModelConversor {
  public CotizacionModel toModel(Cotizacion record) {
    if (record == null) {
      return null;
    }
    CotizacionModel model = new CotizacionModel();
    model.setNumeroCotizacion(record.numeroCotizacion());
    model.setFechaEmision(record.fechaEmision());
    model.setFechaVencimiento(record.fechaVencimiento());
    model.setCliente(record.cliente());
    model.setItems(record.items());
    model.setEstado(record.estado());
    return model;
  }

  public Cotizacion toRecord(CotizacionModel model) {
    if (model == null) {
      return null;
    }
    return new Cotizacion(
          model.getNumeroCotizacion(),
          model.getFechaEmision(),
          model.getFechaVencimiento(),
          model.getCliente(),
          model.getItems(),
          model.getEstado()
        );
  }
}
