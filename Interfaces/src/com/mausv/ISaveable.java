package com.mausv;

import java.util.List;

/**
 * Created by mausv on 8/9/2016.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
