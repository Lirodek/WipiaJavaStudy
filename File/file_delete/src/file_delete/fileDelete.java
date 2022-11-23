package file_delete;

import java.io.File;

public class fileDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\xkfh1\\OneDrive\\사진\\스크린샷\\스크린샷_20221112_100749.png");
        
    	if( file.exists() ){ //파일존재여부확인
    		
    		if(file.isDirectory()){ //파일이 디렉토리인지 확인
    			
    			File[] files = file.listFiles();
    			
    			for( int i=0; i<files.length; i++){
    				if( files[i].delete() ){
    					System.out.println(files[i].getName()+" 삭제성공");
    				}else{
    					System.out.println(files[i].getName()+" 삭제실패");
    				}
    			}
    			
    		}
    		if(file.delete()){
    			System.out.println("파일삭제 성공");
    		}else{
    			System.out.println("파일삭제 실패");
    		}
    		
    	}else{
    		System.out.println("파일이 존재하지 않습니다.");
    	}
	}
}
