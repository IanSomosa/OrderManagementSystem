package com.somosa.oms.domain.order;

import com.somosa.oms.domain.Identifiable;

public interface Order extends Identifiable {

  void markComplete();

  void markIncomplete();
}
