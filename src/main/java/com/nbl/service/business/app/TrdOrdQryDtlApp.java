package com.nbl.service.business.app;

import com.nbl.common.dto.CommRespDto;
import com.nbl.service.user.dto.req.TrdOrdDtlQryDto;

public interface TrdOrdQryDtlApp {

	/**
	 * 交易记录详情查询
	 * 
	 * @param trdOrdDtlQryDto
	 * @return
	 */
	public CommRespDto queryTrdOrdDtl(TrdOrdDtlQryDto trdOrdDtlQryDto);
}
