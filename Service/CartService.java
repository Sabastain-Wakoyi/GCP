package Service;

public interface CartService<Cart> {

     Long save (Cart cart);
    void add(Long idCart, Long idProduct, Integer quantity);
    Long ordered(Long idCart);
}
