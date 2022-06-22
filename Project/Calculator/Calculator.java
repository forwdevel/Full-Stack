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
            "reverse", "x*x", "sqrt(x)", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "+/-", "0", ".", "="
    };

    JButton btn[] = new JButton[btnName.length];

    JPanel showView = new JPanel();
    JPanel btnView = new JPanel();

    JLabel showLa = new JLabel("", JLabel.RIGHT);
    JLabel onlyNum = new JLabel("0", JLabel.RIGHT);

    // Action Listener + key Listener
    Calculator() {
        showLa.setFont(new Font("Consolas", Font.BOLD, 16));
        showLa.setBackground(Color.white);
        showLa.setOpaque(true); // Opacity

        onlyNum.setFont(new Font("Consolas", Font.BOLD, 30));
        onlyNum.setBackground(Color.white);
        onlyNum.setForeground(Color.blue);
        onlyNum.setOpaque(true); // Opacity

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

                // Result (Clear) & Up
                if (input.equals("=")) {
                    // If entered only operator or anything,
                    if (cnt == 0) {
                        showing = "";
                        showLa.setText("0");
                        onlyNum.setText("0");
                    }
                    // If did not entered the operator and did entered the only numbers
                    else if (oper.equals("")) {
                        showing = "";
                        // 공백 나오는 것 방지
                        if (left == "") {
                            showLa.setText("0");
                            onlyNum.setText("0");
                        } else {
                            showLa.setText(removePoint(left));
                            onlyNum.setText("0");
                        }
                    }
                    // If right is empty
                    else if (right == "") {
                        showing = "";
                        // 공백 나오는 것 방지
                        if (left == "") {
                            showLa.setText("0");
                            onlyNum.setText("0");
                        } else {
                            showLa.setText(removePoint(left));
                            onlyNum.setText("0");
                        }
                        showLa.setText(removePoint(left));
                        onlyNum.setText("0");
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

                        if (result.isEmpty()) {
                            result = "0";
                        }

                        // Print the result
                        showLa.setText(removePoint(result));
                        onlyNum.setText("0");

                        // Initalise the values
                        // left 값은 남겨둠
                        left = result;
                        showing = "";
                        right = "";
                        oper = "";
                    }
                }
                // Entered the operator (Clear) & Up
                else if (input == "+" || input == "-" || input == "*" || input == "/") {
                    // If oper is empty and left is exist,
                    if (oper.isEmpty() && !left.isEmpty()) {
                        if (input.equals("+")) {
                            // Save operator
                            oper = "+";
                            // Change showing
                            showing = left + oper;
                            // Print
                            showLa.setText(removePoint(showing));
                            onlyNum.setText(removePoint("0"));
                        }
                        if (input.equals("-")) {
                            // Save operator
                            oper = "-";
                            // Change showing
                            showing = left + oper;
                            // Print
                            showLa.setText(removePoint(showing));
                            onlyNum.setText(removePoint("0"));
                        }
                        if (input.equals("/")) {
                            // Save operator
                            oper = "/";
                            // Change showing
                            showing = left + oper;
                            // Print
                            showLa.setText(removePoint(showing));
                            onlyNum.setText(removePoint("0"));
                        }
                        if (input.equals("*")) {
                            // Save operator
                            oper = "*";
                            // Change showing
                            showing = left + oper;
                            // Print
                            showLa.setText(removePoint(showing));
                            onlyNum.setText(removePoint("0"));
                        }
                    }
                    // 연산자 여러개 넣고싶을때
                    else if (!oper.isEmpty() && !left.isEmpty() && !right.isEmpty()) {
                        if (oper.equals("+")) {
                            result = "" + (Double.parseDouble(left) + Double.parseDouble(right));
                            left = result;
                            showing = left + oper;
                            right = "";
                            oper = input;
                            showLa.setText(removePoint(showing));
                            onlyNum.setText(removePoint(left));
                        }
                        if (oper.equals("-")) {
                            result = "" + (Double.parseDouble(left) - Double.parseDouble(right));
                            left = result;
                            showing = left + oper;
                            right = "";
                            oper = input;
                            showLa.setText(removePoint(showing));
                            onlyNum.setText(removePoint(left));
                        }
                        if (oper.equals("*")) {
                            result = "" + (Double.parseDouble(left) * Double.parseDouble(right));
                            left = result;
                            showing = left + oper;
                            right = "";
                            oper = input;
                            showLa.setText(removePoint(showing));
                            onlyNum.setText(removePoint(left));
                        }
                        if (oper.equals("/")) {
                            result = "" + (Double.parseDouble(left) / Double.parseDouble(right));
                            left = result;
                            showing = left + oper;
                            right = "";
                            oper = input;
                            showLa.setText(removePoint(showing));
                            onlyNum.setText(removePoint(left));
                        }
                    }

                }
                // Entered C or CE (Clear) & Up
                else if (input.charAt(0) == 'C') {
                    // Entered C
                    if (input.length() == 1) {
                        // Initialise the values
                        showing = "";
                        left = "";
                        right = "";
                        oper = "";
                        onlyNum.setText("0");
                        showLa.setText("0");
                    }
                    // Entered CE
                    else if (input.charAt(1) == 'E') {
                        // Initialise only right value
                        right = "";
                        onlyNum.setText(removePoint("0"));
                        showing = left + oper;
                        showLa.setText(removePoint(showing));
                    }
                }
                // Entered . (Clear) & Up
                else if (input.charAt(0) == '.') {
                    // .이 없을때만 작동
                    if (showing.indexOf(".") == -1) {
                        if (!oper.isEmpty()) {
                            right = right + ".";
                            showing = left + oper + right;
                            showLa.setText(removePoint(showing));
                            onlyNum.setText(removePoint(right));
                        } else {
                            left = left + ".";
                            showing = left;
                            showLa.setText(removePoint(showing));
                            onlyNum.setText(removePoint(left));
                        }
                    }
                }
                // Entered the number (Clear) & Up
                else if (input.charAt(0) >= '0' && input.charAt(0) <= '9') {
                    // If the operator was already uesd,
                    if (!oper.isEmpty()) {
                        // Change the right value
                        right = right + input;
                        // Change the showing value
                        showing = left + " " + oper + " " + right;
                        // Change the showLa value
                        showLa.setText(removePoint(showing));
                        onlyNum.setText(removePoint(right));
                        // The value saved successfuly
                        cnt++;
                    } else {
                        // Change the left value
                        left = left + input;
                        // Change the showing value
                        showing = left;
                        // Change the showLa value
                        showLa.setText(removePoint(showing));
                        onlyNum.setText(removePoint(left));
                        // The value saved successfuly
                        cnt++;
                    }
                }
                // Entered <- (Clear) & Up
                else if (input.equals("<-")) {
                    if (showing.isEmpty()) {
                        showLa.setText("0");
                        onlyNum.setText("0");
                    } else if (!oper.isEmpty()) {
                        if (!right.isEmpty()) {
                            right = right.substring(0, right.length() - 1);
                            if (!right.isEmpty()) {
                                showing = left + oper + right;
                                showLa.setText(removePoint(showing));
                                onlyNum.setText(removePoint(right));
                            } else {
                                showing = left + oper;
                                showLa.setText(removePoint(showing));
                                onlyNum.setText("0");
                            }
                        } else {
                            showing = left;
                            oper = "";
                            showLa.setText(removePoint(showing));
                            onlyNum.setText("0");
                        }
                    } else {
                        if (!left.isEmpty()) {
                            left = left.substring(0, left.length() - 1);
                            if (!left.isEmpty()) {
                                showing = left;
                                showLa.setText(removePoint(showing));
                                onlyNum.setText(removePoint(showing));
                            } else {
                                showLa.setText("0");
                                onlyNum.setText("0");
                            }
                        } else {
                            showLa.setText("0");
                            onlyNum.setText("0");
                        }
                    }
                }
                // Entered sqrt(x) (Clear) & Up
                else if (input.equals("sqrt(x)")) {
                    // 좌변만 있을때만 작동
                    if (oper.isEmpty()) {
                        left = "" + (Math.sqrt(Double.parseDouble(left)));
                        showing = left;
                        showLa.setText(removePoint(showing));
                        onlyNum.setText("0");
                    }
                }
                // Entered x*x (Clear)
                else if (input.equals("x*x")) {
                    // 좌변만 있을때만 작동
                    if (oper.isEmpty()) {
                        left = "" + (Double.parseDouble(left) * Double.parseDouble(left));
                        showing = left;
                        showLa.setText(removePoint(showing));
                        onlyNum.setText(removePoint("0"));
                    }
                }
                // Entered reverse (Clear)
                else if (input.equals("reverse")) {
                    if (oper.isEmpty()) {
                        if (!left.isEmpty()) {
                            left = "" + (1 / Double.parseDouble(left));
                            if (left.equals("0")) {
                                left = "";
                                showing = "";
                                showLa.setText("0");
                                onlyNum.setText("0");
                            } else {
                                showing = left;
                                showLa.setText(removePoint(showing));
                                onlyNum.setText(removePoint("0"));
                            }
                        }
                    } else {
                        if (!right.isEmpty()) {
                            right = "" + (1 / Double.parseDouble(right));
                            if (right.equals("0")) {
                                right = "";
                                showing = left + oper;
                            } else {
                                showing = left + oper + right;
                            }
                            showLa.setText(removePoint(showing));
                            onlyNum.setText("0");
                        }
                    }
                }
                // Entered +/- (Clear)
                else if (input.equals("+/-")) {
                    if (oper.isEmpty()) {
                        if (left.indexOf(".") == -1) {
                            left = "" + Integer.parseInt(left) * -1;
                        } else {
                            left = "" + Double.parseDouble(left) * -1;
                        }
                        showing = left;
                        showLa.setText(removePoint(showing));
                        onlyNum.setText(removePoint(showing));
                    } else {
                        if (!right.isEmpty()) {
                            if (right.indexOf(".") == -1) {
                                right = "" + Integer.parseInt(right) * -1;
                            } else {
                                right = "" + Double.parseDouble(right) * -1;
                            }
                            showing = left + oper + right;
                            showLa.setText(removePoint(showing));
                            onlyNum.setText(removePoint(right));
                        }
                    }
                }
                // Entered % (Clear)
                else if (input.equals("%")) {
                    // 우항과 연산자가 있어야만 작동
                    if (!oper.isEmpty() && !right.isEmpty()) {
                        if (oper.equals("+")) {
                            result = "" + (Double.parseDouble(left)
                                    + (Double.parseDouble(left) * (Double.parseDouble(right) / 100)));
                            showing = result;
                            left = "";
                            right = "";
                            showing = "";
                            oper = "";
                            showLa.setText(removePoint(result));
                            onlyNum.setText("0");
                        } else if (oper.equals("-")) {
                            result = "" + (Double.parseDouble(left)
                                    - (Double.parseDouble(left) * (Double.parseDouble(right) / 100)));
                            left = "";
                            right = "";
                            showing = "";
                            oper = "";
                            showLa.setText(result);
                            onlyNum.setText("0");
                        } else if (oper.equals("/")) {
                            result = "" + (Double.parseDouble(left)
                                    / (Double.parseDouble(left) * (Double.parseDouble(right) / 100)));
                            left = "";
                            right = "";
                            showing = "";
                            oper = "";
                            showLa.setText(result);
                            onlyNum.setText("0");
                        } else if (oper.equals("*")) {
                            result = "" + (Double.parseDouble(left)
                                    * (Double.parseDouble(left) * (Double.parseDouble(right) / 100)));
                            left = "";
                            right = "";
                            showing = "";
                            oper = "";
                            showLa.setText(removePoint(result));
                            onlyNum.setText("0");
                        }
                    }
                }
            }
        };

        for (int i = 0; i < btnName.length; i++) {
            btn[i].addActionListener(Listener);
            btnView.add(btn[i]);
        } // for

        // Set Layout
        showView.setLayout(new BorderLayout());

        add(onlyNum, BorderLayout.CENTER);
        add(showLa, BorderLayout.NORTH);
        add(btnView, BorderLayout.SOUTH);

        setBounds(100, 100, 400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public String removePoint(String str) {
        // 필요없는 소수점 제거
        if (str.length() > 2) {
            if (str.charAt(str.length() - 2) == '.'
                    && str.charAt(str.length() - 1) == '0') {
                str = str.substring(0, str.length() - 2);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        new Calculator();
    }// main()
}// Calculator