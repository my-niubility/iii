package com.nbl.service.user.app;

import com.nbl.common.dto.CommRespDto;
import com.nbl.service.user.dto.req.WithdrawAlyThdInfoDto;

public interface WithdrawProxyApp {

	public CommRespDto withdrawApply(WithdrawAlyThdInfoDto wthdwAlyInfoDto);

}
