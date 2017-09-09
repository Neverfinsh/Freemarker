<p>对字符串进行操作
</br>
<p>定义俩个字符串</br>
<#assign a="hello">
<#assign b="world">
-------------------------------------
<p> 字符的连接</br>
<font color="red">${a+b}</font>
</br>
----------------------------------
<p> 字符的连接</br>
<font color="red"> ${a+b}</font>
</br>
-------------------------------------------
<p> 字符的截取</br>
<font color="red"> ${(a+b)?substring(5,8) }</font>
</br>
-------------------------------------

<p> 字符的长度</br>
字符长度：<font color="red"> ${(a+b)?length }</font>
</br>
---------------------------------------

<p> 字符的大写</br>
<font color="red"> ${(a+b)?upper_case }</font>
</br>

-----------------------------------------------

<p> 字符的第一和最后一次出现的位置</br>
第一次出现：     <font color="red">${(a+b)?index_of('w') }      </font></br>
最后一次出现：<font color="red">${(a+b)?last_index_of('l') } </font>
</br>
--------------------------------------------
<p> 字符的小写</br>
<font color="red"> ${(a+b)?lower_case }</font>


