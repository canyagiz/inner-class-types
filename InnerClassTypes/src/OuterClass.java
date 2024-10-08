
public class OuterClass {

	public int outerClassVariable;

	public void outerClassMethod(boolean isInnerLocalClassMethodGonnaBeRunned) {
		System.out.println("Outer classes has just printed.\n");
		/*For local classes, access modifiers are not allowed. Since they are "accessible" 
		 *when the method is called. So, access modifier does not any importance.
		 */
		class InnerLocalClass{
			public String innerLocalClassVariable = "inner local class variable.";

			public void innerLocalClassMethod() {
				System.out.println("Inner Local Class has just printed: "+ innerLocalClassVariable + "\n");
			}
			
		}
		//A basic if conditional for observing how inner local classes method runs.
		if (isInnerLocalClassMethodGonnaBeRunned) {
			//Let's use inner local class we defined.
			InnerLocalClass innerLocal = new InnerLocalClass();
			innerLocal.innerLocalClassMethod();
		}
	}

	public class InnerClass {
		public void innerClassMethod() {
			System.out.println("Inner class has just printed.\n");
		}
	}
	
	public static class InnerStaticClass {
		public void innerStaticClassMethod() {
			System.out.println("Inner static class has just printed.");
		}
	}

}
