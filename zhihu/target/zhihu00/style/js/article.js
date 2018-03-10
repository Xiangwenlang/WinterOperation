window.onload = function(){
    // 实现评论功能
    var comment_button = document.querySelector('#addComment');
    var txt = document.getElementById("txt");
    var btn = document.getElementById("myPoint");
    var ul = document.getElementById("ul");
    var c_number = 0
    comment_button.onclick = function(){
        c_number++
        if(c_number%2==1){
            comment_box.style.display = 'block'
            comment_button.innerHTML = '收起评论'
        }
        else{
            comment_box.style.display = 'none'
            comment_button.innerHTML = '评论'
        }
    }
    myPoint.onclick = function(){
        var val =  txt.value;
        if(val === ""){
            alert("请输入内容");
            return;
        }
        var li = document.createElement("li");
        li.className = 'pinglun'
        ul.appendChild(li);
        li.innerHTML = val;
        // 头像·用户名
        var oDiv = document.createElement("div");
        oDiv.className = "touxiang";
        li.appendChild(oDiv);
        // 用户名
        var oDiv = document.createElement("div");
        oDiv.className = "nicheng";
        oDiv.innerHTML = 'chris'
        li.appendChild(oDiv);
        // 删除评论
        var btn1 = document.createElement("input");
        btn1.type= "button";
        btn1.value = "删除"
        btn1.className = "shanchu"
        li.appendChild(btn1);
        btn1.onclick = function(){
            var li = this.parentNode;
            ul.removeChild(li);
        }
        // 点赞评论
        var btn2 = document.createElement("input");
        btn2.type= "button";
        btn2.value = "点赞"
        btn2.className = "dianzan"
        li.appendChild(btn2);
        var a_clickNumber = 0;
        var agreeNumber = 2;
        btn2.onclick = function(){
            a_clickNumber ++
            if(a_clickNumber%2 == 1){
                agreeNumber++
                btn2.value = agreeNumber + '人觉得赞'
            }
            else{
                agreeNumber --
                btn2.value = agreeNumber + '人觉得赞'
            }

        }
        //那根线
        var oline = document.createElement('div')
        oline.className = 'oline'
        li.appendChild(oline)
    }

    // 分享功能
    var shareButton = document.querySelector('#share')
    shareBox = document.querySelector('.bdsharebuttonbox')
    var clickNumberX = 0;
    // shareButton.onclick = function(){
    //     clickNumberX ++
    //     if(clickNumberX%2 == 1){
    //         shareBox.style.display = 'block'
    //         shareButton.innerHTML = '分享'
    //     }
    //     else{
    //         shareBox.style.display = 'none'
    //         shareButton.innerHTML = '收起分享'
    //     }

    // }
}