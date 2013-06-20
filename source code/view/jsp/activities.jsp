<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>29268 template preview | Home</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<meta http-equiv="Content-Style-Type" content="text/css" />
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="layout.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/cufon-replace.js" type="text/javascript"></script>
<script src="js/DIN_1451_Mittelschrift_Alt_400.font.js" type="text/javascript"></script>
<script src="js/jcarousellite.js" type="text/javascript"></script>
<script src="js/bgstretcher.js" type="text/javascript"></script>
<script src="js/jquery.twitter.js" type="text/javascript"></script>
<script src="js/blogger.js" type="text/javascript"></script>
<script src="js/script.js" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function(){		  
		//  Carousel
		$(".carousel").jCarouselLite({
			  btnNext: ".next",
			  btnPrev: ".prev"
		 });
				
		//  Twitter
		$("#twitter").getTwitter({
			userName: "lorem_ipsum_dol",
			numTweets: 3,
			loaderText: "Loading tweets...",
			slideIn: true,
			slideDuration: 750,
			showHeading: true,
			headingText: "Latest Tweets",
			showProfileLink: true,
			showTimestamp: true
		});
});
</script>
<!--[if lt IE 7]>
   <script type="text/javascript" src="js/ie_png.js"></script>
   <script type="text/javascript">
       ie_png.fix('.png, #main, #header img, .box .left-top-corner, .box .left-bot-corner, .box .right-top-corner, .box .right-bot-corner, .link1 a, .link1 a em, .link1 a b, .box1 .left-top-corner, .box1 .left-bot-corner, .box1 .right-top-corner, .box1 .right-bot-corner, .box2 .left-top-corner, .box2 .left-bot-corner, .box2 .right-top-corner, .box2 .right-bot-corner');
   </script>
   <link href="ie_style.css" rel="stylesheet" type="text/css" />
