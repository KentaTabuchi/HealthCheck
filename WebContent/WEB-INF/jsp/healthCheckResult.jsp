<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>健康診断</title>
</head>
<body>
	<h1>診断結果</h1>
	<table>
		<tr>
			<td>身長</td>
			<td>体重</td>
			<td>BMI</td>
			<td>体型</td>
		</tr>
		<tr>
			<td>${health.height}</td>
			<td>${health.weight}</td>
			<td>${health.bmi}</td>
			<td>${health.bodyType}</td>
		</tr>
	</table>


</body>
</html>