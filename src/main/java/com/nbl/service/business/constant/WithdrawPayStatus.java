package com.nbl.service.business.constant;


/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :提现状态枚举
 */
public enum WithdrawPayStatus {
	
	
	BANKING("00", "银行处理中(线上)","RISKCONTROL", "处理中"),
	SUCCESS("01", "提现成功","RISKCONTROL", "成功"),
	FAIL("02", "提现失败","NORISKCONTROL", "失败"),
	ACCEPT("03", "已受理","NORISKCONTROL", "处理中");
	

//	APPLYING("00", "提现申请中","RISKCONTROL", "申请中"),
//    HANDLING("01", "提现处理中","RISKCONTROL", "处理中"),
//    
//    OFFLINEING("03", "银行处理中(线下)","RISKCONTROL", "处理中"),
//    REFUSEING("04", "拒绝处理中","RISKCONTROL", "处理中"),
//    
//    FAILREFUND("06", "提现失败，待退款","RISKCONTROL", "处理中"),
//   
//    FAIL_REVERSE("08", "提现失败,已冲正","NORISKCONTROL", "失败，已冲正"),
//    ;
	
	private String value;
    private String displayName;
    private String riskControlFlag;
    /**
     * 展示用户的状态说明
     */
    private String displayNameToCust;
	
	WithdrawPayStatus(String value, String displayName ,String riskControlFlag, 
	    		String displayNameToCust){
        this.value = value ;
        this.displayName = displayName ;
        this.riskControlFlag = riskControlFlag ;
        this.displayNameToCust = displayNameToCust;
    }

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
    public String getriskControlFlag() {
        return this.riskControlFlag;
    }
    public String getDisplayNameToCust() {
		return displayNameToCust;
	}
	
	public static WithdrawPayStatus parseOf( String value ){
		
		for ( WithdrawPayStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		return null;
	}
}
