package org.example.view;

import javax.swing.*;

public class CalculadoraView {
    private JButton Button8;
    private JButton Button9;
    private JButton buttonDivide;
    private JButton ButtonCe;
    private JButton Button4;
    private JButton Button5;
    private JButton Button6;
    private JButton ButtonC;
    private JButton Button2;
    private JButton Button1;
    private JButton Button3;
    private JButton buttonSubtract;
    private JButton ButtonEqual;
    private JButton Button0;
    private JButton buttonPoint;
    private JButton buttonAdd;
    private JTextField textField1;
    private JButton Button7;
    private JButton buttonNull;
    private JPanel panel1;
    private JButton ButtonMultiply;

    public CalculadoraView() {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(panel1);
        frame.setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JButton getButton8() {
        return Button8;
    }

    public JButton getButton9() {
        return Button9;
    }

    public JButton getButtonDivide() {
        return buttonDivide;
    }

    public JButton getButtonCe() {
        return ButtonCe;
    }

    public JButton getButton4() {
        return Button4;
    }

    public JButton getButton5() {
        return Button5;
    }

    public JButton getButton6() {
        return Button6;
    }

    public JButton getButtonC() {
        return ButtonC;
    }

    public JButton getButton2() {
        return Button2;
    }

    public JButton getButton1() {
        return Button1;
    }

    public JButton getButton3() {
        return Button3;
    }

    public JButton getButtonSubtract() {
        return buttonSubtract;
    }

    public JButton getButtonEqual() {
        return ButtonEqual;
    }

    public JButton getButton0() {
        return Button0;
    }

    public JButton getButtonPoint() {
        return buttonPoint;
    }

    public JButton getButtonAdd() {
        return buttonAdd;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JButton getButton7() {
        return Button7;
    }

    public JButton getButtonNull() {
        return buttonNull;
    }
    public JButton getButtonMultiply(){
        return ButtonMultiply;
    }

    public JPanel getPanel1() {
        return panel1;
    }
}
