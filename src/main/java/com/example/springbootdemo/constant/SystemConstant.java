package com.example.springbootdemo.constant;

import java.util.HashMap;
import java.util.Map;

/** 项目常量类 */
public class SystemConstant {

	/** 项目编码 */
	public static final String CHARSET_UTF_8 = "UTF-8";

	public static final int status_true = 1;
	public static final int status_false = 0;
	public static final int RETURN_CODE_0=0;  //返回结果


	//订单状态
	public static final int ORDER_STATUS_UNPAY = 1;  //未付款
	public static final int ORDER_STATUS_PAYED = 2;  //已付款
	public static final int ORDER_STATUS_NOTDELIVERY = 3;  //未发货
	public static final int ORDER_STATUS_DELIVERY = 4;  //已发货
	public static final int ORDER_STATUS_SUCCESS = 5;  //交易成功

	//商品订单状态map
	public static final Map<Integer,String> ORDER_STATUS_MAP = new HashMap<Integer,String>(){{
		put(1,"未付款");
		put(2,"已付款");
		put(3,"待发货");
		put(4,"已发货");
		put(5,"交易成功");
		put(6,"交易关闭");
		put(7,"支付中");
		put(8,"审核中");
		put(9,"待支付首付款");
		put(10,"待上传身份证");
		put(11,"待分期支付");
	}};


	//借款单状态
	public static final Map<Integer,String> LOANBILL_STATUS_MAP = new HashMap<Integer,String>(){{
		put(1,"审核通过");
		put(2,"审核未通过");
		put(3,"审核中");
	}};


	//banner类型
	public static final Map<String,String> BANNER_TYPE_MAP = new HashMap<String,String>(){{
		put("INDEX","首页");
		put("LOAN_B_PAGE","白条页");
		put("INDEX_B","首页B(手机金库)");
	}};


	//appId类型
	public static final Map<String,String> APP_ID_MAP = new HashMap<String,String>(){{
		put("cashloan","新浪分期");
		put("flashloan","闪电有钱");
		put("youjieloan","有借管家");
		put("sjjkloan","手机金库");
		put("public","公共");
	}};

	//notice类型
	public static final Map<Integer,String> NOTICE_TYPE_MAP = new HashMap<Integer,String>(){{
		put(1,"公告");
		put(2,"小喇叭");
	}};


	//售后业务
	public static final Map<Integer,String> SHOUHOU_TYPE= new HashMap<Integer,String>(){{
		put(1,"退货退款");
		put(2,"换货");
		put(3,"仅退款");
	}};


	//售后状态
	public static final Map<Integer,String> SHOUHOU_STATUS= new HashMap<Integer,String>(){{
		put(1,"退货处理中");
		put(2,"退货已完成");
		put(3,"退货已取消");
		put(4,"换货处理中");
		put(5,"换货已完成");
		put(6,"换货已取消");
		put(7,"退款处理中");
		put(8,"退款已完成");
		put(9,"退款已取消");
	}};


}
