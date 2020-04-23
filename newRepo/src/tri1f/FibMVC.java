
package newRepo.src.tri1f;

public class FibMVC {
	public static void main(String[] args) {
		FibonnaciView view = new FibonnaciView();
		FibonnaciModel model = new FibonnaciModel();
		FibonnaciController controller = new FibonnaciController(model, view);
		controller.initiate();
		controller.displayFib();
	}
}
