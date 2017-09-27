import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubmitActionListener implements ActionListener {
    private SubmitActionObserver observer;

    public SubmitActionListener(SubmitActionObserver observer){
        this.observer = observer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        observer.onSubmitClick();
    }
}