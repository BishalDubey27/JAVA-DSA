package OOP;
import java.util.*;

class Laptop {

    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    // Parameterized Constructor
    public Laptop(int laptopId, String brand, String osType, double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    // Getters
    public int getLaptopId() {
        return laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public String getOsType() {
        return osType;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    // Setters
    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

public class OopMyClass {

    // Method 1
    public static int countOfLaptopsByBrand(Laptop[] arr, String brand) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getBrand().equalsIgnoreCase(brand)
                    && arr[i].getRating() > 3) {

                count++;
            }
        }

        return count;
    }

    // Method 2
    public static Laptop[] searchLaptopByOsType(Laptop[] arr, String os) {

        Laptop result[] = new Laptop[arr.length];

        int index = 0;

        // Store matching laptops
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getOsType().equalsIgnoreCase(os)) {

                result[index] = arr[i];
                index++;
            }
        }

        // If no laptop found
        if (index == 0) {
            return null;
        }

        // Sort in descending order of laptopId
        for (int i = 0; i < index - 1; i++) {

            for (int j = i + 1; j < index; j++) {

                if (result[i].getLaptopId() < result[j].getLaptopId()) {

                    Laptop temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Laptop arr[] = new Laptop[4];

        // Input 4 Laptop objects
        for (int i = 0; i < 4; i++) {

            int id = sc.nextInt();
            sc.nextLine();

            String brand = sc.nextLine();
            String os = sc.nextLine();

            double price = sc.nextDouble();
            int rating = sc.nextInt();
            sc.nextLine();

            arr[i] = new Laptop(id, brand, os, price, rating);
        }

        // Search inputs
        String brand = sc.nextLine();
        String os = sc.nextLine();

        // Method 1
        int count = countOfLaptopsByBrand(arr, brand);

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("The given brand is not available");
        }

        // Method 2
        Laptop result[] = searchLaptopByOsType(arr, os);

        if (result == null) {

            System.out.println("The given os is not available");

        } else {

            for (int i = 0; i < result.length; i++) {

                if (result[i] != null) {

                    System.out.println(result[i].getLaptopId());
                    System.out.println(result[i].getRating());

                }

            }

        }

        sc.close();
    }
}