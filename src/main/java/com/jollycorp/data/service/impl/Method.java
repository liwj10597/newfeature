package com.jollycorp.data.service.impl;

import lombok.Data;

@Data
public class Method {
    String firstName;
    String lastName;
    Method() {}

    Method(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
