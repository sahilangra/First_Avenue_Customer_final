package thebetadeveloper.app.first_avenue_customer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class staff_dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_dashboard);
    }

    public void staff_new_order(View view)
    {
        Intent cust_dash_intent = new Intent(this,staff_new_order.class);
        startActivity(cust_dash_intent);
    }
}
