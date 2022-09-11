package yakovlev.shoping;
import java.util.Collection;
import java.util.List;

public interface BasketService {

    Collection<Integer> add(List<Integer> product);

    Collection<Integer> get();
}