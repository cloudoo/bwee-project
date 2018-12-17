<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>

<body>

  <div class="layui-row">
    <div class="layui-col-md8">
     <ul class="layui-nav" lay-filter="">
       <li class="layui-nav-item"><a href="">最新活动</a></li>
       <li class="layui-nav-item layui-this"><a href="">产品</a></li>
       <li class="layui-nav-item"><a href="">大数据</a></li>
       <li class="layui-nav-item">
         <a href="javascript:;">解决方案</a>
         <dl class="layui-nav-child"> <!-- 二级菜单 -->
           <dd><a href="">移动模块</a></dd>
           <dd><a href="">后台模版</a></dd>
           <dd><a href="">电商平台</a></dd>
         </dl>
       </li>
       <li class="layui-nav-item"><a href="">社区</a></li>
     </ul>
    </div>
    <div class="layui-col-md4">
     <ul class="layui-nav" style="text-align: right;" lay-filter="">
         <li class="layui-nav-item">
                    <a href="">控制台<span class="layui-badge">9</span></a>
                  </li>
                  <li class="layui-nav-item">
                    <a href="">个人中心<span class="layui-badge-dot"></span></a>
                  </li>
                  <li class="layui-nav-item">
                    <a href=""><img src="//t.cn/RCzsdCq" class="layui-nav-img">我</a>
                    <dl class="layui-nav-child">
                      <dd><a href="javascript:;">修改信息</a></dd>
                      <dd><a href="javascript:;">安全管理</a></dd>
                      <dd><a href="javascript:;">退了</a></dd>
                    </dl>
                  </li>
        </ul>
    </div>

      <div class="layui-col-lg12">
         <div class="layui-carousel" id="test1">
              <div carousel-item>
                <div>条目1</div>
                <div>条目2</div>
                <div>条目3</div>
                <div>条目4</div>
                <div>条目5</div>
              </div>
            </div>
   </div>




<script src="layui/layui.js"></script>
<script>
//注意：导航 依赖 element 模块，否则无法进行功能性操作
layui.use('element', function(){
  var element = layui.element;


});

layui.use('carousel', function(){
  var carousel = layui.carousel;
  //建造实例
  carousel.render({
    elem: '#test1'
    ,width: '100%' //设置容器宽度
    ,arrow: 'always' //始终显示箭头
    ,anim: 'leftright' //切换动画方式
    ,height: '500px'
  });
});
</script>

</body>
 </html>