//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ХОЛОД 3000: Сколько яиц осталось в холодильнике?");
        int eggs = scanner.nextInt();
        if (eggs>3){
            System.out.println("ХОЛОД-3000: Рекомендуют приготовить омлет.");

        } else if (eggs < 3){
            System.out.println("ХОЛОД-3000: Рекомендуют приготовить бутербродами.");
        }
        System.out.println("ХОЛОД-3000: Приятного аппетита!");
        }
    }