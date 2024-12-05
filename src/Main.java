import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John", "Doe", 25, "USA"));
        users.add(new User(2, "Jane", "Smith", 30, "Canada"));
        users.add(new User(3, "Alice", "Johnson", 22, "USA"));
        users.add(new User(4, "Bob", "Brown", 10, "UK"));
        users.add(new User(5, "Charlie", "Davis", 5, "USA"));

        UserService userService = new UserService();

        System.out.println("Sorted by last name:");
        userService.sortByLastName(users).forEach(System.out::println);

        System.out.println("Sorted by age:");
        userService.sortByAge(users).forEach(System.out::println);

        System.out.println("All users age > 7: " + userService.allUsersAgeGreaterThan7(users));

        System.out.println("Average age: " + userService.averageAge(users));

        System.out.println("Distinct countries count: " + userService.countDistinctCountries(users));
    }
}
