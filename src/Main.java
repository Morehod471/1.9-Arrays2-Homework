public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (i == arr.length - 1 ) {
                System.out.println("Сумма трат за месяц составила " + sum + " рублей");
            }
        }
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minSumWaste = 200_001;
        int maxSumWaste = -1;
        for (int j : arr) {
            if (j > maxSumWaste) {
                maxSumWaste = j;
            }
            if (j < minSumWaste) {
                minSumWaste = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumWaste);
        System.out.println("Максимальная сумма трат за день составила " + maxSumWaste);
    }

    private static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int dayInMonth = 30;
        double sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println(sum);
        double averageWasteInMonth = sum / dayInMonth;
        System.out.println("Средняя сумма трат за месяц составила " + averageWasteInMonth + " рублей");
    }

    private static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
