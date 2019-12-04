package Interfaces;


public class BDMensaje extends javax.swing.JFrame{


    public BDMensaje() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OptionPannel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(102, 102, 102, 102));
        setForeground(java.awt.Color.white);
        setMaximizedBounds(new java.awt.Rectangle(50, 50, 0, 0));
        setMinimumSize(new java.awt.Dimension(50, 50));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(50, 50));
        setResizable(false);
        setSize(new java.awt.Dimension(50, 50));

        OptionPannel.setBackground(new java.awt.Color(51, 51, 51));
        OptionPannel.setForeground(new java.awt.Color(102, 102, 102));
        OptionPannel.setLayout(new java.awt.BorderLayout());

        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea1.setRows(5);
        jTextArea1.setText("hola que tal");
        jScrollPane1.setViewportView(jTextArea1);

        OptionPannel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(OptionPannel, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 500, 400);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OptionPannel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
