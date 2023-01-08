package Java_Advanced.TestDomeTests;

public  class TrainComposition {
    Wagon left;
    Wagon right;
    
  
    public void attachWagonFromLeft(int wagonId) {
        try {
            if(this.left==null){
                this.left=new Wagon(wagonId);
                this.right=left;
            }
            else{
                Wagon wagon=new Wagon(wagonId);
                //System.out.println("add");
                wagon.setNext(left);
                left=wagon;
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        
       
    }

    public void attachWagonFromRight(int wagonId) {
        try {
            if(this.left==null){
                this.left=new Wagon(wagonId);
                this.right=left;
            }
            else{
                Wagon wagon=new Wagon(wagonId);
                right.setNext(wagon);
                right=wagon;
    
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        

       
    }

    public int detachWagonFromLeft() {
        try {
            int wagonid= this.left.getValue();
            Wagon r=left.getNext();
            this.left.setNext(null);
            left=r;

        return wagonid;


        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        
       
    }

    public int detachWagonFromRight() {
        try {
            Wagon cwaWagon=this.left;
            while(cwaWagon!=null){
                if(cwaWagon.getNext()==right ){
                    int wagonId=cwaWagon.getNext().getValue();
                    //Wagon rWagon=cwaWagon.getNext();
                    cwaWagon.setNext(null);
                    right=cwaWagon;
                    return wagonId;

                }
                cwaWagon=cwaWagon.getNext();
            }  
            return 0 ; 
            
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        

        

       
    }

    public static void main(String[] args) {
        TrainComposition train = new TrainComposition();
        train.attachWagonFromLeft(7);
        train.attachWagonFromLeft(13);
        train.attachWagonFromLeft(12);
        train.attachWagonFromLeft(15);
        train.attachWagonFromLeft(2);
        train.attachWagonFromLeft(1);
        train.attachWagonFromRight(100);
        train.attachWagonFromRight(101);
        train.attachWagonFromRight(102);

        System.out.println(train.detachWagonFromRight()); // 7 
        System.out.println(train.detachWagonFromLeft()); 
        System.out.println(train.detachWagonFromLeft());
        System.out.println(train.detachWagonFromLeft());// 13
    }
} 
class Wagon{
    int value;
    Wagon next;
    public Wagon(int value){
        this.value=value;

    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public Wagon getNext() {
        return next;
    }
    public void setNext(Wagon next) {
        this.next = next;
    }
}