package be4rjp.jnitest;

public class JNIUtil {

    static {
        //nativeライブラをリロード
        System.loadLibrary("rustlib");
    }

    /**
     * nativeメソッドを定義
     * Rust側で実装する
     */
    public static native void print();

}
