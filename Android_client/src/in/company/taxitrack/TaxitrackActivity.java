package in.company.taxitrack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.parse.Parse;

public class TaxitrackActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Parse.initialize(this, "tg0f9TzBklEtZuTpD8rVWgtrY6KtwKOBCZzzX7rY", "z1gY2cL4MRTR8aI73DFDVERpYcmlEtP3304TtU6s");
        
    }
    public void startLocationTracing(View view) {
    	String userName = ((EditText)findViewById(R.id.editText1)).getText().toString();
    	String phoneNumber = ((EditText)findViewById(R.id.editText2)).getText().toString();
    	String vendorName = ((EditText)findViewById(R.id.vendorText)).getText().toString();
    	Intent intent = new Intent(this, LocationService.class);
    	//Intent intent = new Intent(this, LocationActivity.class);
    	intent.putExtra("username", userName);
    	intent.putExtra("phonenumber", phoneNumber);
    	intent.putExtra("vendorname", vendorName);
    	startService(intent);
    	//startActivity(intent);
    	this.finish();
    }

}