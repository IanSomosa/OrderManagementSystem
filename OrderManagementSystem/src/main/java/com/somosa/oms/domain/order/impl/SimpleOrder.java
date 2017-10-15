package com.somosa.oms.domain.order.impl;

import com.somosa.oms.domain.order.Order;
import com.somosa.oms.domain.order.OrderID;
import java.math.BigDecimal;

public class SimpleOrder implements Order {

  private OrderID orderID;
  private String description;
  private BigDecimal cost;
  private boolean isComplete;

  public OrderID getOrderID() {
    return orderID;
  }

  public void setOrderID(OrderID orderID) {
    this.orderID = orderID;
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
