/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto.Model;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Filme {
    
    private Integer fcodigo;
    private String titulo;
    private String genero;
    private String sinopse;
    private Integer duracao;
    private ArrayList<Item> itens = new ArrayList<Item>();
    private ArrayList<Ator> atores = new ArrayList<Ator>();
    
    
}
