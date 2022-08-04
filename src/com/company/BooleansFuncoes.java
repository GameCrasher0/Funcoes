package com.company;

public class BooleansFuncoes {

    static boolean conjucao(boolean valorUm, boolean valorDois){
        if(valorUm && valorDois)
            return true;
        else return false;
    }
    
    boolean disjuncao(boolean valorUm, boolean valorDois){
        if(valorUm || valorDois)
            return true;
        else return false;
    }
}
