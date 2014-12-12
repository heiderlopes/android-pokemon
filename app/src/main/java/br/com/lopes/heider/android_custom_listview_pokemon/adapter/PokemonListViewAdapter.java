package br.com.lopes.heider.android_custom_listview_pokemon.adapter;

/**
 * Created by heider on 12/12/14.
 */
import java.util.List;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.lopes.heider.android_custom_listview_pokemon.R;
import br.com.lopes.heider.android_custom_listview_pokemon.model.Pokemon;

public class PokemonListViewAdapter extends ArrayAdapter<Pokemon> {

    private final List<Pokemon> list;
    private final Activity context;

    public PokemonListViewAdapter(Activity context, List<Pokemon> list) {
        super(context, R.layout.item_pokemon, list);
        this.context = context;
        this.list = list;
    }

    static class ViewHolder {
        protected TextView tvTitulo;
        protected ImageView ivImagem;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        if (convertView == null) {
            LayoutInflater inflator = context.getLayoutInflater();
            view = inflator.inflate(R.layout.item_pokemon, null);
            final ViewHolder viewHolder = new ViewHolder();
            viewHolder.tvTitulo = (TextView) view.findViewById(R.id.tvTitulo);
            viewHolder.ivImagem = (ImageView) view.findViewById(R.id.ivImagem);
            view.setTag(viewHolder);
        } else {
            view = convertView;
        }
        ViewHolder holder = (ViewHolder) view.getTag();
        holder.tvTitulo.setText(list.get(position).getNome());
        holder.ivImagem.setImageDrawable(context.getResources().getDrawable(list.get(position).getIcon()));
        return view;
    }
}