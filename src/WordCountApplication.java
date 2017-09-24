import javax.swing.*;
import java.awt.*;
import java.lang.String;

public class WordCountApplication extends JFrame {
    private TextField textField1;
    private TextField textField2;
    private TextField textField3;
    private Button button;

    public WordCountApplication() {
        setBounds(200, 200, 300, 300);
        setLayout(null);
        setVisible(true);
    }

    private void addField() {
        textField1 = new TextField();
        textField2 = new TextField();
        textField3 = new TextField();
        textField1.setBounds(60, 60, 160, 30);
        textField2.setBounds(60, 100, 160, 30);
        textField3.setBounds(60, 140, 160, 30);
        button = new Button("Submit");
        button.setBounds(60, 180, 160, 30);
        add(textField1);
        add(textField2);
        add(textField3);
        button.addActionListener(new ButtonActionListener(textField1, textField2, textField3));
        add(button);
    }
    void startApp(){
        addField();
    }
}

