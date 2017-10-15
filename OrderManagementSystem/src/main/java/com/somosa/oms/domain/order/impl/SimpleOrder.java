package com.somosa.oms.domain.order.impl;

import com.somosa.oms.domain.order.Order;
import java.math.BigDecimal;

public class SimpleOrder implements Order {

  private Long id;
  private String description;
  private BigDecimal cost;
  private boolean isComplete;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public boolean isComplete() {
    return isComplete;
  }

  private void setComplete(boolean complete) {
    isComplete = complete;
  }

  public void markComplete() {
    setComplete(true);
  }

  public void markIncomplete() {
    setComplete(false);
  }
}
