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

public class buddeActivity extends AppCompatActivity {

    ViewPager2 viewPager2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail);
        //navigation bar color
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
        arrayList.add(new ModelDetail("बुढ़ापा आने पर लोग बूढ़े व्यक्ति को घर में पड़ा पुराना सामान समझने लगते है..\n" +
                "\n" +
                "आज के हालात में आँखो देखा सच और उस सच को बयां करने की अदना सी कोशिश में कुमार..\n" +
                "\n" +
                "आप दोस्तों की दुआओं से तय होगा मेरा सफलता का मापन..", "Budde Shayari", R.drawable.budde_main));
        arrayList.add(new ModelDetail("दर्द दिल में नहीं जिंदगी में है ...\n" +
                "जिसका इलाज न है किसी वैद्य के पास ,\n" +
                "ना किसी खुदा की बंदगी में है ... ", "Budde Shayari", R.drawable.budde_one));
        arrayList.add(new ModelDetail("एक बचपन था मुझमें जो सालों पहले खो गया\n" +
                "वो बचपन जो हमेशा रंग बिरंगी कैण्डी को तरसा और भागा उस कैण्डी वाले के पीछे, अंजान इस बात से कि सपनों को रौंदती दुनियादारी की ये भीड़ कुछ और नहीं महाकुम्भ है और जब ", "Budde Shayari", R.drawable.budde_two));
        arrayList.add(new ModelDetail("पसीना उम्र भर का उसकी गोद मै सुख जाएगा\n" +
                "हमसफर क्या है ये बुढ़ापे मैं समझ आएगा ", "Budde Shayari", R.drawable.budde_three));
        arrayList.add(new ModelDetail("दरख़्तों पर इश्क की\n" +
                "नुमाइश करने वालों,\n" +
                "इश्क़ की सच्चाई\n" +
                "नज़रों से बयान होती है।\n" +
                "\n" +
                "बुढ़ापे में जब खुद की नज़र\n" +
                "साथ छोड़ देती है,\n" +
                "सिर्फ एक वही नज़र\n" +
                "हमनवाज़ होती है। ", "Budde Shayari", R.drawable.budde_fife));
        arrayList.add(new ModelDetail("क्या बताएं लौटकर\n" +
                "नौकरी से क्या लाए हैं,\n" +
                "घर से जवानी ले गए थे\n" +
                "लौटकर बुढ़ापा लाए हैं। ", "Budde Shayari", R.drawable.budde_six));
        arrayList.add(new ModelDetail("दीवारों की चीखती दरारें,खपरो की चरमराहट\n" +
                "बुढ़ापे का यौवन प्रतीक्षारत,किसी युवा परछाई को", "Budde Shayari", R.drawable.budde_eight));
        arrayList.add(new ModelDetail("दर्द दिल में नहीं जिंदगी में है ...\n" +
                "जिसका इलाज न है किसी वैद्य के पास ,\n" +
                "ना किसी खुदा की बंदगी में है ...", "Budde Shayari", R.drawable.budde_nine));
        arrayList.add(new ModelDetail("बुढापे में उसी ने हाथ नईं थामा किसी का भी\n" +
                "कि बचपन मे जिसे सबसे ज़ियादा प्यार मिलता था \n" +
                "karan singh rajput", "Budde Shayari", R.drawable.budde_ten));
        arrayList.add(new ModelDetail("अब कोई और लाएगा मेरे चश्मे\n" +
                "मुझ को बूढ़ा तुम्हारे साथ होना था \n" +
                "Intzar Akhtar", "Budde Shayari", R.drawable.budde_main));
        arrayList.add(new ModelDetail("हमारा गाँव बूढ़ा हो गया है\n" +
                "कि अब ये रोज़ थोड़ा मर रहा है \n" +
                "Saarthi Baidyanath", "Budde Shayari", R.drawable.budde_three));
        arrayList.add(new ModelDetail("नई उम्र वाले समझते नहीं हैं\n" +
                "मुहब्बत की असली उमर है बुढापा \n" +
                "Gaurav Singh Meer", "Budde Shayari", R.drawable.budde_fife));
        arrayList.add(new ModelDetail("शक़्लो सूरत से नहीं दिखती जवानी मेरी\n" +
                "उम्र पच्चीस में बूढ़ा हो गया है मिर्ज़ा \n" +
                "Amaan mirza", "Budde Shayari", R.drawable.budde_six));
        arrayList.add(new ModelDetail("बड़ी उलझी सी थी कहानी मेरी\n" +
                "बुढापे से बत्तर ज़वानी मेरी\n" +
                "\n" +
                "मुझे तुम से बस फ़ायदा ये है की\n" +
                "सुधर सी गई है अब रवानी मेरी \n" +
                "Alankrat Srivastava", "Budde Shayari", R.drawable.budde_eight));
        arrayList.add(new ModelDetail("मुझे तुझसे मोहब्बत हो न जाये\n" +
                "बुढ़ापे में फ़ज़ीहत हो न जाये\n" +
                "\n" +
                "जो आये हो तो साँसे चल रहीं हैं\n" +
                "तेरे जाने से दिक़्क़त हो न जाये\n" +
                "\n" +
                "कभी मौका मिले तो हँस लो, गा लो\n" +
                "कहीं रोने की आदत हो न जाये\n" +
                "\n" +
                "यक़ी टूटा है दिल टूटा नहीं है\n" +
                "सँभल जाओ कि नफ़रत हो न जाये\n" +
                "\n" +
                "हमारा मूड अब बनने लगा है\n" +
                "कि ऐसे में शरारत हो न जाये \n" +
                "Saarthi Baidyanath", "Budde Shayari", R.drawable.budde_main));
        arrayList.add(new ModelDetail("जवान हो गई इक नस्ल सुनते सुनते ग़ज़ल\n" +
                "हम और हो गए बूढ़े ग़ज़ल सुनाते हुए \n" +
                "Azhar Inayati", "Budde Shayari", R.drawable.budde_one));
        arrayList.add(new ModelDetail("वो वक़्त और थे कि बुज़ुर्गों की क़द्र थी \n" +
                "अब एक बूढ़ा बाप भरे घर पे बार है \n" +
                "Moin Shadab", "Budde Shayari", R.drawable.budde_two));
    }
}