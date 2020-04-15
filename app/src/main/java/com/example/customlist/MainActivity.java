package com.example.customlist;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ListView listView;

            //images, names and desciptions are set in an array
    String[] mNAMES = {"iyartitl", "more life" ,"scorpion", "nwts", "sfg","views", "take care"};

    String[] mDESCRIPTIONS = {"Best Album" , "Second Best", "Third Best", "Fourth Best", "Fifth Best",
            "Sixth Best", "Worst Album"};
    int[] mIMAGES = {R.drawable.iyartitl, R.drawable.morelife, R.drawable.scorpion, R.drawable.nwts, R.drawable.sfg,
            R.drawable.views, R.drawable.takecare,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView  = findViewById(R.id.listView);

        //adapters control the content displayed in the list as well as how to display it.
        MyAdapter adapter = new MyAdapter(this,mNAMES, mDESCRIPTIONS, mIMAGES);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);

                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mIMAGES[0]);
                    intent.putExtras(bundle);
                    //this puts names and description to another activity
                    intent.putExtra("NAME",mNAMES[0]);
                    intent.putExtra("DESCRIPTIONS",mDESCRIPTIONS[0]);
                    //also put your position
                    intent.putExtra("position", ""+0);
                    startActivity(intent);

                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 1 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mIMAGES[1]);
                    intent.putExtras(bundle);
                    //this puts names and description to another activity
                    intent.putExtra("NAME",mNAMES[1]);
                    intent.putExtra("DESCRIPTIONS",mDESCRIPTIONS[1]);
                    //also put your position
                    intent.putExtra("position", ""+1);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 2 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mIMAGES[2]);
                    intent.putExtras(bundle);
                    //this puts names and description to another activity
                    intent.putExtra("NAME",mNAMES[2]);
                    intent.putExtra("DESCRIPTIONS",mDESCRIPTIONS[2]);
                    //also put your position
                    intent.putExtra("position", ""+2);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 3 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mIMAGES[3]);
                    intent.putExtras(bundle);
                    //this puts names and description to another activity
                    intent.putExtra("NAME",mNAMES[3]);
                    intent.putExtra("DESCRIPTIONS",mDESCRIPTIONS[3]);
                    //also put your position
                    intent.putExtra("position", ""+3);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 4 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mIMAGES[4]);
                    intent.putExtras(bundle);
                    //this puts names and description to another activity
                    intent.putExtra("NAME",mNAMES[4]);
                    intent.putExtra("DESCRIPTIONS",mDESCRIPTIONS[4]);
                    //also put your position
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 5 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mIMAGES[5]);
                    intent.putExtras(bundle);
                    //this puts names and description to another activity
                    intent.putExtra("NAME",mNAMES[5]);
                    intent.putExtra("DESCRIPTIONS",mDESCRIPTIONS[5]);
                    //also put your position
                    intent.putExtra("position", ""+5);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 6 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mIMAGES[6]);
                    intent.putExtras(bundle);
                    //this puts names and description to another activity
                    intent.putExtra("NAME",mNAMES[6]);
                    intent.putExtra("DESCRIPTIONS",mDESCRIPTIONS[6]);
                    //also put your position
                    intent.putExtra("position", ""+6);
                    startActivity(intent);
                }
            }
        });

    }

    class MyAdapter extends ArrayAdapter <String>{

        Context context;
        String rNAMES[];
        String rDESCRIPTIONS[];
        int rIMAGES [];

        MyAdapter (Context c,String NAMES[], String DESCRIPTIONS[], int IMAGES[]) {
            super(c,R.layout.row, R.id.textView1, NAMES);
            this.context = c;
            this.rNAMES = NAMES;
            this.rDESCRIPTIONS = DESCRIPTIONS;
            this.rIMAGES = IMAGES;




        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            assert layoutInflater != null;
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myNAMES = row.findViewById(R.id.textView1);
            TextView myDESCRIPTIONS = row.findViewById(R.id.textView2);

                //set resources on views
            images.setImageResource(rIMAGES[position]);
            myNAMES.setText(rNAMES[position]);
            myDESCRIPTIONS.setText(rDESCRIPTIONS[position]);





            return row;
        }
    }
}

