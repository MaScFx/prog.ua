package Other;

import java.io.File;

public class CheckFile implements Runnable{
    String checkThisFile;
    File checkInThisfolder;

    public CheckFile(String checkThisFile, File checkInThisfolder) throws IllegalArgumentException{
        if (checkInThisfolder.isFile()){
            throw new IllegalArgumentException("It is file!");
        }
        this.checkThisFile = checkThisFile;
        this.checkInThisfolder = checkInThisfolder;
    }

    @Override
    public void run() {
        File[] arr = checkInThisfolder.listFiles();
        if (arr!=null){
            for (File file:arr){
                if (file.isDirectory()){
                    CheckFile checkNext=new CheckFile(checkThisFile,file);
                    checkNext.run();
                } else {
                    String nameFile =file.getName();
                    String[] nameArr= nameFile.split("\\.");
                    if (checkThisFile.compareTo(nameArr[0])==0|| checkThisFile.compareTo(nameFile)==0){
                        System.out.println(file.getAbsolutePath());
                    }
                }
            }

        }

    }


    public String getCheckThisFile() {
        return checkThisFile;
    }

    public void setCheckThisFile(String checkThisFile) {
        this.checkThisFile = checkThisFile;
    }

    public File getCheckInThisfolder() {
        return checkInThisfolder;
    }

    public void setCheckInThisfolder(File checkInThisfolder) {
        this.checkInThisfolder = checkInThisfolder;
    }


}
