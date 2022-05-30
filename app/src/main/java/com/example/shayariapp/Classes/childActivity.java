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

public class childActivity extends AppCompatActivity {

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

        arrayList.add(new ModelDetail("बच्चों के छोटे हाथों को चाँद सितारे छूने दो\n" +
                "\n" +
                "चार किताबें पढ़ कर ये भी हम जैसे हो जाएँगे", "Child Shayari", R.drawable.child_one));
        arrayList.add(new ModelDetail("रोते-रोते थक कर जैसे कोई बच्चा सो जाता है\n" +
                "\n" +
                "हाल हमारे दिल का अक्सर कुछ ऐसा ही हो जाता है", "Child Shayari", R.drawable.child_two));
        arrayList.add(new ModelDetail("हम कुछ ऐसे तिरे दीदार में खो जाते हैं\n" +
                "\n" +
                "जैसे बच्चे भरे बाज़ार में खो जाते हैं", "Child Shayari", R.drawable.child_thirteen));
        arrayList.add(new ModelDetail("कभी तो देख लिया करो \n" +
                "\n" +
                "बुजुर्ग माँ बाप की आँखो में \n" +
                "\n" +
                "वो ऐसा दर्पण है  जिनमे\n" +
                "\n" +
                " बच्चे कभी बूठे नहीं होते। .", "Child Shayari", R.drawable.child_three));
        arrayList.add(new ModelDetail("बच्चे मन के सच्चे \n" +
                "\n" +
                "सारे जग के चाँद सितारे \n" +
                "\n" +
                "ये जो नन्हे नन्हे फूल है जो \n" +
                "\n" +
                "भगवान को लगते प्यारे। ..", "Child Shayari", R.drawable.child_four));
        arrayList.add(new ModelDetail("\n" +
                "तुझे मै चलना सिखलाऊ \n" +
                "\n" +
                "कल हाथ पकड़ना मेरा \n" +
                "\n" +
                "जब मै बूठा हो जाऊ....", "Child Shayari", R.drawable.child_five));
        arrayList.add(new ModelDetail("जितनी बुरी कही जाती है उतनी बुरी नहीं है दुनिया\n" +
                "\n" +
                "बच्चों के स्कूल में शायद तुम से मिली नहीं है दुनिया", "Child Shayari", R.drawable.child_six));
        arrayList.add(new ModelDetail("गरज-बरस प्यासी धरती पर फिर पानी दे मौला\n" +
                "\n" +
                "चिड़ियों को दाने बच्चों को गुड़-धानी दे मौला", "Child Shayari", R.drawable.child_seven));
        arrayList.add(new ModelDetail("मोहल्ले वाले मेरे कार-ए-बे-मसरफ़ पे हँसते हैं\n" +
                "\n" +
                "मैं बच्चों के लिए गलियों में ग़ुब्बारे बनाता हूँ", "Child Shayari", R.drawable.child_eight));
        arrayList.add(new ModelDetail("दौलत से मोहब्बत तो नहीं थी मुझे लेकिन\n" +
                "\n" +
                "बच्चों ने खिलौनों की तरफ़ देख लिया है", "Child Shayari", R.drawable.child_nine));
        arrayList.add(new ModelDetail("हम भी इन बच्चों की मानिंद कोई पल जी लें\n" +
                "\n" +
                "एक सिक्का जो हथेली पे सजा लाते हैं", "Child Shayari", R.drawable.child_ten));
        arrayList.add(new ModelDetail("कितनी आसानी से दुनिया की गिरह खोलता है\n" +
                "\n" +
                "मुझ में इक बच्चा बुज़ुर्गों की तरह बोलता है", "Child Shayari", R.drawable.child_eleven));
        arrayList.add(new ModelDetail("घास पर खेलता इक बच्चा,पास माँ बैठी मुस्कुराती है,\n" +
                "\n" +
                "मुझे हैरत है दुनिया क्यु काबा और सोमनाथ को जाती है।", "Child Shayari", R.drawable.child_tweleve));
        arrayList.add(new ModelDetail("\n" +
                "एक बचपन का जमाना था \n" +
                "\n" +
                "होता जब खुशियों का खजाना था \n" +
                "\n" +
                "चाहत होती चाँद को पाने की पर \n" +
                "\n" +
                "दिल तो रंगबेरंगी तितली का दीवाना था।", "Child Shayari", R.drawable.child_thirteen));
        arrayList.add(new ModelDetail("रोने की वहज न थी \n" +
                "\n" +
                "ना हँसने का बहाना था \n" +
                "\n" +
                "क्यों हो गए हम इतने बड़े \n" +
                "\n" +
                "इसे अच्छा तो वो हमारा कल का बचपन था। ", "Child Shayari", R.drawable.child_fifteen));
        arrayList.add(new ModelDetail("वो बचपन की अमीरी न जाने कहा खो गई \n" +
                "\n" +
                "बारिश , पानी और जहाज की \n" +
                "\n" +
                "बाते जो भी अब एक ख्वाब हो गई। ", "Child Shayari", R.drawable.child_forteen));
        arrayList.add(new ModelDetail("भूख चहेरो पे लिए चाँद से प्यारे बच्चे \n" +
                "\n" +
                "बेचते फिरते हे गलियों में \n" +
                "\n" +
                "गुब्बारे बच्चे। ..", "Child Shayari", R.drawable.child_eight));
        arrayList.add(new ModelDetail("क्यों हो गए हम इतने बड़े \n" +
                "\n" +
                "इससे अच्छे तो वो \n" +
                "\n" +
                "बचपन का जमाना था। ..", "Child Shayari", R.drawable.child_nine));
        arrayList.add(new ModelDetail("बच्चो के छोटे हाथो को चाँद सितारें छूने दो \n" +
                "\n" +
                "चार किताबे पठ कर ये भी \n" +
                "\n" +
                "है जैसे हो जाएँगे। ..", "Child Shayari", R.drawable.child_ten));
        arrayList.add(new ModelDetail("बारिश का पानी आजकल \n" +
                "\n" +
                "सुना है कागज की नाव से क्योकि नाव \n" +
                "\n" +
                "बनाने वाले बच्चे अब बड़े हो गये है ...", "Child Shayari", R.drawable.child_thirteen));
        arrayList.add(new ModelDetail("\n" +
                "एक हाथी एक राजा एक रानी के बग़ैर \n" +
                "\n" +
                "नीद बच्चो को नहीं \n" +
                "\n" +
                "आती कहानी के बग़ैर। ..", "Child Shayari", R.drawable.child_three));
        arrayList.add(new ModelDetail("बचपन के दिन भी कितने अच्छे होते थे \n" +
                "\n" +
                "तब ये दिल नहीं सिर्फ खिलौने \n" +
                "\n" +
                "ही टूटा करते थे...", "Child Shayari", R.drawable.child_four));


    }
}
