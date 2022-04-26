package repository;

import entity.User;

public interface UserRepository {
    public User getUser(String username);

    public boolean addUser(String username, String password);

    String encryptPassword(String password);

    boolean checkPassword(User user, String password);
}
