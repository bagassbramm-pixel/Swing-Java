import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class KalkulatorBMI extends JFrame {
    private final JTextField tfBerat = new JTextField(10);   // berat (kg)
    private final JTextField tfTinggi = new JTextField(10);  // tinggi (cm)
    private final JLabel lblHasil = new JLabel("BMI: -");

    public KalkulatorBMI() {
        super("Kalkulator BMI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 8, 8));

        JButton btnHitung = new JButton("Hitung");

        add(new JLabel("Berat (kg):"));
        add(tfBerat);
        add(new JLabel("Tinggi (cm):"));
        add(tfTinggi);
        add(new JLabel());
        add(btnHitung);
        add(new JLabel("Hasil:"));
        add(lblHasil);

        btnHitung.addActionListener(e -> hitung());

        pack();
        setLocationRelativeTo(null);
    }

    private void hitung() {
        String b = tfBerat.getText().trim();
        String t = tfTinggi.getText().trim();

        