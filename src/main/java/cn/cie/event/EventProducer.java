package cn.cie.event;

import cn.cie.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by RojerAlone on 2017/6/25.
 * 事件生产者
 */
public class EventProducer {

    @Autowired
    private RedisUtil redisUtil;

    public long product(EventModel model) {
        return redisUtil.rpushObject(EventModel.EVENT_KEY, EventModel.class, model);
    }

}
