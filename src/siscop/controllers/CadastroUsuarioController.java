package siscop.controllers;

import siscop.views.CadastroUsuario;

public class CadastroUsuarioController {
    
    private static CadastroUsuarioController instancia = new CadastroUsuarioController();
    private CadastroUsuario view;
    
    public CadastroUsuarioController(){
        
    }

    public static CadastroUsuarioController getInstancia(){
        return instancia;
    }
    
     public void exibirInterfaceGrafica(){
        if (view == null){
            view = new CadastroUsuario();
        }
        view.setVisible(true);
    }

}
