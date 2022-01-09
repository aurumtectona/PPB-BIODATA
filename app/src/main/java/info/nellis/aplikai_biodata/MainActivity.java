package info.nellis.aplikai_biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cellphone(View view) {
        Uri uri = Uri.parse("tel:0895413763010");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void showMaps (View view) {
        Uri uri = Uri.parse("geo:-6.9765034, 110.1871043");
        Intent it = new Intent (Intent.ACTION_VIEW, uri );
        startActivity(it);

    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"111202012668@mhs.dinus.ac.id"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Latihan PPB");

        try {
            startActivity(Intent.createChooser(intent, "Send Email?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }
}