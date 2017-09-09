<p>自定义一个排序的函数

<#assign  arr=[3,2,9,8,7]/>
<p> 未排序
<#list arr as items>
  ${items},
</#list>
<p> 排序后
<#list sort_init(arr)as item>
${item}
</#list>