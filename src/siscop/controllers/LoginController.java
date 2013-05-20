package siscop.controllers;

import siscop.views.LoginPrograma;

public class LoginController {

    private static LoginController instancia = new LoginController();
    private LoginPrograma view = new LoginPrograma();
    
    public LoginController(){
        
    }
    
    public static LoginController getInstancia(){
        return instancia;
    }
    
    public void exibirInterfaceGrafica(){
        if (view == null){
            view = new LoginPrograma();
        }
        view.setVisible(true);
    }
}
