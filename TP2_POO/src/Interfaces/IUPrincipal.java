/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Martines
 */
public class IUPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form IUPrincipal
     */
    public IUPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        menuItemCliente = new javax.swing.JMenuItem();
        menuItemGerente = new javax.swing.JMenuItem();
        menuItemVenda = new javax.swing.JMenuItem();
        MenuCadastroProdutos = new javax.swing.JMenu();
        menuItemMoveis = new javax.swing.JMenuItem();
        menuItemEletrodomesticos = new javax.swing.JMenuItem();
        menuItemEletronicos = new javax.swing.JMenuItem();
        menuItemVestuario = new javax.swing.JMenuItem();
        menuItemCadFabricante = new javax.swing.JMenuItem();
        menuItemCadTransportadoras = new javax.swing.JMenuItem();
        MenuRelatorios = new javax.swing.JMenu();
        MenuRelatorioCliente = new javax.swing.JMenu();
        menuItemTodosClientes = new javax.swing.JMenuItem();
        menuItemClientesOuro = new javax.swing.JMenuItem();
        MenuRelatorioGerente = new javax.swing.JMenu();
        menuItemTodosGerentes = new javax.swing.JMenuItem();
        MenuRelatorioVendas = new javax.swing.JMenu();
        menuItemTodasVendas = new javax.swing.JMenuItem();
        menuItemVendMesEsp = new javax.swing.JMenuItem();
        itemMenuVendaDinheiro = new javax.swing.JMenuItem();
        menuItemVendaCartao = new javax.swing.JMenuItem();
        menuItemVendasPIX = new javax.swing.JMenuItem();
        menuItemVendaClienteEspeci = new javax.swing.JMenuItem();
        MenuRelatoriosProdutos = new javax.swing.JMenu();
        menuItemTodosProdutos = new javax.swing.JMenuItem();
        menuItemTodosMoveis = new javax.swing.JMenuItem();
        menuItemTodosEletrodomesticos = new javax.swing.JMenuItem();
        menuItemTodosEletronicos = new javax.swing.JMenuItem();
        menuItemTodosVestuarios = new javax.swing.JMenuItem();
        menuItemProdMaisVend = new javax.swing.JMenuItem();
        menuItemProdOrdA = new javax.swing.JMenuItem();
        ProdOrdB = new javax.swing.JMenuItem();
        MenuRelatorioTRansportadoras = new javax.swing.JMenu();
        menuItemTransport = new javax.swing.JMenuItem();
        menuItemTrasnpMaisTransp = new javax.swing.JMenuItem();
        MenuRelatorioFabricantes = new javax.swing.JMenu();
        menuItemTodosOsFabricantes = new javax.swing.JMenuItem();
        menuItemFabMaisVenda = new javax.swing.JMenuItem();
        menuItemFabMaisLucro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jMenuCadastros.setText("Cadastros ");
        jMenuCadastros.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jMenuCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrosActionPerformed(evt);
            }
        });

        menuItemCliente.setText("Cadastro Cliente");
        menuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(menuItemCliente);

        menuItemGerente.setText("Cadastro Gerente ");
        menuItemGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGerenteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(menuItemGerente);

        menuItemVenda.setText("Cadastro Venda ");
        menuItemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVendaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(menuItemVenda);

        MenuCadastroProdutos.setText("Cadastro Produtos ");

        menuItemMoveis.setText("Móveis");
        menuItemMoveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMoveisActionPerformed(evt);
            }
        });
        MenuCadastroProdutos.add(menuItemMoveis);

        menuItemEletrodomesticos.setText("Elétrodomesticos");
        menuItemEletrodomesticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEletrodomesticosActionPerformed(evt);
            }
        });
        MenuCadastroProdutos.add(menuItemEletrodomesticos);

        menuItemEletronicos.setText("Eletrônicos");
        menuItemEletronicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEletronicosActionPerformed(evt);
            }
        });
        MenuCadastroProdutos.add(menuItemEletronicos);

        menuItemVestuario.setText("Vestuário");
        menuItemVestuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVestuarioActionPerformed(evt);
            }
        });
        MenuCadastroProdutos.add(menuItemVestuario);

        jMenuCadastros.add(MenuCadastroProdutos);

        menuItemCadFabricante.setText("Cadastro Fabricante");
        menuItemCadFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadFabricanteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(menuItemCadFabricante);

        menuItemCadTransportadoras.setText("Cadastro Transportadoras");
        menuItemCadTransportadoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadTransportadorasActionPerformed(evt);
            }
        });
        jMenuCadastros.add(menuItemCadTransportadoras);

        jMenuBar1.add(jMenuCadastros);

        MenuRelatorios.setText("Relatórios");
        MenuRelatorios.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        MenuRelatorioCliente.setText("Relatórios de Cliente");

        menuItemTodosClientes.setText("Todos os Clientes");
        MenuRelatorioCliente.add(menuItemTodosClientes);

        menuItemClientesOuro.setText("Clientes de Ouro");
        MenuRelatorioCliente.add(menuItemClientesOuro);

        MenuRelatorios.add(MenuRelatorioCliente);

        MenuRelatorioGerente.setText("Relatórios de Gerente");

        menuItemTodosGerentes.setText("Todos os Gerentes");
        menuItemTodosGerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTodosGerentesActionPerformed(evt);
            }
        });
        MenuRelatorioGerente.add(menuItemTodosGerentes);

        MenuRelatorios.add(MenuRelatorioGerente);

        MenuRelatorioVendas.setText("Relatórios das Vendas");

        menuItemTodasVendas.setText("Todas as Vendas");
        MenuRelatorioVendas.add(menuItemTodasVendas);

        menuItemVendMesEsp.setText("Vendas Mês Específico e Lucro");
        MenuRelatorioVendas.add(menuItemVendMesEsp);

        itemMenuVendaDinheiro.setText("Vendas Pagas em Dinheiro");
        MenuRelatorioVendas.add(itemMenuVendaDinheiro);

        menuItemVendaCartao.setText("Vendas Pagas no Cartão");
        MenuRelatorioVendas.add(menuItemVendaCartao);

        menuItemVendasPIX.setText("Vendas Pagas no PIX");
        MenuRelatorioVendas.add(menuItemVendasPIX);

        menuItemVendaClienteEspeci.setText("Vendas Cliente Específico");
        MenuRelatorioVendas.add(menuItemVendaClienteEspeci);

        MenuRelatorios.add(MenuRelatorioVendas);

        MenuRelatoriosProdutos.setText("Relatório dos Produtos");

        menuItemTodosProdutos.setText("Todos Produtos");
        MenuRelatoriosProdutos.add(menuItemTodosProdutos);

        menuItemTodosMoveis.setText("Todos Móveis");
        MenuRelatoriosProdutos.add(menuItemTodosMoveis);

        menuItemTodosEletrodomesticos.setText("Todos Eletrodomésticos");
        MenuRelatoriosProdutos.add(menuItemTodosEletrodomesticos);

        menuItemTodosEletronicos.setText("Todos Eletrônicos ");
        MenuRelatoriosProdutos.add(menuItemTodosEletronicos);

        menuItemTodosVestuarios.setText("Todos Vestuários");
        MenuRelatoriosProdutos.add(menuItemTodosVestuarios);

        menuItemProdMaisVend.setText("Produtos Mais Vendidos");
        MenuRelatoriosProdutos.add(menuItemProdMaisVend);

        menuItemProdOrdA.setText("Produtos Ordenados Por Valor(A)");
        MenuRelatoriosProdutos.add(menuItemProdOrdA);

        ProdOrdB.setText("Produtos Ordenados Por Valor(B)");
        MenuRelatoriosProdutos.add(ProdOrdB);

        MenuRelatorios.add(MenuRelatoriosProdutos);

        MenuRelatorioTRansportadoras.setText("Relatórios das Transportadoras");

        menuItemTransport.setText("Todas as Transportadoras");
        MenuRelatorioTRansportadoras.add(menuItemTransport);

        menuItemTrasnpMaisTransp.setText("Transportadoras Com Mais Transportes");
        menuItemTrasnpMaisTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTrasnpMaisTranspActionPerformed(evt);
            }
        });
        MenuRelatorioTRansportadoras.add(menuItemTrasnpMaisTransp);

        MenuRelatorios.add(MenuRelatorioTRansportadoras);

        MenuRelatorioFabricantes.setText("Relatório dos Fabricantes");

        menuItemTodosOsFabricantes.setText("Todos os Fabricantes");
        MenuRelatorioFabricantes.add(menuItemTodosOsFabricantes);

        menuItemFabMaisVenda.setText("Fabricantes Com Mais Produtos Vendidos");
        menuItemFabMaisVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFabMaisVendaActionPerformed(evt);
            }
        });
        MenuRelatorioFabricantes.add(menuItemFabMaisVenda);

        menuItemFabMaisLucro.setText("Fabricantes com mais lucro");
        MenuRelatorioFabricantes.add(menuItemFabMaisLucro);

        MenuRelatorios.add(MenuRelatorioFabricantes);

        jMenuBar1.add(MenuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClienteActionPerformed
        new IUCadastroCliente().setVisible(true);
    }//GEN-LAST:event_menuItemClienteActionPerformed

    private void menuItemGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGerenteActionPerformed
        new IUCadastroGerente().setVisible(true);
    }//GEN-LAST:event_menuItemGerenteActionPerformed

    private void menuItemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVendaActionPerformed
        new IUCadastroVenda().setVisible(true);
    }//GEN-LAST:event_menuItemVendaActionPerformed

    private void jMenuCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrosActionPerformed
        
    }//GEN-LAST:event_jMenuCadastrosActionPerformed

    private void menuItemMoveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMoveisActionPerformed
        new IUCadastroMoveis().setVisible(true); 
    }//GEN-LAST:event_menuItemMoveisActionPerformed

    private void menuItemEletrodomesticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEletrodomesticosActionPerformed
        new IUCadastroEletrodomesticos().setVisible(true); 
    }//GEN-LAST:event_menuItemEletrodomesticosActionPerformed

    private void menuItemEletronicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEletronicosActionPerformed
        new IUCadastroEletronicos().setVisible(true);
        
        
    }//GEN-LAST:event_menuItemEletronicosActionPerformed

    private void menuItemVestuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVestuarioActionPerformed
        new IUCadastroVenda().setVisible(true); 
    }//GEN-LAST:event_menuItemVestuarioActionPerformed

    private void menuItemCadFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadFabricanteActionPerformed
        new IUCadastroFabricante().setVisible(true); 
    }//GEN-LAST:event_menuItemCadFabricanteActionPerformed

    private void menuItemCadTransportadorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadTransportadorasActionPerformed
        new IUCadastroTransportadoras().setVisible(true);
    }//GEN-LAST:event_menuItemCadTransportadorasActionPerformed

    private void menuItemTrasnpMaisTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTrasnpMaisTranspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemTrasnpMaisTranspActionPerformed

    private void menuItemTodosGerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTodosGerentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemTodosGerentesActionPerformed

    private void menuItemFabMaisVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFabMaisVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemFabMaisVendaActionPerformed

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
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastroProdutos;
    private javax.swing.JMenu MenuRelatorioCliente;
    private javax.swing.JMenu MenuRelatorioFabricantes;
    private javax.swing.JMenu MenuRelatorioGerente;
    private javax.swing.JMenu MenuRelatorioTRansportadoras;
    private javax.swing.JMenu MenuRelatorioVendas;
    private javax.swing.JMenu MenuRelatorios;
    private javax.swing.JMenu MenuRelatoriosProdutos;
    private javax.swing.JMenuItem ProdOrdB;
    private javax.swing.JMenuItem itemMenuVendaDinheiro;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem menuItemCadFabricante;
    private javax.swing.JMenuItem menuItemCadTransportadoras;
    private javax.swing.JMenuItem menuItemCliente;
    private javax.swing.JMenuItem menuItemClientesOuro;
    private javax.swing.JMenuItem menuItemEletrodomesticos;
    private javax.swing.JMenuItem menuItemEletronicos;
    private javax.swing.JMenuItem menuItemFabMaisLucro;
    private javax.swing.JMenuItem menuItemFabMaisVenda;
    private javax.swing.JMenuItem menuItemGerente;
    private javax.swing.JMenuItem menuItemMoveis;
    private javax.swing.JMenuItem menuItemProdMaisVend;
    private javax.swing.JMenuItem menuItemProdOrdA;
    private javax.swing.JMenuItem menuItemTodasVendas;
    private javax.swing.JMenuItem menuItemTodosClientes;
    private javax.swing.JMenuItem menuItemTodosEletrodomesticos;
    private javax.swing.JMenuItem menuItemTodosEletronicos;
    private javax.swing.JMenuItem menuItemTodosGerentes;
    private javax.swing.JMenuItem menuItemTodosMoveis;
    private javax.swing.JMenuItem menuItemTodosOsFabricantes;
    private javax.swing.JMenuItem menuItemTodosProdutos;
    private javax.swing.JMenuItem menuItemTodosVestuarios;
    private javax.swing.JMenuItem menuItemTransport;
    private javax.swing.JMenuItem menuItemTrasnpMaisTransp;
    private javax.swing.JMenuItem menuItemVendMesEsp;
    private javax.swing.JMenuItem menuItemVenda;
    private javax.swing.JMenuItem menuItemVendaCartao;
    private javax.swing.JMenuItem menuItemVendaClienteEspeci;
    private javax.swing.JMenuItem menuItemVendasPIX;
    private javax.swing.JMenuItem menuItemVestuario;
    // End of variables declaration//GEN-END:variables
}