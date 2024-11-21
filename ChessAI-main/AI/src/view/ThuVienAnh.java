package view;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;


public class ThuVienAnh {
    protected static ResourceBundle resources;
    static{
        try{
            resources = ResourceBundle.getBundle("lib.Source",Locale.getDefault());
        }catch(Exception e){
            System.out.println("이미지 라이브러리 소스를 찾을 수 없습니다");
            javax.swing.JOptionPane.showMessageDialog(null,
                    "소스를 찾을 수 없습니다.",
                    "오류",javax.swing.JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
    public String getResourceString(String key){
        String str;
        try{
            str = resources.getString(key);
        }catch(Exception e){
            str = null;
        }
        return str;
    }
    protected URL getResource(String key){
        String name = getResourceString(key);
        if(name != null){
            URL url = this.getClass().getResource(name);
            return url;
        }
        return null;
    }
}
