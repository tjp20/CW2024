
package com.example.demo;

import javafx.scene.Group;

public class LevelViewLevelTwo extends LevelView {

	private static final int SHIELD_X_POSITION = 1150;
	private static final int SHIELD_Y_POSITION = 500;
	private final Group root;
	private final ShieldImage shieldImage;

	public LevelViewLevelTwo(Group root, int heartsToDisplay) {
		super(root, heartsToDisplay);
		this.root = root;
		this.shieldImage = new ShieldImage(SHIELD_X_POSITION, SHIELD_Y_POSITION);

	}

	private void addImagesToRoot() {
		root.getChildren().addAll(shieldImage);
	}

	public void showShield(double xPosition, double yPosition) {
		shieldImage.showShield(xPosition, yPosition);
		//addImagesToRoot();
		if (!root.getChildren().contains(shieldImage)) {
			root.getChildren().add(shieldImage); // Add shield to root only if it's not already present
		}
	}
	public void hideShield() {
		shieldImage.hideShield();
	}
	public void updateShieldPosition(double x, double y) {
		shieldImage.showShield(x, y);
	}


}
