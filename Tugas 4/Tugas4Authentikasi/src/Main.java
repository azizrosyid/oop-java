import repository.UserRepository;
import repository.UserRepositoryImpl;
import service.UserService;
import service.UserServiceImpl;
import util.DatabaseUtil;
import view.*;
import view.page.HomePage;
import view.page.LoginForm;
import view.page.RegisterForm;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection dbConnection = DatabaseUtil.getConnection();
        UserRepository userRepository = new UserRepositoryImpl(dbConnection);
        UserService userService = new UserServiceImpl(userRepository);

        Route route = new Route();
        View view = new View(route);
        view.addPage("login", new LoginForm(userService));
        view.addPage("register", new RegisterForm(userService));
        view.addPage("home", new HomePage());

        view.start();

    }
}
