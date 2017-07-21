$( function(){
		var page = $(
			'<div id="register" class="modal fade" tabindex="-1">\
			<div class="modal-dialog">\
				<div class="modal-content">\
					<div class="modal-body">\
						<button class="close" data-dismiss="modal">\
                         <span>&times;</span>\
                     </button>\
					</div>\
					<div class="modal-title">\
						<h1 class="text-center">注册</h1>\
					</div>\
					<div class="modal-body">\
						<form class="form-group" action="">\
							<div class="form-group">\
								<label for="">用户名</label>\
								<input class="form-control" id="username" type="text" placeholder="6-15位字母或数字">\
							</div>\
							<div class="form-group">\
								<label for="">密码</label>\
								<input class="form-control" id="password1" type="password" placeholder="至少6位字母或数字">\
							</div>\
							<div class="form-group">\
								<label for="">再次输入密码</label>\
								<input class="form-control" id="password2" type="password" placeholder="至少6位字母或数字">\
							</div>\
							<div class="form-group">\
								<label for="">邮箱</label>\
								<input class="form-control" id="email" type="email" value="123@123.com" placeholder="例如:123@123.com">\
							</div>\
							<div class="form-group">\
								<label for="">手机号</label>\
								<input class="form-control" id="phone" type="number" placeholder="例如:123@123.com">\
							</div>\
							<div class="form-group">\
								<label for="">身份证号</label>\
								<input class="form-control" id="idcard" type="number" placeholder="18位身份证号">\
							</div>\
							<div class="text-right">\
								<button id="reg" class="btn btn-primary" data-loading-text="正在提交..." data-fail-text="注册失败" data-success-text="注册成功" type="button">提交</button>\
								<button class="btn btn-danger" data-dismiss="modal">取消</button>\
							</div>\
							<a href="" data-toggle="modal" data-dismiss="modal" data-target="#loginW">已有账号？点我登录</a>\
						</form>\
					</div>\
				</div>\
			</div>\
		</div>'
		);
		
		$('body').append(page);
	}
)
