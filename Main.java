public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John", "Doe", 6, 2, 123, 20.0);
        System.out.println(emp.toString());
        System.out.println("Pay for the week: $" + emp.payDay(45));
        System.out.println("New hourly pay after raise: $" + emp.getRaise());
    }
}