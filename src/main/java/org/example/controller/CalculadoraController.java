package org.example.controller;

import org.example.model.CalculadoraModel;
import org.example.view.CalculadoraView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculadoraController {
    private CalculadoraModel model;
    private CalculadoraView view;

    private String operator = "";
    private double num1 = 0;
    private boolean isOperatorClicked = false;

    public CalculadoraController(CalculadoraModel model, CalculadoraView view) {
        this.model = model;
        this.view = view;

        // Añadir listeners para los botones de los números
        addNumberActionListener(view.getButton0(), "0");
        addNumberActionListener(view.getButton1(), "1");
        addNumberActionListener(view.getButton2(), "2");
        addNumberActionListener(view.getButton3(), "3");
        addNumberActionListener(view.getButton4(), "4");
        addNumberActionListener(view.getButton5(), "5");
        addNumberActionListener(view.getButton6(), "6");
        addNumberActionListener(view.getButton7(), "7");
        addNumberActionListener(view.getButton8(), "8");
        addNumberActionListener(view.getButton9(), "9");

        // Añadir listeners para los botones de los operaciones
        addOperatorActionListener(view.getButtonAdd(), "+");
        addOperatorActionListener(view.getButtonSubtract(), "-");
        addOperatorActionListener(view.getButtonMultiply(), "*");
        addOperatorActionListener(view.getButtonDivide(), "/");

        // Boton CE
        view.getButtonCe().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTextField1().setText("");
            }
        });

        // Boton C
        view.getButtonC().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTextField1().setText("");
                num1 = 0;
                operator = "";
                isOperatorClicked = false;
            }
        });

        // Boton Igual o Equal "="
        view.getButtonEqual().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num2 = Double.parseDouble(view.getTextField1().getText());
                double result = 0; // se le asigna el resultado de la operación elegida.
                switch (operator) {
                    case "+" -> result = model.add(num1, num2);
                    case "-" -> result = model.subtract(num1, num2);
                    case "*" -> result = model.multiply(num1, num2);
                    case "/" -> result = model.divide(num1, num2);
                }
                view.getTextField1().setText(String.valueOf(result));
                isOperatorClicked = false;
            }
        });
    }

    private void addNumberActionListener(JButton button, String value) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isOperatorClicked) {
                    view.getTextField1().setText(value);
                    isOperatorClicked = false;
                } else {
                    view.getTextField1().setText(view.getTextField1().getText() + value);
                }
            }
        });
    }


    private void addOperatorActionListener(JButton button, String op) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = op;
                num1 = Double.parseDouble(view.getTextField1().getText());
                isOperatorClicked = true;
            }
        });
    }

    public static void main(String[] args) {
        CalculadoraModel model = new CalculadoraModel();
        CalculadoraView view = new CalculadoraView();
        new CalculadoraController(model, view);
    }
}
