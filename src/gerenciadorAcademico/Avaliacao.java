/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorAcademico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sara
 */
public class Avaliacao {
    private static Scanner in;
    private String nome;
    private float valor;
    private float peso;
    private static List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
    
    public Avaliacao(){
        
    }
    
    public Avaliacao(String nome, float peso){        
        this.setNome(nome);
        this.setPeso(peso);    
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public static List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public static void setAvaliacoes(List<Avaliacao> avaliacoes) {
        Avaliacao.avaliacoes = avaliacoes;
    }
    
    public List cadastrarAvaliacao (Avaliacao a) {
	avaliacoes.add(a);
        System.out.println("Avaliacao cadastrada com sucesso");
        return avaliacoes;
    }
	
    public static int pesquisar (Avaliacao a) {
	if(avaliacoes.contains(a))
            return 1;
        else
            return 0;
    }
	
    public static void excluir (Avaliacao a) {
        if(Avaliacao.pesquisar(a) == 1){
            avaliacoes.remove(a);
            System.out.println("A avaliação " + a.getNome() + " foi excluída.");
        }
        else
            System.out.println("A avaliação não está cadastrada");
        }
        
    public static void print(List avaliacoes) {               
        for(int i = 0; i < avaliacoes.size(); i++){
            System.out.println(avaliacoes.get(i).toString());
        }
    }
        
    public String toString(){             
        return "Nome: " + this.getNome() +'\n' + "Valor: " + this.getValor( ) + "Peso: " + this.getPeso() ;
    }
}

    
