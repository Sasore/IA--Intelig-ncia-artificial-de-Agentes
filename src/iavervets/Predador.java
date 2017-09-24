/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iavervets;

/**
 *
 * @author soare
 */
public class Predador {
    int codigoPredador;
    String especiePredador;
    String NomePredador;

    public void setCodigoPredador(int codigoPredador,String especie) {
        this.codigoPredador = codigoPredador;
        this.especiePredador = especie;
        this.NomePredador="P"+codigoPredador;
    }

    public String getEspeciePredador() {
        return especiePredador;
    }

    public int getCodigoPredador() {
        return codigoPredador;
    }

    public String getNomePredador() {
        return NomePredador;
    }
    
    
    
    
    
    
    
}
