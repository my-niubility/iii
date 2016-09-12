package com.nbl.service.user.app;

import com.nbl.common.dto.CommRespDto;
import com.nbl.service.business.dto.req.PayAlyInfoDto;

public interface PaymentProxyApp {

	public CommRespDto paymentApply(PayAlyInfoDto payAlyInfoDto);

}
