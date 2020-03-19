package com.xuanbing.service;

import com.xuanbing.domain.TableInfo;

import java.util.Arrays;
import java.util.List;

public class SqlHandle {

    public List<TableInfo> buildTableInfoList(String sql) {
        System.out.println(sql);
        TableInfo tableInfo = new TableInfo();
        tableInfo.daoText = "daoText";
        tableInfo.doText = "doText";
        tableInfo.mapperText = "mapperText";
        tableInfo.tableName = "tableName";
        return Arrays.asList(tableInfo);
    }
}
