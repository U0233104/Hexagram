package zeng.a20170718project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    private Spinner spMon, spDay;
    private int mon = 1, day = 1;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findValue();
        setClick();

        //月份
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.dataMon, R.layout.style_spinner);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(R.layout.style_spinner);
        // Apply the adapter to the spinner
        spMon.setAdapter(adapter);

        //日期
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapterDay = ArrayAdapter.createFromResource(this,
                R.array.dataDay, R.layout.style_spinner);
        // Specify the layout to use when the list of choices appears
        adapterDay.setDropDownViewResource(R.layout.style_spinner);
        spDay.setAdapter(adapterDay);
    }


    private void findValue() {
        spMon = (Spinner) findViewById(R.id.sp_Mon);
        spDay = (Spinner) findViewById(R.id.sp_Day);
        btnSend = (Button) findViewById(R.id.btn_Send);
    }

    private void setClick() {
        spMon.setOnItemSelectedListener(this);
        spDay.setOnItemSelectedListener(this);
        btnSend.setOnClickListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {//選擇月份
            case R.id.sp_Mon:
                switch (spMon.getSelectedItemPosition()) {
                    case 0:
                        mon = 1;
                        break;
                    case 1:
                        mon = 2;
                        break;
                    case 2:
                        mon = 3;
                        break;
                    case 3:
                        mon = 4;
                        break;
                    case 4:
                        mon = 5;
                        break;
                    case 5:
                        mon = 6;
                        break;
                    case 6:
                        mon = 7;
                        break;
                    case 7:
                        mon = 8;
                        break;
                    case 8:
                        mon = 9;
                        break;
                    case 9:
                        mon = 10;
                        break;
                    case 10:
                        mon = 11;
                        break;
                    case 11:
                        mon = 12;
                        break;
                }
                break;
            case R.id.sp_Day://選擇日期
                switch (spDay.getSelectedItemPosition()) {
                    case 0:
                        day = 1;
                        break;
                    case 1:
                        day = 2;
                        break;
                    case 2:
                        day = 3;
                        break;
                    case 3:
                        day = 4;
                        break;
                    case 4:
                        day = 5;
                        break;
                    case 5:
                        day = 6;
                        break;
                    case 6:
                        day = 7;
                        break;
                    case 7:
                        day = 8;
                        break;
                    case 8:
                        day = 9;
                        break;
                    case 9:
                        day = 10;
                        break;
                    case 10:
                        day = 11;
                        break;
                    case 11:
                        day = 12;
                        break;
                    case 12:
                        day = 13;
                        break;
                    case 13:
                        day = 14;
                        break;
                    case 14:
                        day = 15;
                        break;
                    case 15:
                        day = 16;
                        break;
                    case 16:
                        day = 17;
                        break;
                    case 17:
                        day = 18;
                        break;
                    case 18:
                        day = 19;
                        break;
                    case 19:
                        day = 20;
                        break;
                    case 20:
                        day = 21;
                        break;
                    case 21:
                        day = 22;
                        break;
                    case 22:
                        day = 23;
                        break;
                    case 23:
                        day = 24;
                        break;
                    case 24:
                        day = 25;
                        break;
                    case 25:
                        day = 26;
                        break;
                    case 26:
                        day = 27;
                        break;
                    case 27:
                        day = 28;
                        break;
                    case 28:
                        day = 29;
                        break;
                    case 29:
                        day = 30;
                        break;
                    case 30:
                        day = 31;
                        break;
                }
                break;
            default:
                Toast.makeText(this, "null select", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_Send:
                if (mon == 2 || mon == 4 || mon == 6 || mon == 9 || mon == 11) {
                    if (mon == 2) {
                        if (day >= 30) {
                            Toast.makeText(this, "日期錯誤", Toast.LENGTH_SHORT).show();
                        } else {
                            Intent intent = new Intent();
                            intent.setClass(MainActivity.this, DataContent.class);
                            intent.putExtra("mon", mon);
                            intent.putExtra("day", day);
                            startActivity(intent);
                        }
                        break;
                    }
                    if (day > 30) {
                        Toast.makeText(this, "日期錯誤", Toast.LENGTH_SHORT).show();
                    } else {
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this, DataContent.class);
                        intent.putExtra("mon", mon);
                        intent.putExtra("day", day);
                        startActivity(intent);
                    }
                } else {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, DataContent.class);
                    intent.putExtra("mon", mon);
                    intent.putExtra("day", day);
                    startActivity(intent);
                }
                break;
            default:
                Toast.makeText(this, "null click", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
