package jp.techacademy.hiroyoshi.inada.javalog;

/**
 * Created by pull on 2016/08/26.
 */
abstract class Animal {
    // メンバ変数
    static String to_jp = "人";
    String name;      // 名前
    int age;    // 年齢

    abstract public void say();
}
