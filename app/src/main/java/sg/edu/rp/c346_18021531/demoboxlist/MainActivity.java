package sg.edu.rp.c346_18021531.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvbox;
    ArrayList<Box> alBoxlist;
    ArrayAdapter<Box> CaBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvbox =findViewById(R.id.listviewcolourbox);

        alBoxlist = new ArrayList<>();
        Box item1 = new Box("blue");
        alBoxlist.add(item1);
        Box item2 = new Box("orange");
        alBoxlist.add(item2);
        Box item3 = new Box("brown");
        alBoxlist.add(item3);


        CaBox = new CustomAdapter(this,R.layout.row,alBoxlist);
        lvbox.setAdapter(CaBox);

    }

}