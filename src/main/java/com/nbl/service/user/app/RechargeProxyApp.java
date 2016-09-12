package com.nbl.service.user.app;

import com.nbl.common.dto.CommRespDto;
import com.nbl.service.user.dto.req.RechgAlyThdInfoDto;

public interface RechargeProxyApp {

	public CommRespDto rechargeApply(RechgAlyThdInfoDto rechgAlyThdInfoDto);

}
