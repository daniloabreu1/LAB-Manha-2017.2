/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import File.Arquivos;
import java.io.File;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import buffers.BufferUsuario;
import classes.Cliente;
import classes.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo Abreu
 */
public class UsuarioGUI extends javax.swing.JDialog {

    /**
     * Creates new form UsuarioGUI
     */
    Arquivos arq;
    List<String> lista;
    private static UsuarioGUI janelaU;
    public UsuarioGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        arq = new Arquivos("login");
        preencher();
    }
    static{
        janelaU = new UsuarioGUI(null, true);
    }
    
    public static UsuarioGUI getInstance(){
        janelaU.preencher();
        return janelaU;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        sairBT = new javax.swing.JButton();
        removerBT = new javax.swing.JButton();
        userCampo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        senhaCampo = new javax.swing.JTextField();
        editarBT = new javax.swing.JButton();
        novoBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsuario.getTableHeader().setResizingAllowed(false);
        tabelaUsuario.getTableHeader().setReorderingAllowed(false);
        tabelaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuario);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        sairBT.setText("Sair");
        sairBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTActionPerformed(evt);
            }
        });

        removerBT.setText("Remover");
        removerBT.setEnabled(false);
        removerBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBTActionPerformed(evt);
            }
        });

        userCampo.setEditable(false);

        jLabel1.setText("Usuario");

        jLabel2.setText("Senha");

        senhaCampo.setEditable(false);

        editarBT.setText("Editar Dados");
        editarBT.setEnabled(false);
        editarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBTActionPerformed(evt);
            }
        });

        novoBt.setText("Novo");
        novoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sairBT, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(novoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(removerBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userCampo)
                            .addComponent(senhaCampo))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {editarBT, novoBt, removerBT, sairBT});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(senhaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sairBT)
                            .addComponent(removerBT)
                            .addComponent(novoBt))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(editarBT)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_sairBTActionPerformed

    private void tabelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuarioMouseClicked
        // TODO add your handling code here:
        removerBT.setEnabled(true);
        editarBT.setEnabled(true);
        int linha=tabelaUsuario.getSelectedRow();
        userCampo.setText(tabelaUsuario.getValueAt(linha, 0).toString());
        senhaCampo.setText(tabelaUsuario.getValueAt(linha, 1).toString());
        
    }//GEN-LAST:event_tabelaUsuarioMouseClicked

    private void removerBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBTActionPerformed
        // TODO add your handling code here:
        File f = arq.getF();
        lista=arq.lerArquivo(f);
        if(arq.regravarDados(f, BufferUsuario.apagarUsuario(lista, userCampo.getText()))){
            preencher();
            removerBT.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Apagou", "já era", JOptionPane.INFORMATION_MESSAGE);
            editarBT.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(this, "nao apagou","nao deu certo",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removerBTActionPerformed

    private void editarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBTActionPerformed
        // TODO add your handling code here:
        File f = arq.getF();
        lista=arq.lerArquivo(f);
        String nu = JOptionPane.showInputDialog("Novo usuario");
        String ns = JOptionPane.showInputDialog("Nova Senha");
        if(!userCampo.equals("")){
            if (arq.regravarDados(f, BufferUsuario.editarUsuario(lista, userCampo.getText(), nu, ns))) {
                preencher();
                removerBT.setEnabled(false);
                JOptionPane.showMessageDialog(this, "alterou", "Opa", JOptionPane.INFORMATION_MESSAGE);
                editarBT.setEnabled(false);
                preencher();
            } else {
                JOptionPane.showMessageDialog(this, "nao editou", "nao deu certo", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "clique no usuario que quer alterar","nao deu",JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_editarBTActionPerformed

    private void novoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoBtActionPerformed
        // TODO add your handling code here:
        
        File arquivo = arq.getF();
        String user = JOptionPane.showInputDialog("Digite o usuario");
        String pass = JOptionPane.showInputDialog("digite a senha");
        Usuario u = new Usuario(user, pass);
        if (BufferUsuario.novoUsuario(arq.lerArquivo(arquivo), u.getLogin())) {
            if (arq.novoDado(arquivo, u.getLogin() + ";" + u.getSenha())) {
                JOptionPane.showMessageDialog(null, "Salvo", "Novo usuario", JOptionPane.INFORMATION_MESSAGE);
                preencher();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Salvo fail", "Novo usuario", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_novoBtActionPerformed
    
    private void preencher(){
        File f = arq.getF();
        lista=arq.lerArquivo(f);
        DefaultTableModel model = (DefaultTableModel) tabelaUsuario.getModel();
        model.setNumRows(0);
        int t=0;
        while(t<lista.size()){
            model.addRow(lista.get(t).toString().split(";"));
            t++;
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UsuarioGUI dialog = new UsuarioGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editarBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton novoBt;
    private javax.swing.JButton removerBT;
    private javax.swing.JButton sairBT;
    private javax.swing.JTextField senhaCampo;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField userCampo;
    // End of variables declaration//GEN-END:variables
}