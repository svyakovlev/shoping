package yakovlev.shoping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@RestController
public class BasketController {
    private final BasketService service;

    public BasketController(BasketService service) {
        this.service = service;
    }

    @GetMapping(path = "/order/add")
    public Collection<Integer> addProduct(@RequestParam List<Integer> product) {
        return service.add(product);
    }

    @GetMapping(path = "/order/get")
    public Collection<Integer> getProduct() {
        return service.get();
    }
}
