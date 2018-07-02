package com.dubbo.dcs.filter;

import com.alibaba.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * dubbo RPC监控拦截器
 */
public class MonitorArgFilter implements Filter {
    private static Logger logger = LoggerFactory.getLogger(MonitorArgFilter.class);

    /**
     * dubbo RPC监控拦截器
     * @param invoker
     * @param invocation
     * @return
     * @throws RpcException
     */
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        logger.info("info===>:begin method[{}]", invocation.getMethodName());
        long stTime = System.currentTimeMillis();
        Result result = invoker.invoke(invocation);
        logger.info("info===>:end method[{}], consume timeMillis:{}", invocation.getMethodName(), System.currentTimeMillis() - stTime);
        return result;
    }
}
