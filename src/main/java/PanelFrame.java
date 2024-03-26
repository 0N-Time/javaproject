import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PanelFrame extends JFrame implements ActionListener {
    private JButton btnNewRound = new JButton("new round");
    private JPanel pnl1 = new JPanel(); //Panel, welches andere Panels aufnimmt
    private JScrollPane scrollpane = new JScrollPane(pnl1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    // Würde hier ein Array Sinn machen?
// Wie kann man alle Panels aller Runden speichern?
    private RoundPanel panel = new RoundPanel();
    // Wie löse ich es für den Player zwei?
    private int y = 0;

    // Vertikale verschiebung der Panels
    public PanelFrame() {
        this.setLayout(null); // fixe Positionierungen
        pnl1.setLayout(null);
        pnl1.setPreferredSize(new Dimension(350, 1000)); //PreferredSize für scrollbar
        scrollpane.setBounds(10, 10, 400, 350);
        this.add(scrollpane);
        btnNewRound.setBounds(170, 370, 100, 30);
        this.add(btnNewRound);
        this.btnNewRound.addActionListener(this);
        this.setSize(450, 450);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.btnNewRound) {
            this.panel = new RoundPanel();
            // neues Panel Objekt pro Runde
            this.panel.setBounds(0, y, 350, 60);
            this.y += 61; // y-Position des nächsten Runden Panels
            this.pnl1.add(panel); // zum scrollbaren Panel hinzufügen
            this.repaint(); // Alles neu zeichnen
        }
    }
}