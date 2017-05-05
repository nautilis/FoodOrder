package serviceImpl;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.UUID;

/**
 * Created by p on 2017/5/5.
 */
public class PicUploadHeaper {

     private static String getSoreDir(){
          //文件物理根路径
          String path = "D:\\IntellijCode\\FoodOder\\web\\resources\\upload\\pic";
          Calendar now = Calendar.getInstance();
          String year = String.valueOf(now.get(Calendar.YEAR));
          String month = String.valueOf(now.get(Calendar.MONTH));
          String day = String.valueOf(now.get(Calendar.DAY_OF_MONTH));
          //根据日期设置分级
          String soreDir= path +"\\"+year+"\\"+month+"\\"+day+"\\";
          File dir = new File(soreDir);
          if(!dir.exists())
               dir.mkdirs();
          return soreDir;
     }

     public static String upload(MultipartFile photo_file) throws IOException {

          String orignialFileName = photo_file.getOriginalFilename();
          //获取源文件后追名
          String newFileName = UUID.randomUUID()+ orignialFileName.substring(orignialFileName.lastIndexOf("."));
          String soreDir = getSoreDir();
          File newFile = new File(soreDir+newFileName);
          photo_file.transferTo(newFile);
          return soreDir.substring(soreDir.lastIndexOf("pic\\"))+newFileName;
     }
}
