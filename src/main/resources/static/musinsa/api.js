$(function(){
alert("dsf")
    $('#apibtn').click(function(){
        $.ajax({
            url:'/hhhh/order/buy' ,
            dataType:'json',
            success:function(data){
                alert(data.tid);
            },
            error:function(error){
                alert(error);
            }
          });
     });
});

function cl(){
alert("5")
    $('#apibtn').click(function(){
        $.ajax({
            url:'/hhhh/order/buy',
            dataType:'json',
            success:function(data){
                alert(data.tid);
            },
            error:function(error){
                alert(error);
            }
          });
     });
}

(function(){
alert("z")
    $('#apibtn').click(function(){
        $.ajax({
            url:'/hhhh/order/buy',
            dataType:'json',
            success:function(data){
                alert(data.tid);
            },
            error:function(error){
                alert(error);
            }
          });
     });
});

function cl(){
alert("e")
    $('#apibtn').click(function(){
        $.ajax({
            url:'/hhhh/order/buy',
            dataType:'json',
            success:function(data){
                alert(data.tid);
            },
            error:function(error){
                alert(error);
            }
          });
     });
}

function cl(){

        $.ajax({
            url:'/hhhh/order/buy',
            dataType:'json',
            success:function(data){
            alert(data.tid)
                var box = data.next_redirect_pc_url;
                window.open(box);
            },
            error:function(error){
                alert(error);
            }
          });
     };
