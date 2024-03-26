import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class RoundPanel extends JPanel {
    // Könnte man hier auch einen Array machen?
// Was würde ein Array für Vorteile bringen?
    int[] labels = {0, 1, 2, 3, 4, 5};
    JLabel lbl1 = new JLabel(labels[0] + "");
    JLabel lbl2 = new JLabel(labels[1] + "");
    JLabel lbl3 = new JLabel(labels[2] + "");
    JLabel lbl4 = new JLabel(labels[3] + "");
    JLabel lbl5 = new JLabel(labels[4] + "");

    public RoundPanel() {
        this.setLayout(null);
        lbl1.setBounds(10, 10, 30, 30);
        lbl2.setBounds(40, 10, 30, 30);
        lbl3.setBounds(70, 10, 30, 30);
        lbl4.setBounds(100, 10, 30, 30);
        lbl5.setBounds(130, 10, 30, 30);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(lbl5);
        this.setBackground(new Color(111, 141, 150));
        Border blackline = BorderFactory.createLineBorder(Color.WHITE);
        this.setBorder(blackline);
    }
// Was fehlt, damit die einzelnen Labels von aussen geändert werden können?
}