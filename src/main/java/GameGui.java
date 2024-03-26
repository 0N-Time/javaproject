import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class GameGui extends JFrame implements ActionListener {

    Player player1 = new Player();
    Player player2 = new Player();

    int outcome1 = Player.roll(1);

    int round = 0;
    int y = 0;
    int y2 = 0;
    int j = 0;

    private JTextField nameInput1 = new JTextField("Name Spieler 1");
    private JTextField nameInput2 = new JTextField("Name Spieler 2");

    private JButton name11 = new JButton("Auswaehlen");
    private JButton name22 = new JButton("Auswaehlen");

    private JLabel name1 = new JLabel("name1");
    private JLabel name2 = new JLabel("name2");

    private JPanel panel2 = new JPanel();
    private RoundPanel panel = new RoundPanel();
    private JScrollPane scrollpane = new JScrollPane(panel2, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    private JPanel panel3 = new JPanel();
    private RoundPanel panel31 = new RoundPanel();
    private JScrollPane scrollpane3 = new JScrollPane(panel3, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    JButton roll1 = new JButton("Spieler1 Wuerfeln");
    JButton roll2 = new JButton("Spieler2 Wuerfeln");

    private JButton stop1 = new JButton("Stoppen");
    private JButton stop2 = new JButton("Stoppen");

    void start() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1080, 745);
        setTitle("DiceGame");
        setVisible(true);

        name1.setBounds(30, 30, 500, 30);
        name1.setVisible(false);
        add(name1);

        name2.setBounds(540, 30, 400, 30);
        add(name2);

        nameInput1.setBounds(30, 30, 400, 30);
        add(nameInput1);

        nameInput2.setBounds(540, 30, 400, 30);
        add(nameInput2);

        name11.setBounds(429, 31, 100, 28);
        name11.addActionListener(this);
        add(name11);

        name22.setBounds(939, 30, 100, 28);
        name22.addActionListener(this);
        add(name22);

        roll1.setBounds(65, 650, 200, 30);
        roll1.addActionListener(this);
        add(roll1);

        roll2.setBounds(575, 650, 200, 30);
        roll2.addActionListener(this);
        add(roll2);

        stop1.setBounds(295, 650, 200, 30);
        stop1.addActionListener(this);
        add(stop1);

        stop2.setBounds(810, 650, 200, 30);
        stop2.addActionListener(this);
        add(stop2);

        // panel2.setBounds(30, 80, 400, 400);
        panel2.setLayout(null);
        panel2.setBackground(new Color(79, 99, 105));
        panel2.setPreferredSize(new Dimension(400, 1000));
        panel2.setVisible(true);
        // add(panel2);

        this.panel2.add(panel);
        panel2.setVisible(true);

        scrollpane.setBounds(30, 80, 500, 550);
        this.add(scrollpane);
        scrollpane.setVisible(true);

        // panel2.setBounds(30, 80, 400, 400);
        panel3.setLayout(null);
        panel3.setBackground(new Color(79, 99, 105));
        panel3.setPreferredSize(new Dimension(400, 1000));
        panel3.setVisible(true);
        // add(panel2);

        this.panel3.add(panel);
        panel3.setVisible(true);

        scrollpane3.setBounds(540, 80, 500, 550);
        this.add(scrollpane3);
        scrollpane3.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == name11) {
            String parsed = nameInput1.getText();
            name1.setText(parsed + "");
            nameInput1.setVisible(false);
            name11.setVisible(false);
            name1.setVisible(true);

        } else if (e.getSource() == name22) {
            String parsed = nameInput2.getText();
            name2.setText(parsed + "");
            nameInput2.setVisible(false);
            name22.setVisible(false);
            name2.setVisible(true);

        }

            if (e.getSource() == this.roll1) {

                this.panel = new RoundPanel();
                this.panel.setBounds(0, y, 500, 80);
                this.y += 80; // y-Position des nächsten Runden Panels
                this.panel2.add(panel); // zum scrollbaren Panel hinzufügen

                int rollOutcome = Player.roll(1);
                panel.lbl1.setText(rollOutcome + "");
                rollOutcome = Player.roll(2);
                panel.lbl2.setText(rollOutcome + "");
                rollOutcome = Player.roll(3);
                panel.lbl3.setText(rollOutcome + "");
                rollOutcome = Player.roll(4);
                panel.lbl4.setText(rollOutcome + "");
                rollOutcome = Player.roll(5);
                panel.lbl5.setText(rollOutcome + "");
                this.repaint();
            }


//		while (j < 5) {
//
//			if (e.getSource() == this.roll2) {
//				this.panel31 = new RoundPanel(); // neues Panel Objekt pro Runde
//				this.panel31.setBounds(0, y2, 500, 80);
//				this.y2 += 80; // y-Position des nächsten Runden Panels
//				this.panel3.add(panel31); // zum scrollbaren Panel hinzufügen
//
//				int rollOutcome2 = Player.roll(1);
//				panel31.lbl1.setText(rollOutcome2 + "");
//				j++;
//				rollOutcome2 = Player.roll(2);
//				panel31.lbl2.setText(rollOutcome2 + "");
//				j++;
//				rollOutcome2 = Player.roll(3);
//				panel31.lbl3.setText(rollOutcome2 + "");
//				j++;
//				rollOutcome2 = Player.roll(4);
//				panel31.lbl4.setText(rollOutcome2 + "");
//				j++;
//				rollOutcome2 = Player.roll(5);
//				panel31.lbl5.setText(rollOutcome2 + "");
//				j++;
//				this.repaint();
//			}
//		}
    }

}