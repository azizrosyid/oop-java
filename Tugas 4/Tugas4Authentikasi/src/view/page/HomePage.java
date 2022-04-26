package view.page;

import view.View;

import javax.swing.*;
import java.awt.*;

public class HomePage implements Page {
    private View view;
    private JPanel mainPanel;
    private JLabel title;

    public HomePage() {
        this.createUIComponents();
    }

    private void createUIComponents() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        title = new JLabel("Welcome to Application");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setHorizontalAlignment(SwingConstants.CENTER);

        mainPanel.add(title, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
    }

    @Override
    public JPanel getMainPanel() {
        return mainPanel;
    }

    @Override
    public Page setView(View view) {
        this.view = view;
        return this;
    }
}
