package com.curtin.game.pracgrader.model;
import com.curtin.game.pracgrader.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class FlagHolder {
    public static final HashMap<String,Integer> FLAGS = new HashMap<>();
    public FlagHolder() {
        FLAGS.put("Unknown", R.drawable.flag__unknown);
        FLAGS.put("Andorra", R.drawable.flag_ad);
        FLAGS.put("Arab Emirates", R.drawable.flag_ae);
        FLAGS.put("Afghanistan", R.drawable.flag_af);
        FLAGS.put("Antigua and Barbuda", R.drawable.flag_ag);
        FLAGS.put("Anguilla", R.drawable.flag_ai);
        FLAGS.put("Albania", R.drawable.flag_al);
        FLAGS.put("Armenia", R.drawable.flag_am);
        FLAGS.put("Argentina", R.drawable.flag_ar);
        FLAGS.put("Austria", R.drawable.flag_at);
        FLAGS.put("Australia", R.drawable.flag_au);
        FLAGS.put("Azerbaijan", R.drawable.flag_az);
        FLAGS.put("Bosnia and Herzegovina", R.drawable.flag_ba);
        FLAGS.put("Bangladesh", R.drawable.flag_bd);
        FLAGS.put("Belgium", R.drawable.flag_be);
        FLAGS.put("Burkina Faso", R.drawable.flag_bf);
        FLAGS.put("Bulgaria",R.drawable.flag_bg);
        FLAGS.put("Brazil", R.drawable.flag_br);
        FLAGS.put("Canada", R.drawable.flag_ca);
        FLAGS.put("Switzerland", R.drawable.flag_ch);
        FLAGS.put("China", R.drawable.flag_cn);
        FLAGS.put("Czechoslovakia", R.drawable.flag_cz);
        FLAGS.put("Germany", R.drawable.flag_de);
        FLAGS.put("Denmark", R.drawable.flag_dk);
        FLAGS.put("Spain", R.drawable.flag_es);
        FLAGS.put("France", R.drawable.flag_fr);
        FLAGS.put("Great Britain", R.drawable.flag_gb);
        FLAGS.put("Georgia", R.drawable.flag_ge);
        FLAGS.put("Greece", R.drawable.flag_gr);
        FLAGS.put("Hong Kong", R.drawable.flag_hk);
        FLAGS.put("Italy", R.drawable.flag_it);
        FLAGS.put("Japan", R.drawable.flag_jp);
        FLAGS.put("Korea", R.drawable.flag_kr);
        FLAGS.put("Lithuania", R.drawable.flag_lt);
        FLAGS.put("Mexico", R.drawable.flag_mx);
        FLAGS.put("Malaysia", R.drawable.flag_my);
        FLAGS.put("Netherlands", R.drawable.flag_nl);
        FLAGS.put("Poland", R.drawable.flag_pl);
        FLAGS.put("Qatar", R.drawable.flag_qa);
        FLAGS.put("Russia", R.drawable.flag_ru);
        FLAGS.put("United Kingdom", R.drawable.flag_uk);
        FLAGS.put("United States", R.drawable.flag_us);
        FLAGS.put("Vietnam", R.drawable.flag_vn);
    }

    public List<Flag> getFlagsAsList() {
        Set<String> keys = FLAGS.keySet();
        List<Flag> flags = new ArrayList<>();
        for(String key : keys) {
            Flag f = new Flag(key, FLAGS.get(key));
            flags.add(f);
        }
        return flags;
    }


}
