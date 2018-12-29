package learn.android.networkconnection;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String GOOGLE = "www.google.com";
    String YAHOO = "www.yahoo.com";
    String AMAZON = "www.amazon.com";

    TextView tv_status;
    Button bt_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_status = (TextView) findViewById(R.id.tv_status);
        bt_check = (Button) findViewById(R.id.bt_check);

        bt_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AsyncTaskRunner().execute();
            }
        });


    }


    private class AsyncTaskRunner extends AsyncTask<String, String, String> {


        ProgressDialog progressDialog;
        Boolean net;

        @Override
        protected void onPreExecute() {
            progressDialog = ProgressDialog.show(MainActivity.this,
                    "ProgressDialog",
                    "Checking Nework Connection");
        }


        @Override
        protected String doInBackground(String... params) {
            try {


                if (new Connection().isInternetAvailable(GOOGLE) == true ||
                        new Connection().isInternetAvailable(YAHOO) == true ||
                        new Connection().isInternetAvailable(AMAZON) == true) {

                    net = true;
                } else {

                    net = false;
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
            return "";
        }


        @Override
        protected void onPostExecute(String result) {
            // execution of result of Long time consuming operation
            progressDialog.dismiss();
            tv_status.setText(result);


            if (net) {
                tv_status.setText("Connection Availabe");
            } else {
                tv_status.setText("No Network Connection");
            }
        }


    }

}

