/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Caixa;
import classes.Cozinheiro;
import classes.Funcionario;
import classes.Pedido;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static telas.TelaInicial.ListaFuncionario;
import static telas.TelaInicial.listaPedidos;

/**
 *
 * @author 144fps
 */
public class CadastroFuncionario extends javax.swing.JFrame {

	String botao_apertado;

	/**
	 * Creates new form CadastroFuncionario
	 */
	public CadastroFuncionario() {
		initComponents();
		setLocationRelativeTo(null);

		//Habilitar ou desabilitar botões:
		btnNovoCadastroFuncionario.setEnabled(true);
		btnSalvarCadastroFuncionario.setEnabled(false);
		btnCancelarCadastroFuncionario.setEnabled(false);
		btnEditarCadastroFuncionario.setEnabled(false);
		btnExcluirCadastroFuncionario.setEnabled(false);
		btnPesquisarCadastroFuncionario.setEnabled(true);
		btnOKCadastroFuncionario.setEnabled(false);
		cmbOcupacaoCadastroFuncionario.setEnabled(false);

		//Habilitar ou Desabilitar os textos:
		txtCpfCadastroFuncionario.setEnabled(false);
		txtNomeCadastroFuncionario.setEnabled(false);
		txtDataNascimentoCadastroFuncionario.setEnabled(false);
		txtSenhaFuncionarioCadastroFuncionario.setEnabled(false);
		txtSalarioCadastroFuncionario.setEnabled(false);

		carregarFuncionarios();

	}

	public void carregarTabelaFuncionarios() {
		DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Cpf", "Nome", "Data de Nascimento", "Senha funcionário", "Salário", "Ocupação"}, 0);

		for (int i = 0; i < ListaFuncionario.size(); i++) {
			Object linha[] = new Object[]{ListaFuncionario.get(i).getCpf(),
				ListaFuncionario.get(i).getNome(),
				ListaFuncionario.get(i).getDataDeNascimento(),
				ListaFuncionario.get(i).getSenha(),
				ListaFuncionario.get(i).getSalario(),
				ListaFuncionario.get(i).getOcupacao()};
			modelo.addRow(linha);
		}

		//Tabela recebe o modelo:
		tblFuncionariosCadastroFuncionario.setModel(modelo);

		tblFuncionariosCadastroFuncionario.getColumnModel().getColumn(0).setPreferredWidth(50);
		tblFuncionariosCadastroFuncionario.getColumnModel().getColumn(1).setPreferredWidth(50);
		tblFuncionariosCadastroFuncionario.getColumnModel().getColumn(2).setPreferredWidth(50);
		tblFuncionariosCadastroFuncionario.getColumnModel().getColumn(3).setPreferredWidth(50);
		tblFuncionariosCadastroFuncionario.getColumnModel().getColumn(4).setPreferredWidth(50);
		tblFuncionariosCadastroFuncionario.getColumnModel().getColumn(5).setPreferredWidth(50);
	}

	public void carregarFuncionarios() {
		cmbOcupacaoCadastroFuncionario.removeAllItems();
		cmbOcupacaoCadastroFuncionario.addItem("Selecione a ocupação do funcionário");
		cmbOcupacaoCadastroFuncionario.addItem("Cozinheiro");
		cmbOcupacaoCadastroFuncionario.addItem("Caixa");
	}

