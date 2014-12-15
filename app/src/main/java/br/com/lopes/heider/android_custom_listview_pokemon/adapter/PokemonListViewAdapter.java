package br.com.lopes.heider.android_custom_listview_pokemon.adapter;

/**
 * Created by heider on 12/12/14.
 */
import java.util.List;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.lopes.heider.android_custom_listview_pokemon.R;
import br.com.lopes.heider.android_custom_listview_pokemon.model.Pokemon;
import br.com.lopes.heider.android_custom_listview_pokemon.utils.StringFormater;

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
        protected FrameLayout flDetalhe;
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
            viewHolder.flDetalhe = (FrameLayout) view.findViewById(R.id.flDetalhe);

            viewHolder.tvTitulo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Animation slide = AnimationUtils.loadAnimation(context, R.anim.slide_up);
                    viewHolder.flDetalhe.startAnimation(slide);
                    viewHolder.flDetalhe.setVisibility(View.VISIBLE);
                }
            });

            viewHolder.flDetalhe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Animation slide = AnimationUtils.loadAnimation(context, R.anim.slide_down);
                    viewHolder.flDetalhe.startAnimation(slide);
                    viewHolder.flDetalhe.setVisibility(View.INVISIBLE);
                    /*Animation fadeOut = AnimationUtils.loadAnimation(context, R.anim.alpha);
                    fadeOut.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {
                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            viewHolder.flDetalhe.setVisibility(View.GONE);
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {
                        }
                    });
                    viewHolder.flDetalhe.startAnimation(fadeOut);*/
                }
            });

            view.setTag(viewHolder);
        } else {
            view = convertView;
        }
        ViewHolder holder = (ViewHolder) view.getTag();
        holder.tvTitulo.setText("#" + StringFormater.lpad(String.valueOf(list.get(position).getId()), "0", 3) + " " + list.get(position).getNome());
        holder.ivImagem.setImageDrawable(context.getResources().getDrawable(list.get(position).getImagem()));

        return view;
    }
}