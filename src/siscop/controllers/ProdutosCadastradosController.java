package siscop.controllers;

import siscop.views.CadastroPedido;
import siscop.views.ProdutosCadastrados;

/**
 *
 * @author Rafael
 */
public class ProdutosCadastradosController {
    
    private static ProdutosCadastradosController instancia = new ProdutosCadastradosController();
    private ProdutosCadastrados view;
    
    public ProdutosCadastradosController(){
        
    }
    
    public static ProdutosCadastradosController getInstancia(){
        return instancia;
    }
    
    public void exibirInterfaceGrafica(CadastroPedido cadped){
        if (view == null){
            view = new ProdutosCadastrados(cadped);
        }
        view.setVisible(true);
    }
    

}
