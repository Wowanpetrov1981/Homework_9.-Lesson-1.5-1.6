public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        generateRandomArray();

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
        System.out.println("Задание 1");
        int sum = 0;
        int myArray [] = generateRandomArray();
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];

        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

    }
    public static void task2 () {
        System.out.println("Задание 2");
        int maxSum = 0;
        int myArray [] = generateRandomArray();
        for (final int current : myArray) {
            if (current > maxSum) {
                maxSum = current;

            }
        }
        int minSum = 201_000;
        int myArray1 [] = generateRandomArray();
        for (final int current : myArray1) {
            if (current < minSum) {
                minSum = current;

            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задание 3");
        double sum = 0;
        int myArray [] = generateRandomArray();
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];

        }
        double average = sum / myArray.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
        System.out.println();
    }




}