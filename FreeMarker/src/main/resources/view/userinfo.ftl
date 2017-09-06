<!DOCTYPE html>
<html>
  <head>
    <title>TODO supply a title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
    姓名：${user.name}<br/>
    邮箱：${user.email}</br>
    <hr>
 测试异常的情况:${(user.age)!"测试值如果为空添加默认值的问题"}
 
 <br>
 <hr>
 
 <p>  用来输出htm文件中的信息：
   邮箱：${(user.email)!?html}</br>
   
   
   
 
 
 
  </body>
</html>