import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class WordCountApplication extends JFrame implements BrowseActionObserver,SubmitActionObserver{
    private TextField textField1;
    private TextField textField2;
    private TextField textField3;
    private Button submit;
    private Button browse;
    private File file;

    public void startApp() {
        addField();
    }

    public WordCountApplication() {
        setTitle("Word Count");
        setBounds(200, 200, 300, 300);
        setLayout(null);
        setVisible(true);
    }

    private void addField() {
        browse = new Button("Browse");
        textField1 = new TextField();
        textField2 = new TextField();
        textField3 = new TextField();
        submit = new Button("Submit");
        browse.setBounds(60, 20, 70, 30);
        textField1.setBounds(60, 60, 160, 30);
        textField2.setBounds(60, 100, 160, 30);
        textField3.setBounds(60, 140, 160, 30);
        submit.setBounds(60, 180, 160, 30);
        add(textField1);
        add(textField2);
        add(textField3);
        browse.addActionListener(new BrowseActionListener(this));
        submit.addActionListener(new SubmitActionListener(this));
        add(browse);
        add(submit);
    }

    @Override
    public void onFileBrowsed(File file) {
        this.file = file;
    }

    @Override
    public void onSubmitClick() {
        FileReader fileReader = new FileReader();
        try {
            String fileContent = fileReader.readFile(this.file);
            StringManager stringManager = new StringManager(fileContent);
            int numberOfLines = stringManager.getNumberOfLines();
            int numberOfWord = stringManager.getNumberOfWord();
            int numberOfCharacters = stringManager.getNumberOfCharacters();
            textField1.setText(String.valueOf(numberOfCharacters));
            textField2.setText(String.valueOf(numberOfWord));
            textField3.setText(String.valueOf(numberOfLines));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

