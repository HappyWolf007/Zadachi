import java.util.Scanner;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 1
//        System.out.print("Введите целое число: ");
//        int number = scanner.nextInt();
//        if (number % 2 == 0) {
//            System.out.println("Число " + number + " чётное");
//        } else {
//            System.out.println("Число " + number + " нечётное");
//        }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 2
//        System.out.println("Введите первое число: ");
//        int a = scanner.nextInt();
//        System.out.println("Введите второе число: ");
//        int b = scanner.nextInt();
//        System.out.println("Введите последнее число: ");
//        int c = scanner.nextInt();
//        int min = Math.min(a, Math.min(b, c));
//        System.out.println("Минимальное число: " + min);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 3
//        int x = 5;
//        for (int i = 1; i <= 10; i++) {
//            int res = x * i;
//            System.out.println(x + " * " + i + " = " + res);
//        }
//        System.out.println();

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 4
//        System.out.println("Введите целое число: ");
//        int n = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i<=n; i++) {
//            sum+=i;
//        }
//        System.out.println("Сумма чисел от 1 до введённого числа: " + sum);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 5
//        System.out.println("Введите целое число:");
//        int n = scanner.nextInt();
//        int[] f = new int[n];
//        f[0] = 0;
//        f[1] = 1;
//        for (int i = 2; i < n; ++i) {
//            f[i] = f[i - 1] + f[i - 2];
//        }
//        for (int i = 0; i < n; ++i) {
//            System.out.println(f[i]);
//        }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 6
//        int res;
//        System.out.println("Введите целое число: ");
//        int x = scanner.nextInt();
//        if (x <= 1) {
//        System.out.println(x + " не является простым числом.");
//        }
//        else {
//        boolean isPrime = true;
//
//        for (int i = 2; i <= x/2; i++) {
//           if (x % i == 0) {
//                isPrime = false;
//               break;
//            }
//        }
//        if (isPrime) {
//            System.out.println(x + " является простым числом.");
//        } else {
//            System.out.println(x + " не является простым числом.");
//        }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 7
//        System.out.println("Введите целое число: ");
//        int x = scanner.nextInt();
//        for (int i = x; i>=1; i--) {
//            System.out.println(i);
//        }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 8
//        System.out.println("Введите первое целое число A: ");
//        int n1 = scanner.nextInt();
//        System.out.println("Введите второе целое число B: ");
//        int n2 = scanner.nextInt();
//        int sum = 0;
//        for (int i = Math.min(n1, n2); i<=Math.max(n1, n2); i++) {
//            if (i%2==0) sum+=i;
//        }
//        System.out.println("Сумма чисел между числами A и B: " + sum);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 9
        //System.out.print("Введите строку: ");
        //String str = scanner.nextLine();
        //String RevStr = new StringBuilder(str).reverse().toString();
        //System.out.println("Обратный порядок строки: " + RevStr);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 10
//        System.out.println("Введите целое число: ");
//        int x = scanner.nextInt();
//        System.out.println("Количество цифр в числе: " + String.valueOf(x).length());

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 11
//        System.out.println("Введите целое число: ");
//        int x = scanner.nextInt();
//        float f = 1;
//        for (int i = 1; i <= x; i++) {
//            f *= i;
//        }
//        System.out.println("Факториал числа " + x + " : " + f);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 12

//        System.out.println("Введите целое число: ");
//        int x = scanner.nextInt();
//        int absN = Math.abs(x);
//        int sum = 0;
//        while (absN > 0) {
//        sum += absN % 10;
//        absN /= 10;
//         }
//
//        System.out.println("Сумма цифр числа: " + sum);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 13
//        System.out.println("Введите строку: ");
//        String str = scanner.nextLine();
//        String reversedStr = new StringBuilder(str).reverse().toString();
//        if (str.equals(reversedStr)) {
//            System.out.println(str + " является палиндромом.");
//        } else {
//            System.out.println(str + " не является палиндромом.");
//        }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 14
//        System.out.println("Введите размер массива: ");
//        int x = scanner.nextInt();
//        int[] a = new int[x];
//        System.out.println("Введите элементы массива: ");
//        for (int i = 0; i < x; i++)
//            a[i] = scanner.nextInt();
//        System.out.printf("Максимальное число в массиве: " + Arrays.stream(a).max().getAsInt());

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 15
//        System.out.println("Введите размер массива: ");
//        int x = scanner.nextInt();
//        int[] a = new int[x];
//        System.out.println("Введите элементы массива: ");
//        for (int i = 0; i < x; i++)
//            a[i] = scanner.nextInt();
//        System.out.printf("Сумма элементов массива: " + Arrays.stream(a).sum());

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 16
//        System.out.println("Введите размер массива: ");
//        int x = scanner.nextInt();
//        int[] a = new int[x];
//        System.out.println("Введите элементы массива: ");
//        int positiveNum = 0;
//        int negativeNum = 0;
//        for (int i=0; i<x; i++) {
//            a[i] = scanner.nextInt();
//            if (a[i]>0) positiveNum++;
//            if (a[i]<0) negativeNum++;
//        }
//        System.out.printf("количество положительных чисел: " + positiveNum + " Количество отрицательных чисел: " + negativeNum);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 17
//        System.out.println("Введите первое целое число A: ");
//        int n1 = scanner.nextInt();
//        System.out.println("Введите второе целое число B: ");
//        int n2 = scanner.nextInt();
//
//        for (int i = Math.min(n1, n2); i <= Math.max(n1, n2); i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//
//    }
//
//    private static boolean isPrime(int num) {
//        if (num < 2) return false;
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) return false;
//        }
//        return true;
//    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 18
//        System.out.print("Введите строку: ");
//        String str = scanner.nextLine();
//        int vowelsCount = 0, consonantsCount = 0;
//        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouyAEIOUY";
//
//        for (char i : str.toCharArray()) {
//            if (Character.isLetter(i)) {
//                if (vowels.indexOf(i) >= 0) {
//                    vowelsCount++;
//                } else {
//                    consonantsCount++;
//                }
//            }
//        }
//        System.out.println("Количество гласных: " + vowelsCount);
//        System.out.println("Количество согласных: " + consonantsCount);
//    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 19
//        System.out.print("Введите строку: ");
//        String str = scanner.nextLine();
//        String[] words = str.split(" ");
//        StringBuilder reversed = new StringBuilder();
//
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversed.append(words[i]).append(" ");
//        }
//        System.out.println("Новая строка: " + reversed.toString().trim());
//    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //ЗАДАЧА 20

//        System.out.print("Введите целое число: ");
//        int num = scanner.nextInt();
//        int originalNum = num;
//        int sum = 0;
//        int digits = String.valueOf(num).length();
//
//        while (num != 0) {
//            int digit = num % 10;
//            sum += Math.pow(digit, digits);
//            num /= 10;
//        }
//
//        if (sum == originalNum) {
//            System.out.println(originalNum + " является числом Армстронга.");
//        } else {
//            System.out.println(originalNum + " не является числом Армстронга.");
//        }
    }

}