	/**
	 * This method is called from within the constructor to initialize
	 * the form. WARNING: Do NOT modify this code. The content of this
	 * method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadastroFuncionario = new javax.swing.JPanel();
        lblSenhaFuncionarioCadastroFuncionario = new javax.swing.JLabel();
        txtSenhaFuncionarioCadastroFuncionario = new javax.swing.JTextField();
        lblSalarioCadastroFuncionario = new javax.swing.JLabel();
        txtSalarioCadastroFuncionario = new javax.swing.JTextField();
        lblOcupacaoCadastroFuncionario = new javax.swing.JLabel();
        cmbOcupacaoCadastroFuncionario = new javax.swing.JComboBox<>();
        lblCpfCadastroFuncionario = new javax.swing.JLabel();
        lblNomeCadastroFuncionario = new javax.swing.JLabel();
        lblDataDeNascimentoCadastroFuncionario = new javax.swing.JLabel();
        txtCpfCadastroFuncionario = new javax.swing.JTextField();
        txtNomeCadastroFuncionario = new javax.swing.JTextField();
        btnOKCadastroFuncionario = new javax.swing.JButton();
        txtDataNascimentoCadastroFuncionario = new javax.swing.JTextField();
        btnNovoCadastroFuncionario = new javax.swing.JButton();
        btnSalvarCadastroFuncionario = new javax.swing.JButton();
        btnCancelarCadastroFuncionario = new javax.swing.JButton();
        btnEditarCadastroFuncionario = new javax.swing.JButton();
        btnExcluirCadastroFuncionario = new javax.swing.JButton();
        btnPesquisarCadastroFuncionario = new javax.swing.JButton();
        scrlpnlCadastroFuncionario = new javax.swing.JScrollPane();
        tblFuncionariosCadastroFuncionario = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/sanduiche.png")).getImage());

        pnlCadastroFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Dados de funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        lblSenhaFuncionarioCadastroFuncionario.setText("SENHA DE FUNCIONÁRIO:");

        lblSalarioCadastroFuncionario.setText("SALÁRIO:");

        lblOcupacaoCadastroFuncionario.setText("OCUPAÇÃO:");

        cmbOcupacaoCadastroFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOcupacaoCadastroFuncionario.setToolTipText("");
        cmbOcupacaoCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOcupacaoCadastroFuncionarioActionPerformed(evt);
            }
        });

        lblCpfCadastroFuncionario.setText("CPF:");

        lblNomeCadastroFuncionario.setText("NOME:");

        lblDataDeNascimentoCadastroFuncionario.setText("DATA DE NASCIMENTO:");

        btnOKCadastroFuncionario.setText("OK");
        btnOKCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKCadastroFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroFuncionarioLayout = new javax.swing.GroupLayout(pnlCadastroFuncionario);
        pnlCadastroFuncionario.setLayout(pnlCadastroFuncionarioLayout);
        pnlCadastroFuncionarioLayout.setHorizontalGroup(
            pnlCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroFuncionarioLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnlCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataDeNascimentoCadastroFuncionario)
                    .addGroup(pnlCadastroFuncionarioLayout.createSequentialGroup()
                        .addComponent(lblNomeCadastroFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomeCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCadastroFuncionarioLayout.createSequentialGroup()
                        .addComponent(lblSalarioCadastroFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(txtSalarioCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCadastroFuncionarioLayout.createSequentialGroup()
                        .addComponent(lblOcupacaoCadastroFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbOcupacaoCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCadastroFuncionarioLayout.createSequentialGroup()
                        .addGroup(pnlCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlCadastroFuncionarioLayout.createSequentialGroup()
                                .addComponent(lblCpfCadastroFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCpfCadastroFuncionario))
                            .addComponent(lblSenhaFuncionarioCadastroFuncionario))
                        .addGroup(pnlCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroFuncionarioLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnOKCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCadastroFuncionarioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDataNascimentoCadastroFuncionario)
                                    .addComponent(txtSenhaFuncionarioCadastroFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCadastroFuncionarioLayout.setVerticalGroup(
            pnlCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroFuncionarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCpfCadastroFuncionario)
                    .addGroup(pnlCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCpfCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOKCadastroFuncionario)))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCadastroFuncionario)
                    .addComponent(txtNomeCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataDeNascimentoCadastroFuncionario)
                    .addComponent(txtDataNascimentoCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaFuncionarioCadastroFuncionario)
                    .addComponent(txtSenhaFuncionarioCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalarioCadastroFuncionario)
                    .addComponent(txtSalarioCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOcupacaoCadastroFuncionario)
                    .addComponent(cmbOcupacaoCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        btnNovoCadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/new.png"))); // NOI18N
        btnNovoCadastroFuncionario.setText("Novo");
        btnNovoCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCadastroFuncionarioActionPerformed(evt);
            }
        });

        btnSalvarCadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar1.png"))); // NOI18N
        btnSalvarCadastroFuncionario.setText("Salvar");
        btnSalvarCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroFuncionarioActionPerformed(evt);
            }
        });

        btnCancelarCadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        btnCancelarCadastroFuncionario.setText("Cancelar");
        btnCancelarCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroFuncionarioActionPerformed(evt);
            }
        });

        btnEditarCadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        btnEditarCadastroFuncionario.setText("Editar");
        btnEditarCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCadastroFuncionarioActionPerformed(evt);
            }
        });

        btnExcluirCadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir1.png"))); // NOI18N
        btnExcluirCadastroFuncionario.setText("Excluir");
        btnExcluirCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCadastroFuncionarioActionPerformed(evt);
            }
        });

        btnPesquisarCadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarCadastroFuncionario.setText("Pesquisar");
        btnPesquisarCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCadastroFuncionarioActionPerformed(evt);
            }
        });

        tblFuncionariosCadastroFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cpf", "Nome", "Data de Nascimento", "Senha funcionário", "Salário", "Ocupação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblFuncionariosCadastroFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncionariosCadastroFuncionarioMouseClicked(evt);
            }
        });
        scrlpnlCadastroFuncionario.setViewportView(tblFuncionariosCadastroFuncionario);
        if (tblFuncionariosCadastroFuncionario.getColumnModel().getColumnCount() > 0) {
            tblFuncionariosCadastroFuncionario.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblFuncionariosCadastroFuncionario.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblFuncionariosCadastroFuncionario.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblFuncionariosCadastroFuncionario.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblFuncionariosCadastroFuncionario.getColumnModel().getColumn(4).setPreferredWidth(50);
            tblFuncionariosCadastroFuncionario.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCadastroFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrlpnlCadastroFuncionario)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovoCadastroFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addComponent(btnSalvarCadastroFuncionario)
                        .addGap(42, 42, 42)
                        .addComponent(btnCancelarCadastroFuncionario)
                        .addGap(39, 39, 39)
                        .addComponent(btnEditarCadastroFuncionario)
                        .addGap(49, 49, 49)
                        .addComponent(btnExcluirCadastroFuncionario)
                        .addGap(51, 51, 51)
                        .addComponent(btnPesquisarCadastroFuncionario)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(314, 314, 314))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCadastroFuncionario)
                    .addComponent(btnEditarCadastroFuncionario)
                    .addComponent(btnExcluirCadastroFuncionario)
                    .addComponent(btnPesquisarCadastroFuncionario)
                    .addComponent(btnSalvarCadastroFuncionario)
                    .addComponent(btnNovoCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrlpnlCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCadastroFuncionarioActionPerformed
		// TODO add your handling code here:
		botao_apertado = "novo";

		//Habilitar ou desabilitar botões:
		btnNovoCadastroFuncionario.setEnabled(false);
		btnSalvarCadastroFuncionario.setEnabled(true);
		btnCancelarCadastroFuncionario.setEnabled(true);
		btnEditarCadastroFuncionario.setEnabled(false);
		btnExcluirCadastroFuncionario.setEnabled(false);
		btnPesquisarCadastroFuncionario.setEnabled(false);
		btnOKCadastroFuncionario.setEnabled(false);
		cmbOcupacaoCadastroFuncionario.setEnabled(true);

		//Habilitar ou Desabilitar os textos:
		txtCpfCadastroFuncionario.setEnabled(true);
		txtNomeCadastroFuncionario.setEnabled(true);
		txtDataNascimentoCadastroFuncionario.setEnabled(true);
		txtSenhaFuncionarioCadastroFuncionario.setEnabled(true);
		txtSalarioCadastroFuncionario.setEnabled(true);

		txtCpfCadastroFuncionario.requestFocus();
		carregarFuncionarios();

    }//GEN-LAST:event_btnNovoCadastroFuncionarioActionPerformed

    private void cmbOcupacaoCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOcupacaoCadastroFuncionarioActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_cmbOcupacaoCadastroFuncionarioActionPerformed

    private void btnSalvarCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroFuncionarioActionPerformed
		// TODO add your handling code here:
		int indexFuncionarioComboBox = cmbOcupacaoCadastroFuncionario.getSelectedIndex();

		if (txtCpfCadastroFuncionario.getText().equals("") || txtNomeCadastroFuncionario.getText().equals("") || txtDataNascimentoCadastroFuncionario.getText().equals("")
				|| txtSenhaFuncionarioCadastroFuncionario.getText().equals("") || txtSalarioCadastroFuncionario.getText().equals("")) {

			JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Aviso.", JOptionPane.PLAIN_MESSAGE);

			txtCpfCadastroFuncionario.requestFocus();
		} else if (indexFuncionarioComboBox == 0 && botao_apertado.equals("novo")) {
			JOptionPane.showMessageDialog(null, "Você deve selecionar uma ocupação!", "Aviso.", JOptionPane.PLAIN_MESSAGE);
		} else {
			String cpf = txtCpfCadastroFuncionario.getText();
			String nome = txtNomeCadastroFuncionario.getText();
			String dataNascimento = txtDataNascimentoCadastroFuncionario.getText();
			String senha = txtSenhaFuncionarioCadastroFuncionario.getText();
			float salario = Float.parseFloat(txtSalarioCadastroFuncionario.getText());

			if (botao_apertado.equals("novo")) {
				if (indexFuncionarioComboBox == 1) {

					Cozinheiro cozinheiro = new Cozinheiro(senha, salario, cpf, nome, dataNascimento);

					cozinheiro.setOcupacao("Cozinheiro");

					ListaFuncionario.add(cozinheiro);

					JOptionPane.showMessageDialog(null, "Cozinheiro adicionado com sucesso!", "Aviso.", JOptionPane.PLAIN_MESSAGE);
				} else if (indexFuncionarioComboBox == 2) {
					Caixa caixa = new Caixa(senha, salario, cpf, nome, dataNascimento);

					caixa.setOcupacao("Caixa");

					ListaFuncionario.add(caixa);

					JOptionPane.showMessageDialog(null, "Caixa adicionado com sucesso!", "Aviso.", JOptionPane.PLAIN_MESSAGE);
				}
			} else if (botao_apertado.equals("editar")) {
				int indexLinhaSelecionada = tblFuncionariosCadastroFuncionario.getSelectedRow();

				ListaFuncionario.get(indexLinhaSelecionada).setCpf(cpf);
				ListaFuncionario.get(indexLinhaSelecionada).setNome(nome);
				ListaFuncionario.get(indexLinhaSelecionada).setDataDeNascimento(dataNascimento);
				ListaFuncionario.get(indexLinhaSelecionada).setSenha(senha);
				ListaFuncionario.get(indexLinhaSelecionada).setSalario(salario);
			}

			//Limpar os textos:
			txtCpfCadastroFuncionario.setText("");
			txtNomeCadastroFuncionario.setText("");
			txtDataNascimentoCadastroFuncionario.setText("");
			txtSenhaFuncionarioCadastroFuncionario.setText("");
			txtSalarioCadastroFuncionario.setText("");

			//Habilitar ou desabilitar botões:
			btnNovoCadastroFuncionario.setEnabled(true);
			btnSalvarCadastroFuncionario.setEnabled(false);
			btnCancelarCadastroFuncionario.setEnabled(false);
			btnEditarCadastroFuncionario.setEnabled(false);
			btnExcluirCadastroFuncionario.setEnabled(false);
			btnPesquisarCadastroFuncionario.setEnabled(true);
			btnOKCadastroFuncionario.setEnabled(false);
			cmbOcupacaoCadastroFuncionario.setEnabled(false);

			//Habilitar ou Desabilitar os textos:
			txtCpfCadastroFuncionario.setEnabled(false);
			txtNomeCadastroFuncionario.setEnabled(false);
			txtDataNascimentoCadastroFuncionario.setEnabled(false);
			txtSenhaFuncionarioCadastroFuncionario.setEnabled(false);
			txtSalarioCadastroFuncionario.setEnabled(false);

			carregarTabelaFuncionarios();

		}

    }//GEN-LAST:event_btnSalvarCadastroFuncionarioActionPerformed

    private void btnCancelarCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroFuncionarioActionPerformed
		// TODO add your handling code here:

		//Limpar os textos:
		txtCpfCadastroFuncionario.setText("");
		txtNomeCadastroFuncionario.setText("");
		txtDataNascimentoCadastroFuncionario.setText("");
		txtSenhaFuncionarioCadastroFuncionario.setText("");
		txtSalarioCadastroFuncionario.setText("");

		//Habilitar ou desabilitar botões:
		btnNovoCadastroFuncionario.setEnabled(true);
		btnSalvarCadastroFuncionario.setEnabled(false);
		btnCancelarCadastroFuncionario.setEnabled(false);
		btnEditarCadastroFuncionario.setEnabled(false);
		btnExcluirCadastroFuncionario.setEnabled(false);
		btnPesquisarCadastroFuncionario.setEnabled(true);
		btnOKCadastroFuncionario.setEnabled(false);
		cmbOcupacaoCadastroFuncionario.setEnabled(false);

		//Habilitar ou Desabilitar os textos:
		txtCpfCadastroFuncionario.setEnabled(false);
		txtNomeCadastroFuncionario.setEnabled(false);
		txtDataNascimentoCadastroFuncionario.setEnabled(false);
		txtSenhaFuncionarioCadastroFuncionario.setEnabled(false);
		txtSalarioCadastroFuncionario.setEnabled(false);

		carregarFuncionarios();
    }//GEN-LAST:event_btnCancelarCadastroFuncionarioActionPerformed

    private void btnEditarCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCadastroFuncionarioActionPerformed
		// TODO add your handling code here:

		botao_apertado = "editar";

		//Habilitar ou desabilitar botões:
		btnNovoCadastroFuncionario.setEnabled(false);
		btnSalvarCadastroFuncionario.setEnabled(true);
		btnCancelarCadastroFuncionario.setEnabled(true);
		btnEditarCadastroFuncionario.setEnabled(false);
		btnExcluirCadastroFuncionario.setEnabled(false);
		btnPesquisarCadastroFuncionario.setEnabled(false);
		btnOKCadastroFuncionario.setEnabled(false);
		cmbOcupacaoCadastroFuncionario.setEnabled(false);

		//Habilitar ou Desabilitar os textos:
		txtCpfCadastroFuncionario.setEnabled(true);
		txtNomeCadastroFuncionario.setEnabled(true);
		txtDataNascimentoCadastroFuncionario.setEnabled(true);
		txtSenhaFuncionarioCadastroFuncionario.setEnabled(true);
		txtSalarioCadastroFuncionario.setEnabled(true);

		txtCpfCadastroFuncionario.requestFocus();
		carregarFuncionarios();

    }//GEN-LAST:event_btnEditarCadastroFuncionarioActionPerformed

    private void btnExcluirCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadastroFuncionarioActionPerformed
		// TODO add your handling code here:

		//Guardar indice da linha selecionada:
		int indexLinha = tblFuncionariosCadastroFuncionario.getSelectedRow();

		//Verificar se a linha é valida:
		if (indexLinha >= 0 && indexLinha < ListaFuncionario.size()) {
			ListaFuncionario.remove(indexLinha);
		}

		//carregar tabela:
		carregarTabelaFuncionarios();

		//Limpar os textos:
		txtCpfCadastroFuncionario.setText("");
		txtNomeCadastroFuncionario.setText("");
		txtDataNascimentoCadastroFuncionario.setText("");
		txtSenhaFuncionarioCadastroFuncionario.setText("");
		txtSalarioCadastroFuncionario.setText("");

		//Habilitar ou desabilitar botões:
		btnNovoCadastroFuncionario.setEnabled(true);
		btnSalvarCadastroFuncionario.setEnabled(false);
		btnCancelarCadastroFuncionario.setEnabled(false);
		btnEditarCadastroFuncionario.setEnabled(false);
		btnExcluirCadastroFuncionario.setEnabled(false);
		btnPesquisarCadastroFuncionario.setEnabled(true);
		btnOKCadastroFuncionario.setEnabled(false);
		cmbOcupacaoCadastroFuncionario.setEnabled(false);

		//Habilitar ou Desabilitar os textos:
		txtCpfCadastroFuncionario.setEnabled(false);
		txtNomeCadastroFuncionario.setEnabled(false);
		txtDataNascimentoCadastroFuncionario.setEnabled(false);
		txtSenhaFuncionarioCadastroFuncionario.setEnabled(false);
		txtSalarioCadastroFuncionario.setEnabled(false);

		carregarFuncionarios();

    }//GEN-LAST:event_btnExcluirCadastroFuncionarioActionPerformed

    private void btnPesquisarCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCadastroFuncionarioActionPerformed
		// TODO add your handling code here:

		if (ListaFuncionario.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado!", "Aviso.", JOptionPane.PLAIN_MESSAGE);
		} else {

			//Habilitar ou desabilitar botões:
			btnNovoCadastroFuncionario.setEnabled(false);
			btnSalvarCadastroFuncionario.setEnabled(false);
			btnCancelarCadastroFuncionario.setEnabled(true);
			btnEditarCadastroFuncionario.setEnabled(false);
			btnExcluirCadastroFuncionario.setEnabled(false);
			btnPesquisarCadastroFuncionario.setEnabled(true);
			btnOKCadastroFuncionario.setEnabled(true);
			cmbOcupacaoCadastroFuncionario.setEnabled(false);

			//Habilitar ou Desabilitar os textos:
			txtCpfCadastroFuncionario.setEnabled(true);
			txtNomeCadastroFuncionario.setEnabled(false);
			txtDataNascimentoCadastroFuncionario.setEnabled(false);
			txtSenhaFuncionarioCadastroFuncionario.setEnabled(false);
			txtSalarioCadastroFuncionario.setEnabled(false);

			txtCpfCadastroFuncionario.requestFocus();
		}
    }//GEN-LAST:event_btnPesquisarCadastroFuncionarioActionPerformed

    private void btnOKCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKCadastroFuncionarioActionPerformed
		// TODO add your handling code here:

		if (txtCpfCadastroFuncionario.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "O CPF deve ser informado!", "Aviso.", JOptionPane.PLAIN_MESSAGE);
		} else {
			Funcionario fun;

			String cpf = "", nome = "", dataNascimento = "", senha = "", salario = "", ocupacao = "";

			String cpfPesquisado = txtCpfCadastroFuncionario.getText();

			for (int i = 0; i < ListaFuncionario.size(); i++) {
				fun = ListaFuncionario.get(i);

				if (cpfPesquisado == fun.getCpf()) {
					cpf = String.valueOf(fun.getCpf());
					nome = fun.getNome();
					dataNascimento = fun.getDataDeNascimento();
					senha = fun.getSenha();
					salario = String.valueOf(fun.getSalario());
					ocupacao = fun.getOcupacao();
				}
			}
			if (cpf.equals("")) {
				JOptionPane.showMessageDialog(null, "Este funcionario não está no sistema!", "Aviso", JOptionPane.PLAIN_MESSAGE);

				//Limpar textos:
				txtCpfCadastroFuncionario.setText("");
				txtNomeCadastroFuncionario.setText("");
				txtDataNascimentoCadastroFuncionario.setText("");
				txtSenhaFuncionarioCadastroFuncionario.setText("");
				txtSalarioCadastroFuncionario.setText("");
				cmbOcupacaoCadastroFuncionario.removeAllItems();

			} else {
				txtCpfCadastroFuncionario.setText(cpf);
				txtNomeCadastroFuncionario.setText(nome);
				txtDataNascimentoCadastroFuncionario.setText(dataNascimento);
				txtSenhaFuncionarioCadastroFuncionario.setText(senha);
				txtSalarioCadastroFuncionario.setText(salario);
				cmbOcupacaoCadastroFuncionario.removeAllItems();
				cmbOcupacaoCadastroFuncionario.addItem(ocupacao);
			}

			txtCpfCadastroFuncionario.selectAll();
			txtCpfCadastroFuncionario.requestFocus();
		}

    }//GEN-LAST:event_btnOKCadastroFuncionarioActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
		// TODO add your handling code here:
		this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void tblFuncionariosCadastroFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuncionariosCadastroFuncionarioMouseClicked
		// TODO add your handling code here:

		//Guardar o indice da linha selecionada:
		int indiceLinha = tblFuncionariosCadastroFuncionario.getSelectedRow();

		//Verificar se o índice é válido:
		if (indiceLinha >= 0 && indiceLinha < ListaFuncionario.size()) {

			Funcionario fun = ListaFuncionario.get(indiceLinha);
			txtCpfCadastroFuncionario.setText(String.valueOf(fun.getCpf()));
			txtNomeCadastroFuncionario.setText(fun.getNome());
			txtDataNascimentoCadastroFuncionario.setText(fun.getDataDeNascimento());
			txtSenhaFuncionarioCadastroFuncionario.setText(fun.getSenha());
			txtSalarioCadastroFuncionario.setText(String.valueOf(fun.getSalario()));
			cmbOcupacaoCadastroFuncionario.removeAllItems();
			cmbOcupacaoCadastroFuncionario.addItem(fun.getOcupacao());

			//Habilitar ou desabilitar botões:
			btnNovoCadastroFuncionario.setEnabled(false);
			btnSalvarCadastroFuncionario.setEnabled(false);
			btnCancelarCadastroFuncionario.setEnabled(true);
			btnEditarCadastroFuncionario.setEnabled(true);
			btnExcluirCadastroFuncionario.setEnabled(true);
			btnPesquisarCadastroFuncionario.setEnabled(false);
			btnOKCadastroFuncionario.setEnabled(false);
			cmbOcupacaoCadastroFuncionario.setEnabled(false);

			//Habilitar ou Desabilitar os textos:
			txtCpfCadastroFuncionario.setEnabled(false);
			txtNomeCadastroFuncionario.setEnabled(false);
			txtDataNascimentoCadastroFuncionario.setEnabled(false);
			txtSenhaFuncionarioCadastroFuncionario.setEnabled(false);
			txtSalarioCadastroFuncionario.setEnabled(false);
		}
    }//GEN-LAST:event_tblFuncionariosCadastroFuncionarioMouseClicked

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
			java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CadastroFuncionario().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCadastroFuncionario;
    private javax.swing.JButton btnEditarCadastroFuncionario;
    private javax.swing.JButton btnExcluirCadastroFuncionario;
    private javax.swing.JButton btnNovoCadastroFuncionario;
    private javax.swing.JButton btnOKCadastroFuncionario;
    private javax.swing.JButton btnPesquisarCadastroFuncionario;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarCadastroFuncionario;
    private javax.swing.JComboBox<String> cmbOcupacaoCadastroFuncionario;
    private javax.swing.JLabel lblCpfCadastroFuncionario;
    private javax.swing.JLabel lblDataDeNascimentoCadastroFuncionario;
    private javax.swing.JLabel lblNomeCadastroFuncionario;
    private javax.swing.JLabel lblOcupacaoCadastroFuncionario;
    private javax.swing.JLabel lblSalarioCadastroFuncionario;
    private javax.swing.JLabel lblSenhaFuncionarioCadastroFuncionario;
    private javax.swing.JPanel pnlCadastroFuncionario;
    private javax.swing.JScrollPane scrlpnlCadastroFuncionario;
    private javax.swing.JTable tblFuncionariosCadastroFuncionario;
    private javax.swing.JTextField txtCpfCadastroFuncionario;
    private javax.swing.JTextField txtDataNascimentoCadastroFuncionario;
    private javax.swing.JTextField txtNomeCadastroFuncionario;
    private javax.swing.JTextField txtSalarioCadastroFuncionario;
    private javax.swing.JTextField txtSenhaFuncionarioCadastroFuncionario;
    // End of variables declaration//GEN-END:variables
}
