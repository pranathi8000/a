package a;

public class Main {
    public static void main(String[] args) {
        int age = 17; // Change this value to test eligibility

        if (A.isEligible(age)) {
            System.out.println("User is eligible to vote.");
        } else {
            System.out.println("User is not eligible to vote.");
        }
    }
}

