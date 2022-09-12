import java.util.logging.Logger;

@RestController
@RequestMapping
public class ShoppingCartController {
    private final ShoppingCartRepository shoppingCartRepository;
    private final ProductRepository productRepository;

    private static final Logger logger = LoggerFactory.getLogger(ShoppingCartController.class);

    @Autowired
    ShoppingCartController(ShoppingCartRepository shoppingCartRepository, ProductRepository productRepository){
    this.shoppingCartRepository = shoppingCartRepository;
    this.productRepository = productRepository;
    }




}
