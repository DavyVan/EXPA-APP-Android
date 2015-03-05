package org.aiesec.experience.expa;


import android.os.Bundle;
import android.app.Activity;
import android.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class IntroductionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction_activity);

        TextView introductionTextView = (TextView) findViewById(R.id.introductionTextView);
        introductionTextView.setText(getIntent().getExtras().getString("introduction"));

        ActionBar actionBar = getActionBar();
        if (actionBar == null)
        {
            Toast.makeText(this, "nulllllllllllllllll", Toast.LENGTH_SHORT).show();
        }

    }




//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.introduction_activity_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}