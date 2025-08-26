import java.util.*;
import java.util.stream.*;


class Student {
    private String name;
    private String grade;
    public Student(String name, String grade) { this.name = name; this.grade = grade; }
    public String getName() { return name; }
    public String getGrade() { return grade; }
}

class Order {
    private String customer;
    private double total;
    public Order(String customer, double total) { this.customer = customer; this.total = total; }
    public String getCustomer() { return customer; }
    public double getTotal() { return total; }
}

class Employee {
    private String department;
    private double salary;
    public Employee(String department, double salary) { this.department = department; this.salary = salary; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

class Book {
    private String genre;
    private int pages;
    public Book(String genre, int pages) { this.genre = genre; this.pages = pages; }
    public String getGenre() { return genre; }
    public int getPages() { return pages; }
}

public class CollectorsExamples {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Alice", "A"),
            new Student("Bob", "B"),
            new Student("Charlie", "A"),
            new Student("David", "C")
        );

        Map<String, List<String>> studentsByGrade = students.stream()
            .collect(Collectors.groupingBy(Student::getGrade,
                     Collectors.mapping(Student::getName, Collectors.toList())));

        System.out.println("Students grouped by grade: " + studentsByGrade);

        String paragraph = "Java is great and Java is powerful";
        Map<String, Long> wordCount = Arrays.stream(paragraph.split(" "))
            .collect(Collectors.toMap(word -> word, w -> 1L, Long::sum));

        System.out.println("Word frequency: " + wordCount);


               List<Order> orders = Arrays.asList(
            new Order("Alice", 120.50),
            new Order("Bob", 80.00),
            new Order("Alice", 200.00),
            new Order("Bob", 50.00)
        );

        Map<String, Double> revenueByCustomer = orders.stream()
            .collect(Collectors.groupingBy(Order::getCustomer,
                     Collectors.summingDouble(Order::getTotal)));

        System.out.println("Revenue by customer: " + revenueByCustomer);


               List<Employee> employees = Arrays.asList(
            new Employee("HR", 50000),
            new Employee("HR", 60000),
            new Employee("IT", 75000),
            new Employee("IT", 90000),
            new Employee("Finance", 85000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment,
                     Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average Salary by Department: " + avgSalaryByDept);

        List<Book> books = Arrays.asList(
            new Book("Fiction", 320),
            new Book("Fiction", 250),
            new Book("Science", 400),
            new Book("Science", 500),
            new Book("History", 300)
        );

        Map<String, IntSummaryStatistics> bookStatsByGenre = books.stream()
            .collect(Collectors.groupingBy(Book::getGenre,
                     Collectors.summarizingInt(Book::getPages)));

        System.out.println("Book statistics by genre: " + bookStatsByGenre);
    }
}
