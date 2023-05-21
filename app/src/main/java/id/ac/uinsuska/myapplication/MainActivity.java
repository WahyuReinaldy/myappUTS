package id.ac.uinsuska.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView rMenu = findViewById(R.id.rMenu);
        ArrayList<Lauk>lauks = new ArrayList<>();
        rMenu.setAdapter(new Adapter(lauks, this));
        lauks.add(new Lauk("Ayam Gulai","20000",R.drawable.gulai));
        lauks.add(new Lauk("Ayam Pop","25000",R.drawable.pop));
        lauks.add(new Lauk("Ayam Bakar","27000",R.drawable.bakar));
        lauks.add(new Lauk("Ayam Rendang","30000",R.drawable.rendang));
        lauks.add(new Lauk("Ayam Balado","21000",R.drawable.balado));

        rMenu.setLayoutManager(new GridLayoutManager(this, 2));
    }
}