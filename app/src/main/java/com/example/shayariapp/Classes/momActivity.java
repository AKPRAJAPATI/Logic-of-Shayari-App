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

public class momActivity extends AppCompatActivity {
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
                "माँ और क्षमा दोनों एक हैं    \n" +
                "क्यूंकि माफ़ करने में दोनों नेक हैं","Mom Shayari",R.drawable.mom_main));
        arrayList.add(new ModelDetail("\n" +
                "सख्त राहों में भी आसान सफ़र लगता है,\n" +
                "ये मेरी माँ की दुआओं का असर लगता है।।","Mom Shayari",R.drawable.mom_one));  arrayList.add(new ModelDetail("","Mom Shayari",R.drawable.mom_main));
        arrayList.add(new ModelDetail("\n" +
                "बद्दुआ संतान को इक माँ कभी देती नहीं,\n" +
                "धूप से छाले मिले जो छाँव बैठी है सहेज","Mom Shayari",R.drawable.mom_one));
        arrayList.add(new ModelDetail(" माँ बिना जिन्दगी वीरान होती है तनहा में हर\n" +
                "राह सुनसान होती है जिन्दगी में माँ का होना\n" +
                "जरुरी है माँ की दुआओं से ही हर मुश्किल\n" +
                "आसान होती है","Mom Shayari",R.drawable.mom_one));
        arrayList.add(new ModelDetail("\n" +
                "तेरे क़दमों में ये सारा जहां होगा एक दिन,\n" +
                "माँ के होठों पे तबस्सुम को सजाने वाले।।","Mom Shayari",R.drawable.mom_two));
        arrayList.add(new ModelDetail("\n" +
                "ख़ुदा ने ये सिफ़त दुनिया की हर औरत को बख्शी है,\n" +
                "कि वो पागल भी हो जाए तो बेटे याद रहते है।।","Mom Shayari",R.drawable.mom_three));
        arrayList.add(new ModelDetail("\n" +
                "मैंने कल शब चाहतों की सब किताबें फाड़ दी,\n" +
                "सिर्फ एक कागज़ पर लफ्जे माँ रहने दिया","Mom Shayari",R.drawable.mom_four));
        arrayList.add(new ModelDetail("\n" +
                "तुम क्या सिखाओगे मुझे प्यार करने का सलीका,\n" +
                "मैंने माँ के एक हाथ से थप्पड़ और दुसरे हाथ से रोटी खाई है ।","Mom Shayari",R.drawable.mom_five));
        arrayList.add(new ModelDetail("\n" +
                "यकीनन  मेरी माँ  मेरी  चट्टान है जो मेरे तक\n" +
                "आने वाली हर मुश्किल को पहले ही   रोक लेती है ।","Mom Shayari",R.drawable.mom_six));
        arrayList.add(new ModelDetail(" मेरी दुनिया में इतनी जो शोहोरत है मेरी माँ की\n" +
                "बदोलत है… ऐ मेरे ऊपर वाले और क्या देगा तू\n" +
                "मुझे मेरी माँ ही सबसे बड़ी दोलत है","Mom Shayari",R.drawable.mom_seven));
        arrayList.add(new ModelDetail("\n" +
                "हर पल में खुशी देती है माँ\n" +
                "अपनी जिन्दगी से जीवन देती है माँ\n" +
                "खुदा क्या है माँ की पूजा करो जनाब\n" +
                "क्योकि खुदा को भी जनम देती है माँ","Mom Shayari",R.drawable.mom_eight));
        arrayList.add(new ModelDetail("\n" +
                "फना कर दो अपनी सारी जिन्दगी अपनी \u202A\u200Eमाँ के कदमो में दोस्तों,\n" +
                "दुनिया में यही एक मोहब्बत है जिस में बेवफाई नही मिलती।","Mom Shayari",R.drawable.mom_nine));
        arrayList.add(new ModelDetail("\n" +
                "माँ का दिल प्यार का ताना बाना है\n" +
                "नहीं…शायद वो प्यार का एक समंदर\n" +
                "है…!नहीं…वो उससे भी बढकर है\n" +
                "!है ना ?","Mom Shayari",R.drawable.mom_ten));
        arrayList.add(new ModelDetail("\n" +
                "जिस घर में माँ होती हैं, वहाँ सब कुछ सही रहता हैं.","Mom Shayari",R.drawable.mom_main));
        arrayList.add(new ModelDetail("\n" +
                "मैं जो कुछ भी हूँ या होने की आशा\n" +
                "रखता हूँ उसका श्रेय मेरी “माँ” को जाता हैं.","Mom Shayari",R.drawable.mom_eight));
        arrayList.add(new ModelDetail("\n" +
                "भगवान हर जगह नही हो सकते इसलिए उन्होंने माँ बनाई.","Mom Shayari",R.drawable.mom_nine));
        arrayList.add(new ModelDetail("\n" +
                "माँ भले ही पढ़ी-लिखी हो या न हो पर दुनिया का\n" +
                "दुर्लभ व महत्वपूर्ण ज्ञान हमे माँ से ही प्राप्त होता हैं.","Mom Shayari",R.drawable.mom_ten));
        arrayList.add(new ModelDetail("\n" +
                "क्या मंदिर, क्या मस्जिद, क्या गंगा की\n" +
                "धार करे वो घर ही मंदिर जैसे है       \n" +
                "जिसमे औलाद माँ बाप का सत्कार करे","Mom Shayari",R.drawable.mom_five));
        arrayList.add(new ModelDetail(" जब एक रोटी के चार टुकडे हो और\n" +
                "खाने वाले पांच…तब मुझे भूख नहीं है\n" +
                "ऐसा कहने वाली इंसान है – माँ !","Mom Shayari",R.drawable.mom_six));
        arrayList.add(new ModelDetail("\n" +
                "माँ भले ही पढ़ी-लिखी हो या न हो पर दुनिया\n" +
                "का दुर्लभ व महत्वपूर्ण ज्ञान हमे माँ से ही प्राप्त होता हैं.","Mom Shayari",R.drawable.mom_seven));
        arrayList.add(new ModelDetail(" आज लाखो रुपये बेकार है वो एक रुपये के सामने\n" +
                "जो \u202Aमाँ स्कूल जाते वक्त देती थी ।","Mom Shayari",R.drawable.mom_one));
        arrayList.add(new ModelDetail("\n" +
                "ये लाखों रूपए मिट्टी हैं\n" +
                "उस एक रुपये के सामने\n" +
                "जो माँ हमें स्कूल जाते समय देती थी","Mom Shayari",R.drawable.mom_two));
        arrayList.add(new ModelDetail("\n" +
                "नाम बहुत है मतलब वही एक है कोई\n" +
                "“राम’’ बुलाता है, कोई “अल्लाह’’ तो\n" +
                "कोई “माँ !!","Mom Shayari",R.drawable.mom_three));
        arrayList.add(new ModelDetail(" जिस के होने से मैं खुद को मुक्कमल मानती हूं.. \n" +
                "\n" +
                "मेरे रब के बाद.. मैं बस मेरी मां को जानती हूं!","Mom Shayari",R.drawable.mom_four));

    }
}
