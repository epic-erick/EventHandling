package com.example.epic.eventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View; /* manually imported */
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EVENT LISTENER
            //Reference to button
            Button epicButton = (Button)findViewById(R.id.Epicsbutton);

            //event listener for click
            epicButton.setOnClickListener(
                    new Button.OnClickListener(){ //good practice to put an interface here for the callback method to go into
                        public void onClick(View V){ //Callback method
                            TextView epicText = (TextView)findViewById(R.id.epicText); //reference to epicText
                            epicText.setText(R.string.ChangedText);
                        }
                    }
            );

            //event listener for longClick
            epicButton.setOnLongClickListener(
                    new Button.OnLongClickListener(){
                        public boolean onLongClick(View V){
                            TextView epicText = (TextView)findViewById(R.id.epicText); //reference to epicText
                            epicText.setText(R.string.LongText);
                            return true;
                                //need to return true for onLongClick so Android knows that it got handled or else it
                                //will get handled by the regular click event handler
                        }
                    }
            );

    }
}
