package com.globallogic.java8.lambda;

public class ExceptioThrownLambda {

	public static void main(String[] args) {

		ExceptionTest et1 = (String t) -> {
			if (t.equals("t")) {
				return true;
			} else {
				throw new Exception("VAlue not matched");
			}

		};
		printHello(et1);
		ExceptionTest et3 = (String t) -> {
			if (t.equals("t1")) {
				return true;
			} else {
				throw new Exception("VAlue not matched");
			}

		};
		printHello(et3);
	}

	static void printHello(ExceptionTest e) {
		try {
			System.out.println(e.test("t"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
