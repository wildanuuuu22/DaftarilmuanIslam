package com.example.willdan.daftarilmuanislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class listilmuwan extends AppCompatActivity {


    String[] nama = {"Al Khawarizmi\n",
            "Al Zahrawi",
            "Ibnu al-Baithar",
            "Ibnu al-Nafis",
            "Ibnu Haitham ",
            "Ibnu Khaldun",
            "Ibnu Sina",
            "Jabir Ibn- Hayyan",
            "Thbit ibn Qurra",
            "Umar Khayyam"};

    int[] gambar = {R.drawable.alzahrawi,
    R.drawable.alkhawarizmi,
    R.drawable.ibnualbhaitar,
    R.drawable.ibnualnafis,
    R.drawable.ibnuhaitman,
    R.drawable.ibnukhaldun,
    R.drawable.ibnusina,
    R.drawable.jabilibnhayyan,
    R.drawable.thbitibnqurra,
    R.drawable.umarkhayyam};

    String[] Url = {"https://id.wikipedia.org/wiki/Mu%E1%B8%A5ammad_bin_M%C5%ABs%C4%81_al-Khaw%C4%81rizm%C4%AB",

    "https://id.wikipedia.org/wiki/Abu_al-Qasim_al-Zahrawi",

    "https://id.wikipedia.org/wiki/Ibnu_al-Baithar",

    "https://id.wikipedia.org/wiki/Ibnu_al-Nafis",

    "https://id.wikipedia.org/wiki/Ibnu_Haitham",

    "https://id.wikipedia.org/wiki/Ibnu_Khaldun",

    "https://id.wikipedia.org/wiki/Ibnu_Sina",

    "https://id.wikipedia.org/wiki/Abu_Musa_Jabir_bin_Hayyan",

    "https://id.wikipedia.org/wiki/Tsabit_bin_Qurrah",

    "https://id.wikipedia.org/wiki/Umar_Khayy%C4%81m"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ilmuwan);

        ListView listView = findViewById(R.id.ListViewIlmuwan);
        CustomListviewAdapter customListviewAdapter = new CustomListviewAdapter();
        listView.setAdapter(customListviewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(listilmuwan.this, detaililmuwan.class);
                i.putExtra("putNama", nama[position]);
                i.putExtra("putUrl", Url [position]);
                startActivity(i);
            }
        });
    }

    class CustomListviewAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return gambar.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.custom_listview,null);

            ImageView imageView = convertView.findViewById(R.id.imgIlmuwan);
            TextView textView = convertView.findViewById(R.id.txtIlmuwan);

            imageView.setImageResource(gambar[position]);
            textView.setText(nama[position]);

            return convertView;
        }
    }
}
