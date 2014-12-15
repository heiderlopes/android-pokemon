package br.com.lopes.heider.android_custom_listview_pokemon;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import br.com.lopes.heider.android_custom_listview_pokemon.adapter.PokemonListViewAdapter;
import br.com.lopes.heider.android_custom_listview_pokemon.dao.DaoPokemon;

public class MainActivity extends Activity {

    private ListView lvPokemons;
    private ImageView  ivLeitor;
    private DaoPokemon dp;
    private Activity context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        dp = new DaoPokemon(this);
        lvPokemons = (ListView)findViewById(R.id.lvPokemons);
        lvPokemons.setAdapter(new PokemonListViewAdapter(context, dp.getAllPokemon()));
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