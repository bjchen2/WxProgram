# WxProgram
Java Socket应用---通信是这样练成的<br/>
重点介绍FileTrans包下的文件上传与下载<br/>

前面的TCPtest和UDPtest包仅仅介绍了socket的基本用法，起到抛砖引玉作用。有基础的可以直接看FileTrans包下的文件上传与下载<br/>
基本上所有注意事项**已在源码中注解标出**，视频中没有坑，可放心食用<br/>
**注意：本人代码与视频略有区别**
&emsp;最后的练习老师的功能是JDBC+IO+Socket实现注册登录和文件上传<br/>
&emsp;我比较薄弱的方向是IO和Socket，所以我省去了登录注册功能（也就是说，不用建表，写JDBC有关操作），添加了文件下载和查询服务端保存文件列表功能<br/>
**最后说一下**<br/>
 &emsp; 因能力有限，不会服务器部署，所以只能做到，**本地**上传下载，<br/>
 &emsp;输入**绝对路径上传**文件<br/>
 &emsp;服务器自动将文件保存到程序同级目录下的**resource**目录，下载自动保存到**download**目录<br/>
 &emsp; 配置服务器后，把Socket改为服务器域名和服务器端口，url改为服务器存放数据目录即可。<br/>

- 慕课网:Java Socket应用---通信是这样练成的源码，除最后的练习，其余写法基本和视频一样。<br/>
参考资料：<br/>
&emsp;https://www.imooc.com/learn/161<br/>

- **代码写于：2018-06-03**<br/>
  &emsp;JDK：JDK1.8版本，<br/>
  &emsp;IDE：IDEA 2017.3.3，<br/>
  &emsp;操作系统为：Windows10<br/>

- 关于一些学习笔记可参看**Note文件夹**，可能需要下载一个OneNote，个人感觉对于记笔记来说真的是个好东西<br/>

