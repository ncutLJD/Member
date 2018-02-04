# Member
新版会员项目

用的框架是springboot+mybatis
数据源用的阿里巴巴的durid

项目的模块划分
xinqushi-parent：父工程，其打包方式是pom，主要管理jar包的版本号。项目中的所有工程都应该继承父工程。
    xinqushi-common：存放一些通用的工具类、通用的pojo。其打包方式为jar，被其他的工程所依赖。
    xinqushi-manager：
        xinqushi-manager-admin：管理员模块
        xinqushi-manager-user： vip用户模块
        xinqushi-manager-clue： 跟踪用户模块
        xinqushi-manager-expericene：体验用户模块
        xinqushi-manager-web：  前端代码模块
        

项目运行：
在xinqushi-manager-web中运行Application.java 即可

刚开始写springboot的代码 有的还在摸索。代码写的也不是特别好。希望多多指教 共同进步。

本人QQ：962603220 欢迎交流!
