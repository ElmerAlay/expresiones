
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.compi2.usac.analizadores;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Simbolo.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\010\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\004\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\017\000\006\004\006\006\005\001\002\000\014\002" +
    "\000\005\015\006\012\007\013\010\014\001\002\000\006" +
    "\004\006\006\005\001\002\000\014\002\ufffa\005\ufffa\006" +
    "\ufffa\007\ufffa\010\ufffa\001\002\000\004\002\010\001\002" +
    "\000\004\002\001\001\002\000\014\002\ufffb\005\ufffb\006" +
    "\ufffb\007\013\010\014\001\002\000\006\004\006\006\005" +
    "\001\002\000\006\004\006\006\005\001\002\000\006\004" +
    "\006\006\005\001\002\000\006\004\006\006\005\001\002" +
    "\000\014\002\uffff\005\uffff\006\uffff\007\013\010\014\001" +
    "\002\000\014\002\ufffc\005\ufffc\006\ufffc\007\ufffc\010\ufffc" +
    "\001\002\000\014\002\ufffd\005\ufffd\006\ufffd\007\ufffd\010" +
    "\ufffd\001\002\000\014\002\ufffe\005\ufffe\006\ufffe\007\013" +
    "\010\014\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\017\000\006\002\006\003\003\001\001\000\002\001" +
    "\001\000\004\003\010\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\003" +
    "\020\001\001\000\004\003\017\001\001\000\004\003\016" +
    "\001\001\000\004\003\015\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    // Método al que se llama automáticamente ante algún error sintactico.
    public void syntax_error(Symbol s){ 
            System.err.println("Error Sintáctico en la Línea " + (s.left) +" Columna "+s.right+ ". No se esperaba este componente: " +s.value+"."); 
    }
 
    // Método al que se llama en el momento en que ya no es posible una recuperación de errores. 
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
            System.err.println("Error síntactico irrecuperable en la Línea " + (s.left)+ " Columna "+s.right+". Componente " + s.value + " no reconocido."); 
    }  


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= OP 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		              
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // OP ::= OP plus OP 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object n2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OP",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // OP ::= OP minus OP 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object n2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OP",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // OP ::= OP by OP 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object n2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OP",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // OP ::= OP divided OP 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object n2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OP",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // OP ::= minus OP 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OP",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // OP ::= number 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String n1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OP",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
