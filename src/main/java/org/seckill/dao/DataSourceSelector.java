package org.seckill.dao;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DataSourceSelector extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceHolder.getDataSourceType();
    }
}
