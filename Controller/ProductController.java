package Controller;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<List<Product>> getProducts() throws ProductNotFoundException {
        List<Product> products = productService.findAll();
        return new ResponseEntity<List<Product>> (products, HttpStatus.FOUND);
    }

    @RequestMapping(value = "/products/{idProduct}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Product> getBy(@PathVariable("idProduct") Long idProduct) throws ProductNotFoundException  {
        Product product = productService.findBy(idProduct);
        return new ResponseEntity<Product> (product, HttpStatus.OK);
    }

    @RequestMapping(value = "/products?description={description}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Product> getByDescription(@PathVariable("description") String description) throws ProductNotFoundException  {
        Product product = productService.findBy(description);
        return new ResponseEntity<Product> (product, HttpStatus.OK);
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<List<Product>> getByCategory(@RequestParam("category") String category) throws ProductNotFoundException  {
        List<Product> products = productService.findByCategory(category);
        return new ResponseEntity<List<Product>> (products, HttpStatus.OK);
    }

}

