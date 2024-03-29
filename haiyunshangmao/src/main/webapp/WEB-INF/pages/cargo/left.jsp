<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../baselist.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
	<script type="text/javascript" src="${ctx}/components/jquery-ui/jquery-1.2.6.js"></script>
</head>
 
<body id="left_frame">
<div class="PositionFrame_black" id="PositionFrame"></div>
 
 
<!-- begin1  -->
<div id="sidebar" class="sidebar">
	<div class="sidebar_t">
		<div class="sidebar_t_l"></div>
		<div class="sidebar_t_c"></div>
		<div class="sidebar_t_r"></div>
	</div>
        <div class="panel">
        <div class="panel_icon"><img src="${ctx}/skin/default/images/icon/document_into.png"/></div>
        <div class="panel-header">
        <div class="panel-title">货运管理</div>
        <div class="panel-content">
			<ul>
				<li><a href="${ctx}/cargo/contract/list.action" onclick="linkHighlighted(this)" target="main" id="aa_1">购销合同</a></li>
				<li><a href="${ctx}/cargo/outproduct/toedit.action" onclick="linkHighlighted(this)" target="main" id="aa_1">出货表</a></li>
				<li><a href="${ctx}/cargo/export/contractList.action" onclick="linkHighlighted(this)" target="main" id="aa_1">合同查询</a></li>
				<li><a href="${ctx}/cargo/export/list.action" onclick="linkHighlighted(this)" target="main" id="aa_1">出口报运</a></li>
				<li><a href="${ctx}/cargo/packinglist/list.action" onclick="linkHighlighted(this)" target="main" id="aa_1">装箱管理</a></li>
				<li><a href="#" onclick="return false;" target="main" id="aa_1">历史合同查询</a></li>
			</ul>
        </div>
        </div>
    </div>
    <div class="sidebar_t">
		<div class="sidebar_b_l"></div>
		<div class="sidebar_t_c"></div>
		<div class="sidebar_b_r"></div>
	</div>  
</div>	

 

<div id="sidebar" class="sidebar">	
	<div class="sidebar_t">
		<div class="sidebar_t_l"></div>
		<div class="sidebar_t_c"></div>
		<div class="sidebar_t_r"></div>
	</div>
 	    <div class="panel">
	        <div class="panel_icon"><img src="${ctx}/skin/default/images/icon/cubes.png" /></div>
	        <div class="panel-header">
		        <div class="panel-title">统计报表</div>
		        
		        <div class="panel-content">
					<ul>
						<li>
							<a href="${ctx}/run/stat/factorySale.action" target="main" id="aa_1">厂家销售情况统计</a>
						</li>
						<li>
							<a href="${ctx}/run/stat/productSale.action" target="main" id="aa_1">产品销售排行</a>
						</li>
						<li>
							<a href="${ctx}/run/stat/onlineInfo.action" target="main" id="aa_1">系统访问压力图</a>
						</li>
					</ul>
		        </div>
	        </div>
	    </div>
	 <div class="sidebar_t">
		<div class="sidebar_b_l"></div>
		<div class="sidebar_t_c"></div>
		<div class="sidebar_b_r"></div>
	</div>    
</div>

</body>
</html>
