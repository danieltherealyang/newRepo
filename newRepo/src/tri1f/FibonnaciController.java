package newRepo.src.tri1f;

import java.util.Scanner;

public class FibonnaciController {
	private FibonnaciModel model;
	private FibonnaciView view;
	
	public FibonnaciController(FibonnaciModel model, FibonnaciView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setFibElements(int elements) {
		model.setElements(elements);
	}
	
	public void displayFib() {
		view.printFibonnaci(model.getFibbonaci());
	}
	
	public void initiate() {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("How many Fibonnaci elements?");
		int elements= scanObj.nextInt();
		setFibElements(elements);
	}
}
