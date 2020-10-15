# 微信移动终端开发

[TOC]

## 第一课

### 1、自我介绍

[方智阳](C:\Users\fanmc\OneDrive\个人\奖状\好未来奖\附件：个人情况目录.pdf)，13550345266

### 2、课程历史

#### （1）《微信移动终端开发》课程安排

**课程性质**：面向四川大学计算机学院本科大二、大三学生， 依据学生专业课成绩、综合素质、获奖情况及求学意愿，由腾讯讲师和校内讲师筛选，最终确定选课人数82人，24个学时，2个学分

**授课方式**：采用线上视频慕课学习 + 线下课堂学习的教学方式。线上由腾讯讲师通过教学视频进行授课。线下除第一次和最后一次课程腾讯讲师会到学校跟同学们面对面交流之外，中间由校内老师组织线下课堂

- `线上视频学习`：通过[腾讯大学](http://scu.daxueqq.edusoho.cn/)的网络授课平台进行，视频由腾讯资深架构师录制；
- `线下课堂学习`：由四川大学计算机学院教师进行授课与答疑指导。

**课程目标**：通过项目实践，提升学生动手能力，将所学知识整合运用到移动终端开发相关项目中

- 开发技能：通过代码编写与阅读，训练学生编写程序的熟练性和规范性；
- 项目经验：通过完成项目案例和阶段项目实战，增加对实际软件项目开发的体验与积累；
- 综合素质：通过项目组角色分配、技术研讨等多种训练手段，培养学生良好的职业习惯。

**考核方式 ：** 5-6 人自由组成团队，要求各小组在两周时间内，运用课程中学到的微信移动端小程序及Android开发相关知识，完成有一定工作量的微信移动端的小项目，并实现相对完整的功能；  
项目选题要有先进性、综合性、实践性。可以结合各小组同学已参加的大学生创新项目、互联网+项目或者同学们的一些实际需求选题，所有选题需要提前课程指导老师确认。   
完成小组自行选择的小程序开发、Android开发项目任务。验收通过后即可获得四川大学`2个选修学分`及`腾讯签发的结业证书`。

> 课程相关代码资源查看Github项目[MobileDevCourse](https://github.com/fanmcgrady/MobileDevCourse)
>
> 地址：https://github.com/fanmcgrady/MobileDevCourse

-----

#### （2）开课情况

川大计算机学院（软件学院）与腾讯公司共建《微信移动终端开发》课程

[开课新闻](http://www.scu.edu.cn/info/1207/3449.htm?from=singlemessage)，[结课新闻](http://cs.scu.edu.cn/info/1066/5830.htm)

![img](http://www.scu.edu.cn/__local/2/B2/D5/F65A770E1F717EA7A8A9B13B6D0_DCFAEA24_3F2B2.jpg)

### 3、言归正传

#### （1）课程准备

- Java基础，强烈推荐[intellij](https://www.jetbrains.com/)，https://www.jetbrains.com/
- 前端基础，推荐HTML的dom使用，jQuery，vue，elementUI
- 版本控制，SVN或者Github，https://github.com/fanmcgrady
- 思维导图，https://gitmind.cn
- 小程序文档，https://mp.weixin.qq.com/

#### （2）内容

1. 介绍课程整体内容，重点微信移动端开发，课程的要求

2. 微信公众号，微信小程序入门

3. 详解HTML，JavaScript，CSS

   

## 第二课

1. 回顾上节课HTML，JavaScript，CSS的内容，以及使用git上传代码

2. 使用Java搭建web后端

   - maven工程配置

     ```
     Maven项目对象模型(POM)，可以通过一小段描述信息来管理项目的构建，报告和文档的项目管理工具软件。
     ```

   - Tomcat和jetty的配置

     - Tomcat 独立软件，绿色版
     - Jetty 基于Java语言编写的，它的API以一组JAR包的形式发布。开发人员可以将Jetty容器实例化成一个对象，可以迅速为一些独立运行（stand-alone）的Java应用提供网络和web连接。

   - servlet配置

     - Servlet 是在[服务器](https://baike.baidu.com/item/服务器)上运行的小程序。服务器上需要一些程序，常常是根据用户输入访问数据库的程序。这些通常是使用[公共网关接口](https://baike.baidu.com/item/公共网关接口)（**C**ommon **G**ateway **I**nterface，CGI）应用程序完成的。然而，在服务器上运行 Java，这种程序可使用 Java 编程语言实现。

   - 使用java编写http的API接口

   - JSON数据的使用 

3. 前端美化

   - 编写css美化

   - 引用现成模板

   - 引用现成组件

     - bootstrap

     - elementUI
4. 使用前端调用我们编写的接口

## 第三课

1. 回顾上节课Java后端接口示例
1. 对比使用Python的写法，简练
1. 前端组件echarts使用
1. 略读小程序文档结构 - 字典
1. 介绍微信小程序HelloWorld
1. 使用web-view标签简单模拟微信小程序HelloWorld程序