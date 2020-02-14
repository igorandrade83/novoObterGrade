package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Grade1 {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// grade1
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.grid4953")).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param chaves
 * @return Var
 */
// Descreva esta função...
public static Var cabGrade(Var chaves) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(chaves.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

