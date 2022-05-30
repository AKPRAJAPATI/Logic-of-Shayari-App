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

public class birthDayActivity extends AppCompatActivity {
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
        arrayList.add(new ModelDetail("हर लम्हा आपके हाथों पे मुस्कान रहे,\n" +
                "\n" +
                "हर ग़म से आप अन्जान रहे,\n" +
                "\n" +
                "जिसके साथ मेहक उठे आपकी जिंदगी,\n" +
                "\n" +
                "हमेशा आपके पास वो इंसान रहे…\n" +
                "\n" +
                "\uD83C\uDF82 Happy Birthday To You…\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81", "BirthDay Shayari", R.drawable.birthday_main));
        arrayList.add(new ModelDetail("जरूर तूमको किसीने दिल ❤️ से पुकारा होगा,\n" +
                "\n" +
                "एक बार तो चाँद ने कभी तुमको निहारा होगा,\n" +
                "\n" +
                "मायूस हुए होंगे सितारे भी उस दिन,\n" +
                "\n" +
                "खुदाने जब जमीन पर तुमको उतारा होगा…\n" +
                "\n" +
                "\uD83C\uDF82जन्मदिन मुबारक हो…\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81", "BirthDay Shayari", R.drawable.birthday_a));
        arrayList.add(new ModelDetail("हमारी एक प्यारी सी दुआ \uD83D\uDE4F है,\n" +
                "\n" +
                "आपकी हर दुआ \uD83D\uDE4F पुरी हो,\n" +
                "\n" +
                "जो प्यारी चाहते होती है सपनों में,\n" +
                "\n" +
                "वो सारी चाहते आपकी पुरी हो…\n" +
                "\n" +
                "\uD83C\uDF80\uD83C\uDF81Janmadin Mubarak!\uD83C\uDF82", "BirthDay Shayari", R.drawable.birthday_b));
        arrayList.add(new ModelDetail("तोहफा मैं तुझे आज मेरा दिल ❤️ ही देता हूँ,\n" +
                "\n" +
                "ये हसीन मोका गवाना नहीं चाहता हूँ,\n" +
                "\n" +
                "अपने दिल ❤️ की बात तुम्हारे सामने बतलाता हूँ,\n" +
                "\n" +
                "और तुम्हारे जन्म दिन की शुभ कामनाये देता हूँ.\n" +
                "\n" +
                "\uD83C\uDF80\uD83C\uDF81Happiest Birthday to U\uD83C\uDF80\uD83C\uDF81", "BirthDay Shayari", R.drawable.birthday_d));
        arrayList.add(new ModelDetail("जन्मदिन \uD83C\uDF82 के ये ख़ास लम्हें मुबारक,\n" +
                "\n" +
                "आँखों में बसे नए ख्वाब मुबारक,\n" +
                "\n" +
                "जिंदगी जो लेकर आई है आपके लिए आज…\n" +
                "\n" +
                "वो तमाम खुशियों की हंसीं सौगात मुबारक….!!!", "BirthDay Shayari", R.drawable.birthday_e));
        arrayList.add(new ModelDetail("प्यार से भरी जिंदगी मिले आपको,\n" +
                "\n" +
                "खुशियाँ से भरे पल मिले आपको,\n" +
                "\n" +
                "कभी किसी ग़म का सामना ना करना पड़े,\n" +
                "\n" +
                "ऐसा आने वाला कल मिले आपको…\n" +
                "\n" +
                "\uD83C\uDF82हेप्पी बर्थडे टू यू….\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81", "BirthDay Shayari", R.drawable.birthday_f));

        arrayList.add(new ModelDetail("ज़िंदगी की कुछ खास \uD83D\uDE4F दुआए लेलो हमसे\n" +
                "\n" +
                "जन्मदिन पर कुछ नजराने ले लो हमसे\n" +
                "\n" +
                "भर दे रंग जो तेरे जीवन के पलो में…\n" +
                "\n" +
                "आज वो हसी मुबारक बाद ले लो हमसे\n" +
                "\n" +
                "Happy Birthday\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81", "BirthDay Shayari", R.drawable.birthday_h));
        arrayList.add(new ModelDetail("Birthday Shayari For Lover:\n" +
                "\n" +
                "ऐ खुदा एक मन्नत है हमारी,\n" +
                "\n" +
                "मेरी जान \uD83D\uDC9E जन्नत है हमारी,\uD83D\uDE18\n" +
                "\n" +
                "चाहे हम हो ना हो साथ उनके,\n" +
                "\n" +
                "पर खुशियाँ मिले उनको प्यारी❣️प्यारी…\n" +
                "\n" +
                "Happy Birthday \uD83D\uDE18 Jaan…\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81", "BirthDay Shayari", R.drawable.birthday_i));
        arrayList.add(new ModelDetail("खुदा कैसे करूँ शुक्रिया इस दिन के लिए\n" +
                "\n" +
                "जिस दिन तुम्हे धरती पर भेजा हमारे लिए\n" +
                "\n" +
                "ना जाने क्यों मैं इंतज़ार कर रहा था\n" +
                "\n" +
                "शायद जन्मदिन है तुम्हारा इस लिए\n" +
                "\n" +
                "मेरी हर एक दुआ \uD83D\uDE4F है तेरी लंबी उमर के लिए\n" +
                "\n" +
                "दिल ❤️ खुद जानता है तू ना हो तो धड़केगा \uD83D\uDC97 किस के लिए\n" +
                "\n" +
                "Happy Birthday\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81", "BirthDay Shayari", R.drawable.birthday_j));

