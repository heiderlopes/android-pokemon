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

    public String[] getAllPokemonName() {
        List<Pokemon> lista = getAllPokemon();
        String[] names = new String[lista.size()];
        for(int i=0; i < lista.size(); i++) {
            names[i] = lista.get(i).getNome();
        }
        return names;
    }
    public List<Pokemon> getAllPokemon() {
        List<Pokemon> pokemons = new ArrayList<Pokemon>();

        pokemons.add(new Pokemon(1, "Bulbasaur", "Grama", R.drawable.p001_bulbasaur));
        pokemons.add(new Pokemon(2, "Ivysaur", "", R.drawable.p002_ivysaur));
        pokemons.add(new Pokemon(3, "Venusaur", "", R.drawable.p003_venusaur));
        pokemons.add(new Pokemon(4, "Charmander", "", R.drawable.p004_charmander));
        pokemons.add(new Pokemon(5, "Charmeleon", "", R.drawable.p005_charmeleon));
        pokemons.add(new Pokemon(6, "Charizard", "", R.drawable.p006_charizard));
        pokemons.add(new Pokemon(7, "Squirle", "", R.drawable.p007_squirtle));
        pokemons.add(new Pokemon(8, "Wartotle", "", R.drawable.p008_wartotle));
        pokemons.add(new Pokemon(9, "Blastoise", "", R.drawable.p009_blastoise));
        pokemons.add(new Pokemon(10, "Caterpie", "", R.drawable.p010_caterpie));
        pokemons.add(new Pokemon(11, "Metapod", "", R.drawable.p011_metapod));
        pokemons.add(new Pokemon(12, "Butterfree", "", R.drawable.p012_butterfree));
        pokemons.add(new Pokemon(13, "Weedle", "", R.drawable.p013_weedle));
        pokemons.add(new Pokemon(14, "Kakuna", "", R.drawable.p014_kakuna));
        pokemons.add(new Pokemon(15, "Beedrill", "", R.drawable.p015_beedrill));
        pokemons.add(new Pokemon(16, "Pidgey", "", R.drawable.p016_pidgey));
        pokemons.add(new Pokemon(17, "Pidgeotto", "", R.drawable.p017_pidgeotto));
        pokemons.add(new Pokemon(18, "Pidgeot", "", R.drawable.p018_pidgeot));
        pokemons.add(new Pokemon(19, "Rattata", "", R.drawable.p019_rattata));
        pokemons.add(new Pokemon(20, "Raticate", "", R.drawable.p020_raticate));
        pokemons.add(new Pokemon(21, "Spearow", "", R.drawable.p021_spearow));
        pokemons.add(new Pokemon(22, "Fearow", "", R.drawable.p022_fearow));
        pokemons.add(new Pokemon(23, "Ekans", "", R.drawable.p023_ekans));
        pokemons.add(new Pokemon(24, "Arbok", "", R.drawable.p024_arbok));
        pokemons.add(new Pokemon(25, "Pikachu", "", R.drawable.p025_pikachu));
        pokemons.add(new Pokemon(26, "Raichu", "", R.drawable.p026_raichu));
        pokemons.add(new Pokemon(27, "Sandshrew", "", R.drawable.p027_sandshrew));
        pokemons.add(new Pokemon(28, "Sandslash", "", R.drawable.p028_sandslash));
        pokemons.add(new Pokemon(29, "Nidoram Femea", "", R.drawable.p029_nidoran_femea));
        pokemons.add(new Pokemon(30, "Nidorina", "", R.drawable.p030_nidorina));
        pokemons.add(new Pokemon(21, "Nidoqueen", "", R.drawable.p031_nidoqueen));
        pokemons.add(new Pokemon(32, "Nidoran Macho", "", R.drawable.p032_nidoran_macho));
        pokemons.add(new Pokemon(33, "Nidorino", "", R.drawable.p033_nidorino));
        pokemons.add(new Pokemon(34, "Nidoking", "", R.drawable.p034_nidoking));
        pokemons.add(new Pokemon(35, "Clefairy", "", R.drawable.p035_clefairy));
        pokemons.add(new Pokemon(36, "Clefable", "", R.drawable.p036_clefable));
        pokemons.add(new Pokemon(37, "Vulpix", "", R.drawable.p037_vulpix));
        pokemons.add(new Pokemon(38, "Ninetales", "", R.drawable.p038_ninetales));
        pokemons.add(new Pokemon(39, "Jigglypuff", "", R.drawable.p039_jigglypuff));
        pokemons.add(new Pokemon(40, "Wigglytuff", "", R.drawable.p040_wigglytuff));
        pokemons.add(new Pokemon(41, "Zubat", "", R.drawable.p041_zubat));
        pokemons.add(new Pokemon(42, "Golbat", "", R.drawable.p042_golbat));
        pokemons.add(new Pokemon(43, "Oddish", "", R.drawable.p043_oddish));
        pokemons.add(new Pokemon(44, "Gloom", "", R.drawable.p044_gloom));
        pokemons.add(new Pokemon(45, "Vileplume", "", R.drawable.p045_vileplume));
        pokemons.add(new Pokemon(46, "Paras", "", R.drawable.p046_paras));
        pokemons.add(new Pokemon(47, "Parasect", "", R.drawable.p047_parasect));
        pokemons.add(new Pokemon(48, "Venonat", "", R.drawable.p048_venonat));
        pokemons.add(new Pokemon(49, "Venomoth", "", R.drawable.p049_venomoth));
        pokemons.add(new Pokemon(50, "Diglett", "", R.drawable.p050_diglett));
        pokemons.add(new Pokemon(51, "Dugtrio", "", R.drawable.p051_dugtrio));
        pokemons.add(new Pokemon(52, "Meowth", "", R.drawable.p052_meowth));
        pokemons.add(new Pokemon(53, "Persian", "", R.drawable.p053_persian));
        pokemons.add(new Pokemon(54, "Psyduck", "", R.drawable.p054_psyduck));
        pokemons.add(new Pokemon(55, "Golduck", "", R.drawable.p055_golduck));
        pokemons.add(new Pokemon(56, "Mankey", "", R.drawable.p056_mankey));
        pokemons.add(new Pokemon(57, "Primeape", "", R.drawable.p057_primeap));
        pokemons.add(new Pokemon(58, "Growlithe", "", R.drawable.p058_growlithe));
        pokemons.add(new Pokemon(59, "Arcanine", "", R.drawable.p059_arcanine));
        pokemons.add(new Pokemon(60, "Poliwag", "", R.drawable.p060_poliwag));
        pokemons.add(new Pokemon(61, "Poliwhirl", "", R.drawable.p061_poliwhirl));
        pokemons.add(new Pokemon(62, "Poliwrath", "", R.drawable.p062_poliwrath));
        pokemons.add(new Pokemon(63, "Abra", "", R.drawable.p063_abra));
        pokemons.add(new Pokemon(64, "Kadabra", "", R.drawable.p064_kadabra));
        pokemons.add(new Pokemon(65, "Alakazam", "", R.drawable.p065_alakazam));
        pokemons.add(new Pokemon(66, "Machop", "", R.drawable.p066_machop));
        pokemons.add(new Pokemon(67, "Machoke", "", R.drawable.p067_machoke));
        pokemons.add(new Pokemon(68, "Machamp", "", R.drawable.p068_machamp));
        pokemons.add(new Pokemon(69, "Bellsprout", "", R.drawable.p069_bellsprout));
        pokemons.add(new Pokemon(70, "Weepinbell", "", R.drawable.p070_weepinbell));
        pokemons.add(new Pokemon(71, "Victreebel", "", R.drawable.p071_victreebel));
        pokemons.add(new Pokemon(72, "Tentacool", "", R.drawable.p072_tentacool));
        pokemons.add(new Pokemon(73, "Tentacruel", "", R.drawable.p073_tentacruel));
        pokemons.add(new Pokemon(74, "Geodude", "", R.drawable.p074_geodude));
        pokemons.add(new Pokemon(75, "Graveler", "", R.drawable.p075_graveler));
        pokemons.add(new Pokemon(76, "Golem", "", R.drawable.p076_golem));
        pokemons.add(new Pokemon(77, "Ponyta", "", R.drawable.p077_ponyta));
        pokemons.add(new Pokemon(78, "Rapidash", "", R.drawable.p078_rapidash));
        pokemons.add(new Pokemon(79, "Slowpoke", "", R.drawable.p079_slowpoke));
        pokemons.add(new Pokemon(80, "Slowbro", "", R.drawable.p080_slowbro));
        pokemons.add(new Pokemon(81, "Magnemite", "", R.drawable.p081_magnemite));
        pokemons.add(new Pokemon(82, "Magneton", "", R.drawable.p082_magneton));
        pokemons.add(new Pokemon(83, "Farfetch'd", "", R.drawable.p083_farfetchd));
        pokemons.add(new Pokemon(84, "Doduo", "", R.drawable.p084_doduo));
        pokemons.add(new Pokemon(85, "Dodrio", "", R.drawable.p085_dodrio));
        pokemons.add(new Pokemon(86, "Seel", "", R.drawable.p086_seel));
        pokemons.add(new Pokemon(87, "Dewgong", "", R.drawable.p087_dewgong));
        pokemons.add(new Pokemon(88, "Grimer", "", R.drawable.p088_grimer));
        pokemons.add(new Pokemon(89, "Muk", "", R.drawable.p089_muk));
        pokemons.add(new Pokemon(90, "Shellder", "", R.drawable.p090_shellder));
        pokemons.add(new Pokemon(91, "Cloyster", "", R.drawable.p091_cloyster));
        pokemons.add(new Pokemon(92, "Gastly", "", R.drawable.p092_gastly));
        pokemons.add(new Pokemon(93, "Haunter", "", R.drawable.p093_haunter));
        pokemons.add(new Pokemon(94, "Gengar", "", R.drawable.p094_gengar));
        pokemons.add(new Pokemon(95, "Onix", "", R.drawable.p095_onix));
        pokemons.add(new Pokemon(96, "Drowzee", "", R.drawable.p096_drowzee));
        pokemons.add(new Pokemon(97, "Hypno", "", R.drawable.p097_hypno));
        pokemons.add(new Pokemon(98, "Krabby", "", R.drawable.p098_krabby));
        pokemons.add(new Pokemon(99, "Kingler", "", R.drawable.p099_kingler));
        pokemons.add(new Pokemon(100, "Voltorb", "", R.drawable.p100_voltorb));
        pokemons.add(new Pokemon(101, "Electrode", "", R.drawable.p101_electrode));
        pokemons.add(new Pokemon(102, "Exeggcute", "", R.drawable.p102_exeggcute));
        pokemons.add(new Pokemon(103, "Exeggutor", "", R.drawable.p103_exeggutor));
        pokemons.add(new Pokemon(104, "Cubone", "", R.drawable.p104_cubone));
        pokemons.add(new Pokemon(105, "Marowak", "", R.drawable.p105_marowak));
        pokemons.add(new Pokemon(106, "Hitmonlee", "", R.drawable.p106_hitmonlee));
        pokemons.add(new Pokemon(107, "Hitmonchan", "", R.drawable.p107_hitmonchan));
        pokemons.add(new Pokemon(108, "Lickitung", "", R.drawable.p108_lickitung));
        pokemons.add(new Pokemon(109, "Koffing", "", R.drawable.p109_koffing));
        pokemons.add(new Pokemon(110, "Weezing", "", R.drawable.p110_weezing));
        pokemons.add(new Pokemon(111, "Rhyhorn", "", R.drawable.p111_rhyhorn));
        pokemons.add(new Pokemon(112, "Rhydon", "", R.drawable.p112_rhydon));
        pokemons.add(new Pokemon(113, "Chansey", "", R.drawable.p113_chansey));
        pokemons.add(new Pokemon(114, "Tangela", "", R.drawable.p114_tangela));
        pokemons.add(new Pokemon(115, "Kangaskhan", "", R.drawable.p115_kangaskhan));
        pokemons.add(new Pokemon(116, "Horsea", "", R.drawable.p116_horsea));
        pokemons.add(new Pokemon(117, "Seadra", "", R.drawable.p117_seadra));
        pokemons.add(new Pokemon(118, "Goldeen", "", R.drawable.p118_goldeen));
        pokemons.add(new Pokemon(119, "Seaking", "", R.drawable.p119_seaking));
        pokemons.add(new Pokemon(120, "Staryu", "", R.drawable.p120_staryu));
        pokemons.add(new Pokemon(121, "Starmie", "", R.drawable.p121_starmie));
        pokemons.add(new Pokemon(122, "Mr Mime", "", R.drawable.p122_mr_mime));
        pokemons.add(new Pokemon(123, "Scyther", "", R.drawable.p123_scyther));
        pokemons.add(new Pokemon(124, "Jynx", "", R.drawable.p124_jynx));
        pokemons.add(new Pokemon(125, "Electabuzz", "", R.drawable.p125_elctabuzz));
        pokemons.add(new Pokemon(126, "Magmar", "", R.drawable.p126_magmar));
        pokemons.add(new Pokemon(127, "Pinsir", "", R.drawable.p127_pinsir));
        pokemons.add(new Pokemon(128, "Taurus", "", R.drawable.p128_taurus));
        pokemons.add(new Pokemon(129, "Magikarp", "", R.drawable.p129_magikarp));
        pokemons.add(new Pokemon(130, "Gyrados", "", R.drawable.p130_gyarados));
        pokemons.add(new Pokemon(131, "Lapras", "", R.drawable.p131_lapras));
        pokemons.add(new Pokemon(132, "Ditto", "", R.drawable.p132_ditto));
        pokemons.add(new Pokemon(133, "Eevee", "", R.drawable.p133_eevee));
        pokemons.add(new Pokemon(134, "Vaporeon", "", R.drawable.p134_vaporeon));
        pokemons.add(new Pokemon(135, "Jolteon", "", R.drawable.p135_jolteon));
        pokemons.add(new Pokemon(136, "Flareon", "", R.drawable.p136_flareon));
        pokemons.add(new Pokemon(137, "Porygon", "", R.drawable.p137_porygon));
        pokemons.add(new Pokemon(138, "Omanyte", "", R.drawable.p138_omanyte));
        pokemons.add(new Pokemon(139, "Omastar", "", R.drawable.p139_omastar));
        pokemons.add(new Pokemon(140, "Kabuto", "", R.drawable.p140_kabuto));
        pokemons.add(new Pokemon(141, "Kabutops", "", R.drawable.p141_kabutops));
        pokemons.add(new Pokemon(142, "Aerodactyl", "", R.drawable.p142_aerodactyl));
        pokemons.add(new Pokemon(143, "Snorlax", "", R.drawable.p143_snorlax));
        pokemons.add(new Pokemon(144, "Articuno", "", R.drawable.p144_articuno));
        pokemons.add(new Pokemon(145, "Zapdos", "", R.drawable.p145_zapdos));
        pokemons.add(new Pokemon(146, "Moltres", "", R.drawable.p146_moltres));
        pokemons.add(new Pokemon(147, "Dratini", "", R.drawable.p147_dratini));
        pokemons.add(new Pokemon(148, "Dragonair", "", R.drawable.p148_dragonair));
        pokemons.add(new Pokemon(149, "Dragonite", "", R.drawable.p149_dragonite));
        pokemons.add(new Pokemon(150, "Mewtwo", "", R.drawable.p150_mewtwo));
        pokemons.add(new Pokemon(151, "Mew", "", R.drawable.p151_mew));

        return pokemons;
    }
}
