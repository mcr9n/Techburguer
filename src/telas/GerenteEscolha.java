/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author Marcelo Piano
 */
public class GerenteEscolha extends javax.swing.JFrame {

	/**
	 * Creates new form GerenteEscolha
	 */
	public GerenteEscolha() {
		initComponents();
		setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize
	 * the form. WARNING: Do NOT modify this code. The content of this
	 * method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGerenteEscolha = new javax.swing.JPanel();
        btnVoltarGerenteEscolha = new javax.swing.JButton();
        btnEstoqueGerenteEscolha = new javax.swing.JButton();
        btnCadastroFuncionariosGerenteEscolha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/sanduiche.png")).getImage());

        pnlGerenteEscolha.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione"));

        btnVoltarGerenteEscolha.setText("Voltar");
        btnVoltarGerenteEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarGerenteEscolhaActionPerformed(evt);
            }
        });

        btnEstoqueGerenteEscolha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/estoque.png"))); // NOI18N
        btnEstoqueGerenteEscolha.setText("Estoque");
        btnEstoqueGerenteEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueGerenteEscolhaActionPerformed(evt);
            }
        });

        btnCadastroFuncionariosGerenteEscolha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png"))); // NOI18N
        btnCadastroFuncionariosGerenteEscolha.setText("Cadastro Funcionarios");
        btnCadastroFuncionariosGerenteEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroFuncionariosGerenteEscolhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGerenteEscolhaLayout = new javax.swing.GroupLayout(pnlGerenteEscolha);
        pnlGerenteEscolha.setLayout(pnlGerenteEscolhaLayout);
        pnlGerenteEscolhaLayout.setHorizontalGroup(
            pnlGerenteEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGerenteEscolhaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnEstoqueGerenteEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastroFuncionariosGerenteEscolha)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGerenteEscolhaLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btnVoltarGerenteEscolha, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addGap(161, 161, 161))
        );
        pnlGerenteEscolhaLayout.setVerticalGroup(
            pnlGerenteEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGerenteEscolhaLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(pnlGerenteEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastroFuncionariosGerenteEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstoqueGerenteEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btnVoltarGerenteEscolha)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGerenteEscolha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGerenteEscolha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstoqueGerenteEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueGerenteEscolhaActionPerformed
		// TODO add your handling code here:
		new Estoque().setVisible(true);

    }//GEN-LAST:event_btnEstoqueGerenteEscolhaActionPerformed

    private void btnVoltarGerenteEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarGerenteEscolhaActionPerformed
		// TODO add your handling code here:
		this.setVisible(false);
    }//GEN-LAST:event_btnVoltarGerenteEscolhaActionPerformed

    private void btnCadastroFuncionariosGerenteEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroFuncionariosGerenteEscolhaActionPerformed
		// TODO add your handling code here:
		new CadastroFuncionario().setVisible(true);
    }//GEN-LAST:event_btnCadastroFuncionariosGerenteEscolhaActionPerformed

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
			java.util.logging.Logger.getLogger(GerenteEscolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GerenteEscolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GerenteEscolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GerenteEscolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GerenteEscolha().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroFuncionariosGerenteEscolha;
    private javax.swing.JButton btnEstoqueGerenteEscolha;
    private javax.swing.JButton btnVoltarGerenteEscolha;
    private javax.swing.JPanel pnlGerenteEscolha;
    // End of variables declaration//GEN-END:variables
}
