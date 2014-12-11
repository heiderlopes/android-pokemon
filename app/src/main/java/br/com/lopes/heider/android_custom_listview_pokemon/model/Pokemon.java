package br.com.lopes.heider.android_custom_listview_pokemon.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heiderlopes on 11/12/14.
 */
public class Pokemon {
    private int id;
    private String nome;
    private String descricao;
    private String especie;
    private String habilidade;
    private List<String> tipos;
    private List<String> fraquezas;
    private int icon;

    public Pokemon() {
        tipos = new ArrayList<String>();
        fraquezas = new ArrayList<String>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public List<String> getTipos() {
        return tipos;
    }

    public void setTipos(List<String> tipo) {
        this.tipos = tipo;
    }

    public List<String> getFraquezas() {
        return fraquezas;
    }

    public void setFraquezas(List<String> fraquezas) {
        this.fraquezas = fraquezas;
    }

    public void addFraqueza(String fraqueza){
        this.fraquezas.add(fraqueza);
    }

    public void addTipo(String tipo) {
        this.tipos.add(tipo);
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}