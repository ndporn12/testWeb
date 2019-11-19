package kr.ac.sunmoon.web;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


/*<aop:config>
<aop:aspect id="measureAspect" ref="exeTimeAspect">
	<aop:pointcut id="publicMethod"
		expression="execution(public * kr.ac.sunmoon.web..*(..))"/>
	<aop:around pointcut-ref="publicMethod" method="measure"/>
</aop:aspect>
</aop:config>
*/

//@Aspect
public class ExeTimeAspect {
	
	//@Pointcut("execution(public * kr.ac.sunmoon.web..*(..))")
	private void publicTarget() {
	}
	
	
	//@Around("publicTarget()")
	public Object measure(ProceedingJoinPoint joinPoint) throws Throwable{
		long start = System.nanoTime();
		Object result = null;
		try {
			result = joinPoint.proceed();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			long end = System.nanoTime();
			Signature signature = joinPoint.getSignature();
			System.out.println(joinPoint.getTarget().getClass().getSimpleName()+ "-" +(end-start));
		}
		return result;			
	}

}
