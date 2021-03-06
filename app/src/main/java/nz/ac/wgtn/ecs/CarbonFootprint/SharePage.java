package nz.ac.wgtn.ecs.CarbonFootprint;


import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;

public class SharePage extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_page);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String userName = preferences.getString("current_user","userName" );
        TextView textView = findViewById(R.id.userName);
        textView.setText(userName);
    }

    public void share(View view) {
//        ImageButton fb = findViewById(R.id.imageButtonFacebook);
//        ImageButton twi = findViewById(R.id.imageButton7);
//        ImageButton ins = findViewById(R.id.imageButton6);
//
//        Intent intent = new Intent(this, WebViewActivity.class);
//        intent.putExtra("facebook_id",R.id.imageButtonFacebook);
//        startActivity(intent);
//
//        ShareLinkContent content = new ShareLinkContent.Builder()
//                .setContentUrl(Uri.parse("https://developers.facebook.com"))
//                .build();
    }


    public void GobackMenu(View view){
        Intent intent = new Intent(this, MenuPage.class);
        startActivity(intent);
    }

    public void shareFacebook(View view) {
        Bitmap image = BitmapFactory.decodeResource(getResources(), R.drawable._john);
        SharePhoto photo = new SharePhoto.Builder()
                .setBitmap(image)
                .build();
        SharePhotoContent content = new SharePhotoContent.Builder()
                .addPhoto(photo)
                .build();
        Toast.makeText(this, "Your story shared", Toast.LENGTH_LONG).show();
    }

    public void shareOnTwitter(View view) {
        Intent intent = new Intent(this, WebViewActivity.class);
        startActivity(intent);
    }

    public void shareOnInstagram(View view) {
        Intent intent = new Intent(this, WebViewActivity.class);
        startActivity(intent);
    }
}