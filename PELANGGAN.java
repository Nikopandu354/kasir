import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PELANGGAN {
    public static void main(String[] args) {
        JFrame f = new JFrame("Data PELANGGAN");
        JLabel KP = new JLabel("Kode PELANGGAN");
        JLabel NP = new JLabel("NAMA PELANGGAN");
        JLabel AP = new JLabel("ALAMAT PELANGGAN");
        JLabel JK = new JLabel("JENIS KELAMIN");
        
        JTextField tkode = new JTextField();
        JTextField tnama = new JTextField();
        JTextArea aalamat = new JTextArea();
        
        // Create radio buttons for gender
        JRadioButton jnsLaki = new JRadioButton("Laki-laki");
        JRadioButton jnsPerempuan = new JRadioButton("Perempuan");
        
        // Group the radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(jnsLaki);
        genderGroup.add(jnsPerempuan);
        
        JButton bsimpan = new JButton("Simpan");
        JButton bkeluar = new JButton("Keluar");
        
        // Set bounds for components
        KP.setBounds(10, 10, 150, 20);
        NP.setBounds(10, 40, 150, 20);
        AP.setBounds(10, 70, 150, 20);
        JK.setBounds(10, 180, 150, 20);
        
        tkode.setBounds(160, 10, 80, 20);
        tnama.setBounds(160, 40, 120, 20);
        aalamat.setBounds(160, 70, 200, 70);
        
        jnsLaki.setBounds(160, 180, 100, 20);
        jnsPerempuan.setBounds(260, 180, 100, 20);
        
        bsimpan.setBounds(160, 210, 100, 40);
        bkeluar.setBounds(270, 210, 100, 40);
        
        // Add components to the frame
        f.add(KP);
        f.add(NP);
        f.add(AP);
        f.add(JK);
        f.add(tkode);
        f.add(tnama);
        f.add(aalamat);
        f.add(jnsLaki);
        f.add(jnsPerempuan);
        f.add(bsimpan);
        f.add(bkeluar);
        
        // Set frame properties
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        // Action listener for the exit button
        bkeluar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}