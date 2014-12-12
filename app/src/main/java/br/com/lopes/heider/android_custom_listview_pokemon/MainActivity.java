package br.com.lopes.heider.android_custom_listview_pokemon;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import br.com.lopes.heider.android_custom_listview_pokemon.adapter.PokemonListViewAdapter;
import br.com.lopes.heider.android_custom_listview_pokemon.dao.DaoPokemon;

public class MainActivity extends Activity {

    private ListView lvPokemons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvPokemons = (ListView)findViewById(R.id.lvPokemons);
        DaoPokemon dp = new DaoPokemon(this);
        lvPokemons.setAdapter(new PokemonListViewAdapter(this, dp.getAllPokemon()));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}