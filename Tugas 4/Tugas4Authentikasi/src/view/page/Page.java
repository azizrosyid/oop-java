package view.page;

import view.View;

import javax.swing.*;

public interface Page {
    public JPanel getMainPanel();
    public Page setView(View view);
}
