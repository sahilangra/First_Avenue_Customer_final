package thebetadeveloper.app.first_avenue_customer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class staff_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_login);
    }
    public void staff_reset_pswd(View view)
    {
        Intent staff_reset_pswd_intent = new Intent(this,staff_reset_pswd.class);
        startActivity(staff_reset_pswd_intent);
    }
    public void staff_dash(View view) {



        EditText username_ref = (EditText) findViewById(R.id.staff_user_field);
        String username = username_ref.getText().toString();
        EditText password_ref = (EditText) findViewById(R.id.staff_password_field);
        String paswd = password_ref.getText().toString();

        String expctd_username = "staff";
        String expctd_pswd = "12345" ;

         if(username.equals(expctd_username)&&paswd.equals(expctd_pswd)) {

            Intent staff_dash_intent = new Intent(this, staff_dashboard.class);
            startActivity(staff_dash_intent);
        }
        else if (username.equals(expctd_username))
        {

            password_ref.setError("Error");
        }

        else if (paswd.equals(expctd_pswd))
        {

            username_ref.setError("Error");
        }
        else
        {

            Toast.makeText(this,"Invalid Credential",Toast.LENGTH_LONG).show();
        }

    }
}
