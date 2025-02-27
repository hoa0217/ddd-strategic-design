package kitchenpos.menu.domain.menugroup;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import kitchenpos.menu.domain.menugroup.MenuGroup;

public interface MenuGroupRepository {
    MenuGroup save(MenuGroup menuGroup);

    Optional<MenuGroup> findById(UUID id);

    List<MenuGroup> findAll();
}

