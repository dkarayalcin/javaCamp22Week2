public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(257);
        product.setDescription("Asus Laptop");
        product.setPrice(15000);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());


    }
}
