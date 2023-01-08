package Java_Advanced.TestDomeTests;

public class UserInpu {
    public static class TextInput {
        protected String currentvalue="";
        public void add(char c){
            this.currentvalue=this.currentvalue+c;
            
        }
        public String getValue(){
            return this.currentvalue;
            
        }
    }

    public static class NumericInput extends TextInput {
        //private char TextInput;

        @Override
        public void add(char c){
            String s="";
            s=s+c;
            
            try {
                int i=Integer.parseInt(s);
                if((i/1)==i){
                    this.currentvalue=this.currentvalue+c;
                }
            } catch (Exception e) {
                // TODO: handle exception
               // this.currentvalue=this.currentvalue;
               return;
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
    
}
