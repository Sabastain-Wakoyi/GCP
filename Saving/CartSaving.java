package Saving;

public abstract class CartSaving<cart> {
    abstract Long save(cart cart);
     abstract void add(Long idCart, Long idProduct, Integer quantity);
     abstract Long ordered(Long idCart);
}
