/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.20
 * Generated at: 2015-12-15 09:28:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app.oms.employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import com.xt.privilege.empower.bussiness.EmpowerDS;
import com.xt.ssb.util.Constants;

public final class EmployeeEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/app/oms/employee/../../includeScript.jsp", Long.valueOf(1448597232733L));
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<meta name=\"keywords\" content=\"index\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
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
      out.write("\t<script type=\"text/javascript\" src='js/EmployeeEdit.js'></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src='../../../js/formCheck.js'></script>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"easyui-layout\" data-options=\"fit:true\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div id='center' data-options=\"region:'center',border:false\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id='employeeFormPanel' title=\"会员信息\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 100%; font-size: 13px;\">\r\n");
      out.write("\t\t\t\t<form id=\"employeeForm\" class='edit-form' method=\"post\">\r\n");
      out.write("\t\t\t\t\t<table cellspacing='10'>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align='right' class='td-label'><font color='red'>*</font>姓名</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input id='name' class=\"easyui-textbox\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-ssbtype='text' name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"required:'required',height:30,width:300\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align='right' class='td-label'><font color='red'>*</font>手机</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input class=\"easyui-textbox\" type=\"text\" id='phone'\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-ssbtype='text' name=\"phone\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"height:30,width:300,required:'required'\"></input></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"width: 150px;\"><div id=\"show_msg\" style=\"color:red;display: none\"></div></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align='right' class='td-label'><font color='red'>*</font>所属医院</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> \r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"easyui-combobox\" type=\"text\" id='orgid' data-ssbtype='combobox' name=\"orgid\" \r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"height:30,width:300,required:'required',valueField:'orgId',textField:'name'\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align='right' class='td-label'>身份证号</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input class=\"easyui-textbox\" type=\"text\" id='cardId'\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-ssbtype='text' name=\"cardId\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"height:30,width:300,validType:'idcard'\"></input></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align='right' class='td-label'>性别</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type='hidden' id='sex' data-ssbtype='radio'>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type='radio' name='sex' checked='true' value='1'>男 \r\n");
      out.write("\t\t\t\t\t\t\t\t<input type='radio' name='sex'  value='0'>女\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align='right' class='td-label'>银行账户</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input class=\"easyui-numberbox\" type=\"text\" id='bankAccount'\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-ssbtype='text' name=\"bankAccount\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"height:30,width:300\"></input></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align='right' class='td-label'>生日</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input class=\"easyui-datebox\" type=\"text\" id='birthday'\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-ssbtype='date' name=\"birthday\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"formatter:tcCoreformatter,parser:tcCoreParser,height:30\"></input></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align='right' class='td-label'>邮箱</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input class=\"easyui-textbox\" type=\"text\" id='email'\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-ssbtype='text' name=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"height:30,width:300,validType:'email'\"></input></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr >\r\n");
      out.write("\t\t\t\t\t\t\t<td align='right' class='td-label'>密码</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input style='display:none' type=\"password\" \r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" title='初始密码123456' id='password'\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"password\" value='123456'\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"height:30,width:200,required:'required'\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class='passwordNew'>初始密码123456</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class='passwordEdit' style='color:blue;cursor:pointer;' id='initPasswordBtn' onclick='updatePasswordDefault()'>恢复初始密码</a>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align='right' class='td-label'></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'south',split:true,border:false\"\r\n");
      out.write("\t\t\tstyle=\"height: 40px;\">\r\n");
      out.write("\t\t\t<div class='edit-form-btn' style='float: right; margin-right: 5px;'>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a id='cancelBtn' class=\"easyui-linkbutton oper\"\r\n");
      out.write("\t\t\t\t\tdata-options=\"iconCls:'icon-form-undo'\" onclick='cancel()'>取消</a> <a\r\n");
      out.write("\t\t\t\t\tid='deleteBtn' class=\"easyui-linkbutton oper\"\r\n");
      out.write("\t\t\t\t\tdata-options=\"iconCls:'icon-form-dustbin'\"\r\n");
      out.write("\t\t\t\t\tonclick='deleteEmployee()'>删除</a> <a id='addBtn'\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-linkbutton oper\"\r\n");
      out.write("\t\t\t\t\tstyle='margin-left: 10px; margin-right: 10px;'\r\n");
      out.write("\t\t\t\t\tdata-options=\"iconCls:'icon-form-ok'\" onclick='saveEmployee()'>保存</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
