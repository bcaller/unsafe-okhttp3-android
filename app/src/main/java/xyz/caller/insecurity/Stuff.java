package xyz.caller.insecurity;

import okhttp3.OkHttpClient;

/**
 * Created by ben on 18/01/19.
 */

public class Stuff {
    OkHttpClient.Builder b()
    {
        return UnsafeOkHttpClient.getUnsafeOkHttpClient().newBuilder();
    }
}
