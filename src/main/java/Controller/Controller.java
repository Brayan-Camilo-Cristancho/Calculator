package Controller;

import Model.modelConector;
import View.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public final class Controller implements ActionListener {

    private final Calculator calculator;
    private String acumulator;
    private modelConector mconector;
    private String op;

    public Controller() {
        mconector = new modelConector();
        acumulator = "";
        this.calculator = new Calculator();
        listeners();
    }

    public void listeners() {
        this.calculator.getJbtnsum().addActionListener(this);
        this.calculator.getJbtnsub().addActionListener(this);
        this.calculator.getJbtnmul().addActionListener(this);
        this.calculator.getJbtndiv().addActionListener(this);
        this.calculator.getJbtnequ().addActionListener(this);
        this.calculator.getJbtn0().addActionListener(this);
        this.calculator.getJbtn1().addActionListener(this);
        this.calculator.getJbtn2().addActionListener(this);
        this.calculator.getJbtn3().addActionListener(this);
        this.calculator.getJbtn4().addActionListener(this);
        this.calculator.getJbtn5().addActionListener(this);
        this.calculator.getJbtn6().addActionListener(this);
        this.calculator.getJbtn7().addActionListener(this);
        this.calculator.getJbtn8().addActionListener(this);
        this.calculator.getJbtn9().addActionListener(this);
        this.calculator.getJbtnpoint().addActionListener(this);
        this.calculator.getJbtnclear().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("addition")) {
            this.op = "add";
            operation(op);
        }

        if (ae.getActionCommand().equals("substract")) {
            this.op = "sub";
            operation(op);
        }

        if (ae.getActionCommand().equals("multiply")) {
            this.op = "mul";
            operation(op);
        }

        if (ae.getActionCommand().equals("division")) {
            this.op = "div";
            operation(op);
        }

        if (ae.getActionCommand().equals("equals")) {
            if(calculator.getJtx().getText().isEmpty()){
                calculator.getJtx().setText(calculator.getJtxacu().getText());
            }
            operation(this.op);
            
        }
        
        if (ae.getActionCommand().equals("clear")) {
            acumulator = "";
            calculator.getJtxacu().setText("");
            calculator.getJtx().setText("");
            calculator.getJtxop().setText("");
        }


        if (ae.getActionCommand().equals("0")) {
            setValues("0");
        }

        if (ae.getActionCommand().equals("1")) {
            setValues("1");
        }

        if (ae.getActionCommand().equals("2")) {
            setValues("2");
        }

        if (ae.getActionCommand().equals("3")) {
            setValues("3");
        }

        if (ae.getActionCommand().equals("4")) {
            setValues("4");
        }

        if (ae.getActionCommand().equals("5")) {
            setValues("5");
        }

        if (ae.getActionCommand().equals("6")) {
            setValues("6");
        }

        if (ae.getActionCommand().equals("7")) {
            setValues("7");
        }

        if (ae.getActionCommand().equals("8")) {
            setValues("8");
        }

        if (ae.getActionCommand().equals("9")) {
            setValues("9");
        }
        
        if (ae.getActionCommand().equals("point")) {
            if(!calculator.getJtx().getText().isEmpty()){
                setValues(".");
            }
        }

    }

    public void setValues(String value) {

        if (acumulator.isEmpty()) {
            this.acumulator = value;
        } else {
            this.acumulator += value;
        }

        this.calculator.getJtx().setText(this.acumulator);
    }

    public void operation(String option) {
        try {

            if (!calculator.getJtxacu().getText().isEmpty() && !calculator.getJtx().getText().isEmpty()) {
                double value1 = Double.parseDouble(calculator.getJtxacu().getText());
                double value2 = Double.parseDouble(calculator.getJtx().getText());
                calculator.getJtx().setText("");
                if (option.equals("add")) {
                    calculator.getJtxacu().setText(String.valueOf(mconector.getiOperations().addition(value1, value2)));
                    calculator.getJtxop().setText("+");
                } else if (option.equals("sub")) {
                    calculator.getJtxacu().setText(String.valueOf(mconector.getiOperations().subtract(value1, value2)));
                    calculator.getJtxop().setText("-");
                } else if (option.equals("mul")) {
                    calculator.getJtxacu().setText(String.valueOf(mconector.getiOperations().multiply(value1, value2)));
                    calculator.getJtxop().setText("*");
                } else if (option.equals("div")) {
                    calculator.getJtxacu().setText(String.valueOf(mconector.getiOperations().division(value1, value2)));
                    calculator.getJtxop().setText("/");
                }
                acumulator = "";
            } else if (!calculator.getJtx().getText().isEmpty()) {
                calculator.getJtxop().setText("+");
                calculator.getJtxacu().setText(calculator.getJtx().getText());
                calculator.getJtx().setText("");
                acumulator = "";
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error aritmetico");
        }
    }

}
