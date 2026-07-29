package com.flux.plugin.example.model;

import com.flux.plugin.example.entity.Person;
import io.jettra.flux.annotations.JettraViewModel;
import io.jettra.flux.annotations.PropertiesInRecord;
import io.jettra.flux.annotations.PropertiesLabel;
import io.jettra.flux.annotations.ViewSelectOne;
import io.jettra.flux.annotations.ViewSelectMany;
import io.jettra.flux.annotations.TableColumnField;
import io.jettra.rules.validations.NotNull;
import io.jettra.rules.validations.Min;
import io.jettra.rules.validations.NotNull;

@JettraViewModel
public class PersonModel {

    @PropertiesInRecord
    @PropertiesLabel(value = "person.name", label = "Name")
    @NotNull
    private String name;

    @PropertiesInRecord
    @PropertiesLabel(value = "person.email", label = "Email")
    @NotNull
    private String email;

    @PropertiesInRecord
    @PropertiesLabel(value = "person.age", label = "Age")
    private Integer age;

    public PersonModel() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
