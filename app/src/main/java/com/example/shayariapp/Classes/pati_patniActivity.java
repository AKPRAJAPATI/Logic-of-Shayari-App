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

public class pati_patniActivity extends AppCompatActivity {
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
        arrayList.add(new ModelDetail("    काश में #व्रत रखूं #इश्क़ का\n" +
                "\n" +
                "    और तू #तुड़वा दे अपने #लबों की #चाशनी से…!!\n" +
                "\n", "Pati Patni", R.drawable.hus_wife_main));
        arrayList.add(new ModelDetail("    #लोग \uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC66\u200D\uD83D\uDC66आज कल \uD83D\uDE0E \u202Aमुझसे\u202C \n" +
                "\n" +
                "    मेरी \u202A#खुशी \uD83D\uDE42\u202C का #\u202Aराज\u202C \uD83D\uDD75पूछते है,\n" +
                "\n" +
                "    अगर \uD83D\uDC69\u200D\uD83E\uDDB0️ तेरी \u202A#इजाजत \u202C\uD83D\uDD7Aहो तो \n" +
                "\n" +
                "    \u202A\u200Eतेरा\u202C \uD83E\uDDD6 #नाम \uD83E\uDD28 \u202A\u200Eबता\u202C दूँ…!!\n" +
                "\n", "Pati Patni", R.drawable.hus_one));
        arrayList.add(new ModelDetail("    ये कैसा #ख्याल है,\n" +
                "\n" +
                "    कैसी #खुशबू सता रही है #दिल को,\n" +
                "\n" +
                "     जो #करार दिल में है,\n" +
                "\n" +
                "    कहीं ये #मोहोब्बत तो नहीं…!!\n" +
                "\n", "Pati Patni", R.drawable.hus_two));
        arrayList.add(new ModelDetail("    #लोग \uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC66\u200D\uD83D\uDC66आज कल \uD83D\uDE0E \u202Aमुझसे\u202C \n" +
                "\n" +
                "    मेरी \u202A#खुशी \uD83D\uDE42\u202C का #\u202Aराज\u202C \uD83D\uDD75पूछते है,\n" +
                "\n" +
                "    अगर \uD83D\uDC69\u200D\uD83E\uDDB0️ तेरी \u202A#इजाजत \u202C\uD83D\uDD7Aहो तो \n" +
                "\n" +
                "    \u202A\u200Eतेरा\u202C \uD83E\uDDD6 #नाम \uD83E\uDD28 \u202A\u200Eबता\u202C दूँ…!!\n" +
                "\n", "Pati Patni", R.drawable.hus_three));
        arrayList.add(new ModelDetail("     तेरी #नज़र \uD83E\uDD26 का #जादू \uD83D\uDC7C है या,\n" +
                "\n" +
                "    मेरी #उम्र \uD83D\uDE46\u200D♂️ का #जोश \uD83D\uDCAA ,\n" +
                "\n" +
                "    जब भी #देखता \uD83D\uDE33 हूँ तुझे,\n" +
                "\n" +
                "    #उड़ \uD83E\uDDDA\u200D♂️जाते है मेरे \uD83D\uDC7C #होश…!!\n" +
                "\n", "Pati Patni", R.drawable.hus_four));
        arrayList.add(new ModelDetail("     हम \uD83D\uDE0E #कुछ यूँ तेरे #दीदार \uD83E\uDD0F में खो \uD83D\uDC64 जाते है,\n" +
                "\n" +
                "    जैसे \uD83D\uDC6B\uD83C\uDFFB बच्चे भरे #बाजार \uD83C\uDFDF में #खो \uD83E\uDD37\u200D♂️ जाते है…!!\n" +
                "\n", "Pati Patni", R.drawable.hus_five));
        arrayList.add(new ModelDetail("     लंबी #बातों \uD83D\uDC8C से मुझे कोई #मतलब \uD83D\uDE47नहीं है,\n" +
                "\n" +
                "    मुझे तो उनका \uD83D\uDC69\u200D\uD83E\uDDB0️ “जी” कहना भी #कमाल \uD83E\uDD26 लगता है…!!\n" +
                "\n", "Pati Patni", R.drawable.hus_five));
        arrayList.add(new ModelDetail("     आये जब \uD83E\uDDD6 तुम #सामने \uD83D\uDE4B\u200D♂️तो,\n" +
                "\n" +
                "    अज़ब \uD83E\uDD0F #तमाशा हुआ,\n" +
                "\n" +
                "    हर #शिकायत \uD83D\uDE1Fने जैसे,\n" +
                "\n" +
                "    #ख़ुदकुशी \uD83E\uDDDC\u200D♂️ कर ली।\n" +
                "\n", "Pati Patni", R.drawable.hus_six));
        arrayList.add(new ModelDetail("प्यार था, इसलिए मैंने\n" +
                "तुम्हें चुना", "Pati Patni", R.drawable.hus_seven));
        arrayList.add(new ModelDetail("आपको इसकी सबसे ज्यादा जरूरत तब पड़ती है\n" +
                "जब कोई लड़की आपसे कहती है कि मुझे अकेला छोड़ दो।", "Pati Patni", R.drawable.hus_eight));
        arrayList.add(new ModelDetail("मैं तुम्हें कभी खोना नहीं चाहता क्योंकि\n" +
                "तुम्हारे आने के बाद से मेरा जीवन बेहतर हो गया है।", "Pati Patni", R.drawable.hus_nine));
        arrayList.add(new ModelDetail("                \"अगर प्यार है तो बात करना क्यों बंद कर देते हो?\", \"Pati Patni\", R.drawable.teacher_main));\n", "Pati Patni", R.drawable.hus_ten));
        arrayList.add(new ModelDetail("ध्यान रखें कि दीवार पर तस्वीरें क्यों टांगें?\n" +
                "अगर प्यार है तो बात करना क्यों बंद कर देते हो?", "Pati Patni", R.drawable.teacher_main));
        arrayList.add(new ModelDetail("पता नहीं वो दिन कब आएगा\n" +
                "जब मैं तुम्हें गले लगा पाऊंगा।", "Pati Patni", R.drawable.hus_five));
        arrayList.add(new ModelDetail("मैं सब कुछ देख सकता हूं लेकिन आप\n" +
                "इस उदास चेहरे को नहीं देख सकते।", "Pati Patni", R.drawable.hus_five));
        arrayList.add(new ModelDetail("इस दुनिया में भी मिल जाएंगे हज़ारों\n" +
                "दीवाने", "Pati Patni", R.drawable.hus_six));
        arrayList.add(new ModelDetail("सच कहूं\n" +
                "तो दुनिया के किसी भी कोने में ऐसा सुकून नहीं है\n" +
                "जो आपके एक आलिंगन में सहज हो !!", "Pati Patni", R.drawable.hus_seven));
        arrayList.add(new ModelDetail("आपसे चिपके रहना\n" +
                "और सबसे अच्छा अहसास होना मजेदार है!", "Pati Patni", R.drawable.hus_eight));
        arrayList.add(new ModelDetail("चलो हग डे और किस डे के साथ मनाएं,\n" +
                "तुम मुझे गले लगाओ और मैं तुम्हें चूमूंगा।", "Pati Patni", R.drawable.hus_wife_main));
        arrayList.add(new ModelDetail("बहुत दिन बीत चुके हैं\n" +
                "और मैं उसके पास जाऊंगा जो पागल से प्यार करता है और\n" +
                "जोर से हग करता है।", "Pati Patni", R.drawable.hus_one));
        arrayList.add(new ModelDetail("ऐ पागल\n" +
                ", अगर मुझसे कभी कोई गलती हो जाए, तो मुझे माफ़ कर देना,\n" +
                "क्योंकि मुझ पर तेरा हक़ है।", "Pati Patni", R.drawable.hus_two));
        arrayList.add(new ModelDetail("मेरी हर ख़ुशी \uD83D\uDE0D हर बात तेरी हैंसाँसों में छुपी ये साँस तेरी हैंदो पल भी नही रह सकते तेरे बिनधड़कनों की धड़कती हर आवाज तेरी हैं", "Pati Patni", R.drawable.hus_three));
    }
}
