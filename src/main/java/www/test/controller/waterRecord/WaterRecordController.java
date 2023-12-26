package www.test.controller.waterRecord;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import sun.awt.windows.WWindowPeer;
import www.test.pojo.Role;
import www.test.pojo.WaterRecord;
import www.test.pojo.WaterRecordDTO;
import www.test.service.role.RoleService;
import www.test.service.waterRecord.WaterRecordService;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/water")
@ResponseBody
public class WaterRecordController {
    @Autowired
    private WaterRecordService waterRecordService;
    @Autowired
    private RoleService roleService;

    @RequestMapping("/query")
    public ModelAndView query(@RequestParam(value = "uploadBy", required = false) String uploadBy,
                              @RequestParam(value = "userRole", required = false) String userRoleQuery,
                              ModelAndView modelAndView) {
        Integer userRole = 0;
        if (uploadBy == null) {
            uploadBy = "";
        }
        if (userRoleQuery != null) {
            userRole = Integer.valueOf(userRoleQuery);
        }
        List<WaterRecord> waterRecord = waterRecordService.selectByService(uploadBy, userRole);
        modelAndView.addObject("waterRecord", waterRecord);
        List<Role> roleList = roleService.getRoleListService();
        modelAndView.addObject("roleList", roleList);
        modelAndView.addObject("userRole", userRole);
        modelAndView.setViewName("/jsp/waterRecordUserList.jsp");
        return modelAndView;
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("COD") String COD,
                            @RequestParam("TN") String TN,
                            @RequestParam("NH3-N") String NH3N,
                            @RequestParam("TP") String TP,
                            @RequestParam("testTime") String testTime,
                            @RequestParam("uploadTime") String uploadTime,
                            @RequestParam("uploadBy") String uploadBy,
                            @RequestParam("roleId") String roleId,
                            ModelAndView modelAndView) throws Exception {
        WaterRecordDTO waterRecord = new WaterRecordDTO();
        waterRecord.setCOD(new BigDecimal(COD));
        waterRecord.setTN(new BigDecimal(TN));
        waterRecord.setNH3N(new BigDecimal(NH3N));
        waterRecord.setTP(new BigDecimal(TP));

        waterRecord.setTestTimeDTO(testTime);
        waterRecord.setUploadTimeDTO(uploadTime);
        //
        Date formatTime = new SimpleDateFormat("yyyy-MM-dd").parse(testTime);
        long time = formatTime.getTime();
        Timestamp timestamp = new Timestamp(time);
        waterRecord.setTestTime(timestamp);
        Date formatBy = new SimpleDateFormat("yyyy-MM-dd").parse(uploadTime);
        waterRecord.setUploadTime(new Timestamp(formatBy.getTime()));
        waterRecord.setUploadBy(uploadBy);
        waterRecord.setRoleId(Integer.valueOf(roleId));
        Integer record = waterRecordService.addWaterRecordService(waterRecord);

        modelAndView.addObject("COD", waterRecord.getCOD());
        modelAndView.addObject("TN", waterRecord.getTN());
        modelAndView.addObject("NH3N", waterRecord.getNH3N());
        modelAndView.addObject("TP", waterRecord.getTP());
        modelAndView.addObject("testTime", waterRecord.getTestTimeDTO());
        modelAndView.addObject("uploadBy", waterRecord.getUploadTimeDTO());
        modelAndView.addObject("roleId", waterRecord.getRoleId());
        if (record != null) {
            modelAndView.setViewName("/water/query");
        } else {
            modelAndView.addObject("errorMsg", "添加失败，请重试");
            modelAndView.setViewName("/jsp/waterRecordListAdd.jsp");
        }
        return modelAndView;
    }
//点击修改按钮，获取的数据，并跳转至修改页
    @RequestMapping("/modify")
    public ModelAndView modify(String id,
                               ModelAndView modelAndView) throws Exception {
       WaterRecord waterRecord= waterRecordService.selectById(Integer.valueOf(id));
        modelAndView.addObject("water",waterRecord);
        if (waterRecord!=null){
            modelAndView.setViewName("/jsp/waterRecordListModify.jsp");
        }
        return modelAndView;
    }
     //修改页
    @RequestMapping("/modifyWater")
    public ModelAndView modifymodifyWater(String id,
                                          @RequestParam("COD") String COD,
                                          @RequestParam("TN") String TN,
                                          @RequestParam("NH3-N") String NH3N,
                                          @RequestParam("TP") String TP,
                                          @RequestParam("testTime") String testTime,
                                          @RequestParam("uploadTime") String uploadTime,
                                          @RequestParam("uploadBy") String uploadBy,
                                          @RequestParam("roleId") String roleId,
                               ModelAndView modelAndView) throws Exception {
        WaterRecord waterRecord = new WaterRecord();
        waterRecord.setId(Integer.valueOf(id));
        waterRecord.setCOD(new BigDecimal(COD));
        waterRecord.setTN(new BigDecimal(TN));
        waterRecord.setNH3N(new BigDecimal(NH3N));
        waterRecord.setTP(new BigDecimal(TP));


        Date formatTime = new SimpleDateFormat("yyyy-MM-dd").parse(testTime);
        long time = formatTime.getTime();
        Timestamp timestamp = new Timestamp(time);
        waterRecord.setTestTime(timestamp);
        Date formatBy = new SimpleDateFormat("yyyy-MM-dd").parse(uploadTime);
        waterRecord.setUploadTime(new Timestamp(formatBy.getTime()));
        waterRecord.setUploadBy(uploadBy);
        waterRecord.setRoleId(Integer.valueOf(roleId));

        Integer modifyWaterListService = waterRecordService.modifyWaterListService(waterRecord);
        if (modifyWaterListService>0){
            modelAndView.setViewName("/water/query");
        }else {
            modelAndView.addObject("errorMsg","错误请重试");
            modelAndView.setViewName("/jsp/waterRecordListModify.jsp");
        }
        return modelAndView;
    }
}
