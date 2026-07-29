package com.flux.plugin.example.services;

import com.flux.plugin.example.entity.Person;
import com.flux.plugin.example.restclient.PersonRestClient;
import io.jettra.core.inject.annotation.Inject;
import java.util.List;

public class PersonService {

    @Inject
    private PersonRestClient client;

    public List<Person> findAll() {
        List<Person> records = client.findAll();
        if (records == null) return List.of();
        return records;
    }

    public void save(Person record) {
        client.save(record);
    }

    public void delete(String id) {
        client.delete(id);
    }
}
