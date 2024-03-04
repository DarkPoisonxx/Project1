import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class RunPokemonCardGame extends PokemonCardGame{
    public RunPokemonCardGame(int numPokemon) {
        super(numPokemon);
    }

    public static void main(String[] args) {
        // Creates Window
        JFrame frame = new JFrame("Pokemon Card Game");
        frame.setSize(2000, 1000); // Set the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed

        // Create a JPanel to hold components
        JPanel panel = new JPanel();
        frame.add(panel); // Add the panel to the frame

        // Add components to the panel
        JLabel player1JLabel = new JLabel("Player 1: ");
        panel.add(player1JLabel);

        JTextField player1TextField = new JTextField(20);
        panel.add(player1TextField);

        JLabel label = new JLabel("Player 2: ");
        panel.add(label);
        
        JTextField player2TextField = new JTextField(20);
        panel.add(player2TextField);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //     player1 = textField.getText();
            //     resultLabel.setText("You entered: " + userInput);
             }
        });

        // Make the frame visible
        frame.setVisible(true);
        player1TextField.setVisible(true);
        player2TextField.setVisible(true);
    }
}
