package be4rjp.jnitest;

import org.bukkit.plugin.java.JavaPlugin;

public final class Jnitest extends JavaPlugin {

    @Override
    public void onEnable() {
        //nativeメソッドを呼び出し
        JNIUtil.print();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
