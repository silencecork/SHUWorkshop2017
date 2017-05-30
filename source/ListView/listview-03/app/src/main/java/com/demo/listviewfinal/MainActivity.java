package com.demo.listviewfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private static final String[] TITLES = {
            "Apples",
            "Apricots",
            "Avocado",
            "Ackee",
            "Bananas",
            "Bilberries",
            "Blueberries",
            "Blackberries",
            "Boysenberries",
            "Bread fruit",
            "Cantaloupes (cantalope)",
            "Chocolate-Fruit",
            "Cherimoya",
            "Cherries",
            "Cranberries",
            "Cucumbers",
            "Currants",
            "Dates",
            "Durian",
            "Eggplant",
            "Elderberries",
            "Figs",
            "Gooseberries",
            "Grapes",
            "Grapefruit",
            "Guava",
            "Honeydew melons",
            "Horned melon (Kiwano)",
            "Huckleberries",
            "Ita Palm",
            "Jujubes",
            "Kiwis",
            "Kumquat",
            "Lemons",
            "Limes",
            "Lychees"
    };

    private static final String[] SUB_TITLES = {
            "Mangos",
            "Mangosteen",
            "Mulberries",
            "Muskmelon",
            "Nectarines",
            "Ogden melons",
            "Olives",
            "Oranges",
            "Papaya",
            "Passion fruit",
            "Peaches",
            "Pears",
            "Peppers",
            "Persimmon",
            "Pineapple",
            "Plums",
            "Pluot",
            "Pomegranate",
            "Prickly Pear",
            "Quince",
            "Rambuton",
            "Raspberries",
            "Rose Apple",
            "Starfruit",
            "Sapadilla",
            "Strawberries",
            "Tamarind",
            "Tangelo",
            "Tangerines",
            "Tomatoes",
            "Ugli fruit",
            "Voavanga (Spanish Tamarind)",
            "Watermelons",
            "Xigua melon",
            "Yellow watermelon",
            "Zucchini"
    };

    private static final int ICONS[] = {
            R.drawable.apple,
            R.drawable.banana,
            R.drawable.cherry,
            R.drawable.grape,
            R.drawable.strawberry
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.listview);
        WordAdapter adapter = new WordAdapter(TITLES, SUB_TITLES);

        list.setAdapter(adapter);
    }

}
