<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>用户登录</title>
		<link href="static/css/bootstrap-responsive.css" rel="stylesheet" />
		<link rel="stylesheet" href="static/css/bootstrap.css" />
		<link rel="stylesheet" href="static/css/login.css" />
		<link rel="shortcut icon" type="image/x-icon" href="static/img/64535.ico">
	</head>

	<body>
		<div class="myform">
			<form role="form">
				<p class="text-center lead">用户登录</p>
				<div class="form-group">
					<!-- <label for="name">用户名</label> -->
					<input type="text" class="form-control" id="name" placeholder="请输入用户名" required autofocus/>

					<p id="p1" class="validate"></p>
				</div>
				<div class="form-group">
					<!-- <label for="password">密码</label> -->
					<input type="password" class="form-control" id="password" placeholder="请输入密码" required autofocus/>
					<p id="p2" class="validate"></p>
				</div>
				<div class="form-group mycheckbox">
					<input type="checkbox" class="col-lg-1">记住密码</input>
					<div class="text-right">
						<a data-toggle="modal" data-target="#register" href="">注册</a>
					</div>

				</div>
				<div class="form-group"></div>
				<div class="form-group">
					<input id="login" type="button" data-loading-text="正在登陆..." data-fail-text="登录失败" data-success-text="登录成功" value="登陆" class="btn btn-primary col-lg-12" />
				</div>
				<div class="form-group text-center"><span class="validate"></span></div>
			</form>
		</div>

		<!-- 注册窗口 -->
		<div id="register" class="modal fade" tabindex="-1">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-body">
						<button class="close" data-dismiss="modal">
                         <span>&times;</span>
                     </button>
					</div>
					<div class="modal-title">
						<h1 class="text-center">注册</h1>
					</div>
					<div class="modal-body">
						<form class="form-group" action="">
							<div class="form-group">
								<label for="">用户名</label>
								<input class="form-control" id="username" type="text" placeholder="6-15位字母或数字">
							</div>
							<div class="form-group">
								<label for="">密码</label>
								<input class="form-control" id="password1" type="password" placeholder="至少6位字母或数字">
							</div>
							<div class="form-group">
								<label for="">再次输入密码</label>
								<input class="form-control" id="password2" type="password" placeholder="至少6位字母或数字">
							</div>
							<div class="form-group">
								<label for="">邮箱</label>
								<input class="form-control" id="email" type="email" value="123@123.com" placeholder="例如:123@123.com">
							</div>
							<div class="form-group">
								<label for="">手机号</label>
								<input class="form-control" id="phone" type="number" placeholder="例如:123@123.com">
							</div>
							<div class="form-group">
								<label for="">身份证号</label>
								<input class="form-control" id="idcard" type="number" placeholder="18位身份证号">
							</div>
							<div class="text-right">
								<button id="reg" class="btn btn-primary" data-loading-text="正在提交..." data-fail-text="注册失败" data-success-text="注册成功" type="button">提交</button>
								<button class="btn btn-danger" data-dismiss="modal">取消</button>
							</div>
							<a href="" data-dismiss="modal">已有账号？点我登录</a>
						</form>
					</div>
				</div>
			</div>
		</div>
		

		<script src="static/js/jquery-3.2.0.js"></script>
		<script src="static/js/bootstrap.js"></script>
		<script src="static/js/UserController/userLogin.js"></script>
		<script src="static/js/UserController/userRegister.js"></script>
	</body>

</html>