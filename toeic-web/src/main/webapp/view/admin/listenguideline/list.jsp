<%--
  Created by IntelliJ IDEA.
  User: 09096
  Date: 1/3/2020
  Time: 9:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
    <title><fmt:message key="label.guideline.listen.danhsach" bundle="${lang}"/></title>
</head>
<body>
<div class="main-content">
    <div class="main-content-inner">
        <div class="breadcrumbs" id="breadcrumbs">
            <script type="text/javascript">
                try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
            </script>

            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#"><fmt:message key="label.home" bundle="${lang}"/></a>
                </li>
                <li class="active"><fmt:message key="label.guideline.listen.danhsach" bundle="${lang}"/></li>
            </ul><!-- /.breadcrumb -->
        </div>
        <div class="page-content">
            <div class="row">
                <div class="col-xs-12">
                    <%--<a href="${listenGuidelineEditUrl}" type="button">Thêm bài hd</a>--%>
                    <fmt:bundle basename="ApplicationResources">
                        <div class="table - responsive">
                            <display:table id="tableList" name="items.listResult" partialList="true" size="${items.totalItems}"
                                           pagesize="${items.maxPageItems}" sort ="external"
                                           class="table table-fcv-ace table-striped table-bordered table-hover dataTable no-footer"
                                           style="margin: 3em 0 1.5em;">
                                <display:column property="tiTle" titleKey="label.guideline.listen.title" sortable="true"/>
                                <display:column property="content" titleKey="label.guideline.listen.content" sortable="true"/>
                            </display:table>
                        </div>
                    </fmt:bundle>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
