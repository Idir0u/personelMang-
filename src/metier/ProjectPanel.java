package metier;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author IDIR
 */

public class ProjectPanel extends JPanel {
    private JLabel nameLabel;
    private JLabel descriptionLabel;

    public ProjectPanel(String name, String description) {
        nameLabel = new JLabel("Name: " + name);
        descriptionLabel = new JLabel("Description: " + description);

        setLayout(new GridLayout(2, 1));
        add(nameLabel);
        add(descriptionLabel);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}