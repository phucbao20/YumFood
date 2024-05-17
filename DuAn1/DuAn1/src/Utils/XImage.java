
package Utils;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;


public class XImage {
    public static java.awt.Image getAppIcon()
    {
        // sửa icon
        URL url = XImage.class.getResource("/icon/fpt.png");
        return new ImageIcon(url).getImage();
    }
    public static void save(File src)
    {
        File dst = new File("logos", src.getName());
        if(!dst.getParentFile().exists())
        {
            dst.getParentFile().mkdirs(); // Tạo thư mục logos nếu chưa tồn tại
        }
        try 
        {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(src.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
            // copy file vào thư mục logos
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }
    public static ImageIcon read(String fileName)
    {
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
