import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab5Part1 extends Frame implements ChangeListener {
JProgressBar progressBar = new JProgressBar(0, 100);
JSlider slider = new JSlider(0, 100);
    Lab5Part1() {

        // Progress bar
        c.gridx = 0;
        c.gridy = 0;
        panel.add(progressBar, c);

        c.gridy = 1;
        slider.setValue(0);
        slider.addChangeListener(this);
        panel.add(slider, c);



        setVisible(true);
        setTitle("progess bar");
    }

    public static void main(String[] args) {
        Lab5Part1 run = new Lab5Part1();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        progressBar.setValue(slider.getValue());
    }
}
