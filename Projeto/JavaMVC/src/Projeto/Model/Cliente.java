/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto.Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bruno
 */
public class Cliente {
    
    private Integer ccliente;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private Date datanasc;
    private ArrayList<Item> itens = new ArrayList<Item>();
    
}
