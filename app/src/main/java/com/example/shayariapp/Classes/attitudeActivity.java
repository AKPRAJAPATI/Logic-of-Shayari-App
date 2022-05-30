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

public class attitudeActivity extends AppCompatActivity {
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

        arrayList.add(new ModelDetail("शराफत की दुनिआ का किस्सा ही खत्म\n" +
                "अब जैसी दुनिया वैसे हम.","Attitude Shayari",R.drawable.atti_main));
        arrayList.add(new ModelDetail("टक्कर की बात मत करो जिस दिन सामना होगा,\n" +
                "उस दिन हस्ती मिटा देंगे.","Attitude Shayari",R.drawable.att_one));
        arrayList.add(new ModelDetail("एक अलग सी पहचान बनाने की आदत है हमें,\n" +
                "जख्म हो जितना गहरा उतना मुस्कुराने की आदत है हमें.","Attitude Shayari",R.drawable.atti_two));
        arrayList.add(new ModelDetail("तुम लौट कर आने की तकलीफ मत करना,\n" +
                "हम एक मोहब्बत दो बार नहीं करते !","Attitude Shayari",R.drawable.atti_three));
        arrayList.add(new ModelDetail("लोग \u202A\u200Dपूछते\u202C हैं\n" +
                "इतने \u202Aगम\u202C में भी \u202Aखुश\u202C क्युँ हो..?\n" +
                "मैने कहा \u202Aदुनिया\u202C साथ \u202A\u200Eदे\u202C न दे\n" +
                "मेरे दोस्त\u202C तो \u202Aसाथ\u202C हैं.","Attitude Shayari",R.drawable.atti_four));
        arrayList.add(new ModelDetail("सुन छोरी इतनी आसानी से में तुझे नहीं मिलने वाला,\n" +
                "मेरी माँ कहती है बेटा लाखों में एक है तू.","Attitude Shayari",R.drawable.atti_five));
        arrayList.add(new ModelDetail("दुश्मन बने दुनिया तो इतना याद रखना मेरे दोस्त,\n" +
                "तेरा यार जिन्दा है तो तेरा हथियार जिन्दा है.","Attitude Shayari",R.drawable.atti_six));
        arrayList.add(new ModelDetail("ज़िन्दगी अपने हिसाब से जीनी चाहिए,\n" +
                "औरो के कहने पर तो शेर भी सरकस में नाचते हैं.","Attitude Shayari",R.drawable.atti_seven));
        arrayList.add(new ModelDetail("जो मेरे मुक्कदर में है वो खुद चल कर आएगा,\n" +
                "जो नहीं है उसे अपना खौफ लाएगा !","Attitude Shayari",R.drawable.atti_eight));
        arrayList.add(new ModelDetail("आजकल ज़माने के साथ चलना है तो,\n" +
                "आपको चेहरे बदलने का हुनर ज़रूर आना चाहिए.","Attitude Shayari",R.drawable.atti_nine));
        arrayList.add(new ModelDetail("बुरे है हम तभी तो जी रहे है\n" +
                "अच्छे होते दुनिया जीने नहीं देती !","Attitude Shayari",R.drawable.atti_ten));
        arrayList.add(new ModelDetail("कागजो पर तो अदालते चलती है\n" +
                "हम तो रॉयल छोरे है\n" +
                "फैसला On The Spot करते है.","Attitude Shayari",R.drawable.atti_main));
        arrayList.add(new ModelDetail("खौफ तो आवारा कुत्ते भी मचाते है ,\n" +
                "पर दहशत हमेशा शेर की ही रहती है !","Attitude Shayari",R.drawable.atti_six));
        arrayList.add(new ModelDetail("वक़्त का खास होना ज़रुरी नहीं,\n" +
                "खास लोगों के लिये वक़्त होना ज़रुरी हैं.","Attitude Shayari",R.drawable.atti_seven));
        arrayList.add(new ModelDetail("हमारी शराफत का फायदा उठाना बंद कर दो,\n" +
                "जिस दिन हम बदमाश हो गए क़यामत आ जायेगी !","Attitude Shayari",R.drawable.atti_eight));
        arrayList.add(new ModelDetail("वो मुझे ज़िन्दगी जीने का तरीका बता रहे है,\n" +
                "जिनकी औकात मेरे Attitude के बराबर भी नहीं.","Attitude Shayari",R.drawable.atti_nine));
        arrayList.add(new ModelDetail("सामने बैठे रहो, दिल को करार आएगा\n" +
                "जितना देखेंगे तुम्हें, उतना ही प्यार आएगा.","Attitude Shayari",R.drawable.atti_ten));
        arrayList.add(new ModelDetail("जिनके मिज़ाज़ दुनिया से अलग होते है ,\n" +
                "महफ़िलो में चर्चे उनके गज़ब होते है !","Attitude Shayari",R.drawable.atti_two));
        arrayList.add(new ModelDetail("मेरे ठोकरें खाने से भी कुछ लोगों को जलन है,\n" +
                "कहतें हैं यह शख्स तजुर्बे में आगे निकल गया !","Attitude Shayari",R.drawable.atti_three));
        arrayList.add(new ModelDetail("हम बाजीराव नहीं जो मस्तानी के लिए दोस्ती छोड़ दे,\n" +
                "अरे पगली हम तो दोस्ती के लिए हज़ारो मस्तानी छोड़ देंगे !","Attitude Shayari",R.drawable.atti_four));
        arrayList.add(new ModelDetail("हम भी नवाब है लोगों की अकड़ धूएँ की तरह उड़ाकर,\n" +
                "औकात सिगरेट की तरह छोटी कर देते है.","Attitude Shayari",R.drawable.atti_five));

        arrayList.add(new ModelDetail("जिसको जो कहना है कहने दो, अपना क्या जाता है,\n" +
                "ये वक्त वक्त की बात है, और वक्त सबका आता है.","Attitude Shayari",R.drawable.atti_six));
        arrayList.add(new ModelDetail("सर झुकाने की आदत नहीं आंसू बहाने की आदत नहीं,\n" +
                "हम बिछड़ गए तो रोओगे,\n" +
                "क्योंकि हमारी लौट के आने की आदत नहीं.","Attitude Shayari",R.drawable.atti_seven));
        arrayList.add(new ModelDetail("रहते हैं आस-पास ही लेकिन साथ नहीं होते,\n" +
                "कुछ लोग जलते हैं मुझसे बस खाक नहीं होते.","Attitude Shayari",R.drawable.atti_eight));
        arrayList.add(new ModelDetail("आज तक ऐसी कोई रानी नहीं बनी,\n" +
                "जो इस बदमाश को अपना गुलाम बना सके !","Attitude Shayari",R.drawable.atti_nine));
        arrayList.add(new ModelDetail("हम दुनिया से अलग नहीं,\n" +
                "हमारी दुनिया ही अलग है !","Attitude Shayari",R.drawable.atti_ten));
        arrayList.add(new ModelDetail("नाम और पहचान चाहे छोटी हो\n" +
                "पर अपने दम पर होनी चाहिए.","Attitude Shayari",R.drawable.atti_main));





    }

}
