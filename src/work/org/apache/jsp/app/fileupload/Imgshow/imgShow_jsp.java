/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.20
 * Generated at: 2015-11-18 21:15:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app.fileupload.Imgshow;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import com.xt.privilege.empower.bussiness.EmpowerDS;
import com.xt.ssb.util.Constants;

public final class imgShow_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/app/fileupload/Imgshow/../../includeScript.jsp", Long.valueOf(1447697011984L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String context = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
	//Long employeeIde = Long.parseLong(request.getSession().getAttribute(Constants.session_employee_id)+"");
	String operationSet = request.getAttribute("operations")==null?"-1":request.getAttribute("operations").toString();
	
	//String uri = //获取当前页的url
			//截取app 后面的 发到后台 获取操作资源的 identityName   print

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t<script type='text/javascript'>\n");
      out.write("\t\tvar context= \"");
      out.print(context);
      out.write("\";\n");
      out.write("\t\tvar operationSet = \"");
      out.print(operationSet);
      out.write("\";\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\t\thref=\"");
      out.print(context);
      out.write("/js/easyui/themes/metro/easyui.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\t\thref=\"");
      out.print(context);
      out.write("/js/easyui/themes/icon.css\">\n");
      out.write("\t\t\t\t<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\t\thref=\"");
      out.print(context);
      out.write("/js/scroll/jquery.mCustomScrollbar.min.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\t\thref=\"");
      out.print(context);
      out.write("/css/style.css\">\n");
      out.write("\t\t\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\t\thref=\"");
      out.print(context);
      out.write("/js/jquery-autocomplete/jquery.autocomplete.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\t\thref=\"");
      out.print(context);
      out.write("/js/controls/controls.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<script src=\"");
      out.print(context);
      out.write("/js/easyui/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.print(context);
      out.write("/js/form.js\"></script>\n");
      out.write("\t<script src=\"");
      out.print(context);
      out.write("/js/easyui/jquery.easyui.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.print(context);
      out.write("/js/easyui/easyui-lang-zh_CN.js\"></script> \n");
      out.write("\t\n");
      out.write("\t<script src=\"");
      out.print(context);
      out.write("/js/controls/controls.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<script src=\"");
      out.print(context);
      out.write("/js/scroll/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<script src=\"");
      out.print(context);
      out.write("/js/core/core.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<script src=\"");
      out.print(context);
      out.write("/js/jquery-autocomplete/browser.js\"></script>\n");
      out.write("\t<script src=\"");
      out.print(context);
      out.write("/js/jquery-autocomplete/lib/jquery.ajaxQueue.js\"></script>\n");
      out.write("\t<script src=\"");
      out.print(context);
      out.write("/js/jquery-autocomplete/jquery.autocomplete.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- \n");
      out.write("\t<link href='");
      out.print(context);
      out.write("/js/fullcalendar/fullcalendar.min.css' rel='stylesheet' />\n");
      out.write("\t<link href='");
      out.print(context);
      out.write("/js/fullcalendar/fullcalendar.print.css' rel='stylesheet' media='print' />\n");
      out.write("\t<script src='");
      out.print(context);
      out.write("/js/fullcalendar/lib/moment.min.js'></script>\n");
      out.write("\t<script src='");
      out.print(context);
      out.write("/js/fullcalendar/fullcalendar.js'></script>\n");
      out.write("\t<script src='");
      out.print(context);
      out.write("/js/fullcalendar/lang-all.js'></script>\n");
      out.write("\t\n");
      out.write("\t<link href='");
      out.print(context);
      out.write("/js/jquery-ui-auto/jquery-ui.theme.min.css' rel='stylesheet' />\n");
      out.write("\t<script src='");
      out.print(context);
      out.write("/js/jquery-ui-auto/jquery-ui.min.js'></script>\n");
      out.write("\t\n");
      out.write("\t -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("/* ie6 png */\r\n");
      out.write(".mypng img {\r\n");
      out.write("azimuth: expression( this.pngSet?this.pngSet=true:(this.nodeName == \"IMG\" && this.src.toLowerCase().indexOf('.png')>-1?(this.runtimeStyle.backgroundImage = \"none\", this.runtimeStyle.filter = \"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='\" + this.src + \"', sizingMethod='image')\", this.src = \"transparent.gif\"):(this.origBg = this.origBg? this.origBg :this.currentStyle.backgroundImage.toString().replace('url(\"', '').replace('\")', ''), this.runtimeStyle.filter = \"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='\" + this.origBg + \"', sizingMethod='crop')\", this.runtimeStyle.backgroundImage = \"none\")), this.pngSet=true);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script  >\r\n");
      out.write("function ImgZoom(){   \r\n");
      out.write("\tvar max_w=window.innerWidth;   \r\n");
      out.write("\tvar max_h=window.innerHeight;   \r\n");
      out.write("\tvar m1=max_w/max_h;   \r\n");
      out.write("\tvar html = '';   \r\n");
      out.write("\t$(\".proListShow\").html(html);   \r\n");
      out.write("\t$(\".proListShow\").each(function(i){   \r\n");
      out.write("\tvar proImg = new Image();   \r\n");
      out.write("\tvar image = $(this);   \r\n");
      out.write("\t//alert(this.src);   \r\n");
      out.write("\tproImg.onload = function(){   \r\n");
      out.write("\t\tvar m2 = proImg.width/proImg.height;   \r\n");
      out.write("\t\tif(m2 > m1){   \r\n");
      out.write("\t\t\timage.width(max_w);   \r\n");
      out.write("\t\t}else{   \r\n");
      out.write("\t\t\timage.height(max_h);   \r\n");
      out.write("\t\t}   \r\n");
      out.write("\t}   \r\n");
      out.write("\t\tproImg.src = this.src;  \r\n");
      out.write("\t});   \r\n");
      out.write("}  \r\n");
      out.write("function init(){\r\n");
      out.write("\tvar dat=tcCore.getTopWindowParam();\r\n");
      out.write("\tif(dat) {\r\n");
      out.write("\t\t$(dat.imgattr).each(function(i,o){\r\n");
      out.write("\t\t\tvar html=\"\";\r\n");
      out.write("\t\t\tif(i==0){\r\n");
      out.write("\t\t\t\thtml=\"<li id='focusIndex1' style=''>\"; \r\n");
      out.write("\t\t\t\thtml+=\"<div class='focusL'><a href='#'><img class='proListShow' src='http://\"+dat.imgurl+o+\"' /></a></div>\";\r\n");
      out.write("\t\t\t\thtml+=\"<div class='focusR'> </div>\";\r\n");
      out.write("\t\t\t\thtml+=\"</li>\"\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\thtml=\"<li id='focusIndex\"+(i+1)+\"' >\"; \r\n");
      out.write("\t\t\t\thtml+=\"<div class='focusL'><a href='#'><img class='proListShow' src='http://\"+dat.imgurl+o+\"' /></a></div>\";\r\n");
      out.write("\t\t\t\thtml+=\"<div class='focusR'> </div>\";\r\n");
      out.write("\t\t\t\thtml+=\"</li>\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$(\".mypng\").append(html);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#focusBar\").css(\"height\",window.innerHeight);\r\n");
      out.write("\t$(\".focusL\").css(\"height\",window.innerHeight);\r\n");
      out.write("\t$('#btnR').click();\r\n");
      out.write("\tImgZoom();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(document).ready(init);\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<div id=\"focusBar\"> \r\n");
      out.write("\t<a href=\"javascript:void(0)\" class=\"arrL\" onclick=\"prePage()\">&nbsp;</a>\r\n");
      out.write("\t<a href=\"javascript:void(0)\" id=\"btnR\" class=\"arrR\" onclick=\"nextPage()\">&nbsp;</a>\r\n");
      out.write("\t<ul class=\"mypng\">\r\n");
      out.write("\t\t   \r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("<div style=\"text-align:center;clear:both;\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
