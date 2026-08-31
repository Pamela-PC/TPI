/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo_oo;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        
        //INSTANCIAR OBJETO USU
        Usuario usu = new Usuario();
        
        //PASSAR OS DADOS PARA CLASSE USUARIO
//        
//        usu.setNome("Pamela Candido");
//        usu.setIdade(19);
//        usu.setEmail("Pamela@email");
//        usu.setTelefone("(13)99990-2000");
        //Chamar método cadastrar dados
        usu.cadastrarDados();
        
        //CHAMAR MÉTODO MOSTRAR DADOS DA CLASSE USUÁRIO
        usu.MostrarDados();
        
        
        
    }
}
