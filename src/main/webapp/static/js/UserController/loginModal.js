$(function(){
		var page = $(
			'<!--登录弹出窗-->\
			<div id="loginW" class="modal fade" tabindex="-1">\
			<div class="modal-dialog">\
				<div class="modal-content">\
					<div class="modal-body">\
						<button class="close" data-dismiss="modal">\
                         <span>&times;</span>\
                     </button>\
					</div>\
					<div class="modal-title">\
						<h1 class="text-center">登录</h1>\
					</div>\
					<div class="modal-body">\
						<form class="form-group" action="">\
							<div class="form-group">\
								<label for="">用户名</label>\
								<input class="form-control" id="name" type="text" placeholder="6-15位字母或数字">\
							</div>\
							<div class="form-group">\
								<label for="">密码</label>\
								<input class="form-control" id="password" type="password" placeholder="至少6位字母或数字">\
							</div>\
							<div class="text-right">\
								<button id="login" onclick="login()" class="btn btn-primary" data-loading-text="正在登录..." data-fail-text="登录失败" data-success-text="登录成功" type="button">登录</button>\
								<button class="btn btn-danger" data-dismiss="modal">取消</button>\
							</div>\
							<a href="" data-toggle="modal" data-dismiss="modal" data-target="#register">还没有账号？点我注册</a>\
						</form>\
					</div>\
				</div>\
			</div>\
		</div>'
		);
		
		$('body').append(page);
	}
)
