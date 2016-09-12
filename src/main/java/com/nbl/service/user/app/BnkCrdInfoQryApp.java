package com.nbl.service.user.app;

import com.nbl.service.user.dto.req.QryBnkCrdDto;
import com.nbl.service.user.dto.res.QryBnkCrdResultDto;

/**
 * @author AlanMa
 * @createdate 2016年4月27日
 * @version 1.0
 * @description :银行卡信息查询器
 */
public interface BnkCrdInfoQryApp {
	/**
	 * 查询默认银行卡信息
	 * 
	 * @param qryBnkCrdDto
	 * @return
	 */
	public QryBnkCrdResultDto queryDefaultCard(QryBnkCrdDto qryBnkCrdDto);
}
