package com.flux.plugin.example.factura.converter;

import com.flux.plugin.example.factura.entity.Cliente;
import com.flux.plugin.example.factura.model.ClienteModel;
import io.jettra.scoped.ApplicationScoped;

@ApplicationScoped
public class ClienteModelConversor {
  public ClienteModel toModel(Cliente record) {
    if (record == null) {
      return null;
    }
    ClienteModel model = new ClienteModel();
    model.setId(record.id());
    model.setNombre(record.nombre());
    model.setRucOIdentificacion(record.rucOIdentificacion());
    model.setEmail(record.email());
    model.setDireccion(record.direccion());
    return model;
  }

  public Cliente toRecord(ClienteModel model) {
    if (model == null) {
      return null;
    }
    return new Cliente(
          model.getId(),
          model.getNombre(),
          model.getRucOIdentificacion(),
          model.getEmail(),
          model.getDireccion()
        );
  }
}
