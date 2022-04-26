package view;

import view.page.Page;

import javax.swing.*;

public class View {
    private JFrame frame;
    private Route route;

    public View( Route route) {
        this.route = route;
        this.initComponent();
    }

    private void initComponent() {
        frame = new JFrame("Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void start() {
        this.route("login");
    }

    public void route(String route) {
        JPanel page = this.route.getPage(route).getMainPanel();
        frame.setContentPane(page);
        frame.pack();
    }

    public void addPage(String route, Page page) {
        this.route.addPage(route, page.setView(this));
    }

}
