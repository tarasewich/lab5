package ru.tarasevich.lab5;

public class Cube extends Body
{
    private double sum; // сумма всех рёбер куба
    private double lengh_diag; // диагональ куба
    
  public  Cube(int id1, int x1, String name1){
        id = id1; hight=x1; name = name1;
        this.sum = sum;
        this.lengh_diag = lengh_diag;
        this.volume = Double.valueOf(hight*hight*hight);
        this.square = Double.valueOf(6*hight*hight);
    }
    

    public double getSum(){
        return sum = this.getHig()*12;
    }

    public double getDiag(){
        return lengh_diag = this.getHig()*Math.sqrt(3);
    }

    @Override
    public double getHig() {
        return hight;
    }
    
    @Override
    public int compareTo(Body t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double volume() {
       return volume;
    }

    @Override
    public double square() {
       return square;
    }

   @Override
    public void print() {
        System.out.println("id= "+this.getId()+", "+this.getName()+", Ребро: "+Math.ceil(this.getHig()*100)/100
                            +", Сумма рёбер: "+this.getSum()+", Длина диаг.: "+Math.ceil(this.getDiag()*100)/100
                            +", Объём: "+Math.ceil(volume*100)/100+", Площадь: "+Math.ceil(square*100)/100);
    }

    

    

}
