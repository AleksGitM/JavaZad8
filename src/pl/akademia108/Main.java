package pl.akademia108;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	System.out.println("Podaj swój wzrost w metrach: ");
    Scanner scanner = new Scanner(System.in);
    String UserHeight = scanner.next();
    System.out.println("Podaj swoją wagę w kilogramach: ");
    String userWeight = scanner.next();
    float height1 = Float.parseFloat(UserHeight);
    float weight = Float.parseFloat(userWeight);
    float height = height1 * height1;
    float bmi = weight / height;

    System.out.println("Twoje bmi wynosi: " + bmi);
    if(bmi < 19){
        System.out.println("Oznacza to niedowagę");
    } else if(bmi >= 19 && bmi <= 25){
        System.out.println("Oznacza to BMI w normie");
    } else if(bmi > 25){
                System.out.println("Oznacza to nadwagę");
        }
    }
}
