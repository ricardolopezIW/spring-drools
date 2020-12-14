package com.baeldung.spring.drools.repository;

import com.baeldung.spring.drools.repository.model.Concepto;

import java.util.List;

public interface ConceptosRepository {
   List<Concepto> findAllCurrent();
}
