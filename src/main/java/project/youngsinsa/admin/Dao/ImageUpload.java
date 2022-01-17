package project.youngsinsa.admin.Dao;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;

public class ImageUpload {

    public String up(MultipartHttpServletRequest multipartHttpServletRequest){

       MultipartFile file1 = multipartHttpServletRequest.getFile("file1");

       String fileName = file1.getOriginalFilename();

        String path = "./images";
        File f1 = new File(path + fileName);
//        file1.transferTo(f1);
        return null;
    }


}
