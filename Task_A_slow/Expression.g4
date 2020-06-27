grammar Expression;

@header {
    import Nodes.*;
}

expression returns [Node node] :
      or=orExpression                               {$node = $or.node;}
    | or=orExpression IMPL_TOKEN exp=expression     {$node = new Implication($or.node, $exp.node);}
    ;

orExpression returns [Node node] :
      and=andExpression {$node = $and.node;}
    | or=orExpression OR_TOKEN and=andExpression    {$node = new Or($or.node, $and.node);}
    ;

andExpression returns [Node node] :
      not=notExpression {$node = $not.node;}
    | and=andExpression AND_TOKEN not=notExpression {$node = new And($and.node, $not.node);}
    ;

notExpression returns [Node node] :
      NOT_TOKEN not=notExpression                   {$node = new Not($not.node);}
    | var=variable                                  {$node = $var.node;}
    | LB_TOKEN exp=expression RB_TOKEN              {$node = $exp.node;}
    ;

variable returns [Node node] :
    VAR_TOKEN                                       {$node = new Var($VAR_TOKEN.text);};

IMPL_TOKEN: '->' ;
AND_TOKEN : '&' ;
NOT_TOKEN : '!' ;
OR_TOKEN  : '|' ;
LB_TOKEN  : '(' ;
RB_TOKEN  : ')' ;

VAR_TOKEN : ( [A-Z] )( [A-Z] | [0-9] | '\'' )* ;