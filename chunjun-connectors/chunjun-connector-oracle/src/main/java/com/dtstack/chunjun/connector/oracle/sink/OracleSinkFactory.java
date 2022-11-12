/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dtstack.chunjun.connector.oracle.sink;

import com.dtstack.chunjun.conf.SyncConf;
import com.dtstack.chunjun.connector.jdbc.conf.JdbcConfig;
import com.dtstack.chunjun.connector.jdbc.sink.JdbcSinkFactory;
import com.dtstack.chunjun.connector.jdbc.util.JdbcUtil;
import com.dtstack.chunjun.connector.oracle.dialect.OracleDialect;

import java.util.Properties;

/**
 * company www.dtstack.com
 *
 * @author jier
 */
public class OracleSinkFactory extends JdbcSinkFactory {

    public OracleSinkFactory(SyncConf syncConf) {
        super(syncConf, new OracleDialect());
    }

    @Override
    protected void rebuildJdbcConf(JdbcConfig jdbcConf) {
        super.rebuildJdbcConf(jdbcConf);

        Properties properties = new Properties();
        if (jdbcConf.getConnectTimeOut() != 0) {
            properties.put(
                    "oracle.jdbc.ReadTimeout", String.valueOf(jdbcConf.getConnectTimeOut() * 1000));
            properties.put(
                    "oracle.net.CONNECT_TIMEOUT",
                    String.valueOf((jdbcConf.getConnectTimeOut()) * 1000));
        }
        JdbcUtil.putExtParam(jdbcConf, properties);
    }
}
