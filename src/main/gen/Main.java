package gen;

/**
 * Created by xiaohe on 10/5/14.
 */
public class Main {
    public static void main(String[] args){
        String pathOfResourceDir="/home/xiaohe/Projects/TestAgent/src/resource/";

        String className="BigClass";

        //8246 ok for java, 8247  not ok for java


        BigClassGen bcg=new BigClassGen(className, 8247);

        String classContent=bcg.genBigJavaClass();

//      System.out.println(classContent);

        //method size has a 64KB constraint.
        Utils.writeToFile(classContent, pathOfResourceDir+className+".java");
    }
}
