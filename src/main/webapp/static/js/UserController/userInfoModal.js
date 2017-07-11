$(function (){
		var page = $(
			'<div id="userInfoW" class="modal fade" tabindex="-1">\
			<div class="modal-dialog">\
				<div class="modal-content">\
					<div class="modal-body">\
						<button class="close" data-dismiss="modal">\
                         <span>&times;</span>\
                     </button>\
					</div>\
					<div class="modal-title">\
						<h1 class="text-center">用户信息</h1>\
					</div>\
					<div class="modal-body">\
						<form class="form-group" action="">\
							<table class="table">\
								<tbody>\
								<tr>\
									<td>用户名:</td>\
									<td><input type="text" id="uname"/></td>\
									<td>密 码:</td>\
									<td><input type="password" id="upassword" readonly="readonly"/></td>\
								</tr>\
								<tr>\
									<td>Email:</td>\
									<td><input type="text" id="uemail"/></td>\
									<td>手机号:</td>\
									<td><input type="number" id="uphone"/></td>\
								</tr>\
								<tr>\
									<td>身份证:</td>\
									<td><input type="number" id="uidcard"/></td>\
									<td>类型:</td>\
									<td><input type="number" id="utype"/></td>\
								</tr>\
								<tr>\
									<td>创建日期:</td>\
									<td><input type="text" id="ucreateDate" readonly="readonly"/></td>\
									<td>更新日期:</td>\
									<td><input type="text" id="uupdateDate" readonly="readonly"/></td>\
								</tr>\
								</tbody>\
							</table>\
							<div class="text-right">\
								<input type="text" id="user_id" style="display:none"></input>\
								<button id="userInfo_update" class="btn btn-primary" data-loading-text="正在更新..." data-fail-text="更新失败" data-success-text="更新成功" type="button">更新</button>\
								<button class="btn btn-danger" data-dismiss="modal">取消</button>\
							</div>\
						</form>\
					</div>\
				</div>\
			</div>\
		</div>'
		);
		
		$('body').append(page);
	}
)
