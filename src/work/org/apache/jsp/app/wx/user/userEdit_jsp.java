/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.20
 * Generated at: 2016-01-15 10:13:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app.wx.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import com.xt.privilege.empower.bussiness.EmpowerDS;
import com.xt.ssb.util.Constants;

public final class userEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/app/wx/user/../../includeScript.jsp", Long.valueOf(1448597232733L));
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>用户管理</title>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write(" ");
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
      out.write("    \r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/js/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("\r\n");
      out.write("<!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("<script src=\"");
      out.print(context);
      out.write("/js/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("<!-- bootstrap-table -->   \r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/js/bootstrap/bootstrap-table/css/bootstrap-table.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(context);
      out.write("/js/bootstrap/bootstrap-table/css/bootstrap-editable.css\"> \r\n");
      out.write("<script src=\"");
      out.print(context);
      out.write("/js/bootstrap/bootstrap-table/ga.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src='js/userEdit.js'></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div>\r\n");
      out.write(" \r\n");
      out.write("    <div id=\"toolbar\">\r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("          <div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t<button id=\"remove\" class=\"btn btn-default\" disabled>\r\n");
      out.write("            <i class=\"glyphicon glyphicon-remove\"></i> 删  除\r\n");
      out.write("           </button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t <div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t <select  class=\"form-control\" id=\"userGroup\" name=\"userGroup\" disabled>\r\n");
      out.write("                 <option value=\"\">添加到</option>\r\n");
      out.write("                 <option value=\"1\">默认组</option>\r\n");
      out.write("                 <option value=\"2\">星标组</option>\r\n");
      out.write("                </select>\r\n");
      out.write("                \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t <div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t<button id=\"blackList\" class=\"btn btn-default\" disabled>\r\n");
      out.write("                                        黑名单\r\n");
      out.write("             </button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("        \r\n");
      out.write("       <div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t<button id=\"synchronous_wx_user\" class=\"btn btn-info\">\r\n");
      out.write("                                        微信粉丝同步\r\n");
      out.write("             </button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("               \r\n");
      out.write("        \r\n");
      out.write("             \r\n");
      out.write("          \r\n");
      out.write("             \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <table id=\"table\"\r\n");
      out.write("           data-toolbar=\"#toolbar\"\r\n");
      out.write("           data-search=\"true\"\r\n");
      out.write("           data-show-refresh=\"true\"\r\n");
      out.write("           data-show-toggle=\"true\"\r\n");
      out.write("           data-show-columns=\"true\"\r\n");
      out.write("           data-show-export=\"true\"\r\n");
      out.write("           data-detail-view=\"true\"\r\n");
      out.write("           data-detail-formatter=\"detailFormatter\"\r\n");
      out.write("           data-minimum-count-columns=\"2\"\r\n");
      out.write("           data-show-pagination-switch=\"true\"\r\n");
      out.write("           data-pagination=\"true\"\r\n");
      out.write("           data-id-field=\"userid\"\r\n");
      out.write("           data-page-list=\"[10, 25, 50, 100, ALL]\"\r\n");
      out.write("           data-show-footer=\"false\"\r\n");
      out.write("           data-side-pagination=\"server\"\r\n");
      out.write("           data-url=\"");
      out.print(context);
      out.write("/userDS/saveOrQueryUser.ssm\"\r\n");
      out.write("           data-response-handler=\"responseHandler\">\r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("var $table = $('#table'),\r\n");
      out.write("$remove = $('#remove'),\r\n");
      out.write("$userGroup = $('#userGroup'),\r\n");
      out.write("$blackList = $('#blackList'),\r\n");
      out.write("$synchronous_wx_user = $('#synchronous_wx_user'),\r\n");
      out.write("\r\n");
      out.write("selections = [];\r\n");
      out.write("\r\n");
      out.write("function initTable() {\r\n");
      out.write("$table.bootstrapTable({\r\n");
      out.write("    height: getHeight(),\r\n");
      out.write("    columns: [\r\n");
      out.write("          [\r\n");
      out.write("            {\r\n");
      out.write("                field: 'state',\r\n");
      out.write("                checkbox: true,\r\n");
      out.write("                rowspan: 2,\r\n");
      out.write("                align: 'center',\r\n");
      out.write("                valign: 'middle'\r\n");
      out.write("            } \r\n");
      out.write("            ,\r\n");
      out.write("            {\r\n");
      out.write("                title: '基本信息',\r\n");
      out.write("                colspan: 8,\r\n");
      out.write("                align: 'center',\r\n");
      out.write("                valign: 'middle'\r\n");
      out.write("            }\r\n");
      out.write("            , {\r\n");
      out.write("            \tfield: 'operate',\r\n");
      out.write("                title: '操作管理',\r\n");
      out.write("                rowspan: 2,\r\n");
      out.write("                align: 'center',\r\n");
      out.write("                valign: 'middle',\r\n");
      out.write("                events: operateEvents,\r\n");
      out.write("                formatter: operateFormatter\r\n");
      out.write("              }\r\n");
      out.write("        ],\r\n");
      out.write("        [ \r\n");
      out.write("            {\r\n");
      out.write("             title: '头像',\r\n");
      out.write("             field: 'headimgurl',\r\n");
      out.write("             align: 'center',\r\n");
      out.write("             valign: 'middle',\r\n");
      out.write("             sortable: true,\r\n");
      out.write("             formatter: operateHtmlFormatter\r\n");
      out.write("            },\r\n");
      out.write("            {\r\n");
      out.write("                field: 'nickname',\r\n");
      out.write("                title: '名称',\r\n");
      out.write("                align: 'left',\r\n");
      out.write("                valign: 'middle',\r\n");
      out.write("                sortable: true\r\n");
      out.write("            }\r\n");
      out.write("            ,\r\n");
      out.write("            {\r\n");
      out.write("                field: 'groupid',\r\n");
      out.write("                title: '分组',\r\n");
      out.write("                align: 'center',\r\n");
      out.write("                valign: 'middle',\r\n");
      out.write("                sortable: true,\r\n");
      out.write("                \teditable: {\r\n");
      out.write("                        type: 'select',\r\n");
      out.write("                        source: [\r\n");
      out.write("                            {value: '0', text: '默认组'},\r\n");
      out.write("                            {value: '1', text: '黑名单'},\r\n");
      out.write("                            {value: '2', text: '星标组'}\r\n");
      out.write("                        ]\r\n");
      out.write("                    }\r\n");
      out.write("            }\r\n");
      out.write("              ,\r\n");
      out.write("            {\r\n");
      out.write("                field: 'remark',\r\n");
      out.write("                title: '备注',\r\n");
      out.write("                align: 'center',\r\n");
      out.write("                valign: 'middle',\r\n");
      out.write("                sortable: true,\r\n");
      out.write("                editable: {\r\n");
      out.write("                    type: 'text',\r\n");
      out.write("                    title: '修改备注',\r\n");
      out.write("                    validate: function (value) {\r\n");
      out.write("                        value = $.trim(value);\r\n");
      out.write("                        if (!value) {\r\n");
      out.write("                            return 'This field is required';\r\n");
      out.write("                        }\r\n");
      out.write("//                         if (!/^$/.test(value)) {\r\n");
      out.write("//                             return 'This field needs to start width $.'\r\n");
      out.write("//                         }\r\n");
      out.write("                        var data = $table.bootstrapTable('getData'),\r\n");
      out.write("                            index = $(this).parents('tr').data('index');\r\n");
      out.write("                        console.log(\"==>>>>>\"+data[index]);\r\n");
      out.write("                        console.log(\"==>>>>>\"+data[index].openid);\r\n");
      out.write("                        var user={remark:value,openid:data[index].openid,userid:data[index].userid}\r\n");
      out.write("                      \r\n");
      out.write("                        \ttcCore.post({\r\n");
      out.write("                        \t\turl:\"userDS/saveRemarkUserName.ssm\",\r\n");
      out.write("                        \t\tdata:{\r\n");
      out.write("                        \t\t\tuser:user\r\n");
      out.write("                        \t\t},\r\n");
      out.write("                        \t\tsuccess:function(data){\r\n");
      out.write("                        \t\t\tconsole.log(data);\r\n");
      out.write("                        \t\t\talert(\"成功\");\r\n");
      out.write("                        \t\t}\r\n");
      out.write("                        \t});\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        return '';\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'sex',\r\n");
      out.write("                title: '性别',\r\n");
      out.write("                align: 'center',\r\n");
      out.write("                valign: 'middle',\r\n");
      out.write("                sortable: true,\r\n");
      out.write("                editable:false,\r\n");
      out.write("                formatter: operateSexFormatter\r\n");
      out.write("            },\r\n");
      out.write("            {\r\n");
      out.write("                field: 'country',\r\n");
      out.write("                title: '国家',\r\n");
      out.write("                align: 'center',\r\n");
      out.write("                valign: 'middle',\r\n");
      out.write("                sortable: true,\r\n");
      out.write("                editable:false\r\n");
      out.write("            },\r\n");
      out.write("            {\r\n");
      out.write("                field: 'province',\r\n");
      out.write("                title: '省份',\r\n");
      out.write("                align: 'center',\r\n");
      out.write("                valign: 'middle',\r\n");
      out.write("                sortable: true,\r\n");
      out.write("                editable:false\r\n");
      out.write("               \r\n");
      out.write("            },\r\n");
      out.write("            {\r\n");
      out.write("                field: 'city',\r\n");
      out.write("                title: '市/区',\r\n");
      out.write("                align: 'center',\r\n");
      out.write("                valign: 'middle',\r\n");
      out.write("                sortable: true,\r\n");
      out.write("                editable:false\r\n");
      out.write("            }\r\n");
      out.write("        ]\r\n");
      out.write("    ]\r\n");
      out.write("});\r\n");
      out.write("// sometimes footer render error.\r\n");
      out.write("setTimeout(function () {\r\n");
      out.write("    $table.bootstrapTable('resetView');\r\n");
      out.write("}, 200);\r\n");
      out.write("$table.on('check.bs.table uncheck.bs.table ' +\r\n");
      out.write("        'check-all.bs.table uncheck-all.bs.table', function () {\r\n");
      out.write("    $remove.prop('disabled', !$table.bootstrapTable('getSelections').length);\r\n");
      out.write("    $userGroup.prop('disabled', !$table.bootstrapTable('getSelections').length);\r\n");
      out.write("    $blackList.prop('disabled', !$table.bootstrapTable('getSelections').length);\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    // save your data, here just save the current page\r\n");
      out.write("    selections = getIdSelections();\r\n");
      out.write("    // push or splice the selections if you want to save all data selections\r\n");
      out.write("});\r\n");
      out.write("$table.on('expand-row.bs.table', function (e, index, row, $detail) {\r\n");
      out.write("//     if (index % 2 == 1) {\r\n");
      out.write("//         $detail.html('Loading from ajax request...');\r\n");
      out.write("//         $.get('LICENSE', function (res) {\r\n");
      out.write("//             $detail.html(res.replace(/\\n/g, '<br>'));\r\n");
      out.write("//         });\r\n");
      out.write("//     }\r\n");
      out.write("});\r\n");
      out.write("$table.on('all.bs.table', function (e, name, args) {\r\n");
      out.write("    console.log(name, args);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$remove.click(function () {\r\n");
      out.write("    var ids = getIdSelections();\r\n");
      out.write("    $table.bootstrapTable('remove', {\r\n");
      out.write("        field: 'id',\r\n");
      out.write("        values: ids\r\n");
      out.write("    });\r\n");
      out.write("    $remove.prop('disabled', true);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$userGroup.click(function () {\r\n");
      out.write("    var ids = getIdSelections();\r\n");
      out.write("    $table.bootstrapTable('remove', {\r\n");
      out.write("        field: 'id',\r\n");
      out.write("        values: ids\r\n");
      out.write("    });\r\n");
      out.write("    $userGroup.prop('disabled', true);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$blackList.click(function () {\r\n");
      out.write("    var ids = getIdSelections();\r\n");
      out.write("    $table.bootstrapTable('remove', {\r\n");
      out.write("        field: 'id',\r\n");
      out.write("        values: ids\r\n");
      out.write("    });\r\n");
      out.write("    $userGroup.prop('disabled', true);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$synchronous_wx_user.click(function () {\r\n");
      out.write("\ttcCore.get({\r\n");
      out.write("\t\turl:\"/userDS/saveQueryWXUser.ssm\",\r\n");
      out.write("\t\tsuccess:function(data){\r\n");
      out.write("\t\t\talert(\"成功\")\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(window).resize(function () {\r\n");
      out.write("    $table.bootstrapTable('resetView', {\r\n");
      out.write("        height: getHeight()\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function getIdSelections() {\r\n");
      out.write("return $.map($table.bootstrapTable('getSelections'), function (row) {\r\n");
      out.write("    return row.id\r\n");
      out.write("});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function responseHandler(res) {\r\n");
      out.write("$.each(res.rows, function (i, row) {\r\n");
      out.write("    row.state = $.inArray(row.id, selections) !== -1;\r\n");
      out.write("});\r\n");
      out.write("return res;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function detailFormatter(index, row) {\r\n");
      out.write("var html = [];\r\n");
      out.write("$.each(row, function (key, value) {\r\n");
      out.write("    html.push('<p><b>' + key + ':</b> ' + value + '</p>');\r\n");
      out.write("});\r\n");
      out.write("return html.join('');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function operateFormatter(value, row, index) {\r\n");
      out.write("return [\r\n");
      out.write("    '<button class=\"btn btn-success like\" href=\"javascript:void(0)\" title=\"Like\">',\r\n");
      out.write("    '<i class=\"glyphicon glyphicon-heart\"></i>关注',\r\n");
      out.write("    '</button> ',\r\n");
      out.write("    '<button class=\"btn btn-danger remove\" href=\"javascript:void(0)\" title=\"Remove\">',\r\n");
      out.write("    '<i class=\"glyphicon glyphicon-remove\"></i>删除',\r\n");
      out.write("    '</button>'\r\n");
      out.write("].join('');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("window.operateEvents = {\r\n");
      out.write("'click .like': function (e, value, row, index) {\r\n");
      out.write("    alert('You click like action, row: ' + JSON.stringify(row));\r\n");
      out.write("},\r\n");
      out.write("'click .remove': function (e, value, row, index) {\r\n");
      out.write("    $table.bootstrapTable('remove', {\r\n");
      out.write("        field: 'openid',\r\n");
      out.write("        values: [row.id]\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function totalTextFormatter(data) {\r\n");
      out.write("return 'Total';\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function totalNameFormatter(data) {\r\n");
      out.write("return data.length;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function totalPriceFormatter(data) {\r\n");
      out.write("var total = 0;\r\n");
      out.write("$.each(data, function (i, row) {\r\n");
      out.write("    total += +(row.price.substring(1));\r\n");
      out.write("});\r\n");
      out.write("return '$' + total;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function operateHtmlFormatter(value, row, index) {\r\n");
      out.write("var img=\"<img src='\"+value+\"' height='48px' width='48px' ></img>\";\r\n");
      out.write(" return img;\r\n");
      out.write("}\r\n");
      out.write("function operateSexFormatter(value, row, index) {\r\n");
      out.write(" var sex=\"未知\";\r\n");
      out.write(" if(\"1\"==value)\r\n");
      out.write(" {\r\n");
      out.write(" \tsex=\"男\";\r\n");
      out.write(" }else if(\"2\"==value)\r\n");
      out.write(" {\r\n");
      out.write(" \tsex=\"女\";\r\n");
      out.write(" }\r\n");
      out.write("return sex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function getHeight() {\r\n");
      out.write("return $(window).height() - $('h1').outerHeight(true);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(function () {\r\n");
      out.write("var scripts = [\r\n");
      out.write("        location.search.substring(1) || '");
      out.print(context);
      out.write("/js/bootstrap/bootstrap-table/bootstrap-table.js',\r\n");
      out.write("        '");
      out.print(context);
      out.write("/js/bootstrap/bootstrap-table/bootstrap-table-export.js',\r\n");
      out.write("        '");
      out.print(context);
      out.write("/js/bootstrap/bootstrap-table/tableExport.js',\r\n");
      out.write("        '");
      out.print(context);
      out.write("/js/bootstrap/bootstrap-table/bootstrap-table-editable.js',\r\n");
      out.write("        '");
      out.print(context);
      out.write("/js/bootstrap/bootstrap-table/bootstrap-editable.js',\r\n");
      out.write("        '");
      out.print(context);
      out.write("/js/bootstrap/bootstrap-table/bootstrap-table-zh-CN.min.js'\r\n");
      out.write("        \r\n");
      out.write("    ],\r\n");
      out.write("    eachSeries = function (arr, iterator, callback) {\r\n");
      out.write("        callback = callback || function () {};\r\n");
      out.write("        if (!arr.length) {\r\n");
      out.write("            return callback();\r\n");
      out.write("        }\r\n");
      out.write("        var completed = 0;\r\n");
      out.write("        var iterate = function () {\r\n");
      out.write("            iterator(arr[completed], function (err) {\r\n");
      out.write("                if (err) {\r\n");
      out.write("                    callback(err);\r\n");
      out.write("                    callback = function () {};\r\n");
      out.write("                }\r\n");
      out.write("                else {\r\n");
      out.write("                    completed += 1;\r\n");
      out.write("                    if (completed >= arr.length) {\r\n");
      out.write("                        callback(null);\r\n");
      out.write("                    }\r\n");
      out.write("                    else {\r\n");
      out.write("                        iterate();\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        };\r\n");
      out.write("        iterate();\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("eachSeries(scripts, getScript, initTable);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function getScript(url, callback) {\r\n");
      out.write("var head = document.getElementsByTagName('head')[0];\r\n");
      out.write("var script = document.createElement('script');\r\n");
      out.write("script.src = url;\r\n");
      out.write("\r\n");
      out.write("var done = false;\r\n");
      out.write("// Attach handlers for all browsers\r\n");
      out.write("script.onload = script.onreadystatechange = function() {\r\n");
      out.write("    if (!done && (!this.readyState ||\r\n");
      out.write("            this.readyState == 'loaded' || this.readyState == 'complete')) {\r\n");
      out.write("        done = true;\r\n");
      out.write("        if (callback)\r\n");
      out.write("            callback();\r\n");
      out.write("\r\n");
      out.write("        // Handle memory leak in IE\r\n");
      out.write("        script.onload = script.onreadystatechange = null;\r\n");
      out.write("    }\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("head.appendChild(script);\r\n");
      out.write("\r\n");
      out.write("// We handle everything using the script element injection\r\n");
      out.write("return undefined;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
