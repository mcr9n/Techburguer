/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.Produto;
import java.util.ArrayList;

/**
 *
 * @author dapedu
 */
public class FazerPedido extends javax.swing.JFrame {
    public ArrayList<Produto> produtosDisponiveis;
    private boolean pedidoDeAniversario;
    
    
    

    /**
     * Creates new form ProdutosDisponíveis
     */
    public FazerPedido() {
        this.produtosDisponiveis = new ArrayList();   
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

        MenuDeAbas = new javax.swing.JTabbedPane();
        Produtos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutosDisponiveis = new javax.swing.JTable();
        botaoAdicionarAoCarrinho = new javax.swing.JButton();
        Carrinho = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        botaoExcluir = new javax.swing.JButton();
        Checkout = new javax.swing.JPanel();
        botaoFinalizarPedido = new javax.swing.JButton();
        valorTotal = new java.awt.Label();
        label2 = new java.awt.Label();
        checkBoxPedidoDeAniversario = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produtos Disponíveis");

        tabelaProdutosDisponiveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Preço (R$)", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProdutosDisponiveis);

        botaoAdicionarAoCarrinho.setText("Adicionar ao Carrinho");

        javax.swing.GroupLayout ProdutosLayout = new javax.swing.GroupLayout(Produtos);
        Produtos.setLayout(ProdutosLayout);
        ProdutosLayout.setHorizontalGroup(
            ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutosLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jScrollPane1)
                .addGap(153, 153, 153))
            .addGroup(ProdutosLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(botaoAdicionarAoCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(286, 286, 286))
        );
        ProdutosLayout.setVerticalGroup(
            ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoAdicionarAoCarrinho)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        MenuDeAbas.addTab("Produtos", Produtos);

        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Preço (R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaCarrinho);

        botaoExcluir.setText("Excluir Produto");

        javax.swing.GroupLayout CarrinhoLayout = new javax.swing.GroupLayout(Carrinho);
        Carrinho.setLayout(CarrinhoLayout);
        CarrinhoLayout.setHorizontalGroup(
            CarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarrinhoLayout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(316, 316, 316))
            .addGroup(CarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CarrinhoLayout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addComponent(jScrollPane2)
                    .addGap(134, 134, 134)))
        );
        CarrinhoLayout.setVerticalGroup(
            CarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarrinhoLayout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addComponent(botaoExcluir)
                .addGap(58, 58, 58))
            .addGroup(CarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CarrinhoLayout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );

        MenuDeAbas.addTab("Carrinho", Carrinho);

        botaoFinalizarPedido.setText("Finalizar Pedido");
        botaoFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarPedidoActionPerformed(evt);
            }
        });

        valorTotal.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        valorTotal.setForeground(new java.awt.Color(187, 187, 187));
        valorTotal.setText("R$ **,**");

        label2.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(187, 187, 187));
        label2.setText("Valor total:");

        checkBoxPedidoDeAniversario.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        checkBoxPedidoDeAniversario.setText("Pedido de Aniversário");
        checkBoxPedidoDeAniversario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxPedidoDeAniversarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CheckoutLayout = new javax.swing.GroupLayout(Checkout);
        Checkout.setLayout(CheckoutLayout);
        CheckoutLayout.setHorizontalGroup(
            CheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckoutLayout.createSequentialGroup()
                .addGroup(CheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CheckoutLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(botaoFinalizarPedido))
                    .addGroup(CheckoutLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(CheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkBoxPedidoDeAniversario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(CheckoutLayout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        CheckoutLayout.setVerticalGroup(
            CheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CheckoutLayout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(checkBoxPedidoDeAniversario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(botaoFinalizarPedido)
                .addGap(175, 175, 175))
        );

        MenuDeAbas.addTab("Checkout", Checkout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuDeAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuDeAbas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoFinalizarPedidoActionPerformed

    private void checkBoxPedidoDeAniversarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxPedidoDeAniversarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxPedidoDeAniversarioActionPerformed

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
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FazerPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Carrinho;
    private javax.swing.JPanel Checkout;
    private javax.swing.JTabbedPane MenuDeAbas;
    private javax.swing.JPanel Produtos;
    private javax.swing.JButton botaoAdicionarAoCarrinho;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoFinalizarPedido;
    private javax.swing.JCheckBox checkBoxPedidoDeAniversario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label2;
    private javax.swing.JTable tabelaCarrinho;
    private javax.swing.JTable tabelaProdutosDisponiveis;
    private java.awt.Label valorTotal;
    // End of variables declaration//GEN-END:variables
}