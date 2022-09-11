package yakovlev.shoping;
import java.util.Collection;

public interface BasketService {
    Integer add(Integer product);
    Collection<Integer> get();
}