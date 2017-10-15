package com.somosa.oms.domain;

public interface Identifiable extends org.springframework.hateoas.Identifiable<Long> {

  void setId(Long id);

}
