/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package test.open;

import org.junit.Assert;
import org.junit.Test;


public class Calculator {public static class __CLR4_3_100jq3jthsz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u006b\u0061\u0072\u0074\u0068\u0069\u006b\u0072\u005c\u005c\u0077\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u005c\u005c\u006f\u0070\u0065\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1545730145721L,8589935092L,14,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	
	public static int sum(int a, int b) {try{__CLR4_3_100jq3jthsz.R.inc(0);
		__CLR4_3_100jq3jthsz.R.inc(1);return a + b;
	}finally{__CLR4_3_100jq3jthsz.R.flushNeeded();}}

	public static int minus(int a, int b) {try{__CLR4_3_100jq3jthsz.R.inc(2);
		__CLR4_3_100jq3jthsz.R.inc(3);return a - b;  
	}finally{__CLR4_3_100jq3jthsz.R.flushNeeded();}}

	public static int divide(int a, int b) {try{__CLR4_3_100jq3jthsz.R.inc(4);
		__CLR4_3_100jq3jthsz.R.inc(5);return a / b;
	}finally{__CLR4_3_100jq3jthsz.R.flushNeeded();}}

	public static  int multiply(int a, int b) {try{__CLR4_3_100jq3jthsz.R.inc(6);
		__CLR4_3_100jq3jthsz.R.inc(7);return a * b;
	}finally{__CLR4_3_100jq3jthsz.R.flushNeeded();}}

	@Test
	public void testSum() {try{__CLR4_3_100jq3jthsz.R.inc(8);
	//Calculator calculator = new Calculator();
	__CLR4_3_100jq3jthsz.R.inc(9);Assert.assertEquals(4, sum(2, 2));
	}finally{__CLR4_3_100jq3jthsz.R.flushNeeded();}}

	@Test
	public void testMinus() {try{__CLR4_3_100jq3jthsz.R.inc(10);
		//Calculator calculator = new Calculator();
		__CLR4_3_100jq3jthsz.R.inc(11);Assert.assertEquals(1, minus(2, 1));
	}finally{__CLR4_3_100jq3jthsz.R.flushNeeded();}}

	@Test
	public void testDivide() {try{__CLR4_3_100jq3jthsz.R.inc(12);
		//Calculator calculator = new Calculator();
		__CLR4_3_100jq3jthsz.R.inc(13);Assert.assertEquals(2, divide(6, 3));
	}finally{__CLR4_3_100jq3jthsz.R.flushNeeded();}}

/*    @Test
	public void testDivide {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2, multiply(4, 2 ));
}*/
}