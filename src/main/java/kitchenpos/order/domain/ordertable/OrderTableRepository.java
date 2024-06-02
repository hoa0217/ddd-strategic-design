package kitchenpos.order.domain.ordertable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import kitchenpos.order.domain.ordertable.OrderTable;

public interface OrderTableRepository {
    OrderTable save(OrderTable orderTable);

    Optional<OrderTable> findById(UUID id);

    List<OrderTable> findAll();
}

