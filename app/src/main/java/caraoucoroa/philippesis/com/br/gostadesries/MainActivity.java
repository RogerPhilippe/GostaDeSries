package caraoucoroa.philippesis.com.br.gostadesries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private SeekBar mseekProgress;

    private ImageView mimvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mseekProgress = findViewById(R.id.idseekProgress);

        mimvStatus = findViewById(R.id.idimvStatus);

        mseekProgress.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int valueProgress = progress;
                switch (progress){
                    case 0:
                        mimvStatus.setImageResource(R.drawable.pouco);
                        break;
                    case 1:
                        mimvStatus.setImageResource(R.drawable.nao_muito);
                        break;
                    case 2:
                        mimvStatus.setImageResource(R.drawable.medio);
                        break;
                    case 3:
                        mimvStatus.setImageResource(R.drawable.muito);
                        break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
