new Vue( {
    el:"#user1",//绑定页面的id，作用范围
    data() {
        return {
            //初始化参数绑定
            user:{
                id:'',
                name:'',
                age:''
            },
        }
    },
    //方法函数
    methods :{
      add(){
          console.log(11);
          var That = this;
            $.ajax({
                url:"/user/add",
                methods:"post",
                data:That.user,
                success:function (r) {
                        alert(r)
                }
            })
        }
    },
})