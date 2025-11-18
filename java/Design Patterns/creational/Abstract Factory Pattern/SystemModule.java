package abstractFactoryPattern;

public class SystemModule {
	public static void main(String[] args) {
		UIFactory windowsFactory = new WindowsFactory();
		Button winButton = windowsFactory.createButton();
		CheckBox winCheckBox = windowsFactory.createCheckBox();
		
		winButton.render();
		winCheckBox.check();
	}
}
