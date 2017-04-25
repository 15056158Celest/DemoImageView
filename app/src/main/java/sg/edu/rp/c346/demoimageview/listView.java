package sg.edu.rp.c346.demoimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class listView extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        ListView listView = (ListView) findViewById(R.id.lvitems);
        listView.setAdapter(itemsAdapter);
    }
}
