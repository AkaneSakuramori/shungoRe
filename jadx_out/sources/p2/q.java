package p2;

import i.a0;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import m2.c0;

/* JADX INFO: loaded from: classes.dex */
public final class q implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f3815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2.h f3816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o2.f f3817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f3818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r2.b f3819f = r2.b.f4070a;

    public q(a0 a0Var, m2.a aVar, o2.f fVar, b bVar) {
        this.f3815b = a0Var;
        this.f3816c = aVar;
        this.f3817d = fVar;
        this.f3818e = bVar;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // m2.c0
    public final m2.b0 a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public final boolean b(Field field, boolean z4) {
        Class<?> type = field.getType();
        o2.f fVar = this.f3817d;
        fVar.getClass();
        if (!o2.f.c(type)) {
            fVar.b(z4);
            if ((field.getModifiers() & 136) == 0 && !field.isSynthetic() && !o2.f.c(field.getType())) {
                List list = z4 ? fVar.f3620b : fVar.f3621c;
                if (!list.isEmpty()) {
                    new c.a().f1137a = field;
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        defpackage.a.n(it.next());
                        throw null;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
