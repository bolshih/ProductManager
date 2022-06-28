package ru.netology.Product;

public class ProductRepository {

    private Product[] products = new Product[0];

    public void addProduct(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product[] getProducts() {
        return products;
    }

    public Product[] removeById(int Id) {
        Product[] tmp = new Product[products.length - 1];
        int copyToIndex = 0;
        for (Product product : products) {
            if (product.getId() != Id) {
                tmp[copyToIndex] = product;
                copyToIndex++;
            }
        }
        products = tmp;
       return products;
    }

}
