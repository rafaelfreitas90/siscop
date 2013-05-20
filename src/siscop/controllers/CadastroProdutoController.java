package siscop.controllers;

import siscop.views.CadastroProduto;

/**
 *
 * @author RSF
 */
public class CadastroProdutoController {
    
    private static CadastroProdutoController instancia = new CadastroProdutoController();
    private CadastroProduto view;
    
    public CadastroProdutoController(){
        
    }
    
    public static CadastroProdutoController getInstancia(){
        return instancia;
    }
    
    public void exibirInterfaceGrafica(){
        if (view == null){
            view = new CadastroProduto();
        }
        view.setVisible(true);
    }
    

    
    
}
