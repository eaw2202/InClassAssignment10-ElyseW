package com.elysewarren.officehours2;

import java.io.Serializable;

/**
 * Created by elysewarren on 4/12/17.
 */

public class Dog implements Serializable {
    public String name;
    public String info;
    public int photoId;

    public Dog(String name, String info, int photoId) {
        this.name = name;
        this.info = info;
        this.photoId = photoId;
    }
}
