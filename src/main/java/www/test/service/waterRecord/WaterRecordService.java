package www.test.service.waterRecord;

import www.test.pojo.WaterRecord;

import java.util.List;

public interface WaterRecordService {
    /**
     * 查看及条件查询水质数据
     * @param uploadBy
     * @param roleId
     * @return
     */
    List<WaterRecord> selectByService(String uploadBy,Integer roleId);
    /**
     * 添加水质数据
     * @param waterRecord
     * @return
     */
    Integer addWaterRecordService(WaterRecord waterRecord);

    /**
     * 修改
     * @param waterRecord
     * @return
     */
    Integer modifyWaterListService(WaterRecord waterRecord);

}
