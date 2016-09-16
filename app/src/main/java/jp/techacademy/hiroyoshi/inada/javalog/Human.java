package jp.techacademy.hiroyoshi.inada.javalog;




        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;

public class Human extends Animal implements Thinkable    {

    // 変数
    String hobby;



    // コンストラクタ
    public Human (String name, int age,String hobby) {
        this.name = name;
        this.age = age;
        this.hobby=hobby;

    }

    // メソッド
    public void say() {
        Log.d("javatest", "私の名前は"+name+"です。年は"+age+"歳です。");



    }




    @Override
    public void think(){
        Log.d("javatest","私は"+hobby+"について考える ");


    }
}


