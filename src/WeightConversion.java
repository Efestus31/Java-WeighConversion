import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {

        //Weight Conversion Program
        Scanner scanner = new Scanner(System.in);
        //Declare variables
        double weight;
        double newWeight;
        int choice;
        double conversionRatio = 0.45359237;

        //welcome message
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        //prompt for user choice
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        //option 1 convert lbs to kgs
        if (choice == 1){
            System.out.print("Insert a weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * conversionRatio;
            System.out.printf("Your weight was %.2flbs \n", weight);
            System.out.printf("Your new weight is: %.2fkgs", newWeight);
        }
        //option 2 convert kgs to lbs
        else if (choice == 2) {
            System.out.print("Insert a weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight / conversionRatio;
            System.out.printf("Your weight was %.2fkgs \n", weight);
            System.out.printf("Your new weight is: %.2flbs", newWeight);
        }
        //else print not a valid choice
        else{
            System.out.println("Choose a valid option");
        }
        scanner.close();
    }
}
