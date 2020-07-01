package com.xxxxx.netspy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        ListView listView = findViewById(R.id.listView);

        final ArrayList<String> platforms = new ArrayList<>();
        platforms.add("Instagram: check for account...");
        platforms.add("Facebook: check for account...");
        platforms.add("Twitter: check for account...");
        platforms.add("Pinterest: check for account...");
        platforms.add("Linkedin: check for account...");
        platforms.add("9GAG: check for account...");
        platforms.add("About.me: check for account...");
        platforms.add("AskFM: check for account...");
        platforms.add("Badoo: check for account...");
        platforms.add("Academia: check for account...");
        platforms.add("VK: check for account...");
        platforms.add("Tumblr: check for account...");
        platforms.add("Reddit: check for account...");
        platforms.add("Wattpad: check for account...");
        platforms.add("Couchsurfing: check for account...");
        platforms.add("Quora: check for account...");
        platforms.add("Patreon: check for account...");
        platforms.add("Vimeo: check for account...");
        platforms.add("Foursquare: check for account...");
        platforms.add("Eksisozluk: check for account...");
        platforms.add("ForumDH: check for account...");

        final ArrayList<String> adress = new ArrayList<>();
        adress.add("https://www.instagram.com/" + username);
        adress.add("https://www.facebook.com/" + username);
        adress.add("https://www.twitter.com/" + username);
        adress.add("https://www.pinterest.com/" + username);
        adress.add("https://www.linkedin.com/" + username);
        adress.add("https://www.9gag.com/" + username);
        adress.add("https://www.about.me/" + username);
        adress.add("https://www.ask.fm/" + username);
        adress.add("https://www.badoo.com/" + username);
        adress.add("https://www.academia.edu/" + username);
        adress.add("https://www.vk.com/" + username);
        adress.add("https://" + username + ".tumblr.com");
        adress.add("https://www.reddit.com/user/" + username);
        adress.add("https://www.wattpad.com/user/" + username);
        adress.add("https://www.couchsurfing.com/" + username);
        adress.add("https://www.quora.com/" + username);
        adress.add("https://www.patreon.com/" + username);
        adress.add("https://www.vimeo.com/" + username);
        adress.add("https://www.foursquare.com/" + username);
        adress.add("https://www.eksisozluk.com/biri/" + username);
        adress.add("https://forum.donanimhaber.com/profil/" + username);

        ArrayAdapter arrayAdapter = new ArrayAdapter(SearchActivity.this,android.R.layout.simple_list_item_1,platforms);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(),LinkActivity.class);
                intent.putExtra("adress", adress.get(position));
                startActivity(intent);

            }
        });

    }
}
