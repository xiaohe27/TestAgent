import org.aspectj.lang.Signature;
/**
 * Created by hx312 on 13/09/2014.
 */
public aspect FindMethods {
    
    pointcut methodCall(): execution(* *(..));
	
    before (): get(int BigClass.a0){
	System.out.println("access a0");	
}

before (): get(int BigClass.a1){
	System.out.println("access a1");	
}
    
    before():methodCall(){
        Signature sig = thisJoinPoint.getSignature();
        String line =""+ thisJoinPoint.getSourceLocation().getLine();
        String sourceName = thisJoinPoint.getSourceLocation().getWithinType().getCanonicalName();

        System.out.println(sig+" "+line+" "+sourceName);
    }

}
