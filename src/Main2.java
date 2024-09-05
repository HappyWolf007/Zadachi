import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main2 {
/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 1
    public static double findMax(double a, double b) throws Exception {
        if (a == b) {
            throw new Exception("Числа равны, невозможно вычислить наибольшее ");
        }
        return Math.max(a, b);
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 2
    public static double divide(int delimoe, int delitel) {
        if (delitel == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо ");
        }
        return (double) delimoe / delitel;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 3
    public static int converter(String str) {
        try {
            return  Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            throw new NumberFormatException("Не удалось преобразовать строку в целое число ");
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 4
    public static void Age(int age)
    {
        if (age<0 || age>150) {
            throw new IllegalArgumentException("Недопустимый возраст ");
        }
        System.out.println("Возраст " + age + " коректный ");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 5
    public static double sqrt(double n)
    {
        if (n<0) throw new IllegalArgumentException("Число отрицательное. Извлечь корень невозможно ");
        return Math.sqrt(n);
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 6
    public static long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Число отрицательное ");
        }
        if (num == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 7
    public static void chechArr(int[] arr) {
        for (int i : arr) {
            if (i==0) throw new IllegalArgumentException("В массиве содержатся нули ");
        }
        System.out.println("В массиве нет нулей ");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 8
    public static double checkStepen(double num, int stepen) {
    if (stepen<0) {
        throw new IllegalArgumentException("Степень отрицательная ");
    }
    return Math.pow(num, stepen);
}

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 9
    public static String obrez(String str, int num) {
        if (str.length()<num) {
            throw new NumberFormatException("Число символов больше длины строки ");
        }
        return str.substring(0, num);

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 10
    public static void searchInArr(int[] arr, int x) {
        for (int i : arr) {
            if (i==x) {
                System.out.println("Элемент " + i + " есть в массиве ");
                return;
            }
        }
        throw new IllegalArgumentException("Элемент " + x + " не найден в массиве ");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 11
    public static String convertInBinary(int x) {
        if (x<0) throw new IllegalArgumentException("Число отрицательное ");
        return Integer.toBinaryString(x);
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 12
    public static boolean isDivis(int delimoe, int delitel) {
        if (delitel == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо ");
        }
        return delimoe % delitel==0;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 13
    public static String getElem(List<String> list, int i) {
        if (i<0 || i>=list.size()) throw new IndexOutOfBoundsException("Индекс выходит за пределы списка ");
        return list.get(i);
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 14
    public static void checkPass(String pass) {
        if (pass.length() < 8) {
            throw new SecurityException("Пароль слишком короткий "); //WeakPasswordException не работает, пришлось заменить
        }
        System.out.println("Пароль подходящий ");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 15
    public static void checkDate(String str) {
        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate date = LocalDate.parse(str, dateTimeFormatter);
            System.out.println("Дата корректна: " + date);
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Неверный формат даты. Ожидаемый формат: dd.MM.yyyy", str, 0);
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 16
    public static String concatenat(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null ");
        }
        return str1 + str2;
    }


/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 17
    public static int Ostatok(int delimoe, int delitel) {
        if (delitel == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо ");
        }
        return delimoe % delitel;
    }


/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 18

    public static double square(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Невозможно извлечь квадратный корень из отрицательного числа ");
        }
        return Math.sqrt(num);
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 19

    public static double fromCinF(double c) {
        if (c < -273.15) {
            throw new IllegalArgumentException("Температура не может быть меньше абсолютного нуля ");
        }
        return (c * 9 / 5) + 32;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////
    // Задача 20
    public static void checkString(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пуста или равна null ");
        }
        System.out.println("Строка не пуста ");
    }

     public static void main(String[] args) {
         try {
////////////////////////////////////////////////////////////////
             // Задача 1
             System.out.println("Максимальное число: " + findMax(14.3, 18));

             // Задача 2
             System.out.println("Результат деления: " + divide(14, 20));

             // Задача 3
             System.out.println("Конвертация строки в число: " + converter("1142"));

             // Задача 4
             Age(112);

             // Задача 5
             System.out.println("Корень: " +sqrt(25));

             // Задача 6
             System.out.println("Факториал: " +factorial(25));

             // Задача 7
             int[] arr = {1, 4, 3, 8, 5};
             chechArr(arr);

             // Задача 8
             System.out.println("Число в степени: " +checkStepen(5, 3));

             // Задача 9
             System.out.println("Обработанная строка: " +obrez("Hello world", 6));

             // Задача 10
             int[] arr2 = {1, 4, 3, 8, 5, 10, 11};
             searchInArr(arr2, 3);

             // Задача 11
             System.out.println("Конвертация числа в двоичную строку: " + convertInBinary(25));

             // Задача 12
             System.out.println("Проверка делимости: " + isDivis(25, 3));

             //Задача 13
             List<String> list = Arrays.asList("123", "hello", "world");
             System.out.println("Элемент по индексу получен: " + getElem(list,1));

             // Задача 14
             checkPass("12345670");

             // Задача 15
             checkDate("06.09.2024");

             // Задача 16
             System.out.println("Объединенная строка: " + concatenat("asdsae", "w313"));

             // Задача 17
             System.out.println("Остаток от деления: " + Ostatok(15, 4));

             // Задача 18
             System.out.println("Квадратный корень числа равен: " + square(25));

             // Задача 19
             System.out.println("Из Цельсия по Фаренгейту: " + fromCinF(25));

             // Задача 20
             checkString("Null");


         } catch (Exception e) {
             System.out.println("Ошибка! " + e.getMessage());
         }
     }
}
