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

public class makeUpActivity extends AppCompatActivity {
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
                "आईने भी कहाँ सच कहते है,\n" +
                "वो मेकअप करके आती है\n" +
                "और ये झूठी तारीफ करते है.","Make Up Shayari",R.drawable.make_main));
        arrayList.add(new ModelDetail("\n" +
                "\n" +
                "वर्षों बाद मिला तो लगा तुम अभी जवान हो,\n" +
                "बाद में चश्मा लगाकर देखा तो लगा मेकअप की दूकान हो.","Make Up Shayari",R.drawable.make_up_one));
        arrayList.add(new ModelDetail("लड़कियाँ दो तरह की होती है,\n" +
                "एक अच्छी और दूसरी बहुत अच्छी\n" +
                "क्योंकि लड़कियों को ईश्वर ने ही\n" +
                "सुंदर बनाया है. मेकअप तो वे\n" +
                "बेवजह ही करती है.","Make Up Shayari",R.drawable.make_up_two));
        arrayList.add(new ModelDetail("दिखावे की दुनिया है साहब\n" +
                "इसलिए मेकअप लगाती हूँ,\n" +
                "क्योंकि घर पर अपनों के साथ\n" +
                "बिना मेकअप के रहती हूँ.","Make Up Shayari",R.drawable.make_up_three));
        arrayList.add(new ModelDetail("जिन्हें मेरा मेकअप वाला\n" +
                "चेहरा सुंदर लगे वो गुमान करें,\n" +
                "जिनको मेकअप के बाद भी अच्छा ना लगे\n" +
                "वो अपनी बेकार आँखे दान करें.","Make Up Shayari",R.drawable.make_up_four));
        arrayList.add(new ModelDetail("बड़ा ही मशहूर हुआ मैं प्यार के चर्चे में,\n" +
                "लेकिन मैं फ़कीर हुआ मेकअप के खर्चे में.","Make Up Shayari",R.drawable.make_five));
        arrayList.add(new ModelDetail("उसके चेहरे की खूबसूरती को देख मैं खिल गया,\n" +
                "जब अगले दिन उसने मुँह धोया तो मैं हिल गया.","Make Up Shayari",R.drawable.make_up_six));
        arrayList.add(new ModelDetail("मेकअप शेकअप\n" +
                "हमें जरा ना भायें,\n" +
                "जो ऊपर वाले ने दिया है\n" +
                "मुझे तो वही रास आये.","Make Up Shayari",R.drawable.make_up_seven));
        arrayList.add(new ModelDetail("मेकअप औरत के चेहरे को सुंदर\n" +
                "और मन को सकारात्मक बना देता है.\n" +
                "और औरत की यही सुंदरता पुरूष को\n" +
                "अपनी तरफ आकर्षित करता है.\n" +
                "साधारण मेकअप और सादगी\n" +
                "केवल विद्वान पुरूषों को पसंद\n" +
                "आती है.","Make Up Shayari",R.drawable.make_up_eight));
        arrayList.add(new ModelDetail("प्रेम जब सच्चा होता है,\n" +
                "तब मेकअप और श्रृंगार की\n" +
                "आवश्यकता नहीं होती है.\n" +
                "क्योंकि उस वक़्त दोनों\n" +
                "की रूह आपस में जुड़ जाती है.","Make Up Shayari",R.drawable.make_up_nine));
        arrayList.add(new ModelDetail("औरत को मेकअप (श्रृंगार) करना अच्छा लगता है,\n" +
                "इसलिए वो सजती और संवरती है. बहुत से शादी शुदा\n" +
                "पुरूष इस गलतफहमी में रहते है कि वो उनके लिए\n" +
                "श्रृंगार करती है.","Make Up Shayari",R.drawable.make_up_ten));
        arrayList.add(new ModelDetail("पति के ही पैसो से\n" +
                "पति को बेवकूफ बनाने\n" +
                "की कला को मेकअप\n" +
                "कहते है.","Make Up Shayari",R.drawable.make_up_eleven));
        arrayList.add(new ModelDetail("\n" +
                "\n" +
                "बेवजह मुस्कुराकर दिलों पर क्यों खंजर चलाती हो,\n" +
                "इतनी खूबसूरत हो फिर क्यों मेकअप करके आती हो.","Make Up Shayari",R.drawable.make_up_tweleve));
        arrayList.add(new ModelDetail("मेकअप वाली खूबसूरती माना दिल में आग लगाती है,\n" +
                "लेकिन हकीकत उस आग को बड़े आसानी से बुझाती है.","Make Up Shayari",R.drawable.make_up_thirteen));
        arrayList.add(new ModelDetail("मैं बिना मेकअप के ही\n" +
                "इतनी खूबसूरत नजर आती हूँ,\n" +
                "थोड़ा सा मेकअप करके\n" +
                "मैं तो दिलों में आग लगाती हूँ.","Make Up Shayari",R.drawable.make_up_fourteen));
        arrayList.add(new ModelDetail("औरतें हर तरह का मेकअप करने में होती है माहिर,\n" +
                "अपने दुःख-दर्द छुपाकर, सिर्फ खुशियों को करती है जाहिर.","Make Up Shayari",R.drawable.make_up_fifteen));


    }
}
