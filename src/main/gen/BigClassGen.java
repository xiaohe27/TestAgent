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
        sb.append(this.genImport());

        sb.append("public class "+this.className+"{\n");

        sb.append(genFields());

        sb.append(genMethods());

        sb.append(genMain());

        sb.append("}\n");


        return sb.toString();
    }

    private String genImport() {
        StringBuilder sb=new StringBuilder();
        sb.append("import java.util.*;\n");

        return sb.toString();
    }

    private String genMain() {
        StringBuilder sb=new StringBuilder();

        sb.append("public static void main(String[] args){\n");

        sb.append("Vector<Integer> v = new Vector<Integer>();\n");

        sb.append(" v.add(1);\n");

        sb.append(" v.add(2);\n");

        sb.append(" v.add(4);\n");

        sb.append(" v.add(8);\n");

        for (int i=0; i<this.sizeOfMethod; i++){
            sb.append(" Iterator iter"+i+" = v.iterator();\n");
        }

        sb.append("\niter0.hasNext();\n");
        sb.append("System.out.println(iter0.next());\n" +
                "System.out.println(iter0.next());\n");

        sb.append("}\n");
        return sb.toString();
    }

    private String genFields(){
        StringBuilder sb=new StringBuilder();

        sb.append("\n");
        return sb.toString();
    }

    private String genMethods(){

        StringBuilder sb=new StringBuilder();

        sb.append("\n");

        return sb.toString();
    }
}
