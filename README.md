# WxProgram
慕课网，微信小程序开发入门练习<br/>

**注：因部分后端变量命名与老师不同，，若是跟着视频学习的，后端开发前，请先查看area.sql文件，前端开发前，请先运行查看返回的JSON**
- 慕课网微信小程序开发源码，大体写法和视频一样，部分地方以个人理解做了适当更改，尽可能的**使用springboot特性，简化代码**（如：除去datasource和sessionFactory类、mybatis.xml的构造，直接在SpringBoot中配置;修改controller访问地址和访问方式，尽可能符合**restful规范**）<br/>
参考资料：<br/>
&emsp;https://www.imooc.com/learn/945<br/>
&emsp;微信公众平台<br/>

- **代码写于：2018-05-03**<br/>
  &emsp;JDK：JDK1.8版本，<br/>
  &emsp;IDE：IDEA 2017.3.3，<br/>
  &emsp;操作系统为：Windows10<br/>
  
- 使用lombok包，springboot的很多特性，虽然知道没有视频讲解对新手很不友好,但能减少代码冗余量，学到更多。（其实是本人太懒，这些工具太好用）建议大家都能了解一下。<br/>**添加**响应结果集工具类（util包下的FormatResponseUtil类），用于controller返回结果<br/>
- 为降低代码冗余，所有get/set方法均用lombok包的Data注解，具体使用方法可自行百度<br/>
 若不愿使用lombok包可将源码中所有bean的@Data注解去掉，加上get/set方法<br/>
 若不喜欢使用响应结果集工具类的，直接删除util包，按照视频教学返回map即可<br/>
