package yakovlev.shoping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
public class BasketController {
    private final BasketService service;

    public BasketController(BasketService service) {
        this.service = service;
    }

    @GetMapping(path = "/store/order/add")
    public Integer addProduct(@RequestParam Integer product) {
        return service.add(product);
    }

    @GetMapping(path = "/store/order/get")
    public Collection<Integer> getProduct() {
        return service.get();
    }
}
