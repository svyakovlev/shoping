package yakovlev.shoping;

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
    public Collection<Integer> add(List<Integer> product) {
        for (Integer integer : product) {
            basket.add(integer);
        }
        return product;
    }

    @Override
    public Collection<Integer> get() {
        return Collections.unmodifiableList(basket);
    }
}
