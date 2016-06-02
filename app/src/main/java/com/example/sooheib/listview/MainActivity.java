package com.example.sooheib.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView listView;
    String[] days={"Monday","Tuesday","Wednesday","Tuesday","Friday","Saturday"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.single_row,R.id.textView,days);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
/*listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView tv= (TextView) view;
        Toast.makeText(MainActivity.this,"Clicked:" +tv.getText()+"at"+position,Toast.LENGTH_LONG ).show();

    }
});*/

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView tv= (TextView) view;
        Toast.makeText(this,"Clicked:" +tv.getText()+"at"+position,Toast.LENGTH_LONG ).show();

    }

    public void gotosecond(View view) {
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
