package com.codegym.service;

import java.util.Optional;

public interface IGenerateService<E> {
    Iterable<E> findAll();
    Optional<E> findById(long id);
    E save( E e);
    void remove(long id);

}
