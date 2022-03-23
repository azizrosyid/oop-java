/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboidcalculator;

import calculateareavolume.Balok;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author azizrosyid
 */
public class ProgramCuboidCalculator implements ActionListener {

    JFrame frame;
    JLabel titleLabel;
    JLabel lengthLabel;
    JTextField lengthText;
    JLabel widthLabel;
    JTextField widthText;
    JLabel heightLabel;
    JTextField heightText;
    JLabel resultLabel;
    JTextArea resultText;
    JButton submitButton;
    JButton resetButton;
    private final Balok calculator;

    ProgramCuboidCalculator(Balok calculator) {
        this.calculator = calculator;
    }

    void start() {
        frame = new JFrame("Cuboid Calculator");
        frame.setSize(500, 500);
        frame.setLayout(null);

        titleLabel = new JLabel("Cuboid Calculator");
        titleLabel.setBounds(180, 0, 150, 20);
        frame.add(titleLabel);

        lengthLabel = new JLabel("Length");
        lengthText = new JTextField(10);
        JPanel inputLength = new JPanel();
        inputLength.setLayout(new FlowLayout(10, 20, 0));
        inputLength.add(lengthLabel);
        inputLength.add(lengthText);
        frame.add(inputLength);
        inputLength.setBounds(10, 50, 250, 50);

        widthLabel = new JLabel("Width");
        widthText = new JTextField(10);
        JPanel inputWidth = new JPanel();
        inputWidth.setLayout(new FlowLayout(10, 20, 0));

        inputWidth.add(widthLabel);
        inputWidth.add(widthText);
        frame.add(inputWidth);
        inputWidth.setBounds(10, 100, 200, 50);

        heightLabel = new JLabel("Height");
        heightText = new JTextField(10);
        JPanel inputHeight = new JPanel();
        inputHeight.setLayout(new FlowLayout(10, 20, 0));

        inputHeight.add(heightLabel);
        inputHeight.add(heightText);
        frame.add(inputHeight);
        inputHeight.setBounds(10, 150, 200, 50);

        resultLabel = new JLabel("Result");
        resultLabel.setBounds(200, 200, 150, 20);
        frame.add(resultLabel);

        resultText = new JTextArea(10, 10);
        resultText.setBounds(100, 225, 250, 100);
        frame.add(resultText);

        JPanel buttonContainer = new JPanel();
        submitButton = new JButton("Count");
        submitButton.addActionListener(this);
        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        buttonContainer.add(submitButton);
        buttonContainer.add(resetButton);
        buttonContainer.setBounds(125, 400, 200, 50);
        frame.add(buttonContainer);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(submitButton)) {
            try {
                int length = parseInt(lengthText.getText());
                int width = parseInt(widthText.getText());
                int height = parseInt(heightText.getText());

                String dataResult = "Square : " + this.calculator.calculateArea(length, width) + "\n"
                        + "Square Circumference : " + this.calculator.calculatePerimeter(length, width) + "\n"
                        + "Cuboid Volume : " + this.calculator.calculateVolume(length, width, height) + "\n"
                        + "Cuboid Surface Area : " + this.calculator.calculateSurfaceArea(length, width, height);

                resultText.setText(dataResult);
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(frame, "Format Tidak Sesuai",
                        "Peringatan", JOptionPane.WARNING_MESSAGE);
            }

        } else if (e.getSource().equals(resetButton)) {
            lengthText.setText("");
            widthText.setText("");
            heightText.setText("");
            resultText.setText("");
        }
    }

}
