package project.youngsinsa.admin.Dao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Image {
    private int idx;
    private int boardIdx;
    private String originalFileName;
    private String storedFilePath;
    private long fileSize;



}
