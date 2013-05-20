package siscop.controllers;

import siscop.views.TelaPrincipal;

/**
 *
 * @author RSF
 */
public class TelaPrincipalController {
    
    private static TelaPrincipalController instancia = new TelaPrincipalController();
    private TelaPrincipal view;
    
    public TelaPrincipalController(){
        
    }
    
    public static TelaPrincipalController getInstancia(){
        return instancia;
    }
    
    public void exibirInterfaceGrafica(){
       if (view == null){
           view = new TelaPrincipal();
       }
        
        view.setVisible(true);
    }
            
    
}
