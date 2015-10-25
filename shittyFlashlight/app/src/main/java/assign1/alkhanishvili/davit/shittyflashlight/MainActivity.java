package assign1.alkhanishvili.davit.shittyflashlight;

import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RelativeLayout backGround;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        backGround = (RelativeLayout) findViewById(R.id.backGround);

    }

        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.buttonB:
                    backGround.setBackgroundColor(getResources().getColor(R.color.blue));
                    break;
                case R.id.buttonG:
                    backGround.setBackgroundColor(getResources().getColor(R.color.green));
                    break;
                case R.id.buttonY:
                    backGround.setBackgroundColor(getResources().getColor(R.color.yellow));
                    break;
                case R.id.buttonW:
                    backGround.setBackgroundColor(getResources().getColor(R.color.white));
                    break;
                case R.id.buttonR:
                    backGround.setBackgroundColor(getResources().getColor(R.color.red));
                    break;
                default:
                    break;
            }
        }

}
