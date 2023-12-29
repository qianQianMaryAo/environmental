package www.test.dao;

import org.springframework.stereotype.Repository;
import www.test.pojo.ChemicalsRecord;

import java.util.List;

@Repository
public interface ChemicalRecordDao {
    /**
     * 插入药剂数据
     * @param chemicalRecord
     * @return
     */
    Integer addChemicalRecordDao(ChemicalsRecord chemicalRecord);

    /**
     * 药剂量列表，及条件查询
     * @param createBy
     * @return
     */
    List<ChemicalsRecord> selectChemicalList(String createBy);

    /**
     * 修改数据
     * @param chemicalsRecord
     * @return
     */
    Integer modifyChemicalDao(ChemicalsRecord chemicalsRecord);

    /**
     * 删除数据
     * @param id
     * @return
     */
    Integer deleteById(Integer id);
}
