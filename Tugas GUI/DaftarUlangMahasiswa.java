import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DaftarUlangMahasiswa extends JFrame {
    private JTextField namaField;
    private JTextField tanggalLahirField;
    private JTextField nomorPendaftaranField;
    private JTextField noTelpField;
    private JTextField alamatField;
    private JTextField emailField;
    private JTextField programStudiField; 

    public DaftarUlangMahasiswa() {
        setTitle("Form Daftar Ulang Mahasiswa Baru");
        setSize(400, 380); // Adjusted height for additional fields
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(8, 2, 10, 5)); // Adjusted for more fields
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("Nama Lengkap:"));
        namaField = new JTextField();
        panel.add(namaField);

        panel.add(new JLabel("Tanggal Lahir:"));
        tanggalLahirField = new JTextField();
        panel.add(tanggalLahirField);

        panel.add(new JLabel("Nomor Pendaftaran:"));
        nomorPendaftaranField = new JTextField();
        panel.add(nomorPendaftaranField);

        panel.add(new JLabel("No Telp:"));
        noTelpField = new JTextField();
        panel.add(noTelpField);

        panel.add(new JLabel("Alamat:"));
        alamatField = new JTextField();
        panel.add(alamatField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Program Studi:")); // Added label
        programStudiField = new JTextField(); // Added text field
        panel.add(programStudiField);

        panel.add(new JLabel("")); 

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Center alignment
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitButtonListener());
        buttonPanel.add(submitButton);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private boolean areFieldsEmpty(JTextField... fields) {
        for (JTextField field : fields) {
            if (field.getText().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void showConfirmation() {
        JFrame confirmationFrame = new JFrame("Konfirmasi Data Mahasiswa");
        confirmationFrame.setSize(400, 380); // Adjusted size for additional fields
        confirmationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        confirmationFrame.setLocationRelativeTo(null);

        JPanel confirmationPanel = new JPanel(new GridLayout(8, 1, 10, 5)); // Adjusted for more fields
        confirmationPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        confirmationPanel.add(new JLabel("Nama Lengkap: " + namaField.getText()));
        confirmationPanel.add(new JLabel("Tanggal Lahir: " + tanggalLahirField.getText()));
        confirmationPanel.add(new JLabel("Nomor Pendaftaran: " + nomorPendaftaranField.getText()));
        confirmationPanel.add(new JLabel("No Telp: " + noTelpField.getText()));
        confirmationPanel.add(new JLabel("Alamat: " + alamatField.getText()));
        confirmationPanel.add(new JLabel("Email: " + emailField.getText()));
        confirmationPanel.add(new JLabel("Program Studi: " + programStudiField.getText())); // Added confirmation for Program Studi

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> confirmationFrame.dispose());
        confirmationPanel.add(closeButton);

        confirmationFrame.add(confirmationPanel);
        confirmationFrame.setVisible(true);
    }

    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (areFieldsEmpty(namaField, tanggalLahirField, nomorPendaftaranField, noTelpField, alamatField, emailField, programStudiField)) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else {
                int response = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
                if (response == JOptionPane.OK_OPTION) {
                    showConfirmation();
                }
            }
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(DaftarUlangMahasiswa::new);
    }
}

