package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository {
    private ArrayList<Product> listOfProducts = new ArrayList<Product>(); // ArrayList를 Product로 캐스팅
    private stactic ProductRepository instance = new ProductRepository();
    
    public stactic ProductRepository getInstance(){
        return instance;
    }
    
    public ProductRepository() {
        Product phone = new Product("P1234", "emTek Geforce RTX 4060", 400000);
        phone.setDescription("GDDR6(DDR6), 8GB, 249.9mm");
        phone.setCategory("VGA");
        phone.setManufacturer("NVIDIA");
        phone.setUnitsInStock(1000);
        phone.setCondition("New");
        
        Product notebook = new Product("P1235", "emTek Geforce RTX 3060", 300000);
        notebook.setDescription("GDDR6(DDR6), 12GB, 245mm");
        notebook.setCategory("VGA");
        notebook.setManufacturer("NVIDIA");
        notebook.setUnitsInStock(1000);
        notebook.setCondition("Refurbished");
        
        Product tablet = new Product("P1236", "MSI Geforce GTX 1650", 100000);
        notebook.setDescription("GDDR6(DDR6), 4GB, 248mm");
        notebook.setCategory("VGA");
        notebook.setManufacturer("NVIDIA");
        notebook.setUnitsInStock(1000);
        notebook.setCondition("Old");
        
        // 위와 같이 상품 초기화 하고 아래에 상품을 추가
        
        listOfProducts.add(phone);
        listOfProducts.add(notebook);
        listOfProducts.add(tablet);
        // listOfProducts.add(상품명);
    }
    
    public ArrayList<Product> getAllProducts(){
        return listOfProducts;
    }
    
    public Product getProductById(String productId) {
        Product productById = null;
        
        for (int i = 0; i < listOfProducts.size(); i++) {
            Product product = listOfProducts.get(i);
            if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
                productById = product;
                break;
            }
        }
        return productById;
    }
    
    public void addProduct(Product product) {
        listOfProducts.add(product);
    }
}