import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class BrowseActionListener implements ActionListener {

    private BrowseActionObserver observer;

    public BrowseActionListener(BrowseActionObserver observer){
        this.observer = observer;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser jFileChooser = new JFileChooser();
        int isFileSelected = jFileChooser.showOpenDialog(null);
        if (isFileSelected == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            observer.onFileBrowsed(file);
        }
    }
}
