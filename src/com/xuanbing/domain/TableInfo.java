package com.xuanbing.domain;

import java.util.List;

public class TableInfo {

    /**
     * 表名
     */
    public String tableName;

    /**
     * 生成的对象名称
     */
    public String objectName;

    public String daoText;

    public String doText;

    public String mapperText;

    /**
     * 字段列表
     */
    public List<FieldInfo> fieldInfoList;

    public static class FieldInfo {

        /**
         * 字段名
         */
        public String field;

        /**
         * 生成的对象属性
         */
        public String objectAttr;

        /**
         * 字段类型
         */
        public Integer fieldType;

        /**
         * 字段描述
         */
        public String fieldDesc;
    }
}
