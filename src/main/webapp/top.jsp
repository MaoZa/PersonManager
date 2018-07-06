<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>无标题文档</title>
</head>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/validate.js"></script>
<script type="text/javascript" type="text/JavaScript">
<!--
function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}



 function quit() {
  if(confirm("您确实要退出本系统吗？")){
    window.location.href="exitSave.jsp";
	}
  }
//-->
</script>
<map name="Map">
  <area shape="rect" coords="187,28,256,79" href="${pageContext.servletContext.contextPath }/queryDepList">
  <area shape="rect" coords="278,27,347,86" href="${pageContext.servletContext.contextPath }/queryEmpList">
  <area shape="rect" coords="367,24,435,101" href="${pageContext.servletContext.contextPath }/queryInviteJob">
  <area shape="rect" coords="461,29,525,92" href="${pageContext.servletContext.contextPath }/queryTrain">
  <area shape="rect" coords="551,24,623,103" href="${pageContext.servletContext.contextPath }/queryCj">
  <area shape="rect" coords="642,28,704,103" href="${pageContext.servletContext.contextPath }/queryPay">
  <area shape="rect" coords="720,25,785,100" href="${pageContext.servletContext.contextPath }/queryManager">
</map>




<body onLoad="MM_preloadImages('${pageContext.servletContext.contextPath }/images/top-11.gif','${pageContext.servletContext.contextPath }/images/top-22.gif','${pageContext.servletContext.contextPath }/images/top-33.gif')">
<table width="100" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td><img src="${pageContext.servletContext.contextPath }/images/top1.jpg" width="801" height="60" border="0" usemap="#Map"></td>
      </tr>
    </table>



      <table width="100" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td><img src="${pageContext.servletContext.contextPath }/images/top2.jpg" width="801" height="107"></td>
        </tr>
      </table>  
<table width="801" height="34" border="0" cellpadding="0" cellspacing="0" background="${pageContext.servletContext.contextPath }/images/top3.jpg">
        <tr>
          <td width="532" align="right" valign="top">
		  <table width="224" border="0" align="right" cellpadding="0" cellspacing="0">
            <tr>
              <td width="206" height="30" valign="bottom" align="right"><font color="#666633">系统时间：</font></td>
              <td width="10" height="30" valign="bottom"><font color="#666633" id="tdTime"></font>&nbsp;</td>
              	<script type="text/javascript">
					function getTime()
					{
						var time=document.getElementById("tdTime");var date=new Date();var hour=date.getHours();var minute=date.getMinutes();var second=date.getSeconds();
						var str=hour+":"+minute+":"+second;
						time.innerHTML=str;
					}
					setInterval("getTime()",1000);
				</script>
            </tr>
          </table>         
	      </td>
          <td width="88"><a href="manager_update.jsp" onClick="javascript:;" onMouseOver="MM_swapImage('Image1','','images/top-11.gif',1)" onMouseOut="MM_swapImgRestore()"><img src="${pageContext.servletContext.contextPath }/images/top-1.gif" name="Image1" width="85" height="34" border="0" id="Image1"></a></td>
          <td width="88"><a href="mainPage.jsp" onClick="javascript:;" onMouseOver="MM_swapImage('Image2','','images/top-22.gif',1)" onMouseOut="MM_swapImgRestore()"><img src="${pageContext.servletContext.contextPath }/images/top-2.gif" name="Image2" width="85" height="34" border="0" id="Image2"></a></td>
          <td width="93"><a href="javascript:quit()" onClick="javascript:;" onMouseOver="MM_swapImage('Image3','','images/top-33.gif',1)" onMouseOut="MM_swapImgRestore()"><img src="${pageContext.servletContext.contextPath }/images/top-3.gif" name="Image3" width="85" height="34" border="0" id="Image3"></a></td>
        </tr>
      </table>
	  

	  
	  </body>
</html>
