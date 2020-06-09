package com.alibaba.dubbo.rpc.cluster.loadbalance;

import java.util.List;
import java.util.Random;


import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.cluster.LoadBalance;
import com.alibaba.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance;


public class SimpleLoadBalance implements LoadBalance {
	
	public <T> Invoker<T> select(List<Invoker<T>> invokers, URL url, Invocation invocation) throws RpcException {
		// TODO Auto-generated method stub
		System.out.println("select of SimpleLoadBalance");
		Random r=new Random();
		int ran=r.nextInt(invokers.size());
		return invokers.get(ran);
	}

//	@Override
//	protected <T> Invoker<T> doSelect(List<Invoker<T>> invokers, URL url, Invocation invocation) {
//		// TODO Auto-generated method stub
//		System.out.println("select of SimpleLoadBalance");
//		Random r=new Random();
//		int ran=r.nextInt(invokers.size());
//		return invokers.get(ran);
//	}

}
