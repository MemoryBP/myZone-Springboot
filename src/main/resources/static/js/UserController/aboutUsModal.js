$(function(){
		var page = $(
			'<div id="aboutW"  class="modal fade" tabindex="-1">\
			<div class="modal-dialog">\
				<div class="modal-content">\
					<div class="modal-body">\
						<button class="close" data-dismiss="modal">\
                         <span>&times;</span>\
                     </button>\
					</div>\
					<div class="modal-title text-center">\
						<img class="img-circle" src="/img/header.jpg" alt="头像"/>\
					</div>\
					<div class="modal-body">\
						<table class="table">\
							<tr class="text-center">\
								<td style="width:25%;"><a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=&site=qq&menu=yes"><img border="0" src="/img/qq.png" alt="欢迎访问我的个人空间! _&#62;3" title="欢迎访问我的个人空间! _&#62;3"/></a></td>\
								<td><a id="sina" href="http://weibo.com/Mrcgq" target="_blank" ><img border="0" src="/img/weibo.png" /></a></td>\
								<td style="width:25%;"><a id="weixin" href="javascript:;"><img border="0" src="/img/weixin.png" /></a></td>\
							</tr>\
							<tr id="weixinimgCode" style="display: none;">\
								<td colspan="6" class="text-center"><img src="/img/myweixinCode.png"/></td>\
							</tr>\
						</table>\
					</div>\
				</div>\
			</div>\
		</div>'
		);
		
		$('body').append(page);
	}
)
