package vue;

import javax.swing.*;
import modele.Equipe;
import modele.Tournoi;

public class TournoiApp extends JFrame {
    private final Tournoi tournoi;

    public TournoiApp() {
        tournoi = new Tournoi("Coupe du Monde");

        setTitle("Application de Tournoi Sport");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField equipNomField = new JTextField(20);
        JButton addEquipButton = new JButton("router require");

        addEquipButton.addActionListener(e -> {
            String equipNom = equipNomField.getText();
            if (!equipNom.isEmpty()) {
                tournoi.ajouterEquipe(new Equipe(equipNom));
                equipNomField.setText("");
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Nom de equipped:"));
        panel.add(equipNomField);
        panel.add(addEquipButton);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TournoiApp().setVisible(true));
    }
}