        arrayList.add(new ModelDetail("एक दुआ \uD83D\uDE4F है कोई गिला नहीं हो,\n" +
                "\n" +
                "ऐसा प्यार \uD83D\uDC96 का फूल \uD83C\uDF3A जो आज तक खिला ना हो,\n" +
                "\n" +
                "आज मिले वो सब आपको,\n" +
                "\n" +
                "जो आज तक कभी किसी को मिला ना हो…\n" +
                "\n" +
                "\uD83C\uDF82H’py B’day to u\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81", "BirthDay Shayari", R.drawable.birthday_a));
        arrayList.add(new ModelDetail("ख्वाहिशों के समंदर के सब मोती तेरे नसीब हो,\n" +
                "\n" +
                "तेरे चाहने वाले हमसफ़र तेरे हरदम करीब हों,\n" +
                "\n" +
                "कुछ यूँ उतरे तेरे लिए रहमतों का मौसम,\n" +
                "\n" +
                "कि तेरी हर \uD83D\uDE4F दुआ, हर ख्वाहिश कबूल हो।\n" +
                "\n" +
                "\uD83C\uDF82जन्मदिन की बधाई!\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81", "BirthDay Shayari", R.drawable.birthday_a));
        arrayList.add(new ModelDetail("ये दुआ \uD83D\uDE4F है आपके जन्मदिन पे हमारी,\n" +
                "\n" +
                "ना तूटे कभी दोस्ती हमारी,\n" +
                "\n" +
                "सारी जिंदगी देंगे खुशियाँ आपको…\n" +
                "\n" +
                "और वो खुशियाँ होगी प्यारी प्यारी…\uD83D\uDE0A\n" +
                "\n" +
                "\uD83C\uDF82Happy Birthday to you my Best Friend…\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81", "BirthDay Shayari", R.drawable.birthday_a));
        arrayList.add(new ModelDetail("#Life का हर #Goal रहे आपका #Clear,\n" +
                "\n" +
                "तुम #Success पाओ Without any #Fear\n" +
                "\n" +
                "हर पल जियो Without any #Tear,\n" +
                "\n" +
                "Enjoy your day my #Dear,\n" +
                "\n" +
                "\uD83C\uDF82HAPPY BIRTHDAY\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81", "BirthDay Shayari", R.drawable.birthday_a));
        arrayList.add(new ModelDetail("सूरज की रोशनी लेकर आया,\n" +
                "\n" +
                "और चिडियों ने गाना गाया…\n" +
                "\n" +
                "फूलों ने हंस हंस कर बोला…\n" +
                "\n" +
                "मुबारक हो तुम्हारा जन्मदिन आया…\n" +
                "\n" +
                "\uD83C\uDF82*Happy Birthday*\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81\n" +
                "\n" +
                "Good Morning Have a Blessing day…", "BirthDay Shayari", R.drawable.birthday_f));

        arrayList.add(new ModelDetail("हमारे लिये खास है आज का दिन,\n" +
                "\n" +
                "जो नहीं बिताना चाहते आपके बिन,\n" +
                "\n" +
                "वैसे तो हर दुआ \uD83D\uDE4Fआपके लिये मांगते है,\n" +
                "\n" +
                "फिर भी कहते है –\n" +
                "\n" +
                "खुब सारी खुशियाँ मिले आपको इस जन्मदिन…\n" +
                "\n" +
                "\uD83C\uDF82जन्मदिन की बधाई हो…\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81", "BirthDay Shayari", R.drawable.birthday_h));
        arrayList.add(new ModelDetail("On these Beautiful Birthday,\n" +
                "\n" +
                "भगवान करे आप Enjoyment से\n" +
                "\n" +
                "भरपूर और Smile से अपना आज\n" +
                "\n" +
                "का दिन Celebrate करो, और\n" +
                "\n" +
                "बहुत सारी Surprises पाओ,,,\n" +
                "\n" +
                "^\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81^HAPPY BIRTHDAY^\uD83C\uDF82^", "BirthDay Shayari", R.drawable.birthday_i));
        arrayList.add(new ModelDetail("On these Beautiful Birthday,\n" +
                "\n" +
                "भगवान करे आप Enjoyment से\n" +
                "\n" +
                "भरपूर और Smile से अपना आज\n" +
                "\n" +
                "का दिन Celebrate करो, और\n" +
                "\n" +
                "बहुत सारी Surprises पाओ,,,\n" +
                "\n" +
                "^\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81^HAPPY BIRTHDAY^\uD83C\uDF82^", "BirthDay Shayari", R.drawable.birthday_j));


