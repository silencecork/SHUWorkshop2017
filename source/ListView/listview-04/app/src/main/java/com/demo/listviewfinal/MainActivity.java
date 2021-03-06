package com.demo.listviewfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

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

        // 建立物件的陣列
        ArrayList<DisplayWord> dataList = new ArrayList<>();
        int length = TITLES.length;

        // 執行迴圈來處理合併資料，將多種資料合併成單一物件
        for (int i = 0; i < length; i++) {
            DisplayWord word = new DisplayWord();
            word.title = TITLES[i];
            word.subTitle = SUB_TITLES[i];
            word.iconRedId = ICONS[i % ICONS.length];

            // 處理完的物件加入物件陣列
            dataList.add(word);
        }

        ListView list = (ListView) findViewById(R.id.listview);

        // Adapter只要接受單一物件即可
        WordAdapter adapter = new WordAdapter(dataList);

        list.setAdapter(adapter);
    }


}
