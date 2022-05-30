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

public class teacherActivity extends AppCompatActivity {
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
        arrayList.add(new ModelDetail("गुरु ईश्वर से बढ़कर है,\n" +
                "क्योंकि गुरु ही भक्तों को ईश्वर तक पहुंचाते हैं।","Teacher Shayari",R.drawable.teacher_main));
        arrayList.add(new ModelDetail("मुझे पढ़ना-लिखना सिखाने के लिए धन्यवाद\n" +
                "मुझे सही-गलत की पहचान सिखाने के लिए धन्यवाद\n" +
                "मुझे बड़े सपने देखने और आकाश\n" +
                "को चूमने का साहस देने के लिए धन्यवाद\n" +
                "मेरा मित्र, गुरु और प्रकाश बनने के लिए धन्यवाद","Teacher Shayari",R.drawable.teacher_one));
        arrayList.add(new ModelDetail("सही क्या है गलत क्या है ये सबक\n" +
                "पढ़ाते है आप,\n" +
                "सच क्या है झूठ क्या है ये समझाते\n" +
                "है आप,\n" +
                "जब सूझता ता नहीं कुछ तो रहो को\n" +
                "सरल बनाते है आप।","Teacher Shayari",R.drawable.teacher_two));
        arrayList.add(new ModelDetail("जीवन के हर अँधेरे में रौशनी दिखाते है आप,\n" +
                "बंद हो जाते है जब सारे दरवाजे नया रास्ता दिखाते है आप,\n" +
                "सिर्फ किताबी ज्ञान ही नहीं जीवन जीना भी सिखाते है आप।","Teacher Shayari",R.drawable.teacher_three));
        arrayList.add(new ModelDetail("गुरु की ऊर्जा सूर्य-सी, अम्बर-सा विस्तार,\n" +
                "गुरु की गरिमा से बड़ा, नहीं कहीं आकार,\n" +
                "गुरु का सद्सान्निध्य ही,जग में हैं उपहार,\n" +
                "प्रस्तर को क्षण-क्षण गढ़े, मूरत हो तैयार","Teacher Shayari",R.drawable.teacher_four));
        arrayList.add(new ModelDetail("गुरू यह दुनिया,दुनिया न होती, गर खुदा का नूर न होता\n" +
                "यह दुनिया कितनी बेजान होती, गर संगीत का सुर न होता\n" +
                "खुदा खुदा न होता, संगीत संगीत न होता,\n" +
                "गर इस दुनिया में गुरूओं का गुर न होता !","Teacher Shayari",R.drawable.teacher_five));

          arrayList.add(new ModelDetail("सत्य का पाठ जो पढ़ाये\n" +
                  "वही सच्चा गुरु कहलाये,\n" +
                  "जो ज्ञान से जीवन को आसान\n" +
                  "बनाये वही सच्चा गुरु कहलाये।","Teacher Shayari",R.drawable.teacher_main));
        arrayList.add(new ModelDetail("गुरू बिना ज्ञान कहाँ,\n" +
                "उसके ज्ञान का न अंत यहाँ,\n" +
                "गुरू ने दी शिक्षा जहाँ,\n" +
                "उठी शिष्टाचार की मूरत वहां।","Teacher Shayari",R.drawable.teacher_one));
        arrayList.add(new ModelDetail("साक्षर हमें बनाते हैं,जीवन क्या है समझाते हैं |\n" +
                "जब गिरते हैं हम हार कर तो साहस वही बढाते हैं |\n" +
                "ऐसे महान व्यक्ति ही तो शिक्षक हैं – जो गुरु कहलाते हैं |","Teacher Shayari",R.drawable.teacher_two));
        arrayList.add(new ModelDetail("एक बच्चा, एक शिक्षक, एक किताब और\n" +
                "एक पेन पूरी दुनिया को बदल सकते है।","Teacher Shayari",R.drawable.teacher_three));
        arrayList.add(new ModelDetail("मैंने सीखा है कि गलतियाँ भी उतनी ही\n" +
                "अच्छी शिक्षक हो सकती हैं जितना कि सफलता","Teacher Shayari",R.drawable.teacher_four));
        arrayList.add(new ModelDetail("आज टीचर्स डे के दिन हम आपसे बताना चाहते हैं कि\n" +
                "आप जिस तरह से हमें पढ़ाते हैं…\n" +
                "हमारा ध्यान रखते हैं…\n" +
                "हमें प्यार करते हैं…\n" +
                "वो आपको दुनिया का बेस्ट टीचर बनाता है.\n" +
                "हैप्पी टीचर्स डे","Teacher Shayari",R.drawable.teacher_five));



