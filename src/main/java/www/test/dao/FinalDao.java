package www.test.dao;

import org.springframework.stereotype.Repository;
import www.test.pojo.ChemicalsRecord;
import www.test.pojo.Final;

import java.util.List;

@Repository
public interface FinalDao {
    /**
     * 插入数据
     * @param finalE
     * @return
     */
    Integer addFianlDao(Final finalE);

    /**
     * 列表，及条件查询
     * @param technologyName
     * @return
     */
    List<ChemicalsRecord> selectFinalList(String technologyName);

    /**
     * 修改数据
     * @param finalE
     * @return
     */
    Integer modifyFinalDao(Final finalE);

    /**
     * 删除数据
     * @param id
     * @return
     */
    Integer deleteById(Integer id);
}
