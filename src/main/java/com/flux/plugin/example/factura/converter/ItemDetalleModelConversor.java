package com.flux.plugin.example.factura.converter;

import com.flux.plugin.example.factura.entity.ItemDetalle;
import com.flux.plugin.example.factura.model.ItemDetalleModel;
import io.jettra.scoped.ApplicationScoped;
import java.math.BigDecimal;

@ApplicationScoped
public class ItemDetalleModelConversor {
  public ItemDetalleModel toModel(ItemDetalle record) {
    if (record == null) {
      return null;
    }
    ItemDetalleModel model = new ItemDetalleModel();
    model.setIdProducto(record.idProducto());
    model.setDescripcion(record.descripcion());
    model.setCantidad(record.cantidad());
    model.setPrecioUnitario(record.precioUnitario());
    return model;
  }

  public ItemDetalle toRecord(ItemDetalleModel model) {
    if (model == null) {
      return null;
    }
    return new ItemDetalle(
          model.getIdProducto(),
          model.getDescripcion(),
          model.getCantidad(),
          model.getPrecioUnitario()
        );
  }
}
