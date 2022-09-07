---
title: 纯钧（ChunJun）介绍
weight: 4
type: docs
nav-title: 介绍
---

<!--
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
-->

# 纯钧（ChunJun）

## 介绍

纯钧（ChunJun，原名FlinkX），是一款稳定、易用、高效、批流一体的数据集成框架，目前基于实时计算引擎Flink实现多种异构数据源之间的数据同步与计算，已在上千家公司部署且稳定运行。

## 特性

纯钧（ChunJun）将不同的数据库抽象成了reader/source 插件，writer/sink 插件和lookup 维表插件，其具有以下特点：

- 基于实时计算引擎Flink，支持JSON模版配置任务，兼容Flink SQL语法；
- 支持分布式运行，支持flink-standalone、yarn-session、yarn-per job等多种提交方式；
- 支持Docker一键部署，支持K8S 部署运行；
- 支持多种异构数据源，可支持MySQL、Oracle、SQLServer、Hive、Kudu等20多种数据源的同步与计算；
- 易拓展，高灵活性，新拓展的数据源插件可以与现有数据源插件即时互通，插件开发者不需要关心其他插件的代码逻辑；
- 不仅仅支持全量同步，还支持增量同步、间隔轮训；
- 批流一体，不仅仅支持离线同步及计算，还兼容实时场景；
- 支持脏数据存储，并提供指标监控等；
- 配合checkpoint实现断点续传；
- 不仅仅支持同步DML数据，还支持Schema变更同步；

## 架构

WIP

## 贡献者

感谢所有的贡献者！

<a href="https://github.com/DTStack/chunjun/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=DTStack/chunjun"  alt="contributors"/>

## 开源协议

纯钧遵循Apache 2.0 开源协议。
