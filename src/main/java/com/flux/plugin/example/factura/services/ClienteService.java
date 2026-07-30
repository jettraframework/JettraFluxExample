package com.flux.plugin.example.factura.services;

import com.flux.plugin.example.factura.entity.Cliente;
import com.flux.plugin.example.factura.restclient.ClienteRestClient;
import io.jettra.core.inject.annotation.Inject;
import java.util.List;

public class ClienteService {

    @Inject
    private ClienteRestClient client;

    public List<Cliente> findAll() {
        List<Cliente> records = client.findAll();
        if (records == null) return List.of();
        return records;
    }

    public void save(Cliente record) {
        client.save(record);
    }

    public void delete(String id) {
        client.delete(id);
    }

    public List<Cliente> findById(String id) {
        List<Cliente> records = client.findById(id);
        if (records == null) return List.of();
        return records;
    }

    public List<Cliente> findByNombre(String nombre) {
        List<Cliente> records = client.findByNombre(nombre);
        if (records == null) return List.of();
        return records;
    }

    public List<Cliente> findByRucOIdentificacion(String rucOIdentificacion) {
        List<Cliente> records = client.findByRucOIdentificacion(rucOIdentificacion);
        if (records == null) return List.of();
        return records;
    }

    public List<Cliente> findByEmail(String email) {
        List<Cliente> records = client.findByEmail(email);
        if (records == null) return List.of();
        return records;
    }

    public List<Cliente> findByDireccion(String direccion) {
        List<Cliente> records = client.findByDireccion(direccion);
        if (records == null) return List.of();
        return records;
    }
}
