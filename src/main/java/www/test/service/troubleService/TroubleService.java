package www.test.service.troubleService;

import www.test.pojo.Trouble;

public interface TroubleService {
    /**
     * 插入数据
     * @param trouble
     * @return
     */
    Integer addTroubleService(Trouble trouble);
    /**
     * 修改数据
     * @param trouble
     * @return
     */
    Integer modifyTroubleService(Trouble trouble);
}
