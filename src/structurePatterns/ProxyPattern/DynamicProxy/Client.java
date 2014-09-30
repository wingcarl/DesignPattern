package structurePatterns.ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;

class Client {

	public static void main(String[] args) {

		Subject subject = new RealSubject();
		InvocationHandler handler = new MyInvocationHandler(subject);
		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass()
				.getClassLoader(), subject.getClass().getInterfaces(), handler);
		proxy.doSomething("Finish");
	}

}