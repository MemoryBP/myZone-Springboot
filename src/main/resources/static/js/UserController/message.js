function mymessage(type,title,content){
	var reval=false
	if(type=='alert'){
		$.alert({
			title: title,
		    content: content,
		    backgroundDismiss: true,
		    autoClose: 'cancel|5000',
		    buttons: {
		        info: {
		        	text:'确定',
		            btnClass: 'btn-success',
		            action:function(){
		            	reval = true;
		            },
		        },
		        cancel:{
		        	text:'取消',
		            btnClass: 'btn-red',
		            action:function(){
		            	reval = true;
		            },
		        },
		    },
		});
		alert(reval)
	}else{
		$.confirm({
			title: title,
		    content: content,
		    backgroundDismiss: true,
		    buttons: {
		        info: {
		        	text:'确定',
		            btnClass: 'btn-success',
		            action:function(){
		            	return true;
		            },
		        },
		        cancel:{
		        	text:'取消',
		            btnClass: 'btn-red',
		            action:function(){
		            	return false;
		            },
		        },
		    }
		});
	}
	
	return reval;
}