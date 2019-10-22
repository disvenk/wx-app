package com.phone.erp.boss.controller.retail;

import com.phone.erp.base.Result;
import com.phone.erp.base.annotation.AuthValidate;
import com.phone.erp.base.utils.Assert;
import com.phone.erp.boss.controller.ReportBaseController;
import com.phone.erp.boss.service.retail.OperatorServiceService;
import com.phone.erp.boss.vo.common.BossQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * [运营商业务战报控制层]
 * @author hmj
 * @create 2018-08-18 15:31
 */
@Controller
@RequestMapping("${project.url.prefix}/report/retail/operatorService")
public class OperatorServiceController extends ReportBaseController {
    @Autowired
    private OperatorServiceService operatorServiceService;

    /**
     * [运营商业务战报获取主页分页集合]
     * @param queryVo
     * @return
     * @throws Exception
     */
    @AuthValidate
    @RequestMapping("/getPageData")
    @ResponseBody
    public Result getPageData(BossQueryVo queryVo) throws Exception{
        Assert.notNull(queryVo.getGroupField(), "分组参数不能为空!!");
        setCurrentEmp(queryVo);
        queryVo.setMenuCode("BOSS_YYSYWZB");//设置菜单码
        queryVo.setDestStr("获取运营商业务战报主页分页数据");
        //这里设置断言和特殊查询参数
        Result result = new Result();
        Map<String, Object> paramMap = getParamMap(queryVo,result);
        return operatorServiceService.getPageData(queryVo, paramMap, result);
    }

    /**
     * [运营商业务战报主页获取总计行对象]
     * @param queryVo
     * @return
     * @throws Exception
     */
    @AuthValidate
    @RequestMapping("/getTotalVo")
    @ResponseBody
    public Result getTotalVo(BossQueryVo queryVo) throws Exception{
        setCurrentEmp(queryVo);
        queryVo.setMenuCode("BOSS_YYSYWZB");//设置菜单码
        queryVo.setDestStr("获取运营商业务战报主页总计行数据");
        Result result = new Result();
        Map<String, Object> paramMap = getParamMap(queryVo,result);
        return operatorServiceService.getTotalVo(queryVo, paramMap, result);
    }

    /**
     * [运营商跳转页详情]
     * @param queryVo
     * @return
     * @throws Exception
     */
    @AuthValidate
    @RequestMapping("/getBreakPageDetail")
    @ResponseBody
    public Result getBreakPageDetail(BossQueryVo queryVo) throws Exception{
        setCurrentEmp(queryVo);
        Assert.notNull(queryVo.getNodeType(),"nodeType参数不能为空!!");//对象类型参数不为空
        queryVo.setMenuCode("BOSS_WDXL");
        queryVo.setDestStr("获取我的销量详情页数据");
        Result result = new Result();
        Map<String, Object> paramMap = getParamMap(queryVo,result);
        //与主页区别参数设置
        if ("Section".equals(queryVo.getNodeType())) {//当主页点击部门跳转详情页就用sectionId查询
            paramMap.put("sectionIds", paramMap.get("sectionId"));
        }
        return operatorServiceService.getDetailPageData(queryVo, paramMap, result);
    }

}
