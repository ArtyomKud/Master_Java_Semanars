public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Laptop laptop1 = new Laptop(2000, 120, "Linux", "Black", 30000);
        Laptop laptop2 = new Laptop(4000, 240, "Windows", "White", 32000);
        Laptop laptop3 = new Laptop(6000, 320, "Windows", "Blue", 35000);
        Laptop laptop4 = new Laptop(8000, 500, "Linux", "Black", 40000);
        Laptop laptop5 = new Laptop(16000, 1000, "Windows", "White", 50000);
        shop.putLaptop(laptop1);
        shop.putLaptop(laptop2);
        shop.putLaptop(laptop3);
        shop.putLaptop(laptop4);
        shop.putLaptop(laptop5);
        shop.setFilterCriteria();
        shop.filterDevaced();





    }
}
