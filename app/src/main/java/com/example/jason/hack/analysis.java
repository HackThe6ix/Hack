package com.example.jason.hack;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class analysis extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;
    String sentiment;

    private class AskWatsonTask extends AsyncTask<String, Void, String>{
        @Override
        protected Object clone() throws CloneNotSupportedException {
            protected String doInBackground(String...textsToAnalyze){
                System.out.println(editText.getText());

                runOnUiThread(new Runnable()){
                    
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //initializing UI parameters
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

        //fire action when button is pressed
        button.setOnClickListener(new View.OnClickListener()){
            @override
                    public void onClick(View v){
                System.out.println("Logging into the console that the button pressed for the text: " + editText.getText());
                textView.setText("displaying at UI the sentiment to be checked for: " + editText.getText());
            }
        }
    }
}
