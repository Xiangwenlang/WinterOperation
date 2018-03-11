// 实现文章展开
window.onload = function(){
    var article_1 = document.querySelector('#arcticle');   
        ar_pic = document.querySelector('.ar_pic')
        word = document.querySelector('#word')
        words = document.querySelector('#words')
        words_length = words.innerHTML.length
        words_str_0 = words.innerHTML
        
        zk_btn = document.querySelector('.zk_btn')
        if(words_length>200){
            zk_btn.style.display = 'block'
        }
        var clickNumber = 0
        zk_btn.onclick = function(){
            clickNumber++
            if(clickNumber%2==1){
                ar_pic.style.width = '610px'
                ar_pic.style. height = '400px'
                ar_pic.style.float = 'none'
                ar_pic.style.margin = '20px'
                word.style.margin = '20px'
                word.style.float = 'none'
                word.style.width = '610px'
                word.style.height = 'auto'
                zk_btn.innerHTML = '收起全文'
                
            }
            else{
                ar_pic.style.width = '190px'
                ar_pic.style.height = '100px'
                ar_pic.style.float = 'left'
                ar_pic.style.margin = '0'
                word.style.margin = '0'
                word.style.float = 'left'
                word.style.width = '440px'
                word.style.height = '100px'
                zk_btn.innerHTML = '展开全文'
            }
        }
// 实现评论功能
var comment_button = document.querySelector('.comment')
var txt = document.getElementById("txt")
var btn = document.getElementById("btn")
var ul = document.getElementById("ul")
var closeTheComment = document.querySelector('.closeTheComment')
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
    var val =  txt.value
    if(val === ""){
        alert("请输入内容")
        return;
    }
    var li = document.createElement("li")
    li.className = 'pinglun'
    ul.appendChild(li)
    li.innerHTML = val
    // 头像·用户名
    var oDiv = document.createElement("div")
    oDiv.className = "touxiang"
    li.appendChild(oDiv)
    // 用户名
    var oDiv = document.createElement("div")
    oDiv.className = "nicheng"
    oDiv.innerHTML = 'chris'
    li.appendChild(oDiv)
    // 删除评论
    var btn1 = document.createElement("input")
    btn1.type= "button"
    btn1.value = "删除"
    btn1.className = "shanchu"
    li.appendChild(btn1);
    btn1.onclick = function(){
        var li = this.parentNode
        ul.removeChild(li)
    }
    // 点赞评论
    var btn2 = document.createElement("input")
    btn2.type= "button"
    btn2.value = "点赞"
    btn2.className = "dianzan"
    li.appendChild(btn2)
    var a_clickNumber = 0
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
    //是否有已存在的评论。。。
    if(ul.hasChildNodes()){
    closeTheComment.style.display = 'block'    
    }
    // 收起评论
    // closeTheComment.onclick = function(){
    //     comment_box.style.display = 'none'
    // }
}
