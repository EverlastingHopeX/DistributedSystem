package com.balance;

import java.util.List;
import java.util.Random;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.cluster.LoadBalance;

public class SimpleLoadBalance implements LoadBalance {

	public <T> Invoker<T> select(List<Invoker<T>> invokers, URL url, Invocation invocation) throws RpcException {
		// TODO Auto-generated method stub
		Random r=new Random();
		int ran=r.nextInt(invokers.size());
		return invokers.get(ran);
	}

}
