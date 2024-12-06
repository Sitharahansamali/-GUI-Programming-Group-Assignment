import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.Year;

public class Frame extends JFrame implements ActionListener {
    final int labelWidth = 120;
    final int labelHeight = 35;
    final int textboxWidth = 250;
    final int textboxHeight = 30;

    private static final int WIDTH = 500;
    private static final int HEIGHT = 800;

    private JTextField nameField, emailField, emailSignInField;
    private JPasswordField passwordField, passwordSignInField;
    private JRadioButton maleButton, femaleButton;
    private ButtonGroup genderGroup;
    private JCheckBox robotCheckBox;
    private JButton signUpButton, signInButton;
    private JComboBox<Integer> dateComboBox, yearComboBox;
    private JComboBox<String> monthComboBox;

    Frame() {
        setTitle("User Registration Form");
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Header
        JLabel headerLabel = new JLabel("Sign Up");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 25));
        headerLabel.setBounds(200, 20, 200, 30);
        headerLabel.setForeground(Color.BLUE);
        add(headerLabel);

        // Name field
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        nameLabel.setBounds(30, 70, labelWidth, labelHeight);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 15));
        nameField.setBounds(150, 75, textboxWidth, textboxHeight);
        add(nameField);

        // Email field
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Arial", Font.BOLD, 20));
        emailLabel.setBounds(30, 120, labelWidth, labelHeight);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.PLAIN, 15));
        emailField.setBounds(150, 125, textboxWidth, textboxHeight);
        add(emailField);

        // Gender selection
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Arial", Font.BOLD, 20));
        genderLabel.setBounds(30, 170, labelWidth, labelHeight);
        add(genderLabel);

        maleButton = new JRadioButton("Male");
        maleButton.setBounds(150, 170, labelWidth, labelHeight);
        maleButton.setFont(new Font("Arial", Font.PLAIN, 18));

        femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(280, 170, labelWidth, labelHeight);
        femaleButton.setFont(new Font("Arial", Font.PLAIN, 18));

        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        add(maleButton);
        add(femaleButton);

        // Birthday field
        JLabel birthdayLabel = new JLabel("Birthday");
        birthdayLabel.setFont(new Font("Arial", Font.BOLD, 20));
        birthdayLabel.setBounds(30, 220, labelWidth, labelHeight);
        add(birthdayLabel);

        Integer[] dates = new Integer[31];
        for (int i = 0; i < 31; i++) {
            dates[i] = i + 1;
        }
        dateComboBox = new JComboBox<>(dates);
        dateComboBox.setBounds(150, 220, 60, 30);
        add(dateComboBox);

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        monthComboBox = new JComboBox<>(months);
        monthComboBox.setBounds(210, 220, 90, 30);
        add(monthComboBox);

        int currentYear = Year.now().getValue();
        Integer[] years = new Integer[currentYear - 1900 + 1];
        for (int i = 0; i < years.length; i++) {
            years[i] = 1900 + i;
        }
        yearComboBox = new JComboBox<>(years);
        yearComboBox.setBounds(300, 220, 90, 30);
        add(yearComboBox);

        // Password field
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 20));
        passwordLabel.setBounds(30, 270, labelWidth, labelHeight);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordField.setBounds(150, 275, textboxWidth, textboxHeight);
        add(passwordField);

        // Checkbox for robot verification
        robotCheckBox = new JCheckBox("I am not a robot.");
        robotCheckBox.setBounds(30, 320, 400, 30);
        robotCheckBox.setFont(new Font("Arial", Font.PLAIN, 18));
        add(robotCheckBox);

        // Sign-up button
        signUpButton = new JButton("Sign Up");
        signUpButton.setFont(new Font("Arial", Font.BOLD, 25));
        signUpButton.setBounds(30, 370, 440, 50);
        signUpButton.setBackground(Color.BLUE);
        signUpButton.setForeground(Color.WHITE);
        signUpButton.addActionListener(this);
        add(signUpButton);

        // Sign-in section
        JLabel signInLabel = new JLabel("Sign In");
        signInLabel.setFont(new Font("Arial", Font.BOLD, 25));
        signInLabel.setBounds(200, 460, labelWidth, labelHeight);
        signInLabel.setForeground(Color.BLUE);
        add(signInLabel);

        JLabel emailSignInLabel = new JLabel("Email");
        emailSignInLabel.setFont(new Font("Arial", Font.BOLD, 20));
        emailSignInLabel.setBounds(30, 510, labelWidth, labelHeight);
        add(emailSignInLabel);

        emailSignInField = new JTextField();
        emailSignInField.setFont(new Font("Arial", Font.PLAIN, 15));
        emailSignInField.setBounds(150, 515, textboxWidth, textboxHeight);
        add(emailSignInField);

        JLabel passwordSignInLabel = new JLabel("Password");
        passwordSignInLabel.setFont(new Font("Arial", Font.BOLD, 20));
        passwordSignInLabel.setBounds(30, 560, labelWidth, labelHeight);
        add(passwordSignInLabel);

        passwordSignInField = new JPasswordField();
        passwordSignInField.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordSignInField.setBounds(150, 565, textboxWidth, textboxHeight);
        add(passwordSignInField);

        signInButton = new JButton("Sign In");
        signInButton.setFont(new Font("Arial", Font.BOLD, 25));
        signInButton.setBounds(30, 620, 440, 50);
        signInButton.setBackground(Color.BLUE);
        signInButton.setForeground(Color.WHITE);
        signInButton.addActionListener(this);
        add(signInButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SignUpHandler signUpHandler = new SignUpHandler();

        if (e.getSource() == signUpButton) {
            // Get user input
            String name = nameField.getText();
            String email = emailField.getText();
            String gender = maleButton.isSelected() ? "Male" : "Female";
            int date = (int) dateComboBox.getSelectedItem();
            String month = (String) monthComboBox.getSelectedItem();
            int year = (int) yearComboBox.getSelectedItem();
            String password = new String(passwordField.getPassword());

            // Validate email
            String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
            Pattern emailPattern = Pattern.compile(emailRegex);
            Matcher matcher = emailPattern.matcher(email);

             if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(this, "Invalid email format.");
                return;
            }

            if (!robotCheckBox.isSelected()) {
                JOptionPane.showMessageDialog(this, "Please verify that you're not a robot.");
                return;
            }

            String birthday = String.format("%04d-%02d-%02d", year, monthComboBox.getSelectedIndex() + 1, date);

            try {
                signUpHandler.signUp(name, email, gender, birthday, password);
                JOptionPane.showMessageDialog(this, "Sign-up successful!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
            }
        } else if (e.getSource() == signInButton) {
            String email = emailSignInField.getText();
            String password = new String(passwordSignInField.getPassword());

            try {
                if (signUpHandler.signIn(email, password)) {
                    JOptionPane.showMessageDialog(this, "Sign-in successful!");
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid email or password.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
            }
        }
    }
}
