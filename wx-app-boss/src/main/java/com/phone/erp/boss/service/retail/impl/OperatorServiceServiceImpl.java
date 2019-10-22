package com.phone.erp.boss.service.retail.impl;

import com.phone.erp.base.Result;
import com.phone.erp.boss.mapper.retail.OperatorServiceMapper;
import com.phone.erp.boss.service.impl.ReportBaseServiceImpl;
import com.phone.erp.boss.service.retail.OperatorServiceService;
import com.phone.erp.boss.vo.common.BossQueryVo;
import com.phone.erp.boss.vo.retail.OperatorServiceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * [运营商业务战报服务实现类]
 * @author hmj
 * @create 2018-08-18 15:26
 */
@Service
@Transactional
public class OperatorServiceServiceImpl extends ReportBaseServiceImpl<OperatorServiceVo,OperatorServiceMapper> implements OperatorServiceService {
    @SuppressWarnings("unused")
    @Autowired
    private OperatorServiceMapper operatorServiceMapper;
    //Autowired不能缺少,强制将子类的mapper传到ReportBaseMapper中使用
    @Autowired
    public void setBaseMapper(OperatorServiceMapper operatorServiceMapper) {
        super.setMapper(operatorServiceMapper);
    }

    @Override
    public Result getPageData(BossQueryVo queryVo, Map<String, Object> paramMap, Result result) throws Exception {
        Result pageData = super.getPageData(queryVo, paramMap, result);
        if("sectionName".equals(paramMap.get("groupField"))){
            List<OperatorServiceVo> dataList = (List<OperatorServiceVo>) pageData.getData().get("dataList");
        for(OperatorServiceVo vo :dataList){
            paramMap.put("sectionId",vo.getSectionId());
            List<OperatorServiceVo> operators = operatorServiceMapper.getOperatorsBySectionId(paramMap);
            vo.setOperators(operators);
        }
            pageData.put("dataList",dataList);
        }
        return pageData;
    }


}
