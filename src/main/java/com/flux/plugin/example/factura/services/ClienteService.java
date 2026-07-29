package com.flux.plugin.example.factura.services;

import com.flux.plugin.example.factura.entity.Cliente;
import com.flux.plugin.example.factura.model.ClienteModelConversor;
import com.flux.plugin.example.factura.restclient.ClienteRestClient;
import io.jettra.core.inject.annotation.Inject;
import java.util.List;

public class ClienteService {

    @Inject
    private ClienteModelConversor converter;

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
}
