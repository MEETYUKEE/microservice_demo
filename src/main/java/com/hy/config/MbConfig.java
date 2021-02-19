package com.hy.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * <p>
 *  mybatis_plus 配置类
 * </p>
 * @author hy
 * @date 2021/2/19 16:56
 **/
@Configuration
@MapperScan("com.hy.mapper")
public class MbConfig {

    /***
     * 乐观锁插件 配置
     * @return 、
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInnerInterceptor(){
        return new OptimisticLockerInterceptor();
    }


}