        arrayList.add(new ModelDetail("वक्त और टीचर में\n" +
                "थोड़ा सा फर्क होता है\n" +
                "टीचर सीखा कर इम्तेहान\n" +
                "लेता है और वक्त\n" +
                "इम्तेहान लेकर सिखाता है।","Teacher Shayari",R.drawable.teacher_six));
        arrayList.add(new ModelDetail("माता-पिता की मूरत है गुरू,\n" +
                "इस कलयुग में भगवान की सूरत है गुरू।","Teacher Shayari",R.drawable.teacher_seven));
        arrayList.add(new ModelDetail("सही क्या है ? गलत क्या है ? ये सबक पढ़ाते हैं आप,\n" +
                "झूठ क्या है ? सच क्या है ? ये बात समझाते हैं आप,\n" +
                "जब सूझता नहीं कुछ भी ,राहों को सरल बनाते हैं आप।","Teacher Shayari",R.drawable.teacher_eight));
        arrayList.add(new ModelDetail("गुरूदेव के श्रीचरणों में श्रद्धा सुमन संग वंदन\n" +
                "जिनके कृपा नीर से जीवन हुआ चंदन\n" +
                "धरती कहती, अंबर कहते कहती यही तराना\n" +
                "गुरू आप ही वो पावन नूर हैं जिनसे रौशन हुआ जमाना\n" +
                "ले गए आप इस स्कूल को उस मुकाम पर ,गर्व से उठते हैं हमारे सर ,\n" +
                "हम रहे ना रहे कल ,याद आएंगे आपके साथ बिताये हुए पल ,\n" +
                "हमे आपकी जरुरत रहेगी हर पल।","Teacher Shayari",R.drawable.teacher_nine));
        arrayList.add(new ModelDetail("शिक्षा से बड़ा कोई वरदान नहीं है\n" +
                "गुरु का आशीर्वाद मिले,\n" +
                "इससे बड़ा कोई सम्मान नहीं।","Teacher Shayari",R.drawable.teacher_ten));
        arrayList.add(new ModelDetail("जीवन जितना सजता है माँ-बाप के प्यार से,\n" +
                "उतना ही महकता है गुरू के आशीर्वाद से,\n" +
                "समझ कल्याण में जीतने माँ-बाप होते है खास,\n" +
                "उतने ही गुरू के कारण होती है देश की साख।","Teacher Shayari",R.drawable.teacher_three));
        arrayList.add(new ModelDetail("माँ-बाप की मूरत है गुरू …\n" +
                "इस कलयुग में भगवान की सूरत है गुरू","Teacher Shayari",R.drawable.teacher_four));
        arrayList.add(new ModelDetail("गुरु बिना ज्ञान नही ,गुरु बिना सुनी हैं जिंदगानी,\n" +
                "गुरु बिना न राम मिले ना मिले सत्य का राज\n" +
                "जब मिले गुरु का ज्ञान तो हो जाये सत्य का ज्ञान","Teacher Shayari",R.drawable.teacher_five));
        arrayList.add(new ModelDetail("जीवन में कुछ पाना है\n" +
                "तो शिक्षक का सम्मान करो।","Teacher Shayari",R.drawable.teacher_six));
        arrayList.add(new ModelDetail("शांति का पढ़ाया पाठ,\n" +
                "अज्ञान का मिटाया अंधकार,\n" +
                "गुरू ने सिखाया हमें,\n" +
                "नफरत पर विजय है प्यार।","Teacher Shayari",R.drawable.teacher_main));
        arrayList.add(new ModelDetail("जो बनाए हमें इंसान\n" +
                "और दे सही-गलत की पहचान\n" +
                "देश के उन निर्माताओं को\n" +
                "हम करते हैं शत-शत प्रणाम!\n" +
                "शिक्षक दिवस की हार्दिक शुभकामनाएं.","Teacher Shayari",R.drawable.teacher_one));
        arrayList.add(new ModelDetail("सही क्या है, गलत क्या है, ये सबक पढ़ाते हैं आप,\n" +
                "सच क्या है, झूठ क्या है, ये समझाते हैं आप,\n" +
                "जब सूझता नहीं कुछ तो राहों को सरल बनाते हैं आप।","Teacher Shayari",R.drawable.teacher_two));


    }
}
