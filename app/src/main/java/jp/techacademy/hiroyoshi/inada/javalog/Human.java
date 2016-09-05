package jp.techacademy.hiroyoshi.inada.javalog;




        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;

public class MainActivity extends AppCompatActivity;
{

    @Override
    protected void onCreate(Bundle savedInstanceState); {
        super.onCerate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("javatest", "ログへの出力テスト");

    }

}