        arrayList.add(new ModelDetail("आसमान की बुलंदियों पर नाम हो आपका,\n" +
                "\n" +
                "चांद की धरती पर मुकाम हो आपका…\n" +
                "\n" +
                "हम तो रहते है छोटी-सी \uD83C\uDF0E दुनिया में,\n" +
                "\n" +
                "पर ईश्वर करें सारा जहान हो आपका…\n" +
                "\n" +
                "\uD83C\uDF82जन्मदिन की बहोत बहोत शुभकामनायें \uD83C\uDF82\uD83C\uDF80\uD83C\uDF81", "BirthDay Shayari", R.drawable.birthday_main));
        arrayList.add(new ModelDetail("मैं लिख दू तुम्हारी उम्र चाँद सितारों से…\n" +
                "\n" +
                "मैं मनाऊ जन्मदिन तुम्हारा फूल बहारों से\n" +
                "\n" +
                "ऐसी खूबसूरती दुनिया \uD83C\uDF0E से लेकर आऊ मैं\n" +
                "\n" +
                "के सारी महफ़िल सज जाए हसीं नजारो से\n" +
                "\n" +
                "Happy \uD83C\uDF82 Birthday \uD83C\uDF82to You…\uD83C\uDF80\uD83C\uDF81", "BirthDay Shayari", R.drawable.birthday_a));
        arrayList.add(new ModelDetail("एक दुआ \uD83D\uDE4F माँगते है हम अपने भगवान से,\n" +
                "\n" +
                "चाहते है आपकी खुशी पूरे ईमान से,\n" +
                "\n" +
                "सब हसरतें पूरी हो आपकी\n" +
                "\n" +
                "और आप मुस्कुराएँ दिलो ❤️ जान \uD83D\uDC97 से…\n" +
                "\n" +
                "\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81*Happy Birthday*\uD83C\uDF82\uD83C\uDF82", "BirthDay Shayari", R.drawable.birthday_b));
        arrayList.add(new ModelDetail("≛≛”*•”*•≛≛\n" +
                "\n" +
                "दुनिया \uD83C\uDF0E कि सारी खुशियाँ मिले आपको,\n" +
                "\n" +
                "खुदा से रहमत और प्यार ❤️ मिले आपको…\n" +
                "\n" +
                "आपके होठों पर बनी रहे हमेशा मुस्कान\uD83D\uDE0A,\n" +
                "\n" +
                "दुआ \uD83D\uDE4F है,\n" +
                "\n" +
                "उम्र के साथ साथ बढ़ते रहे आपका मान-सम्मान…\n" +
                "\n" +
                "≛≛”*•”*•≛≛\n" +
                "\n" +
                "\uD83C\uDF82\uD83C\uDF82“Happy Birthday”\uD83C\uDF80\uD83C\uDF81\uD83C\uDF82\n" +
                "\n" +
                "≛≛”*•”*•≛≛", "BirthDay Shayari", R.drawable.birthday_d));
        arrayList.add(new ModelDetail("दोस्त तू है मेरा सबसे न्यारा,\n" +
                "\n" +
                "तुझे मुबारक हो तेरा जन्मदिन ओ यारा…\n" +
                "\n" +
                "किसी की कभी नजर ना लगे तुझे,\n" +
                "\n" +
                "कभी उदास ना हो ये चहेरा प्यारा \uD83D\uDC9E प्यारा…\n" +
                "\n" +
                "जन्मदिन \uD83C\uDF82\uD83C\uDF80\uD83C\uDF81 की बहोत बहोत शुभकामनायें", "BirthDay Shayari", R.drawable.birthday_e));
        arrayList.add(new ModelDetail("आ तेरी उम्र में लिख दूँ \uD83C\uDF19✨चाँद-सितारों\uD83C\uDF19✨ से,\n" +
                "\n" +
                "तेरा जन्मदिन मनाऊँ फूलों से बहारों से…\n" +
                "\n" +
                "हर एक खूबसूरती दुनिया \uD83C\uDF0E से मैं ले आउ,\n" +
                "\n" +
                "सजाऊ में ये महेफिल हर हसिन नजारों से…\n" +
                "\n" +
                "\uD83C\uDF80\uD83C\uDF81जन्मदिन की ढेर सारी शुभकामनायें…\uD83C\uDF82\uD83C\uDF82", "BirthDay Shayari", R.drawable.birthday_f));


    }
}
