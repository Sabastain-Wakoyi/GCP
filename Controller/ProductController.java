package Controller;

import Saving.ProductSaving;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductSaving productSaving;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<List<Product>> getProducts() throws ProductNotFoundException {
        List<Product> products = productSaving.findAll();
        return new ResponseEntity<List<Product>> (products, HttpStatus.FOUND);
    }

    @RequestMapping(value = "/products/{idProduct}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Product> getBy(@PathVariable("idProduct") Long idProduct) throws ProductNotFoundException  {
        Product product = productSaving.findBy(idProduct);
        return new ResponseEntity<Product> (product, HttpStatus.OK);
    }

    @RequestMapping(value = "/products?description={description}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Product> getByDescription(@PathVariable("description") String description) throws ProductNotFoundException  {
        Product product = productService.findBy(description);
        return new ResponseEntity<Product> (product, HttpStatus.OK);
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<List<Product>> getByCategory(@RequestParam("category") String category) throws ProductNotFoundException  {
        List<Product> products = productSaving.findByCategory(category);
        return new ResponseEntity<List<Product>> (products, HttpStatus.OK);
    }

}

