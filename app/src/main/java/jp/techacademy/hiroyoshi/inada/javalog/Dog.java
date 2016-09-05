package jp.techacademy.hiroyoshi.inada.javalog;

import android.util.Log;

class Human extends Animal implements Movable {
    // 変数
    static String to_jp = "犬";


    // コンストラクタ
    public Human(String name, int age) {
        this.name =name;
        this. age =35;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");

    }
}