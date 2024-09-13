import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDateTime;
////////////////////////////////////////////////////////////////
//Задача 1
class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void DisplayInfo() {
        System.out.println(" Имя: " + name + " ,возраст: " + age + " , пол: " + gender);
    }

    public void IncreaseAge(int increaseAge) {
        age+=increaseAge;
    }
    public void ChangeName(String newName){
        name = newName;
    }
}
////////////////////////////////////////////////////////////////
//Задача 2
class Worker extends Person{
    private double salary;
    public Worker(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

}
class Manager extends Worker{
    private int subordinateEmployees;
    public Manager(String name, int age, String gender, double salary, int subordinateEmployees) {
        super(name, age, gender, salary);
        this.subordinateEmployees = subordinateEmployees;
    }
    public int getSubordinateEmployees(){
        return subordinateEmployees;
    }
}

////////////////////////////////////////////////////////////////
//Задача 3

interface Animal{
    void makeSound();
}
class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Гав! Гав!");
    }
}
class Cat implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Мяу! Мяу!");
    }
}
class Cow implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Му-у-у-у");
    }
}

////////////////////////////////////////////////////////////////
//Задача 4
abstract class Transport{
    abstract void move();
}
class Car extends Transport{
    @Override
    void move(){
        System.out.println("Машине едет");
    }
}
class Bike extends Transport{
    @Override
    void move(){
        System.out.println("Велосипед движется");
    }
}

////////////////////////////////////////////////////////////////
//Задача 5
class Book{
    private String title;
    private String author;
    private int year;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
}


class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    // Метод для поиска книг по году публикации
    public List<Book> findBooksByYear(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }
}


////////////////////////////////////////////////////////////////
//Задача 6
class BankAccount{
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance +=amount;
    }
    public void withdrawFunds(double amount) {
        if (amount<=balance) {
            balance -= amount;
        }
        else {
            System.out.println("Недостаточно средств для вывода");
        }
    }
    public double getBalance(){
        return balance;
    }
}

////////////////////////////////////////////////////////////////
//Задача 7

class Counter {
    private static int count = 0;
    public Counter(){
        count++;
    }
    public static int getCount(){
        return count;
    }
}

////////////////////////////////////////////////////////////////
//Задача 8
abstract class Shape{
    public abstract double getArea();
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
}
class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

    ////////////////////////////////////////////////////////////////
    //Задача 9
class Animals{
    public void move(){
        System.out.println("Животное движется");
    }
}
class Fish extends Animals{
    @Override
    public void move(){
        System.out.println("Рыба плывёт");
    }
}
class Bird extends Animals{
    @Override
    public void move(){
        System.out.println("Птица летит");
    }
}
class Dog2 extends Animals{
    @Override
    public void move(){
        System.out.println("Собака бежит");
    }
}

////////////////////////////////////////////////////////////////
//Задача 10
class Student{
    private String name;
    private String group;
    private double grade;
    public Student(String name, String group,double grade){
        this.name = name;
        this.group = group;
        this.grade = grade;
    }
    public String getName(){
        return name;
    }
    public String getGroup(){
        return group;
    }
    public double getGrade(){
        return grade;
    }
    @Override
    public String toString() {
        return "Студент: " + name + '\'' +
                ", группа: " + group + '\'' +
                ", оценка: " + grade;
    }
}
class University{
    public List<Student> students;
    public University(){
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void sortByStudentName(){
        Collections.sort(students, Comparator.comparing(Student::getName));
    }
    public List<Student> filterStudentsByGrade(double minGrade) {
        return students.stream().filter(s -> s.getGrade() >= minGrade).collect(Collectors.toList());
    }
}

////////////////////////////////////////////////////////////////
//Задача 11
class Product{
    private String name;
    private double price;
    private  int quantity;
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    @Override
    public String toString() {
        return name + '\'' +
                ", группа: " + price + '\'' +
                ", количество: " + quantity;
    }
}
class Store{
    public List<Product> products;
    public Store(){
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void deleteProduct(String name){
        products.removeIf(product -> product.getName().equals(name));
    }
    public Product findProductByName(String name){
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "Продукт: " + products;
    }
}
////////////////////////////////////////////////////////////////
//Задача 12
interface PaymentSystem {
    void pay(double amount);
    void refund(double amount);
}

class CreditCard implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Оплачено банковской картой: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возвращено банковской картой: " + amount);
    }
}

