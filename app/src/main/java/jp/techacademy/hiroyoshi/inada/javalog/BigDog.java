package jp.techacademy.hiroyoshi.inada.javalog;

import android.util.Log;

/**
 * Created by pull on 2016/08/26.
 */
class BigDog extends Dog {
    // クラス変数
    static String to_jp = "大型犬";

    public BigDog(String name, int age) {
        (name age);

    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは大型犬クラスです。");
    }
}