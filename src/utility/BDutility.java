package utility;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.HashMap;

/**
 * Utility class for handling image operations.
 * 
 * @author Pranshu
 */
public class BDutility {
    // Map to keep track of opened forms
    private static HashMap<String, JFrame> formsMap = new HashMap<>();

    // Set an image to the given JFrame
    public static void setImage(JFrame frame, String imagePath, int newWidth, int newHeight) {
        try {
            BufferedImage originalImage = ImageIO.read(BDutility.class.getResource(imagePath));
            Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            ImageIcon backgroundImage = new ImageIcon(resizedImage);
            JLabel backgroundLabel = new JLabel(backgroundImage);
            backgroundLabel.setBounds(0, 0, newWidth, newHeight);
            frame.getContentPane().add(backgroundLabel, BorderLayout.CENTER);
            frame.pack(); // Adjust the frame size to fit the content
            frame.setVisible(true); // Ensure the frame is visible

        } catch (Exception ex) {
            ex.printStackTrace(); // Handle exceptions appropriately
        }
    }

    // Open a form and manage visibility
    public static void openForm(String formName, JFrame formInstance) {
        JFrame existingForm = formsMap.get(formName);
        if (existingForm == null || !existingForm.isVisible()) {
            formsMap.put(formName, formInstance);
            formInstance.setVisible(true);
        } else {
            existingForm.toFront();
        }
    }

    // Set the file path
    public static String setPath(String finalPath) {
        String projectPath = System.getProperty("user.dir");
        return projectPath + "\\src\\" + finalPath;
    }

    // Get the file extension from a file name
    public static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf(".");
        if (lastDotIndex != -1) {
            return fileName.substring(lastDotIndex + 1);
        }
        return "";
    }

    // Scale the image
     public static BufferedImage scaleImage(BufferedImage originalImage, BufferedImage selectedImage) {
        // Create a new BufferedImage with the specified dimensions
       int width = selectedImage.getWidth();
       int height = selectedImage.getHeight();
       BufferedImage scaledImage = new BufferedImage(width, height, originalImage.getType());
       scaledImage.createGraphics().drawImage(originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0,0,null);
       return scaledImage;
    
    }

    public static String getPath(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
