package com.jollycorp.data.service;

import com.jollycorp.data.service.impl.Method;

@FunctionalInterface
interface MethodFactory<P extends Method> {
    P create(String firstName, String lastName);
}
