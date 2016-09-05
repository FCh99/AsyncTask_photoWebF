package com.example.faustocheca.downoladingwebf;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static String url = "http://www.hrsanroque.com/galeria/slider/18.jpg";
    private TextView textView;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonDown = (Button) findViewById(R.id.button_download);

    }


    // Botón download

    public void download (View view) {
        // Ejecuta el AsyncTask
        Operation operation = new Operation(this);
        operation.execute(url);



    }

    public void dibujarResultados (Bitmap bitmap, long time) {
        long timeDifference = time;
        Log.i(">>TAG", "he recbido "+ time);

        textView = (TextView) findViewById(R.id.textview_result);
        textView.setText("Took to download: "+String.valueOf(timeDifference)+" ms");

        imageView = (ImageView) findViewById(R.id.imageView_photo);
        imageView.setImageBitmap(bitmap);

    }

}
