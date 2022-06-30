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

    public Product[] removeById(int id) {
        return repo.removeById(id);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        int count = 0;
        for (Product product : repo.getProducts()) {
            if (product.matches(text)) {
                Product[] tmp = new Product[result.length + 1];
                if (count > 0) {
                    for (int i = 0; i < result.length; i++) {
                        tmp[i] = result[i];
                    }
                }
                tmp[count] = product;
                result = tmp;
                count++;
            }
        }
        return result;
    }
}