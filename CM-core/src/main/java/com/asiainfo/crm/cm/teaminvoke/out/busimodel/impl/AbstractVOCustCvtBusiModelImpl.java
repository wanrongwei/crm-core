package com.asiainfo.crm.cm.teaminvoke.out.busimodel.impl;

import java.util.Map;

import com.asiainfo.crm.cm.teaminvoke.out.busimodel.IConvertBusiModel;

public abstract class AbstractVOCustCvtBusiModelImpl implements IConvertBusiModel {

	public abstract Object convert(Map parameter) throws Exception;
}
