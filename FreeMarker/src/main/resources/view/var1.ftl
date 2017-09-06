<p>用来获取list集合中值</br>
     <#list list as items>
     
         <font color="blue">${items!}</font>     </br>
  </#list>
  
  <p>获取Map的集合中的值
  
  <#list mymap?keys as key>
  
  <br>
      <font color="red">${key}:${mymap[key]}</font>
  </#list>