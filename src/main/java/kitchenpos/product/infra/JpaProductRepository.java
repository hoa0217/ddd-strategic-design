package kitchenpos.product.infra;

import kitchenpos.product.domain.product.Product;
import kitchenpos.product.domain.product.ProductRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaProductRepository extends ProductRepository, JpaRepository<Product, UUID> {
}
