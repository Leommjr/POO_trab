/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author vinil
 */
public class TelaGerente extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaGerente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraMenu = new javax.swing.JMenuBar();
        arquivoMenu = new javax.swing.JMenu();
        saveExit = new javax.swing.JMenuItem();
        cadatrarMenu = new javax.swing.JMenu();
        cadastroConta = new javax.swing.JMenuItem();
        cadastroCliente = new javax.swing.JMenuItem();
        editarMenu = new javax.swing.JMenu();
        editaConta = new javax.swing.JMenuItem();
        editaCliente = new javax.swing.JMenuItem();
        removeMenu = new javax.swing.JMenu();
        removeCliente = new javax.swing.JMenuItem();
        removeConta = new javax.swing.JMenuItem();
        ajudaMenu = new javax.swing.JMenu();
        ajudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco DBC");

        arquivoMenu.setText("Arquivo");

        saveExit.setText("Salvar e Sair");
        saveExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveExitActionPerformed(evt);
            }
        });
        arquivoMenu.add(saveExit);

        barraMenu.add(arquivoMenu);

        cadatrarMenu.setText("Cadastrar");

        cadastroConta.setText("Conta");
        cadastroConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroContaActionPerformed(evt);
            }
        });
        cadatrarMenu.add(cadastroConta);

        cadastroCliente.setText("Cliente");
        cadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroClienteActionPerformed(evt);
            }
        });
        cadatrarMenu.add(cadastroCliente);

        barraMenu.add(cadatrarMenu);

        editarMenu.setText("Editar");

        editaConta.setText("Conta");
        editarMenu.add(editaConta);

        editaCliente.setText("Cliente");
        editarMenu.add(editaCliente);

        barraMenu.add(editarMenu);

        removeMenu.setText("Remover");

        removeCliente.setText("Cliente");
        removeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeClienteActionPerformed(evt);
            }
        });
        removeMenu.add(removeCliente);

        removeConta.setText("Conta");
        removeConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeContaActionPerformed(evt);
            }
        });
        removeMenu.add(removeConta);

        barraMenu.add(removeMenu);

        ajudaMenu.setText("Ajuda");
        ajudaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajudaMenuActionPerformed(evt);
            }
        });

        ajudaSobre.setText("Sobre");
        ajudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajudaSobreActionPerformed(evt);
            }
        });
        ajudaMenu.add(ajudaSobre);

        barraMenu.add(ajudaMenu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 341));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ajudaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaMenuActionPerformed
        
    }//GEN-LAST:event_ajudaMenuActionPerformed

    private void ajudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaSobreActionPerformed
        JOptionPane.showMessageDialog(null, "Bem vindo ao Banco DBC, selecione a operação.");
    }//GEN-LAST:event_ajudaSobreActionPerformed

    private void saveExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_saveExitActionPerformed

    private void cadastroContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroContaActionPerformed
        CadastroConta cadConta = new CadastroConta(this, true);
        cadConta.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        cadConta.setTitle("Cadastro da Conta");
        cadConta.setLocationRelativeTo(null);
        cadConta.setResizable(false);
        cadConta.setVisible(true);
    }//GEN-LAST:event_cadastroContaActionPerformed

    private void cadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroClienteActionPerformed
        CadastroCliente cadCliente = new CadastroCliente(this, true);
        cadCliente.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        cadCliente.setTitle("Cadastro do Cliente");
        cadCliente.setLocationRelativeTo(null);
        cadCliente.setResizable(false);
        cadCliente.setVisible(true);
    }//GEN-LAST:event_cadastroClienteActionPerformed

    private void removeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeClienteActionPerformed
        RemoveCliente remCliente = new RemoveCliente(this, true);
        remCliente.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        remCliente.setTitle("Remoção Cliente");
        remCliente.setLocationRelativeTo(null);
        remCliente.setResizable(false);
        remCliente.setVisible(true);
    }//GEN-LAST:event_removeClienteActionPerformed

    private void removeContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeContaActionPerformed
        RemoveConta remConta = new RemoveConta(this, true);
        remConta.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        remConta.setTitle("Remoção Conta");
        remConta.setLocationRelativeTo(null);
        remConta.setResizable(false);
        remConta.setVisible(true);
    }//GEN-LAST:event_removeContaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new TelaAdmin().setVisible(true);
                TelaGerente telaPrincipal = new TelaGerente();
                telaPrincipal.setLocationRelativeTo(null);
                telaPrincipal.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ajudaMenu;
    private javax.swing.JMenuItem ajudaSobre;
    private javax.swing.JMenu arquivoMenu;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem cadastroCliente;
    private javax.swing.JMenuItem cadastroConta;
    private javax.swing.JMenu cadatrarMenu;
    private javax.swing.JMenuItem editaCliente;
    private javax.swing.JMenuItem editaConta;
    private javax.swing.JMenu editarMenu;
    private javax.swing.JMenuItem removeCliente;
    private javax.swing.JMenuItem removeConta;
    private javax.swing.JMenu removeMenu;
    private javax.swing.JMenuItem saveExit;
    // End of variables declaration//GEN-END:variables
}
