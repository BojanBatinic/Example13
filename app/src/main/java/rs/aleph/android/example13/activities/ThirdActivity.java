package rs.aleph.android.example13.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import rs.aleph.android.example13.R;


/**
 * Created by BBLOJB on 18.10.2017..
 */

public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setContentView method draws UI
        setContentView(R.layout.third_activity);

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }
}
