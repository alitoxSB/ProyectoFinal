package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class RunCommand extends Command {

    public IntegerLiteral I;
    public Command C;

    public RunCommand (Command cAST, IntegerLiteral iAST, SourcePosition sourcePosition) {
        super(sourcePosition);
        I = iAST;
        C = cAST;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitRunCommand(this, o);
    }

}
