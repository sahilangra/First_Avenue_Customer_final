package thebetadeveloper.app.first_avenue_customer;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splah_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah_screen);
        DatabaseHelper db = new DatabaseHelper(this);
        db.addWaitor (new Waitor("waitor","1234"));
        db.addFoodItem (new FoodMenu("b1","coffee",10));



        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent splash_intent = new Intent( getApplicationContext() , homepage.class);
                                          startActivity(splash_intent);
                                          finish();
                                      }
                                  },3700
        );

    }
}
