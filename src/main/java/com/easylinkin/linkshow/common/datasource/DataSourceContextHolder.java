package com.easylinkin.linkshow.common.datasource;

/**
 * DataSourceContextHolder
 * <p>
 * 功能:
 *
 * <pre>
 * ver     修订日              作者           修订内容
 * 1.0     2019/1/10           沈磊           新规做成
 * </pre>
 */
public class DataSourceContextHolder {

    private final static ThreadLocal<String> _dataSource = new ThreadLocal<String>();

    public static String getDataSource() {
        return _dataSource.get();
    }

    public static void setDataSource(String dataSource) {
        _dataSource.set(dataSource);
    }

    public static void clearDataSource() {
        _dataSource.remove();
    }
}
