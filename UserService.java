public class UserService {
    public User getuserById(String id) {
        return database.fetch(id);
    }
}
