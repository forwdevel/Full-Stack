import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {

    String left = "";
    String right = "";
    String showing = "";
    String result = "";
    String oper = "";
    int cnt = 0;

    String[] btnName = {
            "%", "CE", "C", "<-",
            "1/x", "x*x", "sqrt(x)", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "+/-", "0", ".", "="
    };

    JButton btn[] = new JButton[btnName.length];

    JPanel showView = new JPanel();
    JPanel btnView = new JPanel();

    JLabel showLa = new JLabel("0", JLabel.RIGHT);

    // Action Listener + key Listener
    Calculator() {
        showLa.setFont(new Font("Consolas", Font.BOLD, 30));
        showLa.setBackground(Color.white);
        showLa.setOpaque(true); // Opacity

        btnView.setLayout(new GridLayout(6, 4, 2, 2));

        // Create and Set the Button
        for (int i = 0; i < btnName.length; i++) {
            btn[i] = new JButton(btnName[i]);
            btn[i].setFont(new Font("Consolas", Font.BOLD, 16));

            // If btn value is number,
            if (i == 8 || i == 9 || i == 10 || i == 12 || i == 13 || i == 14 || i == 16 || i == 17 || i == 18
                    || i == 21) {
                btn[i].setForeground(Color.black);
                btn[i].setBackground(Color.white);
            }
            // If btn value is not number,
            else {
                btn[i].setForeground(Color.white);
                btn[i].setBackground(Color.gray);
            }
        }

        ActionListener Listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                String input = b.getText();

                // Result
                if (input.equals("=")) {
                    // If entered only operator or anything,
                    if (cnt == 0) {
                        showing = "";
                        showLa.setText("0");
                    }
                    // If did not entered the operator and did entered the only numbers
                    else if (oper.equals("")) {
                        showing = "";
                        showLa.setText(left);
                    }
                    // If right is empty
                    else if (right == "") {
                        showing = "";
                        showLa.setText(left);
                    }
                    // If left, right and oper are not empty
                    else {
                        if (oper.equals("+")) {
                            result = "" + (Double.parseDouble(left) + Double.parseDouble(right));
                        }
                        if (oper.equals("-")) {
                            result = "" + (Double.parseDouble(left) - Double.parseDouble(right));
                        }
                        if (oper.equals("/")) {
                            result = "" + (Double.parseDouble(left) / Double.parseDouble(right));
                        }
                        if (oper.equals("*")) {
                            result = "" + (Double.parseDouble(left) * Double.parseDouble(right));
                        }
                        // Print the result
                        if (result.isEmpty()) {
                            showLa.setText("0");
                        }
                        showLa.setText(result);

                        // Initalise the values
                        showing = "";
                        left = "";
                        right = "";
                        oper = "";
                    }

                }
                // Entered the operator
                else if (input == "+" || input == "-" || input == "*" || input == "/") {
                    // If oper is empty,
                    if (oper.isEmpty()) {
                        if (input.equals("+")) {
                            // Save operator
                            oper = "+";
                            // Change showing
                            showing = showing + oper;
                            // Print
                            showLa.setText(showing);
                        }
                        if (input.equals("-")) {
                            // Save operator
                            oper = "-";
                            // Change showing
                            showing = showing + oper;
                            // Print
                            showLa.setText(showing);
                        }
                        if (input.equals("/")) {
                            // Save operator
                            oper = "/";
                            // Change showing
                            showing = showing + oper;
                            // Print
                            showLa.setText(showing);
                        }
                        if (input.equals("*")) {
                            // Save operator
                            oper = "*";
                            // Change showing
                            showing = showing + oper;
                            // Print
                            showLa.setText(showing);
                        }
                    }
                }
                // Entered the number
                else if (Integer.parseInt(input) >= 0 && Integer.parseInt(input) <= 9) {
                    // If the operator was already uesd,
                    if (!oper.isEmpty()) {
                        // Change the right value
                        right = right + input;
                        // Change the showing value
                        showing = left + " " + oper + " " + right;
                        // Change the showLa value
                        showLa.setText(showing);
                        // The value saved successfuly
                        cnt++;
                    } else {
                        // Change the left value
                        left = left + input;
                        // Change the showing value
                        showing = left;
                        // Change the showLa value
                        showLa.setText(showing);
                        // The value saved successfuly
                        cnt++;
                    }
                }
                // Entered C or CE
                else if (input == "C" || input == "CE") {
                    // Print the result
                    showLa.setText("Successfuly Works");
                    // Initalise the values
                    showing = "";
                    left = "";
                    right = "";
                    oper = "";
                }
            }

        };

        for (int i = 0; i < btnName.length; i++) {
            btn[i].addActionListener(Listener);
            btnView.add(btn[i]);
        }

        // Set Layout
        showView.setLayout(new BorderLayout());
        add(showLa, BorderLayout.CENTER);
        add(btnView, BorderLayout.SOUTH);

        setBounds(100, 100, 300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}