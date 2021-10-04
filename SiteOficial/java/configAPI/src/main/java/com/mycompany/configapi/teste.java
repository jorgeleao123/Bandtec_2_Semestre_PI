/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.configapi;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;

/**
 *
 * @author vitor.herculano
 */
public class teste {

    public static void main(String[] args) {
        Looca looca = new Looca();
        
        Sistema sistema = looca.getSistema();

        sistema.getPermissao();
        sistema.getFabricante();
        sistema.getArquitetura();
        sistema.getArquitetura();
        sistema.getInicializado();
        sistema.getSistemaOperacional();

        
        System.out.println(sistema);

        
    }
}
