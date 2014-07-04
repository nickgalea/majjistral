package com.majjistralapp.majjistralapp;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		
		Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/BebasNeue.otf");
	    TextView myTextView = (TextView)findViewById(R.id.titlehome);
	    myTextView.setTypeface(myTypeface);
	    
	    myTextView.setLineSpacing(1, 0.8f);
		
	/*	ImageView btnNextScreen = (ImageView)findViewById(R.id.imageView8);
		 
        //Listening to button event
        btnNextScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), WildLifeGuide.class);
                startActivity(nextScreen);
 
            }
        });*/
		
			
	}

	

}
