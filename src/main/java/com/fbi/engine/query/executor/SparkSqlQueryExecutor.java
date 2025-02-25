package com.fbi.engine.query.executor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fbi.engine.domain.Connection;

public class SparkSqlQueryExecutor extends SqlQueryExecutor {

    public SparkSqlQueryExecutor(Connection connection, ObjectMapper objectMapper) {
        super(connection, objectMapper);
    }

    @Override
    protected void loadDrivers() throws ClassNotFoundException {
        Class.forName("org.apache.hive.jdbc.HiveDriver");
    }

}
