import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener {
    TextField textField1;
    TextField textField2;
    TextField textField3;
    int numberOfCharacter;
    int numberOfWords;
    int numberOfLines;

    ButtonActionListener(TextField textField1, TextField textField2, TextField textField3) {
        this.textField1 = textField1;
        this.textField2 = textField2;
        this.textField3 = textField3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FileReader fileReader = new FileReader();
        try {
            String content = fileReader.fileRead();
            StringManager stringManager = new StringManager(content);
            numberOfCharacter = stringManager.getNumberOfCharacters();
            numberOfWords = stringManager.getNumberOfWord();
            numberOfLines = stringManager.getNumberOfLines();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        textField1.setText(String.valueOf(numberOfCharacter));
        textField2.setText(String.valueOf(numberOfWords));
        textField3.setText(String.valueOf(numberOfLines));
    }
}