package gen;

/**
 * Created by xiaohe on 10/5/14.
 */
public class Main {
    public static void main(String[] args){
        String pathOfResourceDir="/home/xiaohe/Projects/TestAgent/src/resource/";

        String className="BigClass";

        //4600 ok for java, 4700 not ok

        //3250 ok for aspectj
        BigClassGen bcg=new BigClassGen(className, 3850);

        String classContent=bcg.genBigJavaClass();

//      System.out.println(classContent);

        //method size has a 64KB constraint.
        Utils.writeToFile(classContent, pathOfResourceDir+className+".java");
    }
}
