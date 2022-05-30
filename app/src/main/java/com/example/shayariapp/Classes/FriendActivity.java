package com.example.shayariapp.Classes;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.shayariapp.Application.AdapterDetails;
import com.example.shayariapp.Application.ModelDetail;
import com.example.shayariapp.R;

import java.util.ArrayList;

public class FriendActivity extends AppCompatActivity {
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail);

        getWindow().setNavigationBarColor(getResources().getColor(R.color.black));

        this.getTheme().applyStyle(R.style.Fullsreen,false);
        getSupportActionBar().hide();

        viewPager2 = findViewById(R.id.viewPager2);
        ArrayList<ModelDetail> arrayList = new ArrayList<>();
        arrayList.add(new ModelDetail("ज़िन्दगी हर पल कुछ खास नहीं होती,\n" +
                "फूलों की खुशबू हमेशा पास नहीं होती,\n" +
                "मिलना हमारी तक़दीर में था वरना,\n" +
                "इतनी प्यारी दोस्ती इत्तेफाक नहीं होती।","Friends Shayari",R.drawable.two_friends2));
        arrayList.add(new ModelDetail("तुम दोस्त बनके ऐसे आए ज़िन्दगी में,\n" +
                "कि हम ये जमाना ही भूल गये,\n" +
                "तुम्हें याद आए न आए हमारी कभी,\n" +
                "पर हम तो तुम्हें भुलाना ही भूल गये।","Friends Shayari",R.drawable.two_friends));
        arrayList.add(new ModelDetail("ज़िन्दगी के तूफानों का साहिल है दोस्ती,\n" +
                "दिल के अरमानों की मंज़िल है दोस्ती,\n" +
                "ज़िन्दगी भी बन जाएगी अपनी तो जन्नत,\n" +
                "अगर मौत आने तक साथ दे दोस्ती।","Friends Shayari",R.drawable.friend_two));
        arrayList.add(new ModelDetail("दुश्मनों से मोहब्बत होने लगी है मुझे,\n" +
                "जैसे-जैसे दोस्तों को आजमाता जा रहा हूँ।","Friends Shayari",R.drawable.friend_one));
        arrayList.add(new ModelDetail("दाग दुनिया ने दिए ज़ख्म ज़माने से मिले,\n" +
                "हमको तोहफे ये तुम्हें दोस्त बनाने से मिले।","Friends Shayari",R.drawable.friend_two));
        arrayList.add(new ModelDetail("दोस्त होकर भी महीनों नहीं मिलता मुझसे,\n" +
                "उस से कहना कि कभी ज़ख्म लगाने आये।","Friends Shayari",R.drawable.friend_three));
        arrayList.add(new ModelDetail("आप जिसके वास्ते मुझसे किनारा कर गए\n" +
                "आपसे बच कर वही मुझको इशारा कर गए।","Friends Shayari",R.drawable.friend_four));
        arrayList.add(new ModelDetail("तूफानों \u200Bकी दुश्मनी से न बचते तो खैर थी\u200B,\n" +
                "\u200Bसाहिल से दोस्तों के भरम ने डुबो दिया\u200B।","Friends Shayari",R.drawable.friend_five));
        arrayList.add(new ModelDetail("दोस्ती किससे न थी किससे मुझे प्यार न था,\n" +
                "जब बुरे वक़्त पे देखा तो कोई यार न था।","Friends Shayari",R.drawable.friend_seven));
        arrayList.add(new ModelDetail("साथ रहते यूँ ही वक़्त गुजर जायेगा,\n" +
                "दूर होने के बाद कौन किसे याद आयेगा,\n" +
                "जी लो ये पल जब तक साथ है दोस्तों,\n" +
                "कल क्या पता वक़्त कहाँ ले के जायेगा।","Friends Shayari",R.drawable.two_friends2));
        arrayList.add(new ModelDetail("तन्हाई सी थी दुनिया की भीड़ में,\n" +
                "सोचा कोई अपना नहीं तकदीर में,\n" +
                "एक दिन जब दोस्ती की आप से तो यूँ लगा,\n" +
                "कुछ ख़ास था मेरे हाथ की लकीर में।","Friends Shayari",R.drawable.friendsingle));
        arrayList.add(new ModelDetail("रिश्तों से बड़ी चाहत और क्या होगी,\n" +
                "दोस्ती से बड़ी इबादत और क्या होगी,\n" +
                "जिसे दोस्त मिल सके कोई आप जैसा,\n" +
                "उसे ज़िन्दगी से कोई और शिकायत क्या होगी।","Friends Shayari",R.drawable.friend_singles));

        AdapterDetails adapterDetails = new AdapterDetails(getApplicationContext(), arrayList);
        viewPager2.setAdapter(adapterDetails);

    }
}