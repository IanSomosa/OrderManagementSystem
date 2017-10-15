package com.somosa.oms.domain.order;

import com.somosa.oms.domain.Identifiable;
import java.math.BigDecimal;

public class Order implements Identifiable {

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

  public void setComplete(boolean complete) {
    isComplete = complete;
  }

  public void markComplete() {
    setComplete(true);
  }

  public void markIncomplete() {
    setComplete(false);
  }
}
