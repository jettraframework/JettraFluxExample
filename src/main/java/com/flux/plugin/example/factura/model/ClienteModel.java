package com.flux.plugin.example.factura.model;

import com.flux.plugin.example.factura.entity.Cliente;
import io.jettra.flux.annotations.JettraViewModel;
import io.jettra.core.flux.FluxModelToRecordConversor;
import io.jettra.flux.annotations.PropertiesInRecord;
import io.jettra.flux.annotations.PropertiesLabel;
import io.jettra.flux.annotations.ViewSelectOne;
import io.jettra.flux.annotations.ViewSelectMany;
import io.jettra.flux.annotations.TableColumnField;
import io.jettra.rules.validations.NotNull;

@JettraViewModel
@FluxModelToRecordConversor(goal = Cliente.class)
public class ClienteModel {

    @PropertiesInRecord
    @PropertiesLabel(value = "cliente.id", label = "Id")
    @NotNull
    private String id;

    @PropertiesInRecord
    @PropertiesLabel(value = "cliente.nombre", label = "Nombre")
    @NotNull
    private String nombre;

    @PropertiesInRecord
    @PropertiesLabel(value = "cliente.rucOIdentificacion", label = "RucOIdentificacion")
    @NotNull
    private String rucOIdentificacion;

    @PropertiesInRecord
    @PropertiesLabel(value = "cliente.email", label = "Email")
    @NotNull
    private String email;

    @PropertiesInRecord
    @PropertiesLabel(value = "cliente.direccion", label = "Direccion")
    @NotNull
    private String direccion;

    public ClienteModel() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRucOIdentificacion() {
        return rucOIdentificacion;
    }

    public void setRucOIdentificacion(String rucOIdentificacion) {
        this.rucOIdentificacion = rucOIdentificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
