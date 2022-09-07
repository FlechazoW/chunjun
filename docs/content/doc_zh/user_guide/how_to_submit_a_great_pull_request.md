---
title: 如何提交一个好的PR
weight: 4
type: docs
nav-title: 如何提交一个好的PR
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

# 如何提交一个优秀的pr

在github上提交pr是参与ChunJun开源项目的一个重要途径，小伙伴们在使用中的一些功能上feature或者bug都可以向社区提交pr贡献代码，也可以根据已有的issue提供自己的解决方案。下面给大家带来提交一个优秀PR的步骤。

## 第一步：fork chunjun到自己的github仓库

![image](../../website/src/images/doc/pr/pr1.png)

点击fork后就可以在自己仓库中看到以你名字命名的chunjun项目了：

![image](../../website/src/images/doc/pr/pr2.png)

## 第二步：clone chunjun到本地IDE

![image](../../website/src/images/doc/pr/pr3.png)

## 第三步：将DTStack/chunjun设置为本地仓库的远程分支upstream

```shell
$ cd chunjun
# add upstream
$ git remote add upstream https://github.com/DTStack/chunjun.git
# 查看远程仓库设置
$ git remote -v
origin  https://github.com/your_name/chunjun.git (fetch)
origin  https://github.com/your_name/chunjun.git (push)
upstream    https://github.com/DTStack/chunjun.git (fetch)
upstream    https://github.com/DTStack/chunjun.git (push)
```

## 第四步：提交代码

任何一个提交都要基于最新的分支
**切换分支**

```shell
# Fetch branches from upstream.
$ git remote update upstream -p
# Checkout a new branch.
$ git checkout -b branch_name
# Pull latest code into your own branch.
$ git pull upstream master:branch_name
```

```shell
# 提交commit前先进行代码格式化
$ mvn spotless:apply
$ git commit -a -m "<you_commit_message>"
```

## 第五步：提交pr

以笔者修复kafka写入过程中出现空指针问题为例，经过步骤四笔者已经把代码提交至笔者自己仓库的master分支

![image](../../website/src/images/doc/pr/pr4.png)

进入chunjun仓库页面，点击Pull Request

![image](../../website/src/images/doc/pr/pr5.png)

![image](../../website/src/images/doc/pr/pr6.png)

选择head仓库和base仓库以及相应的分支

![image](../../website/src/images/doc/pr/pr7.png)

填写pr信息，pr信息应该尽量概括清楚问题的前因后果，如果存在对应issue要附加issue地址，保证问题是可追溯的

![image](../../website/src/images/doc/pr/pr8.png)

![image](../../website/src/images/doc/pr/pr9.png)

PR提交成功后需要一段时间代码review，可以耐心等待一下项目维护者review后合入，或者在PR评论区艾特相关人员。


