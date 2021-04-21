package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class RunCommand extends Command {

    public IntegerLiteral I;
    private Command C;

    public RunCommand (Command cAST, IntegerLiteral iAST, SourcePosition sourcePosition) {
        super(sourcePosition);
        I = iAST;
        setC(cAST);
    }

    public Object visit(Visitor v, Object o) {
        return v.visitRunCommand(this, o);
    }

    public Command getC() {
        return C;
    }

    public void setC(Command c) {
        C = c;
    }
}
