


public class Laptop{
    private static int id= 0;
    private int ram;
    private int  hardDiskCapacity;
    private String operatingSystem;
    private String color;
    private int price;


    public Laptop(int ram, int hardDiskCapacity, String operatingSystem, String color, int price) {
        id++;
        this.ram = ram;
        this.hardDiskCapacity = hardDiskCapacity;
        this.operatingSystem = operatingSystem.toLowerCase();
        this.color = color.toLowerCase();
        this.price = price;

    }



    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHardDiskCapacity(int hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem.toLowerCase();
    }

    public void setColor(String color) {
        this.color = color.toLowerCase();
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public int getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop{ " + id +
                " ram=" + ram +
                ", hardDiskCapacity=" + hardDiskCapacity +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                " руб}";
    }
}
