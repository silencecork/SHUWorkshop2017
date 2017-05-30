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
            "Lychees"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.listview);

        // 建立Adapter
        WordAdapter adapter = new WordAdapter(TITLES);

        // 設定給ListView
        list.setAdapter(adapter);
    }

}
