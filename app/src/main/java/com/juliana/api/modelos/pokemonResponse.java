package com.juliana.api.modelos;

import java.util.ArrayList;

public class pokemonResponse {
    private ArrayList<Pokemon> resultados;

    public ArrayList<Pokemon> getResultados() {
        return resultados;
    }

    public void setResults(ArrayList<Pokemon>results){
        this.resultados = results;
    }
}
