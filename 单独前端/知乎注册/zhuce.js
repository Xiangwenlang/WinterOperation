window.onload=function(){
    username = getElementsById(username)
    if (username.value(/(^s*)|(s*$)/g, "").length ==0) 
    { 
    alert('不能为空'); 
    }
}