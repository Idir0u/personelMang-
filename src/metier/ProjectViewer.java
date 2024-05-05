
package metier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author IDIR
 */



public class ProjectViewer extends JFrame {
    private JPanel mainPanel;

    public ProjectViewer(List<Project> projects) {
        setTitle("Project Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        for (Project project : projects) {
            mainPanel.add(new ProjectPanel(project.getNom_long(), project.getDescription()));
        }

        add(scrollPane);
        
    }

    public static void main(String[] args) {
        // Retrieve projects from the database
        Vector<Project> projects = fetchProjectsFromDatabase();

        SwingUtilities.invokeLater(() -> new ProjectViewer(projects));
        
    }
    public static Vector<Project> fetchProjectsFromDatabase(){
        
        Vector<Project> projects = new Vector<Project>();
        Connection conn = Utilitaire.getConnection();
        try {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM PROJET");
                while (rs.next()) {
                    String etatValue = rs.getString(8); // Assuming the enum value is stored as a string in the database
                    Etat etat;
                    if ("clos".equalsIgnoreCase(etatValue)) {
                        etat = Etat.CLOS;
                    } else if ("ouvert".equalsIgnoreCase(etatValue)) {
                        etat = Etat.OUVERT;
                    } else {
                        // Handle unknown enum values or error cases
                        etat = null; // Or throw an exception
                    }
                    projects.add(new Project(rs.getByte(1), rs.getNString(2), rs.getNString(3), rs.getNString(4), rs.getNString(5), rs.getNString(6), rs.getBoolean(7), etat, rs.getDate(9)));
                } 
            } catch (Exception e) {
                            System.out.println("Exception : "+ e);
            }
            return projects;
    
    }
}