package br.com.lopes.heider.android_custom_listview_pokemon.utils;

/**
 * Created by heiderlopes on 12/12/14.
 */
public class StringFormater {
    public static String lpad(String valueToPad, String filler, int size) {
        while (valueToPad.length() < size) {
            valueToPad = filler + valueToPad;
        }
        return valueToPad;
    }

    public static String rpad(String valueToPad, String filler, int size) {
        while (valueToPad.length() < size) {
            valueToPad = valueToPad+filler;
        }
        return valueToPad;
    }
}
