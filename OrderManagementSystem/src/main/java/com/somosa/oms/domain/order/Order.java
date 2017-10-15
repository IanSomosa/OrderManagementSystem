package com.somosa.oms.domain.order;

public interface Order {

  OrderID getOrderID();

  void markComplete();

  void markIncomplete();
}
