package practice;

import java.util.Scanner;

public class Automobile {
    private int model_year;
    private final String make;
    private String model;
    private final String license_plate;

    public Automobile(String make, int model_year, String model, String license_plate) {
        this.make = make;
        this.model_year = model_year;
        this.model = model;
        this.license_plate = license_plate;
    }

    public String getModel() {
        return model;
    }

    public int getModel_year() {
        return model_year;
    }

    public String getMake() {
        return make;
    }

    public License_plate getLicense_plate() {
        return new License_plate();
    }

    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to enter info? ");
        String answer = input.nextLine();
        String answer1 = input.findInLine("no");
        if (answer.equals("yes")) {
            System.out.println("Enter model year: ");
            int model_year = input.nextInt();
            this.model_year = model_year;

            System.out.println("Enter model: ");
            input.nextLine();
            this.model = getModel();
            System.out.println("Would you like to continue? ");
            if (answer1.equals("no")) {

            }

            if (answer.equals("no")) {

            }
        }
    }

}