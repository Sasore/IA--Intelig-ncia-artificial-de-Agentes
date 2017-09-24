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
class Simbolo {
    int CodigoSimbolo;
    String Simbolo;
    Simbolo(int codigo,String simbolo){
        this.CodigoSimbolo=codigo;
        this.Simbolo=simbolo;       
    }
    public int getCodigoSimbolo() {
        return CodigoSimbolo;
    }

    public void setCodigoSimbolo(int CodigoSimbolo) {
        this.CodigoSimbolo = CodigoSimbolo;
    }

    public String getSimbolo() {
        return Simbolo;
    }

    public void setSimbolo(String Simbolo) {
        this.Simbolo = Simbolo;
    }
    
    
}
