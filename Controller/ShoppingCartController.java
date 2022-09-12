package Controller;

import Saving.CartSaving;

@RestController
public class ShoppingCartController {
@Autowired
    CartSaving cartSaving;

@RequestMapping(value = "/users{idUser/cart", method = RequestMethod.POST)
    public  @ResponseBody ResponseEntity<Void> create@ResponseBody cart cart, HttpServletRequest request) throws Exception{
}
}


