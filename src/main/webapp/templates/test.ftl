<!DOCTYPE html>
<html lang="en">
<#--<#assign basePath=request.contextPath>-->
<head>
    <meta content="text/html;charset=utf-8" />

    <title>Title</title>
    <#--<link href="${basePath}/static/css/bootstrap.min.css" rel="stylesheet" />-->

    <link href="/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<table class="table">
    <thead>
    <tr class="bg-primary">
        <th>编号</th>
        <th>姓名</th>
        <th>密码</th>
    </tr>
    </thead>
    <tbody>
<#if customerList?exists>
    <#list customerList as customer>
      <tr align="center">
          <td>${customer.id}</td>
          <td>${customer.username}</td>
          <td>${customer.password}</td>
      </tr>
    </#list>
</#if>
    </tbody>
</table>
</body>
</html>