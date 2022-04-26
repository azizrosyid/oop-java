package service;

import entity.User;
import repository.UserRepository;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean login(String username, String password) {
        User user = this.userRepository.getUser(username);
        if (user == null) {
            throw new IllegalArgumentException("User with username " + username + " does not exist!");
        }
        if (!this.userRepository.checkPassword(user, password)) {
            throw new IllegalArgumentException("Invalid password!");
        }
        return true;
    }

    @Override
    public boolean register(String username, String password) {
        try {
            String encryptedPassword = this.userRepository.encryptPassword(password);
            this.userRepository.addUser(username, encryptedPassword);
            return true;
        } catch (Exception e) {
            if (e.getMessage().contains("Duplicate entry")) {
                throw new RuntimeException("User already exists");
            }
            throw new RuntimeException(e);
        }
    }
}
