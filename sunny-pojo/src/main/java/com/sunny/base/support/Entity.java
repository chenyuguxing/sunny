package com.sunny.base.support;

import com.sunny.core.annotation.ClassInfo;

import java.io.Serializable;

/**
 * Created by lijinlong on 2016/11/28.
 */

@ClassInfo(value = "可持久化的顶级接口类")
public interface Entity<PK extends Serializable> extends Serializable {
    String PRIMARY_KEY = "id";
    /*主键*/
    void setId(PK id);
    PK getId();
}
