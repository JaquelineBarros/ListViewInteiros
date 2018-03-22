package jaqueline.angel.listviewinteiros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvi;
    Integer[] inteiros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11, 12, 13, 14, 15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvi = (ListView) findViewById(R.id.list_inteiros);

        ArrayAdapter<Integer> adapter =
                     new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, inteiros);

        lvi.setAdapter(adapter);

             
    }
}
