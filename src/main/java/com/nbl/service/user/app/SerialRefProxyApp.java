package com.nbl.service.user.app;

import com.nbl.common.exception.MyBusinessCheckException;
import com.nbl.service.user.dto.req.SerialRefDto;
import com.nbl.service.user.dto.res.SerialRefResultDto;

public interface SerialRefProxyApp {

	public SerialRefResultDto updateSerialRef(SerialRefDto serialRefDto) throws MyBusinessCheckException;

}