class PayPal implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Оплачено PayPal: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возвращено PayPal: " + amount);
    }
}

////////////////////////////////////////////////////////////////
//Задача 13
class UniqueID {
    private static int id = 1;

    public static int generateID() {
        return id++;
    }

    public int getID() {
        return id;
    }
}

////////////////////////////////////////////////////////////////
//Задача 14
class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle2 {
    Point p1, p2;

    public Rectangle2(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getArea() {
        return Math.abs((p2.x - p1.x) * (p2.y - p1.y));
    }
}

////////////////////////////////////////////////////////////////
//Задача 15
class ComplexNumber {
    public double real;
    public double  imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}

////////////////////////////////////////////////////////////////
//Задача 16
class Matrix {
    private int rows;
    private int columns;
    public int[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            throw new IllegalArgumentException("Матрицы должны быть одинакового размера! ");
        }
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        if (this.columns != other.rows) {
            throw new IllegalArgumentException("Матрицы должны быть одинакового размера! ");
        }
        Matrix result = new Matrix(this.rows, other.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                int sum = 0;
                for (int k = 0; k < this.columns; k++) {
                    sum += this.data[i][k] * other.data[k][j];
                }
                result.data[i][j] = sum;

            }
        }

        return result;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sb.append(data[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

////////////////////////////////////////////////////////////////
//Задача 17
class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}

class Player {
    private String name;
    private int health;
    private Weapon weapon;

    public Player(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void attack(Enemy enemy) {
        System.out.println(name + " атаковал " + enemy.getName() + " используя " + weapon.getName() + " и нанёс " + weapon.getDamage() + " урона");
        enemy.takeDamage(weapon.getDamage());
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }
}

class Enemy {
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attack(Player player) {
        Random random = new Random();
        int damage = random.nextInt(10) + 1; // Урон врага от 1 до 10
        System.out.println(name + " атаковал " + player.getName() + " и нанёс " + damage + " урона");
        player.takeDamage(damage);
    }
}

////////////////////////////////////////////////////////////////
//Задача 18
class Product1 {
    private String name;
    private double price;
    private int quantity;

    public Product1(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
class Customer {
    private String name;
    private String address;
    private String email;

    public Customer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
class Order {
    private int orderId;
    private Customer customer;
    private LocalDateTime orderDate;
    private List<Product> products;

    private static int nextOrderId = 1;

    public Order(Customer customer) {
        this.orderId = nextOrderId++;
        this.customer = customer;
        this.orderDate = LocalDateTime.now();
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }
}



 class OrderManagementSystem {
    private List<Order> orders;

    // Конструктор
    public OrderManagementSystem() {
        this.orders = new ArrayList<>();
    }

    // Метод для добавления нового заказа
    public void placeOrder(Customer customer, List<Product> products) {
        Order order = new Order(customer);
        for (Product product : products) {
            order.addProduct(product);
        }
        orders.add(order);
        System.out.println("ID заказа: " + order.getOrderId());
    }

    // Метод для вывода истории заказов
    public void printOrderHistory() {
        System.out.println("История заказов: ");
        for (Order order : orders) {
            System.out.println("ID заказа: " + order.getOrderId());
            System.out.println("Дата заказа: " + order.getOrderDate());
            System.out.println("Получатель: " + order.getCustomer().getName());
            System.out.println("Товары:");

            for (Product product : order.getProducts()) {
                System.out.println("- " + product.getName() + " - Кол-во: " + product.getQuantity() + " - Цена за шт.: $" + product.getPrice());
            }

            System.out.println("Всего: $" + order.calculateTotal());
            System.out.println();
        }

        }
     public double calculateTotalRevenue() {
         double totalRevenue = 0;
         for (Order order : orders) {
             totalRevenue += order.calculateTotal();
         }
         return totalRevenue;
     }
    }

////////////////////////////////////////////////////////////////
//Задача 19
class Device{
    private String brand;
    boolean isOn;
    public Device(String brand){
        this.brand = brand;
        this.isOn = false;
    }

    public void turnOn(){
        if (!isOn){
            System.out.println("Устройство '" + brand + "' включено ");
        }
        else {
            System.out.println("Устройство '" + brand + "' уже включено ");

        }
    }
    public void turnOff(){
        if (isOn){
            System.out.println("Устройство '" + brand + "' выключено ");
        }
        else {
            System.out.println("Устройство '" + brand + "' уже выключено ");

        }
    }
    public String getBrand(){
        return brand;
    }
}
class Smartphone extends Device{
    public Smartphone(String brand){
        super(brand);
    }
    public void turnOnTheFlashlight(){
        if (super.isOn) {
            System.out.println("Фонарик включён на устройстве " + super.getBrand());
        } else {
            System.out.println("Устройство выключено. Сначала включите его.");
        }
    }
}
class Laptop extends Device {


    public Laptop(String brand) {
        super(brand);
    }

    public void sendEmail(String message) {
        if (super.isOn) {
            System.out.println("Сообщение: " + message);
        } else {
            System.out.println(super.getBrand() + " Устройство выключено. Сначала включите его.");
        }
    }
}


////////////////////////////////////////////////////////////////
//Задача 20





public class Main
{
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////
        //Задача 1
        System.out.println("/////////////////////////////////Задача 2");
        Person Ivan = new Person("Иван", 18, "Мужской");

        Ivan.DisplayInfo();
        Ivan.IncreaseAge(2);
        Ivan.ChangeName("Иван2");
        Ivan.DisplayInfo();

        ////////////////////////////////////////////////////////////////
        //Задача 3
        System.out.println("/////////////////////////////////Задача 3");
        Animal[] animals = {new Dog(), new Cat(), new Cow()};
        for (Animal i : animals) {
            i.makeSound();
        }

        ////////////////////////////////////////////////////////////////
        //Задача 4
        System.out.println("/////////////////////////////////Задача 4");
        Transport car = new Car();
        car.move();
        Transport bike = new Bike();
        bike.move();

        ////////////////////////////////////////////////////////////////
        //Задача 5
        System.out.println("/////////////////////////////////Задача 5");
        Library library = new Library();
        library.addBook(new Book("Анна Каренина", "Лев Толстой", 1873));
        library.addBook(new Book("Собор Парижской Богоматери", "Виктор Гюго", 1831));

        List<Book> booksByJohnDoe = library.findBooksByAuthor("Лев Толстой");
        System.out.println("Книги по автору: ");
        for (Book book : booksByJohnDoe) {
            System.out.println(book.getTitle() + " (" + book.getYear() + ")");
        }

        List<Book> booksPublishedIn2020 = library.findBooksByYear(1831);
        System.out.println("\nКниги изданные в этом году: ");
        for (Book book : booksPublishedIn2020) {
            System.out.println(book.getTitle() + " " + book.getAuthor());
        }
        ////////////////////////////////////////////////////////////////
        //Задача 6
        System.out.println("/////////////////////////////////Задача 6");
        BankAccount account = new BankAccount("9999", 9999);
        account.deposit(11.5);
        System.out.println("Current balance: " + account.getBalance());
        account.withdrawFunds(500);
        System.out.println("Current balance: " + account.getBalance());
        account.withdrawFunds(12200);

        ////////////////////////////////////////////////////////////////
        //Задача 7
        System.out.println("/////////////////////////////////Задача 7");
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println("Number: " + Counter.getCount());

        ////////////////////////////////////////////////////////////////
        //Задача 8
        System.out.println("/////////////////////////////////Задача 8");
        Shape circle = new Circle(3);
        System.out.println("Площадь круга: " + circle.getArea());
        Shape rectangle = new Rectangle(5, 8);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());

        ////////////////////////////////////////////////////////////////
        //Задача 9
        System.out.println("/////////////////////////////////Задача 9");
        Animals fish = new Fish();
        fish.move();
        Animals bird = new Bird();
        bird.move();
        Animals dog = new Dog2();
        dog.move();

        ////////////////////////////////////////////////////////////////
        //Задача 10
        System.out.println("/////////////////////////////////Задача 10");
        University university = new University();
        university.addStudent(new Student("Илон", "3ИСИП-321", 89));
        university.addStudent(new Student("Маск", "4ИСИП-321", 99));
        System.out.println("Список студентов: ");
        university.students.forEach(System.out::println);
        university.sortByStudentName();
        university.students.forEach(System.out::println);
        List<Student> highPerformingStudents = university.filterStudentsByGrade(91);
        highPerformingStudents.forEach(System.out::println);

        ////////////////////////////////////////////////////////////////
        //Задача 11
        System.out.println("/////////////////////////////////Задача 11");
        Store store = new Store();
        store.addProduct(new Product("Яблоко", 50, 7));
        System.out.println(store);
        store.findProductByName("Яблоко");
        store.deleteProduct("Яблоко");
        System.out.println(store);

        ////////////////////////////////////////////////////////////////
        //Задача 12
        System.out.println("/////////////////////////////////Задача 12");
        PaymentSystem card = new CreditCard();
        PaymentSystem paypal = new PayPal();
        card.pay(100);
        paypal.pay(200);
        card.refund(50);

        ////////////////////////////////////////////////////////////////
        //Задача 13
        System.out.println("/////////////////////////////////Задача 13");

        int id1 = UniqueID.generateID();
        int id2 = UniqueID.generateID();
        System.out.println("ID's: " + id1 + ", " + id2);

        ////////////////////////////////////////////////////////////////
        //Задача 14
        System.out.println("/////////////////////////////////Задача 14");

        Point p1 = new Point(1, 4);
        Point p2 = new Point(3, 5);
        Rectangle2 rectangle2 = new Rectangle2(p1, p2);
        System.out.println("Площадь прямоугольника: " + rectangle2.getArea());

        ////////////////////////////////////////////////////////////////
        //Задача 15
        System.out.println("/////////////////////////////////Задача 15");

        ComplexNumber num1 = new ComplexNumber(3, 2);
        ComplexNumber num2 = new ComplexNumber(1, 7);
        ComplexNumber sum = num1.add(num2);
        System.out.println("Сумма: " + sum.real + " + " + sum.imaginary + "i");

        ////////////////////////////////////////////////////////////////
        //Задача 16
        System.out.println("/////////////////////////////////Задача 16");

        Matrix matrix1 = new Matrix(2, 2);
        matrix1.data[0][0] = 1;
        matrix1.data[0][1] = 2;
        matrix1.data[1][0] = 3;
        matrix1.data[1][1] = 4;

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.data[0][0] = 5;
        matrix2.data[0][1] = 6;
        matrix2.data[1][0] = 7;
        matrix2.data[1][1] = 8;

        Matrix sum1 = matrix1.add(matrix2);
        System.out.println("Сумма матриц: " + sum1);

        Matrix product = matrix1.multiply(matrix2);
        System.out.println("Умножение матриц: " + product);

        ////////////////////////////////////////////////////////////////
        //Задача 17
        System.out.println("/////////////////////////////////Задача 17");
        Weapon sword = new Weapon("Меч", 5);
        Player player = new Player("Мечник", 30, sword);
        Enemy enemy = new Enemy("Гоблин", 15);

        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy);
            if (enemy.isAlive()) {
                enemy.attack(player);
            }
        }

        if (player.isAlive()) {
            System.out.println(player.getName() + " убил " + enemy.getName());
        } else {
            System.out.println(player.getName() + " был убит " + enemy.getName());
        }


        ////////////////////////////////////////////////////////////////
        //Задача 18

        Customer customer1 = new Customer("Иван Иваныч", "Кронштадский бульвар 37", "ivan@mail.ru");
        Customer customer2 = new Customer("Сан Саныч", "Кронштадский бульвар 38", "san@mail.ru");

        Product product1 = new Product("Ноутбук", 999.99, 1);
        Product product2 = new Product("Мышка", 9.99, 2);
        Product product3 = new Product("Клавиатура", 49.99, 1);

        OrderManagementSystem system = new OrderManagementSystem();
        system.placeOrder(customer1, List.of(product1, product2));
        system.placeOrder(customer2, List.of(product2, product3));

        // Вывод истории заказов
        system.printOrderHistory();

        // Вычисление общей выручки
        System.out.println("Total Revenue: $" + system.calculateTotalRevenue());

        ////////////////////////////////////////////////////////////////
        //Задача 19
        System.out.println("/////////////////////////////////Задача 19");

        Smartphone iphone = new Smartphone("iPhone");
        Laptop laptop = new Laptop("Samsung");

        iphone.turnOn();
        laptop.turnOn();

        iphone.turnOnTheFlashlight();
        laptop.sendEmail("Hello world");

        iphone.turnOff();
        laptop.turnOff();

        ////////////////////////////////////////////////////////////////
        //Задача 20


    }

}
	

