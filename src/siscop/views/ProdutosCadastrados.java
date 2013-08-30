package siscop.views;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import siscop.controllers.CadastroPedidoController;
import siscop.dao.SalvarEntidades;
import siscop.entidades.Produto;

/**
 *
 * @author Rafael
 */
public class ProdutosCadastrados extends javax.swing.JFrame {

    private SalvarEntidades dao = new SalvarEntidades();
    private Produto produto = new Produto();
    private CadastroPedido pedido = null;

    public ProdutosCadastrados() {
        initComponents();
        preencherTabela();
    }

    public ProdutosCadastrados(CadastroPedido pedido) {
        this();
        this.pedido = pedido;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textValorProd = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutosCadastrados = new javax.swing.JTable();
        btnIncluir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        textCodProduto1 = new javax.swing.JTextField();
        textDescProduto1 = new javax.swing.JTextField();
        textValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));

        textValorProd.setBackground(new java.awt.Color(0, 153, 153));

        tableProdutosCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProdutosCadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutosCadastradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProdutosCadastrados);
        tableProdutosCadastrados.getColumnModel().getColumn(0).setResizable(false);
        tableProdutosCadastrados.getColumnModel().getColumn(0).setPreferredWidth(15);
        tableProdutosCadastrados.getColumnModel().getColumn(1).setResizable(false);
        tableProdutosCadastrados.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableProdutosCadastrados.getColumnModel().getColumn(2).setResizable(false);
        tableProdutosCadastrados.getColumnModel().getColumn(2).setPreferredWidth(15);

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siscop/views/Add.png"))); // NOI18N
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siscop/views/Cancelar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        textCodProduto1.setEditable(false);

        textDescProduto1.setEditable(false);

        textValor.setEditable(false);

        javax.swing.GroupLayout textValorProdLayout = new javax.swing.GroupLayout(textValorProd);
        textValorProd.setLayout(textValorProdLayout);
        textValorProdLayout.setHorizontalGroup(
            textValorProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textValorProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(textValorProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(textValorProdLayout.createSequentialGroup()
                        .addGroup(textValorProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCodProduto1))
                        .addGap(18, 18, 18)
                        .addGroup(textValorProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(textValorProdLayout.createSequentialGroup()
                                .addComponent(textDescProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        textValorProdLayout.setVerticalGroup(
            textValorProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textValorProdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(textValorProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDescProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(textValorProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(btnIncluir))
                .addGap(190, 190, 190))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textValorProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textValorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableProdutosCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutosCadastradosMouseClicked
        int lin = tableProdutosCadastrados.getSelectedRow();
        textCodProduto1.setText(tableProdutosCadastrados.getModel().getValueAt(lin, 0).toString());
        textDescProduto1.setText(tableProdutosCadastrados.getModel().getValueAt(lin, 1).toString());
        textValor.setText(tableProdutosCadastrados.getModel().getValueAt(lin, 2).toString());

    }//GEN-LAST:event_tableProdutosCadastradosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        String cod1 = textCodProduto1.getText();
        String desc1 = textDescProduto1.getText();
        String valor1 = textValor.getText();        
        pedido.preencheCamposTexto(cod1, desc1, valor1);   

//        CadastroPedidoController.getInstancia().exibirInterfaceGrafica();
        this.dispose();
    }//GEN-LAST:event_btnIncluirActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProdutosCadastrados;
    private javax.swing.JTextField textCodProduto1;
    private javax.swing.JTextField textDescProduto1;
    private javax.swing.JTextField textValor;
    private javax.swing.JPanel textValorProd;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        List<Produto> produtos = dao.ListarProdutos();

        DefaultTableModel modelo = (DefaultTableModel) tableProdutosCadastrados.getModel();

        for (Produto objeto : produtos) {

            modelo.addRow(new Object[]{objeto.getId(), objeto.getDescricao(), objeto.getValor()});

        }
    }
}
