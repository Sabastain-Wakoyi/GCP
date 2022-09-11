package Service;
import java.util.List;
public interface Product {

    Product findBy(Long idProduct) throws ProductNotFoundException;
    Product findBy(String description) throws ProductNotFoundException;
    List<Product> findByCategory(String category) throws ProductNotFoundException;
    List<Product> findAll() throws ProductNotFoundException;

}
