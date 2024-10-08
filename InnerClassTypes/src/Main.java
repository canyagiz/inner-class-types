public class Main {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.outerClassMethod(false);
		
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.innerClassMethod();
		
		OuterClass.InnerStaticClass innerStatic = new OuterClass.InnerStaticClass();
		innerStatic.innerStaticClassMethod();
		
		

	}

}
