package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository {
    private ArrayList<Product> listOfProducts = new ArrayList<Product>(); // ArrayList를 Product로 캐스팅
    private static ProductRepository instance = new ProductRepository();
    
    public static ProductRepository getInstance(){
        return instance;
    }
    
    public ProductRepository() {
        Product phone = new Product("G4080", "GIGABYTE Geforce RTX 4080", 1500000);
        phone.setDescription("GDDR6X(DDR6X), 16GB, 328.9mm");
        phone.setCategory("VGA");
        phone.setManufacturer("NVIDIA");
        phone.setUnitsInStock(1000);
        phone.setCondition("New");
        phone.setFilename("G4080.jpg");
        
        Product notebook = new Product("G4070", "PNY Geforce RTX 4070", 800000);
        notebook.setDescription("GDDR6X(DDR6X), 12GB, 247.4mm");
        notebook.setCategory("VGA");
        notebook.setManufacturer("NVIDIA");
        notebook.setUnitsInStock(1000);
        notebook.setCondition("Refurbished");
        notebook.setFilename("G4070.jpg");
        
        Product tablet = new Product("G4060", "GIGABYTE Geforce RTX 4060", 400000);
        tablet.setDescription("GDDR6(DDR6), 8GB, 192mm");
        tablet.setCategory("VGA");
        tablet.setManufacturer("NVIDIA");
        tablet.setUnitsInStock(1000);
        tablet.setCondition("Refurbished");
        tablet.setFilename("G4060.jpg");
        
        Product VGA1 = new Product("G3080Ti", "MSI Geforce RTX 3080Ti", 1000000);
        VGA1.setDescription("GDDR6X(DDR6X), 12GB, 317.8mm");
        VGA1.setCategory("VGA");
        VGA1.setManufacturer("NVIDIA");
        VGA1.setUnitsInStock(1000);
        VGA1.setCondition("New");
        VGA1.setFilename("G3080Ti.jpg");
        
        Product VGA2 = new Product("G3070", "GIGABYTE Geforce RTX 3070", 800000);
        VGA2.setDescription("GDDR6(DDR6), 8GB, 286mm");
        VGA2.setCategory("VGA");
        VGA2.setManufacturer("NVIDIA");
        VGA2.setUnitsInStock(1000);
        VGA2.setCondition("Old");
        VGA2.setFilename("G3070.jpg");
        
        Product VGA3 = new Product("G3060", "MANLI Geforce RTX 3060", 400000);
        VGA3.setDescription("GDDR6(DDR6), 12GB, 245mm");
        VGA3.setCategory("VGA");
        VGA3.setManufacturer("NVIDIA");
        VGA3.setUnitsInStock(1000);
        VGA3.setCondition("Old");
        VGA3.setFilename("G3060.jpg");
        
        Product VGA4 = new Product("G1660", "ZOTAC Geforce GTX 1660", 400000);
        VGA4.setDescription("GDDR5(DDR5), 6GB, 214mm");
        VGA4.setCategory("VGA");
        VGA4.setManufacturer("NVIDIA");
        VGA4.setUnitsInStock(1000);
        VGA4.setCondition("Old");
        VGA4.setFilename("G1660.jpg");
        
        Product VGA5 = new Product("G1650", "ASUS Geforce GTX 1650", 200000);
        VGA5.setDescription("GDDR5(DDR5), 4GB, 204mm");
        VGA5.setCategory("VGA");
        VGA5.setManufacturer("NVIDIA");
        VGA5.setUnitsInStock(1000);
        VGA5.setCondition("Old");
        VGA5.setFilename("G1650.jpg");
        
        Product VGA6 = new Product("G1060", "GIGABYTE Geforce GTX 1060", 200000);
        VGA6.setDescription("GDDR5(DDR5), 2GB, 200mm");
        VGA6.setCategory("VGA");
        VGA6.setManufacturer("NVIDIA");
        VGA6.setUnitsInStock(1000);
        VGA6.setCondition("Old");
        VGA6.setFilename("G1060.jpg");
        
        // 위와 같이 상품 초기화 하고 아래에 상품을 추가
        
        listOfProducts.add(phone);
        listOfProducts.add(notebook);
        listOfProducts.add(tablet);
        listOfProducts.add(VGA1);
        listOfProducts.add(VGA2);
        listOfProducts.add(VGA3);
        listOfProducts.add(VGA4);
        listOfProducts.add(VGA5);
        listOfProducts.add(VGA6);
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