package model;
public class DiChuyen {
   public  int viTriDau;
   public int viTriDich;
    public DiChuyen(){
        viTriDau = -1;
        viTriDich = -1;
    }
    public DiChuyen(int viTriDau, int viTriDich){
        this.viTriDau = viTriDau;
        this.viTriDich = viTriDich;
    }
	@Override
	public String toString() {
		return "DiChuyen [ 시작위치 =" + viTriDau + ", 도착위치 =" + viTriDich + "]";
	}
    
}