<![endif]-->
</head>
<body id="page1" onload="getActivities()">
<div class="tail-top">
   <div id="main">
      <!-- HEADER -->
      <div id="header">
         <div class="fleft"><a href="index.html"><img src="images/logo.png" alt="" /></a></div>
         <div class="fright"><img src="images/slogan.png" alt="" /></div>
      </div>
      <!-- CONTENT -->
      <div id="content">
         <ul class="box-list wrapper">
            <li>
               <div class="box style1">
                  <div class="left-top-corner">
                     <div class="right-top-corner">
                        <div class="border-top">
                           <h3>OpenMS</h3>
                        </div>
                     </div>
                  </div>
                  <div class="xcontent">
                     <div class="border-left">
                        <div class="border-right">
                           <div class="extra-border-bot">
                              <div class="extra-left-corner">
                                 <div class="extra-right-corner">
                                    <div class="inner">
                                       <p>本次活动（OpenMS）是西电软院科协联合微软中国及微软校园精英（MSP）团队一同举办的一场Hack盛会。设计者，享受创新与合作的乐趣，体会到“黑客精神”和编程之美！
									   </p>
                                       <div class="link1"><a href="activity-1.jsp"><em><b>detail</b></em></a></div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
                  <div class="left-bot-corner">
                     <div class="right-bot-corner">
                        <div class="border-bot"></div>
                     </div>
                  </div>
               </div>
            </li>
            <li>
               <div class="box style2">
                  <div class="left-top-corner">
                     <div class="right-top-corner">
                        <div class="border-top">
                           <h3>Earth Hour</h3>
                        </div>
                     </div>
                  </div>
                  <div class="xcontent">
                     <div class="border-left">
                        <div class="border-right">
                           <div class="extra-border-bot">
                              <div class="extra-left-corner">
                                 <div class="extra-right-corner">
                                    <div class="inner">
                                       <p>“地球1小时”也称“关灯一小时”，是世界自然基金会在2007年向全球发出的一项倡议：呼吁个人、社区、企业和政府在每年三月最后一个星期六熄灯1小时，</p>
                                       <div class="link1"><a href="#"><em><b>detail</b></em></a></div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
                  <div class="left-bot-corner">
                     <div class="right-bot-corner">
                        <div class="border-bot"></div>
                     </div>
                  </div>
               </div>
            </li>
            <li>
               <div class="box style3">
                  <div class="left-top-corner">
                     <div class="right-top-corner">
                        <div class="border-top">
                           <h3>musician</h3>
                        </div>
                     </div>
                  </div>
                  <div class="xcontent">
                     <div class="border-left">
                        <div class="border-right">
                           <div class="extra-border-bot">
                              <div class="extra-left-corner">
                                 <div class="extra-right-corner">
                                    <div class="inner">
                                       <p>为进一步丰富校园文化生活，努力营造积极向上、格调高雅、健康文明的校园文化氛围，也给大学生提供锻炼自己、展示自己,现决定举办我“西电十大校园歌手”大赛。</p>
                                       <div class="link1"><a href="#"><em><b>detail</b></em></a></div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
                  <div class="left-bot-corner">
                     <div class="right-bot-corner">
                        <div class="border-bot"></div>
                     </div>
                  </div>
               </div>
            </li>
            <li class="last">
               <div class="box style4">
                  <div class="left-top-corner">
                     <div class="right-top-corner">
                        <div class="border-top">
                           <h3>nsmoking</h3>
                        </div>
                     </div>
                  </div>
                  <div class="xcontent">
                     <div class="border-left">
                        <div class="border-right">
                           <div class="extra-border-bot">
                              <div class="extra-left-corner">
                                 <div class="extra-right-corner">
                                    <div class="inner">
                                       <p>世界卫生组织1987年11月建议将每年的4月7日定为“世界无烟日”世界无烟日改为5月31日。2013年5月31日是第26个世界无烟日，主题是“全面禁止烟草广告、促销和赞助。”</p>
                                       <div class="link1"><a href="#"><em><b>detail</b></em></a></div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
                  <div class="left-bot-corner">
                     <div class="right-bot-corner">
                        <div class="border-bot"></div>
                     </div>
                  </div>
               </div>
            </li>
         </ul>
         <div class="wrapper">
            <div class="col-1">
               <div class="box1 alt">
                  <div class="left-top-corner">
                     <div class="right-top-corner">
                        <div class="border-top">
                           <h4>main menu</h4>
                        </div>
                     </div>
                  </div>
                  <div class="xcontent">
                     <ul class="list">
                        <li>
                        <%
                        	String name=(String)session.getAttribute("userName");
                        	if(name==null)
                        		out.print("<a href=index.jsp>登        陆</a>");
                        	else
                        		out.print("<a href=home.jsp>首        页</a>");
                         %>
                        </li>
                        <li><a href="activities.jsp" class="active">活动列表</a></li>
                        <li><a href="gallery.jsp">海报观赏</a></li>
                         <%
                        	String identity=(String)session.getAttribute("identity");
                        	if(name!=null && (identity.equals("管理员")  || identity .equals("社团") ))            
                        		out.print("<li><a href=publish.jsp>活动发布</a></li>");
                         %>
                     </ul>
                  </div>
                  <div class="left-bot-corner">
                     <div class="right-bot-corner">
                        <div class="border-bot"></div>
                     </div>
                  </div>
               </div>
            </div>


            <div class="col-2">
               <div class="box2">
                  <div class="left-top-corner">
                     <div class="right-top-corner">
                        <div class="border-top"></div>
                     </div>
                  </div>
                  <div class="border-left">
                     <div class="border-right">
                        <div class="xcontent">
                           <div class="inner">
                              <h3>Activities</h3>
                              <h4>以下是在我们网站上传的所有活动，您可以在这里进行活动信查看，但是在您登陆之前您将无法进行活动报名</h4>
                              <div class="row-1 wrapper">
                                 <div class="col-1">
                                    <ul class="list1" id="activityUL">
                                      
                                    </ul>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
                  <div class="left-bot-corner">
                     <div class="right-bot-corner">
                        <div class="border-bot"></div>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
      <!-- FOOTER -->
      <div id="footer">Copy Right &copy; 2013 | <a href="about.html">About Us</a></div>
   </div>
</div>
<script type="text/javascript"> Cufon.now(); </script>

<!-- my script begin-->
<script type="text/javascript" language="javascript">
    	function addNewActivity(text,url){
    		var link=document.createElement("a");
			var li=document.createElement("li");
			var activitiUL=document.getElementById("activityUL");
			link.setAttribute("href",url);
			link.innerHTML=text;
			li.appendChild(link);
			activitiUL.appendChild(li);
    	}
	    function getResult(){
	    	if (http_request.readyState == 4){
	   			 if (http_request.status == 200){
	   			 	var res=http_request.responseText;
	   			 	var message=res.split("&");
	   			 	for(var j=0;j < message.length-1;j++){
	   			 		var subMessage = message[j].split("#");
	   			 		addNewActivity(subMessage[0],subMessage[1]);
	   			 	}
	   			 }
	   		}
	   	}
	    function createRequest(url,message){	 		
	  	 	http_request=false;
			if(window.XMLHttpRequest){
				http_request=new XMLHttpRequest();
			}
			else 
				if(window.ActiveXObject){
					try{
						http_request=new ActiveXObject("Msxml2.XMLHTTP");
					}catch(e){
						try{
							http_request=new ActiveXObject("Microsoft.XMLHTTP");	
						}catch(e){}
					}
				}
			if(!http_request){
				alert("不能创建实例");
				return false;
			}
			http_request.onreadystatechange=getResult;
			http_request.open("POST",url,true);
			http_request.setRequestHeader("content-type","application/x-www-form-urlencoded;charset=UTF-8");
			http_request.send(message);
		}  	
		function getActivities(){
			createRequest("GetActivityServlet",null);
		}		
</script>
<!-- my script end -->

</body>
</html>
