public class UserService {
    public User getUserById(String id) {
        return database.fetch(id);
    }
}
