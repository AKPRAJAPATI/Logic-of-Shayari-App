package com.example.shayariapp.Classes;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.shayariapp.Application.AdapterDetails;
import com.example.shayariapp.Application.ModelDetail;
import com.example.shayariapp.R;

import java.util.ArrayList;

public class deshBhaktiActivity extends AppCompatActivity {
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail);
        getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        this.getTheme().applyStyle(R.style.Fullsreen, false);
        getSupportActionBar().hide();

        viewPager2 = findViewById(R.id.viewPager2);
        ArrayList<ModelDetail> arrayList = new ArrayList<>();
        //set over shayari
        setOverShayari(arrayList);

        AdapterDetails adapterDetails = new AdapterDetails(getApplicationContext(), arrayList);
        viewPager2.setAdapter(adapterDetails);


    }

    private void setOverShayari(ArrayList<ModelDetail> arrayList) {
        arrayList.add(new ModelDetail("\n" +
                "\n" +
                "भारत माता से गुजारिश कि तेरी भक्ति के सिवा कोई बंदगी न मिले,\n" +
                "हर जनम मिले हिन्दुस्तान की पावन धरा पर या फिर कभी जिंदगी न मिले..!!", "Desh Bhakti Shayri", R.drawable.des_man));
        arrayList.add(new ModelDetail("मेरा मुल्क मेरा देश मेरा यह वतन,\n" +
                "शांति का उन्नति का प्यार का चमन..!!", "Desh Bhakti Shayri", R.drawable.des_a));
        arrayList.add(new ModelDetail("शहीदों की चिताओं पर लगेंगे हर बरस मेले,\n" +
                "वतन पे मर मिटने वालों का बाकी यही निशां होगा..!!", "Desh Bhakti Shayri", R.drawable.des_b));
        arrayList.add(new ModelDetail("इंडियन होने पर करिए गर्व, मिल के मनाएं लोकतंत्र का पर्व,\n" +
                "देश के दुश्मनों को मिलके हराओ, घर घर पर तिरंगा लहराओ..!!", "Desh Bhakti Shayri", R.drawable.des_c));
        arrayList.add(new ModelDetail("\n" +
                "\n" +
                "दिन रात गुरु कि पूजा करो,\n" +
                "वही है जो हमें इस संसार के पालनहार परमपिता पमेश्वर के समीप पहुंचता है..!!", "Desh Bhakti Shayri", R.drawable.des_man));
        arrayList.add(new ModelDetail("आजादी की कभी शाम ना होने देंगे,\n" +
                "शहीदों की कुर्बानी बदनाम ना होने देंगे,\n" +
                "बची है जो एक भी बूंद लहू की तब तक,\n" +
                "भारत का आँचल नीलाम ना होने देंगे..!!", "Desh Bhakti Shayri", R.drawable.des_a));
        arrayList.add(new ModelDetail("मुझे ना तन चाहिए ना धन चाहिए,\n" +
                "बस अमन से भरा यह वतन चाहिए,\n" +
                "जब तक जिन्दा रहूं इस मातृ-भूमि के लिए,\n" +
                "और जब मरुँ तो तिरंगा कफ़न चाहिये..!! ", "Desh Bhakti Shayri", R.drawable.des_b));
        arrayList.add(new ModelDetail("\n" +
                "\n" +
                "दे सलामी इस तिरंगे को जिस से तेरी शान हैं,\n" +
                "सर हमेशा ऊँचा रखना इसका जब तक दिल में जान हैं..!!", "Desh Bhakti Shayri", R.drawable.des_c));
        arrayList.add(new ModelDetail("वतन हमारा ऐसा कोई ना छोड पाये,\n" +
                "रिश्ता हमारा ऐसा कोई न तोड़ पाये,\n" +
                "दिल एक है जान एक है हमारी,\n" +
                "हिन्दुस्तान हमारा है यह शान हैं हमारी..!!", "Desh Bhakti Shayri", R.drawable.des_d));
        arrayList.add(new ModelDetail("भूख, गरीबी, लाचारी को, इस धरती से आज मिटायें,\n" +
                "भारत के भारतवासी को उसके सब अधिकार दिलायें,\n" +
                "आओ सब मिलकर नये रूप में गणतंत्र मनायें..!! ", "Desh Bhakti Shayri", R.drawable.des_e));
        arrayList.add(new ModelDetail("\n" +
                "\n" +
                "पगली तेरी याद तो बहुत आती है,\n" +
                "मगर वतन की मोहब्बत में दम ज्यादा है..!!", "Desh Bhakti Shayri", R.drawable.des_f));
        arrayList.add(new ModelDetail("\n" +
                "\n" +
                "हम आजादी तभी पाते हैं,\n" +
                "जब अपने जीवित रहने के अधिकार का पूरा मूल्य चुका देते हैं..!!", "Desh Bhakti Shayri", R.drawable.des_g));
        arrayList.add(new ModelDetail("लिख रहा हूँ मैं अंजाम, जिसका कल आगाज आएगा,\n" +
                "मेरे लहू का हर एक कतरा इंकलाब लाएगा..!!", "Desh Bhakti Shayri", R.drawable.des_c));
        arrayList.add(new ModelDetail("सारे जहाँ से अच्छा हिन्दोस्तां हमारा,\n" +
                "हम बुलबुले हैं इसकी ये गुलसिता हमारा..!!", "Desh Bhakti Shayri", R.drawable.des_d));
        arrayList.add(new ModelDetail("\n" +
                "\n" +
                "उन आँखों की दो बूंदों से सातों सागर हारे हैं,\n" +
                "जब मेहँदी वाले हाथों ने मंगल-सूत्र उतारे हैं..!!", "Desh Bhakti Shayri", R.drawable.des_e));
        arrayList.add(new ModelDetail("सीने में ज़ुनू, ऑखों में देंशभक्ति की चमक रखता हुँ,\n" +
                "दुश्मन की साँसें थम जाए, आवाज में वो धमक रखता हुँ..!!", "Desh Bhakti Shayri", R.drawable.des_f));
        arrayList.add(new ModelDetail("मझहब नही सीखाता आपस मे बैर रखना,\n" +
                "हिन्दी हैं हम वतन है हिन्दोस्तान हमारा..!!", "Desh Bhakti Shayri", R.drawable.des_g));
        arrayList.add(new ModelDetail("वतन की सर बुलंदी में, हमारा नाम हो शामिल,\n" +
                "गुजरते रहना है हमको सदा ऐसे मुकामो से..!!", "Desh Bhakti Shayri", R.drawable.des_h));
        arrayList.add(new ModelDetail("\n" +
                "\n" +
                "अपनी आज़ादी को हम हरगिज़ मिटा सकते नहीं,\n" +
                "सर कटा सकते हैं लेकिन सर झुका सकते नहीं..!!", "Desh Bhakti Shayri", R.drawable.des_i));
        arrayList.add(new ModelDetail("चैन ओ अमन का देश है मेरा, इस देश में दंगा रहने दो,\n" +
                "लाल हरे में मत बांटो, इसे शान ए तिरंगा रहने दो..!!", "Desh Bhakti Shayri", R.drawable.des_j));
        arrayList.add(new ModelDetail("चूमा था वीरों ने फांसी का फंदा,\n" +
                "यूँ ही नहीं मिली थी आजादी खैरात में..!!", "Desh Bhakti Shayri", R.drawable.des_g));
        arrayList.add(new ModelDetail("अनेकता में एकता ही इस देश की शान है,\n" +
                "इसीलिए मेरा भारत महान है..!!", "Desh Bhakti Shayri", R.drawable.des_h));
        arrayList.add(new ModelDetail("न पूछो ज़माने को क्या हमारी कहानी है,\n" +
                "हमारी पहचान तो सिर्फ ये है कि हम सिर्फ हिन्दुस्तानी हैं..!!", "Desh Bhakti Shayri", R.drawable.des_i));
        arrayList.add(new ModelDetail("आन देश की शान देश की, देश की हम संतान हैं,\n" +
                "तीन रंगों से रंगा तिरंगा, अपनी ये पहचान हैं..!!", "Desh Bhakti Shayri", R.drawable.des_j));


    }
}
