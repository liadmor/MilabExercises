package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public static String stockNameHolder;
    EditText stockInput;
    TextView resultOutput;
    Button SubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SubmitButton = (Button) findViewById(R.id.submitButton);
        stockInput = (EditText) findViewById(R.id.symbolEditText);
        resultOutput = (TextView) findViewById(R.id.StockPrice);

        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "Please wait, we calculate the stock price", Toast.LENGTH_LONG);
                toast.show();
                stockNameHolder = (String) stockInput.getText().toString();
                fetchPrice(v);
            }

            private void fetchPrice(final View v) {
                final PriceFetcher fetcher = new PriceFetcher(v.getContext());
                fetcher.dispatchRequest(new StockResponseListener() {
                    @Override
                    public void onResponse(StockResponse response) {
                        if (response.isError){
                            Toast.makeText(v.getContext(), "ERROR FOUND", Toast.LENGTH_LONG);
                        }
                        resultOutput.setText(response.stockPrice);
                    }
                });
            }
        });
    }
}