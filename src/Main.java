import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int input[] = new int[]{1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        System.out.println("Исходный массив: ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();

        //Фильтр
        int firstIttr[] = new int[input.length], countFirst = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0 && input[i] % 2 == 0) {
                firstIttr[countFirst] = input[i];
                countFirst++;
            }
        }
        System.out.println("Первая итерация (фильтр): ");
        for (int i = 0; i < firstIttr.length; i++) {
            System.out.print(firstIttr[i] + " ");
        }
        System.out.println();

        //Сортировка
        int secondIttr[] = firstIttr;
        Arrays.sort(secondIttr);
        System.out.println("Вторая итерация (сортировка): ");
        for (int i = 0; i < firstIttr.length; i++) {
            if (firstIttr[i] != 0)
                System.out.print(firstIttr[i] + " ");
        }
    }
}
