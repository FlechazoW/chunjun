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

package com.dtstack.chunjun.element.column;

import com.dtstack.chunjun.element.AbstractBaseColumn;
import com.dtstack.chunjun.throwable.CastException;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class ByteColumn extends AbstractBaseColumn {

    private static final long serialVersionUID = -7151575051615132219L;

    public ByteColumn(byte data) {
        super(data, 1);
    }

    public ByteColumn(byte data, int byteSize) {
        super(data, byteSize);
    }

    public static ByteColumn from(byte data) {
        return new ByteColumn(data, 0);
    }

    public ByteColumn(char data) {
        super(data, 1);
    }

    @Override
    public Boolean asBoolean() {
        return (byte) data != 0x00;
    }

    @Override
    public String type() {
        return "BIGDECIMAL";
    }

    @Override
    public byte[] asBytes() {
        return new byte[] {(byte) data};
    }

    @Override
    public String asString() {
        return String.valueOf(data);
    }

    @Override
    public BigDecimal asBigDecimal() {
        return new BigDecimal((byte) data);
    }

    @Override
    public Timestamp asTimestamp() {
        throw new CastException("byte", "Timestamp", String.valueOf(data));
    }

    @Override
    public Time asTime() {
        if (null == data) {
            return null;
        }
        throw new CastException("byte", "java.sql.Time", String.valueOf(data));
    }

    @Override
    public Date asSqlDate() {
        if (null == data) {
            return null;
        }
        throw new CastException("byte", "java.sql.Date", String.valueOf(data));
    }

    @Override
    public String asTimestampStr() {
        throw new CastException("byte", "Timestamp", String.valueOf(data));
    }
}
