package com.flux.plugin.example.restclient;

import com.flux.plugin.example.entity.Person;
import io.jettra.rest.annotations.DELETE;
import io.jettra.rest.annotations.GET;
import io.jettra.rest.annotations.POST;
import io.jettra.rest.annotations.Path;
import io.jettra.rest.annotations.PathParam;
import io.jettra.rest.client.RestClient;
import java.util.List;

@RestClient(baseUri = "/api/example/persons")
public interface PersonRestClient {

    @GET
    List<Person> findAll();

    @POST
    void save(Person model);

    @DELETE
    @Path("/{id}")
    void delete(@PathParam("id") String id);
}
