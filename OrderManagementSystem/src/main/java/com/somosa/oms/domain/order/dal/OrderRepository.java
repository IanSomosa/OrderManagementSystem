package com.somosa.oms.domain.order.dal;

import com.somosa.oms.domain.dal.InMemoryRepository;
import com.somosa.oms.domain.order.Order;

public class OrderRepository extends InMemoryRepository<Order> {

  @Override
  protected void updateIfExists(Order original, Order updated) {
    original.setDescription(updated.getDescription());
    original.setCost(updated.getCost());
    original.setComplete(updated.isComplete());
  }
}
