package view.page;

import service.UserService;
import view.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterForm implements Page {
    private UserService userService;
    private View view;
    private JLabel title;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPanel mainPanel;
    private JPanel usernamePanel;
    private JPanel passwordPanel;
    private JButton registerButton;
    private JLabel loginButton;

    public RegisterForm(UserService userService) {
        this.userService = userService;
        this.createUIComponents();
        this.createActionListeners();

    }

    private void createUIComponents() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        title = new JLabel("Register");
        title.setFont(new Font("Consolas", Font.BOLD, 20));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(title, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 0, 20, 0), 1, 0));

        usernamePanel = new JPanel();
        usernamePanel.setLayout(new GridBagLayout());
        usernameLabel = new JLabel("Username");
        usernamePanel.add(usernameLabel);
        usernameField = new JTextField(20);
        usernamePanel.add(usernameField);
        mainPanel.add(usernamePanel, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 20, 0, 20), 1, 0));

        passwordPanel = new JPanel();
        passwordPanel.setLayout(new GridBagLayout());
        passwordLabel = new JLabel("Password");
        passwordPanel.add(passwordLabel);
        passwordField = new JPasswordField(20);
        passwordPanel.add(passwordField);
        mainPanel.add(passwordPanel, new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 20, 0, 20), 1, 0));

        registerButton = new JButton("Register");
        mainPanel.add(registerButton, new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(30, 20, 30, 20), 1, 0));

        loginButton = new JLabel("Login");
        loginButton.setFont(new Font("Consolas", Font.ITALIC, 15));
        loginButton.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(loginButton, new GridBagConstraints(0, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 20, 20, 20), 1, 0));
    }

    private void createActionListeners() {
        registerButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            try {
                if (userService.register(username, password)) {
                    JOptionPane.showMessageDialog(mainPanel, "Register Successfully");
                    this.view.route("login");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(mainPanel, ex.getMessage());
            }
        });

        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                RegisterForm.this.view.route("login");
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public Page setView(View view) {
        this.view = view;
        return this;
    }
}
