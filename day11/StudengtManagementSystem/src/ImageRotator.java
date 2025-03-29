import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class ImageRotator {

    public static void main(String[] args) {
        // 使用文件选择器让用户选择图片
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("你需要操作的图片");

        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue != JFileChooser.APPROVE_OPTION) {
            System.out.println("没有选择文件，程序退出");
            return;
        }

        File inputFile = fileChooser.getSelectedFile();
        File outputFile = new File(
                inputFile.getParent(),
                "rotated_" + inputFile.getName()
        );

        try {
            // 1. 验证文件是否存在且可读
            if (!inputFile.exists() || !inputFile.canRead()) {
                throw new Exception("无法读取文件，请检查文件是否存在和权限");
            }

            // 2. 读取图片
            System.out.println("正在读取图片: " + inputFile.getPath());
            BufferedImage originalImage = ImageIO.read(inputFile);

            if (originalImage == null) {
                throw new Exception("不支持的图片格式");
            }

            // 3. 获取图片信息
            int width = originalImage.getWidth();
            int height = originalImage.getHeight();
            System.out.printf("图片尺寸: %d x %d%n", width, height);

            // 4. 创建旋转后的图片
            BufferedImage rotatedImage = new BufferedImage(
                    height, width, originalImage.getType());

            // 5. 执行旋转操作
            System.out.println("正在旋转图片...");
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    rotatedImage.setRGB(height - 1 - y, x, originalImage.getRGB(x, y));
                }
            }

            // 6. 获取文件扩展名
            String formatName = getFileExtension(inputFile);
            if (formatName == null) {
                formatName = "jpg"; // 默认格式
            }

            // 7. 保存图片
            System.out.println("正在保存旋转后的图片...");
            boolean success = ImageIO.write(rotatedImage, formatName, outputFile);

            if (success) {
                System.out.println("图片旋转成功！保存为: " + outputFile.getPath());
            } else {
                throw new Exception("无法保存图片，可能是不支持的格式");
            }

        } catch (Exception e) {
            System.err.println("处理图片时出错: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static String getFileExtension(File file) {
        String name = file.getName();
        int lastDot = name.lastIndexOf('.');
        if (lastDot > 0) {
            return name.substring(lastDot + 1).toLowerCase();
        }
        return null;
    }
}