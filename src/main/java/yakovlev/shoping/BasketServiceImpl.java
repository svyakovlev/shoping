package yakovlev.shoping;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private final List<Integer> basket;

    public BasketServiceImpl() {
        this.basket = new ArrayList<>();
    }

    @Override
    public Integer add(Integer product) {
        basket.add(product);
        return product;
    }

    @Override
    public Collection<Integer> get() {
        return Collections.unmodifiableList(basket);
    }
}
