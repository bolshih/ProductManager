package ru.netology.Product;

public class ProductManager {
    private ProductRepository repo;

    public ProductManager(ProductRepository repo) {
        this.repo = repo;
    }

    public void addProduct(Product product) {
        repo.addProduct(product);
    }

    public Product[] getProduct() {
        return repo.getProducts();
    }

    public Product[] removeById(int id){
        repo.removeById(id);
        return new Product[0];
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : repo.getProducts()) {
            if (product.matches(text)) {
                int i = 0;
                Product[] tmp = new Product[result.length + 1];
                tmp[i] = product;
                result = tmp;
            }
        }
        return result;
    }
}