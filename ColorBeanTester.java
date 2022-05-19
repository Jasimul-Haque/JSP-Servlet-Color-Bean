package colors;

public class ColorBeanTester {

	public static void main(String[] args) {
		ColorBean colorBean= new ColorBean();
		System.out.println("Original ForeGround color: "+ colorBean.getForegroundColor());
		System.out.println("Original Background color: "+ colorBean.getBackgroundColor());
		if(args.length>1){
			colorBean.setForegroundColor(args[0]);
			colorBean.setBackgroundColor(args[1]);
			
			System.out.println("new ForeGround color: "+ colorBean.getForegroundColor());
			System.out.println("new Background color: "+ colorBean.getBackgroundColor());
		}
		

	}

}
