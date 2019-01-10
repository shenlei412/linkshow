package com.easylinkin.linkshow.common.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * DynamicRountingDataSource
 * <p>
 * 功能:
 *
 * <pre>
 * ver     修订日              作者           修订内容
 * 1.0     2019/1/10           沈磊           新规做成
 * </pre>
 */
public class DynamicRountingDataSource extends AbstractRoutingDataSource {

    @Override protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSource();
    }
}
