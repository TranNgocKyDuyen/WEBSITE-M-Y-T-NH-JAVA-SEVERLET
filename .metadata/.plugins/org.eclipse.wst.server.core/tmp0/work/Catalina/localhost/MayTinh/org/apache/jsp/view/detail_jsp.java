/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.17
 * Generated at: 2024-04-17 13:00:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5-migrated-0.0.1.jar", Long.valueOf(1713342033540L));
    _jspx_dependants.put("jar:file:/F:/final%20doan%20java%20nhóm%203/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MayTinh/WEB-INF/lib/taglibs-standard-impl-1.2.5-migrated-0.0.1.jar!/META-INF/c.tld", Long.valueOf(1578905964000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <style>\r\n");
      out.write("            .gallery-wrap .img-big-wrap img {\r\n");
      out.write("                height: 450px;\r\n");
      out.write("                width: auto;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                cursor: zoom-in;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            .gallery-wrap .img-small-wrap .item-gallery {\r\n");
      out.write("                width: 60px;\r\n");
      out.write("                height: 60px;\r\n");
      out.write("                border: 1px solid #ddd;\r\n");
      out.write("                margin: 7px 2px;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .gallery-wrap .img-small-wrap {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            .gallery-wrap .img-small-wrap img {\r\n");
      out.write("                max-width: 100%;\r\n");
      out.write("                max-height: 100%;\r\n");
      out.write("                object-fit: cover;\r\n");
      out.write("                border-radius: 4px;\r\n");
      out.write("                cursor: zoom-in;\r\n");
      out.write("            }\r\n");
      out.write("            .img-big-wrap img{\r\n");
      out.write("                width: 100% !important;\r\n");
      out.write("                height: auto !important;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "gd.jsp", out, false);
      out.write("\r\n");
      out.write("                <div class=\"col-sm-9\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <aside class=\"col-sm-5 border-right\">\r\n");
      out.write("                                    <article class=\"gallery-wrap\"> \r\n");
      out.write("                                        <div class=\"img-big-wrap\">\r\n");
      out.write("                                            <div> <a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.ima}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></a></div>\r\n");
      out.write("                                        </div> \r\n");
      out.write("                                        <div class=\"img-small-wrap\">\r\n");
      out.write("                                        </div> \r\n");
      out.write("                                    </article> \r\n");
      out.write("                                </aside>\r\n");
      out.write("                                <aside class=\"col-sm-7\">\r\n");
      out.write("                                    <article class=\"card-body p-5\">\r\n");
      out.write("                                        <h3 class=\"title mb-3\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.name}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("                                        <p class=\"price-detail-wrap\"> \r\n");
      out.write("                                            <span class=\"price h3 text-warning\"> \r\n");
      out.write("                                                <span class=\"currency\">US $</span><span class=\"num\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.price}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                            </span> \r\n");
      out.write("                                        </p> \r\n");
      out.write("                                        <dl class=\"item-property\">\r\n");
      out.write("                                            <dt>Description</dt>\r\n");
      out.write("                                            <dd><p>\r\n");
      out.write("                                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.mota}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                                </p></dd>\r\n");
      out.write("                                        </dl>\r\n");
      out.write("\r\n");
      out.write("                                        <hr>\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-sm-5\">\r\n");
      out.write("                                                <dl class=\"param param-inline\">\r\n");
      out.write("                                                    <dt>Quantity: </dt>\r\n");
      out.write("                                                    <dd>\r\n");
      out.write("                                                        <select class=\"form-control form-control-sm\" style=\"width:70px;\">\r\n");
      out.write("                                                            <option> 1 </option>\r\n");
      out.write("                                                            <option> 2 </option>\r\n");
      out.write("                                                            <option> 3 </option>\r\n");
      out.write("                                                            <option> 4 </option>\r\n");
      out.write("                                                            <option> 5 </option>\r\n");
      out.write("                                                            <option> 6 </option>\r\n");
      out.write("                                                            <option> 7 </option>\r\n");
      out.write("                                                            <option> 8 </option>\r\n");
      out.write("                                                        </select>\r\n");
      out.write("                                                    </dd>\r\n");
      out.write("                                                </dl>  \r\n");
      out.write("                                            </div> \r\n");
      out.write("\r\n");
      out.write("                                        </div> \r\n");
      out.write("                                        <hr>\r\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-lg btn-primary text-uppercase\"> Mua ngay </a>\r\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-lg btn-outline-primary text-uppercase\"> <i class=\"fas fa-shopping-cart\"></i> Thêm vào giỏ hàng </a>\r\n");
      out.write("                                    </article> \r\n");
      out.write("                                </aside> \r\n");
      out.write("                            </div> \r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
