$(function() {
	weixinImg()
});

function about() {
	$('#aboutW').modal('show')
};

function weixinImg() {
	$('#weixin').click(function() {
		if ($('#weixinimgCode').is(':hidden')) {
			$('#weixinimgCode').show()
		} else {
			$('#weixinimgCode').hide()
		}

	})
};