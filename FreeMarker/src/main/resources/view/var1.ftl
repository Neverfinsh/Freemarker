<p>用来获取list集合中值</br>
     <#list list as items>
     
         <font color="blue">${items!}</font>     </br>
  </#list>
  
  <p>获取Map的集合中的值
  
  <#list mymap?keys as key>
  
  <br>
      <font color="red">${key}:${mymap[key]}</font>
  </#list>
  
  
  
  <p>测试的一下if的使用:</br>
  
  <#assign var=100/>
  
  <p>if---的结构：</br>
  <#if var==100>
      <font color="red">var=100</font>
  </#if>
  
 <p> if---else---</br>
  
  <#if var==100>
  <font color="red"> var=100</font>
  <#else>
  <font color="red"> var!=100</font>
  </#if>
  
  
  <p> if--else if---else的结构：</br>
  
  <#if var &gt; 100>
     <font color="red">var大有100 </font>
     
   <#elseif var==100>  
     
     <font color="red">var=100</font>
    <#else >
       <font color="red">var小于100 </font>
  </#if>
  
  
  <p>第三次进行语法更新</br>
  
  <p> switch语法的问题：
  
  <#assign var2=991 />
  
    <#switch var2>
    
    <#case 99>
    <font color="red"> 99 or 100</font>
    <#case 100>
    <#break>
    
    <font color="red"> 99 or 100</font>
    <#break>
     
     <#default>
     <font color="red"> 我是默认值</font>
     </#switch>
    
    
    <p>第四次进行语法的更新</br>
    
    </hr>
  
  
  
  
  