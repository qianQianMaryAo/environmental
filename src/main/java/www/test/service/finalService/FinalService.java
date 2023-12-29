package www.test.service.finalService;

import www.test.pojo.ChemicalsRecord;
import www.test.pojo.Final;

import java.util.List;

public interface FinalService {
    /**
     * 插入数据
     * @param finalE
     * @return
     */
    Integer addFinalService(Final finalE);

    /**
     * 列表，及条件查询
     * @param technologyName
     * @return
     */
    List<ChemicalsRecord> selectFinalListService(String technologyName);

    /**
     * 修改数据
     * @param finalE
     * @return
     */
    Integer modifyFinalService(Final finalE);

    /**
     * 删除数据
     * @param id
     * @return
     */
    Integer deleteById(Integer id);
}
