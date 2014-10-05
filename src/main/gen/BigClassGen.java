package gen;

/**
 * Created by xiaohe on 10/5/14.
 */
public class BigClassGen {
    public static final String defaultPackageName="";

    private final String className;
    private final int numOfFields=1;

    public int sizeOfMethod=10;

    public BigClassGen(String className, int sizeOfM) {
        this.className = className;

        this.sizeOfMethod=sizeOfM;
    }

    public BigClassGen(){
       this("Test", 100);
    }

    public BigClassGen(String className){
        this(className, 100);
    }

    public String genBigJavaClass(){
        StringBuilder sb=new StringBuilder();

        //no package decl is supported at the moment.
        sb.append("public class "+this.className+"{\n");

        sb.append(genFields());

        sb.append(genMethods());

        sb.append(genMain());

        sb.append("}\n");


        return sb.toString();
    }

    private String genMain() {
        StringBuilder sb=new StringBuilder();

        sb.append("public static void main(String[] args){\n");

        sb.append(this.className+" bc=new "+this.className+"();\n");
        sb.append("bc.updateFieldsUsingSum(0);\n");
        sb.append("System.out.println(\"a0:\"+bc.a0);\n");

        sb.append("}\n");
        return sb.toString();
    }

    private String genFields(){
        StringBuilder sb=new StringBuilder();

        String intFields="public int a";

        for (int i=0; i<this.numOfFields; i++){
            sb.append(intFields+i+";\n");
        }

        sb.append("\n");

        return sb.toString();
    }

    private String genMethods(){


        StringBuilder sb=new StringBuilder();

        //only build one method now.
        sb.append("public void updateFieldsUsingSum(");

        for (int i=0; i<this.numOfFields-1; i++){
            if (i%4==0)
                sb.append("\n");

            sb.append("int a"+i+", ");
        }

        sb.append("int a"+(this.numOfFields-1)+"){\n");

        //method body
        for (int j=0; j< this.sizeOfMethod; j++) {
            for (int i = 0; i < this.numOfFields; i++) {
                sb.append("this.a" + i + "+=a" + i + "+" + j + ";");
            }

            sb.append("\n");
        }

        sb.append("}\n");

        return sb.toString();
    }
}
