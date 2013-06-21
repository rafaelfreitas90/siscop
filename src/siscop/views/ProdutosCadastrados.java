package siscop.views;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import siscop.dao.SalvarEntidades;
import siscop.entidades.Produto;

/**
 *
 * @author Rafael
 */
public class ProdutosCadastrados extends javax.swing.JFrame {

    private SalvarEntidades dao = new SalvarEntidades();
    private Produto produto = new Produto();
    private CadastroPedido pedido;

    public ProdutosCadastrados() {
        initComponents();
        preencherTabela();
    }
    
        public ProdutosCadastrados(CadastroPedido pedido) {
        initComponents();
        this.pedido = pedido;      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutosCadastrados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siscop/views/Add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siscop/views/Cancelar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(190, 190, 190))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableProdutosCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutosCadastradosMouseClicked
         int lin = tableProdutosCadastrados.getSelectedRow();
        (tableProdutosCadastrados.getModel().getValueAt(lin, 0).toString());
        textNome.setText(tableProdutosCadastrados.getModel().getValueAt(lin, 1).toString());
        textTel.setText(tableProdutosCadastrados.getModel().getValueAt(lin, 2).toString());
        textCnpj.setText(tableProdutosCadastrados.getModel().getValueAt(lin, 3).toString());
    }//GEN-LAST:event_tableProdutosCadastradosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProdutosCadastrados;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        List<Produto> produtos = dao.ListarProdutos();

        DefaultTableModel modelo = (DefaultTableModel) tableProdutosCadastrados.getModel();

        for (Produto objeto : produtos) {
            
            modelo.addRow(new Object[]{objeto.getId(), objeto.getDescricao(), objeto.getValor()});
            
        }
    }
    
    
}
