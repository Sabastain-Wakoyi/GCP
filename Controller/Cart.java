package Controller;

import Service.CartService;

import java.net.http.HttpHeaders;

@RestController
public class Cart {
    @Autowired
    CartService cartService;
    private Object RequestMethod;

    @RequestMapping(value = "/users/{idUser/carts", method = RequestMethod.POST)
    public @ResponseBody <HttpServletRequest, ResponseEntity> ResponseEntity create(@RequestBody Cart cart, HttpServletRequest request) throws URISyntaxException {
        Long id = cartService.save(cart);
        HttpHeaders header = new HttpHeaders();
        header.setLocation(new URI(request.getRequestURL() + "/" + id.toString()));
        return new ResponseEntity<void>(header, HttpStatus.CREATED);
    }
}

