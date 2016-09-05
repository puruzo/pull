package jp.techacademy.hiroyoshi.inada.javalog;


import android.util.Log;

class Human extends Animal  {
    // 変数
    String name;      // 名前
    int age;    // 年齢

    // コンストラクタ
    public Human (String name, int age {
        this.name = name;
        this.age = age;
    }

    // メソッド
    public void say() {
        Log.d("javatest", "ワンワン");



    }
}
