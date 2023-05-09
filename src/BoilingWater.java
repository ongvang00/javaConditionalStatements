import java.util.Scanner;
public class BoilingWater {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number greater than 212");
        double temp = scanner.nextDouble();

        if (temp >= 212) {
            System.out.println("Water is boiling!");
        } else {
            System.out.println("The number enter is not greater or equal to 212");
        }
    }
}
