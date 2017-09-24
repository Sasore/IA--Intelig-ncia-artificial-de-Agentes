/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iavervets;

import java.util.ArrayList;


/**
 *
 * @author soare
 */
public class Agente {
    int CodigoAgente;
    String EspecieAgente;
    String NomeAgente;
    ArrayList<ArrayList<Double>> Simbolos= new ArrayList<>();//Matriz de Símbolos

    public int getCodigoAgente() {
        return CodigoAgente;
    }

    public void setCodigoAgente(int CodigoAgente, String especie) {
        this.CodigoAgente = CodigoAgente;
        this.EspecieAgente = especie;
        this.NomeAgente="M"+CodigoAgente;
    }

    public String getEspecieAgente() {
        return EspecieAgente;
    }
    public String getNomeAgente() {
        return NomeAgente;
    }

    public void setSimbolos(ArrayList<ArrayList<Double>> Simbolos) {
        this.Simbolos=Simbolos;
    }

    public ArrayList<ArrayList<Double>> getSimbolos() {
        return Simbolos;
    }

    String getSimbolos(int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
