import javax.swing.JLabel;

public class Player {
    JLabel dice1 = new JLabel("1");

    public static int roll(int number) {
        return number = (int) (Math.random() * 6 + 1);
    }
}
