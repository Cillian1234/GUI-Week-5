import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab5Part2 extends Frame implements ActionListener {
JPanel cards = new JPanel(new CardLayout());
JPanel card1, card2, card3, results;
String[] items = {"Favourite snack", "Favourite animal", "Favourite car", "Results"};
JLabel label;
JRadioButton choice1, choice2, choice3;
ButtonGroup radio1 = new ButtonGroup();
ButtonGroup radio2 = new ButtonGroup();
ButtonGroup radio3 = new ButtonGroup();
JComboBox questionSelect;
String picked1, picked2, picked3;
    CardLayout cl = (CardLayout)(cards.getLayout());
    Lab5Part2() {
        card1 = new JPanel();
        label = new JLabel("Which is your favourite snack?");
        card1.add(label);
        choice1 = new JRadioButton("Chocolate");
        choice1.addActionListener(this);
        card1.add(choice1);
        choice1 = new JRadioButton("Crisps");
        choice2.addActionListener(this);
        card1.add(choice2);
        choice1 = new JRadioButton("Milk");
        choice3.addActionListener(this);
        card1.add(choice3);
        radio1.add(choice1);
        radio1.add(choice2);
        radio1.add(choice3);


        card2 = new JPanel();
        label = new JLabel("Which is your favourite animal?");
        card2.add(label);
        choice1 = new JRadioButton("Dog");
        choice1.addActionListener(this);
        card2.add(choice1);
        choice2 = new JRadioButton("Cat");
        choice2.addActionListener(this);
        card2.add(choice2);
        choice3 = new JRadioButton("Bird");
        choice3.addActionListener(this);
        card2.add(choice3);
        radio2.add(choice1);
        radio2.add(choice2);
        radio2.add(choice3);

        card3 = new JPanel();
        label = new JLabel("Which is your favourite car?");
        card3.add(label);
        choice1 = new JRadioButton("Ford");
        choice1.addActionListener(this);
        card3.add(choice1);
        choice2 = new JRadioButton("Toyota");
        choice2.addActionListener(this);
        card3.add(choice2);
        choice3 = new JRadioButton("Volkswagen");
        choice3.addActionListener(this);
        card3.add(choice3);
        radio3.add(choice1);
        radio3.add(choice2);
        radio3.add(choice3);

        results = new JPanel();
        label = new JLabel("Your result will appear here");
        results.add(label);

        cards.add(card1, "Favourite snack");
        cards.add(card2, "Favourite animal");
        cards.add(card3, "Favourite car");
        cards.add(results, "Results");

        JPanel comboboxPanel = new JPanel(new GridBagLayout());
        questionSelect = new JComboBox(items);
        questionSelect.addActionListener(this);

        c.gridy = 0;
        c.gridx = 0;
        comboboxPanel.add(questionSelect, c);
        c.gridy = 1;
        comboboxPanel.add(cards, c);

        panel.add(comboboxPanel);
        setVisible(true);
        setTitle("Cards");

    }

    public static void main(String[] args) {
        Lab5Part2 run = new Lab5Part2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == questionSelect) {
            cl.show(cards, (String)questionSelect.getSelectedItem());
        }

        if (questionSelect.getSelectedItem() == items[0]) {

        } else if (questionSelect.getSelectedItem() == items[1]) {
            if (source == choice1) {
                picked2 = "Dog";
            } else if (source == choice2) {
                picked2 = "Cat";
            } else if (source == choice3) {
                picked2 = "Bird";
            }
        } else if (questionSelect.getSelectedItem() == items[2]) {
            if (source == choice1) {
                picked3 = "Ford";
            } else if (source == choice2) {
                picked3 = "Toyota";
            } else if (source == choice3) {
                picked3 = "Volkswagen";
            }
        } else if (questionSelect.getSelectedItem() == items[3]) {
            label.setText(picked1 + " " + picked2 + " " + picked3);

            results.add(label);
        }
    }
}
