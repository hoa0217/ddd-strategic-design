package kitchenpos.order.infra;

import kitchenpos.order.domain.order.Order;
import kitchenpos.order.domain.order.OrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderRepository extends OrderRepository, JpaRepository<Order, UUID> {
}
