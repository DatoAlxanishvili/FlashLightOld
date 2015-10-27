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
    int color=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        backGround = (RelativeLayout) findViewById(R.id.backGround);
        if (savedInstanceState !=null)
        backGround.setBackgroundColor(savedInstanceState.getInt("save color"));
    }

        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.buttonB:
                    color=getResources().getColor(R.color.blue);
                    backGround.setBackgroundColor(color);
                    break;
                case R.id.buttonG:
                    color=getResources().getColor(R.color.green);
                    backGround.setBackgroundColor(color);
                    break;
                case R.id.buttonY:
                    color=getResources().getColor(R.color.yellow);
                    backGround.setBackgroundColor(color);
                    break;
                case R.id.buttonW:
                    color=getResources().getColor(R.color.white);
                    backGround.setBackgroundColor(color);
                    break;
                case R.id.buttonR:
                    color=getResources().getColor(R.color.red);
                    backGround.setBackgroundColor(color);
                    break;
                default:
                    break;
            }
        }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("save color",color);

    }

}
