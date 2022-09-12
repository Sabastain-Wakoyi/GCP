package Controller;
import java.net.URI;
import java.net.http.HttpHeaders;
import Saving.CartSaving;

@RestController
public class ShoppingCartController {
@Autowired
    CartSaving cartSaving;

@RequestMapping(value = "/users{idUser/cart", method = RequestMethod.POST)
    public  @ResponseBody ResponseEntity<Void> create@ResponseBody cart cart, HttpServletRequest) throws URISyntaxException{

        Long id = cartSaving.save(cart);
        HttpHeaders header = new HttpHeaders();
        header.setLocation(new URI(request.getRequestURL() + "/" + id.toString()));
        return new ResponseEntity<Void>(header, HttpStatus.CREATED);
            }
    @RequestMapping(value = "/users/{idUser}/carts/{idCart}", method = RequestMethod.PUT)
    public @ResponseBody ResponseEntity<Void> addProduct(@PathVariable("idCart") Long idCart, @RequestParam("idProduct") Long idProduct,
                                                         @RequestParam("quantity") Integer quantity) {
        cartSaving.add(idCart, idProduct, quantity);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<Void> ordered(@PathVariable("idCart") Long idCart, HttpServletRequest request) throws URISyntaxException {
        Long id = cartSaving.ordered(idCart);
        HttpHeaders header = new HttpHeaders();
        header.setLocation(new URI(request.getRequestURL() + "/" + id.toString()));
        return new ResponseEntity<Void>(header, HttpStatus.CREATED);
    }

}


