package com.phone.erp.boss.mapper.retail;

import com.phone.erp.boss.mapper.ReportBaseMapper;
import com.phone.erp.boss.vo.retail.OperatorServiceVo;

import java.util.List;
import java.util.Map;

/**
 * [运营商业务战报]
 * @author hmj
 * @create 2018-08-18 15:20
 */
public interface OperatorServiceMapper extends ReportBaseMapper<OperatorServiceVo> {

    List<OperatorServiceVo> getOperatorsBySectionId(Map map);
}
