package com.example.instagramclone;

import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Application;

public class ParseApplication extends Application {
    public void onCreate()
    {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Z6CSvJYa3atjeEMlEYUFXVszs9TOfe4d0xFyfWrf")
                .clientKey("Jix4gwWFsZglFtjtfxUzw0MXLIlPnFI2TJEfzdLb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
