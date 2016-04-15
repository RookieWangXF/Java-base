package cn.rookie.exception;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rookie on 2016/4/13.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class ExtendsException {

    public void throwRuntimeException() {

    }

    public void throwNullPointerException() {
        String str =null;
        str.charAt(1);
    }

    public void throwArrayIndexOutOfBoundsException() {
        int[] arr = {};
        arr[1] = 2;
    }
    public void throwFileNotFoundException() {
        File file = new File("/as/sd");
        file.getName();

    }

    public void throwClassCastException() {
        List list = new ArrayList<>();
        list.add("123");
        int i = (int) list.get(0);
    }

    public void throwCloneNotSupportedException() {

    }
    public void throwDataFormatException() {

    }

}
