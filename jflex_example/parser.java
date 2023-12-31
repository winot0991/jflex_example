
//----------------------------------------------------
// The following code was generated by jh-javacup-1.2 20210807
// Thu Oct 19 13:29:55 BRT 2023
//----------------------------------------------------

import java_cup.runtime;

/** jh-javacup-1.2 20210807 generated parser.
  * @version Thu Oct 19 13:29:55 BRT 2023
  */
public class parser extends java_cup.runtime.LRParser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}
  /** The static parse table */
  static java_cup.runtime.ParseTable CUP$parse_table =
    new java_cup.runtime.ParseTable(new String[] {
    "\016\000\002\001\002\002\003\004\000\003\003" +
    "\003\003\003\001\014\044\030\020\044\042\040" +
    "\022\016\042\040\036\014\062\000\000\000\000" +
    "\000\000\000\000\000\000\000\000\014\001\013" +
    "\006\007\004\002\015\006\002\013\006\007\004" +
    "\002\003\001\016\001\011\001\013\012\014\011" +
    "\012\010\027\003\010\005\003\004\003\000\003" +
    "\014\001\016\005\001\007\011\011\010\002\002" +
    "\003\007\003\012\011\010"
    });

  /** Return parse table */
  protected java_cup.runtime.ParseTable parse_table() {
    return CUP$parse_table;
  }

  /** Instance of action encapsulation class. */
  protected CUP$parser$action action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$action(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java.util.ArrayList        stack)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$do_action(act_num, stack);
  }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$action {
  private final parser parser;

  /** Constructor */
  CUP$parser$action(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$do_action(
    int                        CUP$act_num,
    java.util.ArrayList            CUP$stack)
    throws java.lang.Exception
    {
      /* Stack size for peeking into the stack */
      int CUP$size = CUP$stack.size();

      /* select the action based on the action number */
      switch (CUP$act_num)
        {
          // $START ::= expr_list EOF 
          case 0:
            {
              Object RESULT;
              java_cup.runtime.Symbol CUP$rhs$ = ((java_cup.runtime.Symbol) CUP$stack.get(CUP$size - 2));
              int CUP$rhsleft = CUP$rhs$.left;
              int CUP$rhsright = CUP$rhs$.right;
              Object CUP$rhs = (Object) CUP$rhs$.value;
RESULT = CUP$rhs;
/* ACCEPT */
parser.done_parsing();
              return parser.getSymbolFactory().newSymbol("$START", 0, CUP$rhs$, ((java_cup.runtime.Symbol) CUP$stack.get(CUP$size - 1)), RESULT);
            }

          // expr_list ::= expr_list expr_ptv 
          case 1:
            {
              Object RESULT;
              return parser.getSymbolFactory().newSymbol("expr_list", 1, ((java_cup.runtime.Symbol) CUP$stack.get(CUP$size - 2)), ((java_cup.runtime.Symbol) CUP$stack.get(CUP$size - 1)), RESULT);
            }

          // expr_ptv ::= expr NT$0 PTVIRG 
          case 2:
            {
              Object RESULT = (Object) ((java_cup.runtime.Symbol) CUP$stack.get(CUP$size - 2)).value;
              java_cup.runtime.Symbol e$ = ((java_cup.runtime.Symbol) CUP$stack.get(CUP$size - 3));
              int eleft = e$.left;
              int eright = e$.right;
              Integer e = Integer.valueOf(e$.value.toString()) ;
              return parser.getSymbolFactory().newSymbol("expr_ptv", 2, e$, ((java_cup.runtime.Symbol) CUP$stack.get(CUP$size - 1)), RESULT);
            }

          // NT$0 ::= 
          case 3:
            {
              Object RESULT = null;
              java_cup.runtime.Symbol e$ = ((java_cup.runtime.Symbol) CUP$stack.get(CUP$size - 1));
              int eleft = e$.left;
              int eright = e$.right;
              Integer e = Integer.valueOf(e$.value.toString()) ;
 System.out.println("="+e.intValue()); 
              return parser.getSymbolFactory().newSymbol("NT$0", 4, e$, e$, RESULT);
            }

          // expr ::= INTEIRO MAIS expr 
          case 4:
            {
              Integer RESULT;
              java_cup.runtime.Symbol e$ = ((java_cup.runtime.Symbol) CUP$stack.get(CUP$size - 1));
              int eleft = e$.left;
              int eright = e$.right;
              Integer e = Integer.valueOf(e$.value.toString()) ;
              java_cup.runtime.Symbol n$ = ((java_cup.runtime.Symbol) CUP$stack.get(CUP$size - 3));
              int nleft = n$.left;
              int nright = n$.right;
              Integer n = Integer.valueOf(n$.value.toString()) ;
 RESULT = new Integer(n.intValue() + e.intValue()); 
              return parser.getSymbolFactory().newSymbol("expr", 3, n$, e$, RESULT);
            }

          // expr ::= INTEIRO MENOS expr 
          case 5:
            {
              Integer RESULT;
              java_cup.runtime.Symbol e$ = ((java_cup.runtime.Symbol) CUP$stack.get(CUP$size - 1));
              int eleft = e$.left;
              int eright = e$.right;
              Integer e = Integer.valueOf(e$.value.toString()) ;
              java_cup.runtime.Symbol n$ = ((java_cup.runtime.Symbol) CUP$stack.get(CUP$size - 3));
              int nleft = n$.left;
              int nright = n$.right;
              Integer n = Integer.valueOf(n$.value.toString()) ;
 RESULT = new Integer(n.intValue() - e.intValue()); 
              return parser.getSymbolFactory().newSymbol("expr", 3, n$, e$, RESULT);
            }

          // expr ::= INTEIRO 
          case 6:
            {
              Integer RESULT;
              java_cup.runtime.Symbol n$ = ((java_cup.runtime.Symbol) CUP$stack.get(CUP$size - 1));
              int nleft = n$.left;
              int nright = n$.right;
              Integer n = Integer.valueOf(n$.value.toString()) ;
 RESULT = n; 
              return parser.getSymbolFactory().newSymbol("expr", 3, n$, n$, RESULT);
            }

          /* . . . . . .*/
          default:
            throw new InternalError(
               "Invalid action number found in internal parse table");

        }
    }
}

