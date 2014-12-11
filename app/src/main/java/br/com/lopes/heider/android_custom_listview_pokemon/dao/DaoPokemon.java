package br.com.lopes.heider.android_custom_listview_pokemon.dao;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import br.com.lopes.heider.android_custom_listview_pokemon.R;
import br.com.lopes.heider.android_custom_listview_pokemon.model.Pokemon;

/**
 * Created by heiderlopes on 11/12/14.
 */
public class DaoPokemon {
    private Context ctx;
    public DaoPokemon(Context context) {
        ctx = context;
    }

    public List<Pokemon> getAllPokemon() {
        List<Pokemon> pokemons = new ArrayList<Pokemon>();
        Pokemon bulbasaur = new Pokemon();
        bulbasaur.setNome("Bulbasaur");
        bulbasaur.setDescricao("Uma estranha semente foi plantada em suas costas no momento do nascimento. A planta brota e cresce com este Pokémon.");
        bulbasaur.setEspecie("Seed");
        bulbasaur.setHabilidade("Overgrow");
        bulbasaur.setId(1);
        bulbasaur.addFraqueza("Fire");
        bulbasaur.addFraqueza("Flying");
        bulbasaur.addFraqueza("Ice");
        bulbasaur.addFraqueza("Psychic");
        bulbasaur.addTipo("Grass");
        bulbasaur.addTipo("Poison");
        bulbasaur.setId(R.drawable.p001_bulbasaur);
        pokemons.add(bulbasaur);

        return pokemons;
    }
}
