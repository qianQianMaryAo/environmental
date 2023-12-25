package www.test.service.waterRecord.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.test.dao.WaterRecordDao;
import www.test.pojo.WaterRecord;
import www.test.service.waterRecord.WaterRecordService;

import java.util.List;

@Service
public class WaterRecordImpl implements WaterRecordService {
    @Autowired
    private WaterRecordDao waterRecordDao;

    @Override
    public List<WaterRecord> selectByService(String uploadBy, Integer roleId) {
        return waterRecordDao.selectByDao(uploadBy,roleId);
    }

    @Override
    public Integer addWaterRecordService(WaterRecord waterRecord) {
        return waterRecordDao.addWaterListDao(waterRecord);
    }

    @Override
    public Integer modifyWaterListService(WaterRecord waterRecord) {
        return waterRecordDao.modifyWaterListDao(waterRecord);
    }
}
