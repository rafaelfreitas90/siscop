package siscop.main;

import siscop.conexoes.FabricadeConexoes;
import siscop.controllers.LoginController;
import siscop.controllers.TelaPrincipalController;
import siscop.views.LoginPrograma;

/**
 *
 * @author RSF
 */
public class Programa {
   
    public static void main(String[] args) {
        
//        LoginController.getInstancia().exibirInterfaceGrafica();
        TelaPrincipalController.getInstancia().exibirInterfaceGrafica();

    }
}
