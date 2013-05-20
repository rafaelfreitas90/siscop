package siscop.controllers;

import siscop.views.CadastroPedido;

public class CadastroPedidoController {
    
    private static CadastroPedidoController instancia = new CadastroPedidoController();
    private CadastroPedido view;
    
    public CadastroPedidoController(){
        
    }
    
    public static CadastroPedidoController getInstancia(){
        return instancia;
    }
    
     public void exibirInterfaceGrafica(){
        if (view == null){
            view = new CadastroPedido();
        }
        view.setVisible(true);
    }

}
