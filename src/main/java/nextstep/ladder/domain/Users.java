package nextstep.ladder.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author han
 */
public class Users {
    private static final String COMMA = ",";

    private final List<User> users;

    public Users(List<User> users) {
        this.users = users;
    }

    public static Users createByString(String users) {
        return new Users(Arrays.stream(users.split(COMMA))
            .map(user -> new User(Name.of(user)))
            .collect(Collectors.toList()));
    }

    public int getIndexBy(User user) {
        if (!users.contains(user)) {
            throw new IllegalArgumentException();
        }
        return users.indexOf(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public int width() {
        return users.size();
    }
}
