package www.test.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import www.test.pojo.WaterRecord;

import java.util.List;

@Repository
public interface WaterRecordDao {
    /**
     * 通过上传人及角色Id查找
     * @param uploadBy
     * @param roleId
     * @return
     */
    List<WaterRecord> selectByDao(@Param("uploadBy") String uploadBy,@Param("roleId") Integer roleId);
    /**
     * 添加数据
     * @param waterRecord
     * @return
     */
    Integer addWaterListDao(WaterRecord waterRecord);

    /**
     * 修改数据
     * @param waterRecord
     * @return
     */
    Integer modifyWaterListDao(WaterRecord waterRecord);
}
