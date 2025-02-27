package kitchenpos.menu.domain.menu;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import kitchenpos.menu.domain.menu.Menu;

public interface MenuRepository {
    Menu save(Menu menu);

    Optional<Menu> findById(UUID id);

    List<Menu> findAll();

    List<Menu> findAllByIdIn(List<UUID> ids);

    List<Menu> findAllByProductId(UUID productId);
}

