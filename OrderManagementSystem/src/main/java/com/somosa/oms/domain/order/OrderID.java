package com.somosa.oms.domain.order;

import com.somosa.oms.domain.Identifier;

public class OrderID implements Identifier {

  private final String id;

  public OrderID(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    OrderID orderID = (OrderID) o;

    return new org.apache.commons.lang3.builder.EqualsBuilder()
        .append(id, orderID.id)
        .isEquals();
  }

  @Override
  public int hashCode() {
    return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
        .append(id)
        .toHashCode();
  }
}
