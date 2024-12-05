import java.util.*;
import java.util.stream.Collectors;

public class UserService {

    public List<User> sortByLastName(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getLastName))
                .collect(Collectors.toList());
    }

    public List<User> sortByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
    }

    public boolean allUsersAgeGreaterThan7(List<User> users) {
        return users.stream()
                .allMatch(user -> user.getAge() > 7);
    }

    public double averageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0.0);
    }

    public long countDistinctCountries(List<User> users) {
        return users.stream()
                .map(User::getCountry)
                .distinct()
                .count();
    }
}
