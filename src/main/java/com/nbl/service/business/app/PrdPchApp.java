package com.nbl.service.business.app;

import java.util.List;

import com.nbl.common.dto.CommRespDto;
import com.nbl.common.exception.MyBusinessCheckException;
import com.nbl.service.business.dto.req.PrdPchInfoDto;
import com.nbl.service.business.dto.res.CustSimplInfoResDto;
import com.nbl.service.business.dto.res.PrdCheckResDto;

/**
 * @author maxinwei
 * @createdate 2016年4月19日
 * @version 1.0
 * @description :商品购买
 */
public interface PrdPchApp {
	/**
	 * 立即购买
	 * 
	 * @param PrdPch
	 * @return
	 */
	public CommRespDto buyNow(PrdPchInfoDto prdPchInfoDto);

	/**
	 * 立即购买产品信息校验
	 * 
	 * @param prdPchInfoDto
	 * @return
	 */
	public PrdCheckResDto buyNowChkPrdInfo(PrdPchInfoDto prdPchInfoDto) throws MyBusinessCheckException;


}


