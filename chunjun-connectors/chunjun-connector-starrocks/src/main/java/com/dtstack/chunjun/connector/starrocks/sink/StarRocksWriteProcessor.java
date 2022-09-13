/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.chunjun.connector.starrocks.sink;

import com.dtstack.chunjun.connector.starrocks.conf.StarRocksConf;
import com.dtstack.chunjun.connector.starrocks.streamload.StreamLoadManager;

import org.apache.flink.table.data.RowData;

import java.util.List;

/** @author liuliu 2022/7/28 */
public abstract class StarRocksWriteProcessor {

    protected final StreamLoadManager streamLoadManager;
    protected final StarRocksConf starRocksConf;

    public StarRocksWriteProcessor(
            StreamLoadManager streamLoadManager, StarRocksConf starRocksConf) {
        this.streamLoadManager = streamLoadManager;
        this.starRocksConf = starRocksConf;
    }

    public abstract void write(List<RowData> rowDataList) throws Exception;
}
