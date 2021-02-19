package com.hy.util;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/***
 * <p>
 * mybatis_plus 自动填充配置类
 * </p>
 * @author hy
 * @date 2021/2/19 15:42
 **/
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    private static final Logger log = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("开始插入填充 ....");
        Timestamp systemDate = DateUtil.date().toTimestamp();
        // 注： 如果实体中的属性类型与这里这是字段属性类型不一致，自动填充可能失效
        this.strictInsertFill(metaObject, "createDate", Timestamp.class, systemDate);
        this.strictInsertFill(metaObject, "version", Integer.class, 1);

        this.strictUpdateFill(metaObject, "updateDate", Timestamp.class, systemDate);

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("开始编辑填充 ....");
        // 注： 如果实体中的属性类型与这里这是字段属性类型不一致，自动填充可能失效
        this.strictUpdateFill(metaObject, "updateDate", Timestamp.class, DateUtil.date().toTimestamp());
    }
}
