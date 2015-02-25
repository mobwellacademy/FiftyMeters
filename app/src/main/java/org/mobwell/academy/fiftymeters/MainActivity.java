package org.mobwell.academy.fiftymeters;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.mobwell.academy.fiftymeters.accounts.RecoveryActivity;
import org.mobwell.academy.fiftymeters.accounts.SignUpActivity;

/*cenas*/

public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    TextView forgotPassword;
    TextView signUp;
    //Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forgotPassword = (TextView) findViewById(R.id.am_button_forgotpw);
        signUp = (TextView) findViewById(R.id.am_button_signup);

        forgotPassword.setOnClickListener(this);
        signUp.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //MÉTODO QUE FAZ HANDLE AO CLICK
    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.am_button_forgotpw : {
                //Chamar o ecrã do Recovery
                Intent it = new Intent(this, RecoveryActivity.class);
                startActivity(it);
                break;}

            case R.id.am_button_signup : {
                //Chamar o ecrã do SignUp
                Intent it = new Intent(this, SignUpActivity.class);
                startActivity(it);
                break;
            }


        }


    }


}
