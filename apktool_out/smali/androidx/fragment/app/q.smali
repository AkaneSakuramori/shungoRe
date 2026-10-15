.class public abstract Landroidx/fragment/app/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements Landroidx/lifecycle/r;
.implements Landroidx/lifecycle/r0;
.implements Landroidx/lifecycle/h;
.implements Lz0/g;


# static fields
.field public static final S:Ljava/lang/Object;


# instance fields
.field public A:Z

.field public B:Z

.field public final C:Z

.field public D:Z

.field public E:Landroid/view/ViewGroup;

.field public F:Landroid/view/View;

.field public G:Z

.field public H:Z

.field public I:Landroidx/fragment/app/o;

.field public J:Z

.field public K:F

.field public L:Z

.field public M:Landroidx/lifecycle/m;

.field public N:Landroidx/lifecycle/t;

.field public O:Landroidx/fragment/app/z0;

.field public final P:Landroidx/lifecycle/x;

.field public Q:Lz0/f;

.field public final R:Ljava/util/ArrayList;

.field public b:I

.field public c:Landroid/os/Bundle;

.field public d:Landroid/util/SparseArray;

.field public e:Landroid/os/Bundle;

.field public f:Ljava/lang/String;

.field public g:Landroid/os/Bundle;

.field public h:Landroidx/fragment/app/q;

.field public i:Ljava/lang/String;

.field public j:I

.field public k:Ljava/lang/Boolean;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:I

.field public s:Landroidx/fragment/app/i0;

.field public t:Landroidx/fragment/app/t;

.field public u:Landroidx/fragment/app/i0;

.field public v:Landroidx/fragment/app/q;

.field public w:I

.field public x:I

.field public y:Ljava/lang/String;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/fragment/app/q;->S:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/q;->b:I

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/q;->i:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/q;->k:Ljava/lang/Boolean;

    new-instance v0, Landroidx/fragment/app/i0;

    invoke-direct {v0}, Landroidx/fragment/app/i0;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/q;->C:Z

    iput-boolean v0, p0, Landroidx/fragment/app/q;->H:Z

    sget-object v0, Landroidx/lifecycle/m;->f:Landroidx/lifecycle/m;

    iput-object v0, p0, Landroidx/fragment/app/q;->M:Landroidx/lifecycle/m;

    new-instance v0, Landroidx/lifecycle/x;

    invoke-direct {v0}, Landroidx/lifecycle/x;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/q;->P:Landroidx/lifecycle/x;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/q;->R:Ljava/util/ArrayList;

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/fragment/app/q;->N:Landroidx/lifecycle/t;

    invoke-static {p0}, Lz0/c;->b(Lz0/g;)Lz0/f;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/q;->Q:Lz0/f;

    return-void
.end method


# virtual methods
.method public A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 1

    iget-object p3, p0, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    invoke-virtual {p3}, Landroidx/fragment/app/i0;->J()V

    const/4 p3, 0x1

    iput-boolean p3, p0, Landroidx/fragment/app/q;->q:Z

    new-instance p3, Landroidx/fragment/app/z0;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->h()Landroidx/lifecycle/q0;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/fragment/app/z0;-><init>(Landroidx/lifecycle/q0;)V

    iput-object p3, p0, Landroidx/fragment/app/q;->O:Landroidx/fragment/app/z0;

    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/q;->r(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/q;->F:Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/q;->O:Landroidx/fragment/app/z0;

    invoke-virtual {p1}, Landroidx/fragment/app/z0;->c()V

    iget-object p1, p0, Landroidx/fragment/app/q;->F:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/q;->O:Landroidx/fragment/app/z0;

    const-string p3, "<this>"

    invoke-static {p1, p3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0801ef

    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Landroidx/fragment/app/q;->F:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/q;->O:Landroidx/fragment/app/z0;

    invoke-static {p1, p3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0801f2

    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Landroidx/fragment/app/q;->F:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/q;->O:Landroidx/fragment/app/z0;

    invoke-static {p1, p3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0801f1

    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Landroidx/fragment/app/q;->P:Landroidx/lifecycle/x;

    iget-object p2, p0, Landroidx/fragment/app/q;->O:Landroidx/fragment/app/z0;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->e(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/q;->O:Landroidx/fragment/app/z0;

    iget-object p1, p1, Landroidx/fragment/app/z0;->c:Landroidx/lifecycle/t;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/fragment/app/q;->O:Landroidx/fragment/app/z0;

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called getViewLifecycleOwner() but onCreateView() returned null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final B()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/i0;->s(I)V

    iget-object v0, p0, Landroidx/fragment/app/q;->F:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/q;->O:Landroidx/fragment/app/z0;

    invoke-virtual {v0}, Landroidx/fragment/app/z0;->c()V

    iget-object v0, v0, Landroidx/fragment/app/z0;->c:Landroidx/lifecycle/t;

    iget-object v0, v0, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    sget-object v2, Landroidx/lifecycle/m;->d:Landroidx/lifecycle/m;

    invoke-virtual {v0, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/q;->O:Landroidx/fragment/app/z0;

    sget-object v2, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    invoke-virtual {v0, v2}, Landroidx/fragment/app/z0;->b(Landroidx/lifecycle/l;)V

    :cond_0
    iput v1, p0, Landroidx/fragment/app/q;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/q;->D:Z

    invoke-virtual {p0}, Landroidx/fragment/app/q;->s()V

    iget-boolean v1, p0, Landroidx/fragment/app/q;->D:Z

    if-eqz v1, :cond_2

    new-instance v1, Lv0/b;

    invoke-interface {p0}, Landroidx/lifecycle/r0;->h()Landroidx/lifecycle/q0;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lv0/b;-><init>(Landroidx/lifecycle/r;Landroidx/lifecycle/q0;)V

    iget-object v1, v1, Lv0/b;->k:Lv0/a;

    iget-object v1, v1, Lv0/a;->c:Ln/l;

    iget v2, v1, Ln/l;->d:I

    if-gtz v2, :cond_1

    iput-boolean v0, p0, Landroidx/fragment/app/q;->q:Z

    return-void

    :cond_1
    iget-object v1, v1, Ln/l;->c:[Ljava/lang/Object;

    aget-object v0, v1, v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    :cond_2
    new-instance v0, Landroidx/fragment/app/e1;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDestroyView()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final C()Landroid/content/Context;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/q;->g()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not attached to a context."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final D()Landroid/view/View;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/q;->F:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not return a View from onCreateView() or this was called before onCreateView()."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final E(IIII)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/q;->d()Landroidx/fragment/app/o;

    move-result-object v0

    iput p1, v0, Landroidx/fragment/app/o;->d:I

    invoke-virtual {p0}, Landroidx/fragment/app/q;->d()Landroidx/fragment/app/o;

    move-result-object p1

    iput p2, p1, Landroidx/fragment/app/o;->e:I

    invoke-virtual {p0}, Landroidx/fragment/app/q;->d()Landroidx/fragment/app/o;

    move-result-object p1

    iput p3, p1, Landroidx/fragment/app/o;->f:I

    invoke-virtual {p0}, Landroidx/fragment/app/q;->d()Landroidx/fragment/app/o;

    move-result-object p1

    iput p4, p1, Landroidx/fragment/app/o;->g:I

    return-void
.end method

.method public final F(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    if-eqz v0, :cond_1

    iget-boolean v1, v0, Landroidx/fragment/app/i0;->A:Z

    if-nez v1, :cond_0

    iget-boolean v0, v0, Landroidx/fragment/app/i0;->B:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment already added and state has been saved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Landroidx/fragment/app/q;->g:Landroid/os/Bundle;

    return-void
.end method

.method public b()Lc3/h;
    .locals 1

    new-instance v0, Landroidx/fragment/app/n;

    invoke-direct {v0, p0}, Landroidx/fragment/app/n;-><init>(Landroidx/fragment/app/q;)V

    return-object v0
.end method

.method public final c(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/q;->w:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mContainerId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/q;->x:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mTag="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/q;->y:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/q;->b:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mWho="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBackStackNesting="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/q;->r:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAdded="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/q;->l:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mRemoving="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/q;->m:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mFromLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/q;->n:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mInLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/q;->o:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHidden="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/q;->z:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mDetached="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/q;->A:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mMenuVisible="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/q;->C:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mHasMenu="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mRetainInstance="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/q;->B:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mUserVisibleHint="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/q;->H:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v1, p0, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    if-eqz v1, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mFragmentManager="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/q;->t:Landroidx/fragment/app/t;

    if-eqz v1, :cond_1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mHost="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/q;->t:Landroidx/fragment/app/t;

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_1
    iget-object v1, p0, Landroidx/fragment/app/q;->v:Landroidx/fragment/app/q;

    if-eqz v1, :cond_2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mParentFragment="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/q;->v:Landroidx/fragment/app/q;

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_2
    iget-object v1, p0, Landroidx/fragment/app/q;->g:Landroid/os/Bundle;

    if-eqz v1, :cond_3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mArguments="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/q;->g:Landroid/os/Bundle;

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_3
    iget-object v1, p0, Landroidx/fragment/app/q;->c:Landroid/os/Bundle;

    if-eqz v1, :cond_4

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mSavedFragmentState="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/q;->c:Landroid/os/Bundle;

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_4
    iget-object v1, p0, Landroidx/fragment/app/q;->d:Landroid/util/SparseArray;

    if-eqz v1, :cond_5

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mSavedViewState="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/q;->d:Landroid/util/SparseArray;

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_5
    iget-object v1, p0, Landroidx/fragment/app/q;->e:Landroid/os/Bundle;

    if-eqz v1, :cond_6

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mSavedViewRegistryState="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/q;->e:Landroid/os/Bundle;

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_6
    iget-object v1, p0, Landroidx/fragment/app/q;->h:Landroidx/fragment/app/q;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    goto :goto_0

    :cond_7
    iget-object v1, p0, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    if-eqz v1, :cond_8

    iget-object v3, p0, Landroidx/fragment/app/q;->i:Ljava/lang/String;

    if-eqz v3, :cond_8

    iget-object v1, v1, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v1, v3}, Landroidx/fragment/app/o0;->b(Ljava/lang/String;)Landroidx/fragment/app/q;

    move-result-object v1

    goto :goto_0

    :cond_8
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_9

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "mTarget="

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v1, " mTargetRequestCode="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v1, p0, Landroidx/fragment/app/q;->j:I

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(I)V

    :cond_9
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mPopDirection="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez v1, :cond_a

    move v1, v0

    goto :goto_1

    :cond_a
    iget-boolean v1, v1, Landroidx/fragment/app/o;->c:Z

    :goto_1
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v1, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez v1, :cond_b

    goto :goto_3

    :cond_b
    iget v1, v1, Landroidx/fragment/app/o;->d:I

    if-eqz v1, :cond_d

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "getEnterAnim="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez v1, :cond_c

    move v1, v0

    goto :goto_2

    :cond_c
    iget v1, v1, Landroidx/fragment/app/o;->d:I

    :goto_2
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(I)V

    :cond_d
    :goto_3
    iget-object v1, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez v1, :cond_e

    goto :goto_5

    :cond_e
    iget v1, v1, Landroidx/fragment/app/o;->e:I

    if-eqz v1, :cond_10

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "getExitAnim="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez v1, :cond_f

    move v1, v0

    goto :goto_4

    :cond_f
    iget v1, v1, Landroidx/fragment/app/o;->e:I

    :goto_4
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(I)V

    :cond_10
    :goto_5
    iget-object v1, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez v1, :cond_11

    goto :goto_7

    :cond_11
    iget v1, v1, Landroidx/fragment/app/o;->f:I

    if-eqz v1, :cond_13

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "getPopEnterAnim="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez v1, :cond_12

    move v1, v0

    goto :goto_6

    :cond_12
    iget v1, v1, Landroidx/fragment/app/o;->f:I

    :goto_6
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(I)V

    :cond_13
    :goto_7
    iget-object v1, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez v1, :cond_14

    goto :goto_9

    :cond_14
    iget v1, v1, Landroidx/fragment/app/o;->g:I

    if-eqz v1, :cond_16

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "getPopExitAnim="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez v1, :cond_15

    goto :goto_8

    :cond_15
    iget v0, v1, Landroidx/fragment/app/o;->g:I

    :goto_8
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_16
    :goto_9
    iget-object v0, p0, Landroidx/fragment/app/q;->E:Landroid/view/ViewGroup;

    if-eqz v0, :cond_17

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/q;->E:Landroid/view/ViewGroup;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_17
    iget-object v0, p0, Landroidx/fragment/app/q;->F:Landroid/view/View;

    if-eqz v0, :cond_18

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_18
    iget-object v0, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez v0, :cond_19

    move-object v0, v2

    goto :goto_a

    :cond_19
    iget-object v0, v0, Landroidx/fragment/app/o;->a:Landroid/view/View;

    :goto_a
    if-eqz v0, :cond_1b

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAnimatingAway="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez v0, :cond_1a

    goto :goto_b

    :cond_1a
    iget-object v2, v0, Landroidx/fragment/app/o;->a:Landroid/view/View;

    :goto_b
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_1b
    invoke-virtual {p0}, Landroidx/fragment/app/q;->g()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1c

    new-instance v0, Lv0/b;

    invoke-interface {p0}, Landroidx/lifecycle/r0;->h()Landroidx/lifecycle/q0;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lv0/b;-><init>(Landroidx/lifecycle/r;Landroidx/lifecycle/q0;)V

    invoke-virtual {v0, p1, p3}, Lv0/b;->Q2(Ljava/lang/String;Ljava/io/PrintWriter;)V

    :cond_1c
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Child "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    const-string v1, "  "

    invoke-static {p1, v1}, La;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/i0;->u(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public final d()Landroidx/fragment/app/o;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/fragment/app/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Landroidx/fragment/app/q;->S:Ljava/lang/Object;

    iput-object v1, v0, Landroidx/fragment/app/o;->k:Ljava/lang/Object;

    iput-object v1, v0, Landroidx/fragment/app/o;->l:Ljava/lang/Object;

    iput-object v1, v0, Landroidx/fragment/app/o;->m:Ljava/lang/Object;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Landroidx/fragment/app/o;->n:F

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/fragment/app/o;->o:Landroid/view/View;

    iput-object v0, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    return-object v0
.end method

.method public final e()Lz0/e;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q;->Q:Lz0/f;

    iget-object v0, v0, Lz0/f;->b:Lz0/e;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()Landroidx/fragment/app/i0;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/q;->t:Landroidx/fragment/app/t;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has not been attached yet."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q;->t:Landroidx/fragment/app/t;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/t;->k:Landroid/content/Context;

    :goto_0
    return-object v0
.end method

.method public final h()Landroidx/lifecycle/q0;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    iget-object v0, v0, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    iget-object v0, v0, Landroidx/fragment/app/k0;->e:Ljava/util/HashMap;

    iget-object v1, p0, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/q0;

    if-nez v1, :cond_0

    new-instance v1, Landroidx/lifecycle/q0;

    invoke-direct {v1}, Landroidx/lifecycle/q0;-><init>()V

    iget-object v2, p0, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()I
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/q;->M:Landroidx/lifecycle/m;

    sget-object v1, Landroidx/lifecycle/m;->c:Landroidx/lifecycle/m;

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/q;->v:Landroidx/fragment/app/q;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/q;->v:Landroidx/fragment/app/q;

    invoke-virtual {v1}, Landroidx/fragment/app/q;->i()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public final j()Landroidx/fragment/app/i0;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not associated with a fragment manager."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/o;->l:Ljava/lang/Object;

    sget-object v2, Landroidx/fragment/app/q;->S:Ljava/lang/Object;

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    return-object v1
.end method

.method public final l()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/o;->k:Ljava/lang/Object;

    sget-object v2, Landroidx/fragment/app/q;->S:Ljava/lang/Object;

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    return-object v1
.end method

.method public final m()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/o;->m:Ljava/lang/Object;

    sget-object v2, Landroidx/fragment/app/q;->S:Ljava/lang/Object;

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    return-object v1
.end method

.method public final n()Z
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/q;->v:Landroidx/fragment/app/q;

    if-eqz v0, :cond_1

    iget-boolean v1, v0, Landroidx/fragment/app/q;->m:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final o(IILandroid/content/Intent;)V
    .locals 3

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " received the following in onActivityResult(): requestCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " resultCode: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " data: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/q;->D:Z

    return-void
.end method

.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q;->t:Landroidx/fragment/app/t;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/t;->j:Landroid/app/Activity;

    check-cast v0, Landroidx/fragment/app/u;

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Fragment "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " not attached to an activity."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onLowMemory()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/q;->D:Z

    return-void
.end method

.method public p(Landroid/content/Context;)V
    .locals 1

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/q;->D:Z

    iget-object v0, p0, Landroidx/fragment/app/q;->t:Landroidx/fragment/app/t;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/t;->j:Landroid/app/Activity;

    :goto_0
    if-eqz v0, :cond_1

    iput-boolean p1, p0, Landroidx/fragment/app/q;->D:Z

    :cond_1
    return-void
.end method

.method public q(Landroid/os/Bundle;)V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/q;->D:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const-string v2, "android:support:fragments"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    invoke-virtual {v2, p1}, Landroidx/fragment/app/i0;->O(Landroid/os/Parcelable;)V

    iget-object p1, p0, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    iput-boolean v1, p1, Landroidx/fragment/app/i0;->A:Z

    iput-boolean v1, p1, Landroidx/fragment/app/i0;->B:Z

    iget-object v2, p1, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    iput-boolean v1, v2, Landroidx/fragment/app/k0;->h:Z

    invoke-virtual {p1, v0}, Landroidx/fragment/app/i0;->s(I)V

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    iget v2, p1, Landroidx/fragment/app/i0;->o:I

    if-lt v2, v0, :cond_1

    goto :goto_0

    :cond_1
    iput-boolean v1, p1, Landroidx/fragment/app/i0;->A:Z

    iput-boolean v1, p1, Landroidx/fragment/app/i0;->B:Z

    iget-object v2, p1, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    iput-boolean v1, v2, Landroidx/fragment/app/k0;->h:Z

    invoke-virtual {p1, v0}, Landroidx/fragment/app/i0;->s(I)V

    :goto_0
    return-void
.end method

.method public r(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public s()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/q;->D:Z

    return-void
.end method

.method public final t()Landroidx/lifecycle/t;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/q;->N:Landroidx/lifecycle/t;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/q;->w:I

    if-eqz v1, :cond_0

    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/q;->w:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/q;->y:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/q;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/q;->D:Z

    return-void
.end method

.method public v(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 1

    iget-object p1, p0, Landroidx/fragment/app/q;->t:Landroidx/fragment/app/t;

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroidx/fragment/app/t;->n:Landroidx/fragment/app/u;

    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    iget-object v0, v0, Landroidx/fragment/app/i0;->f:Landroidx/fragment/app/a0;

    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract w(Landroid/os/Bundle;)V
.end method

.method public x()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/q;->D:Z

    return-void
.end method

.method public y()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/q;->D:Z

    return-void
.end method

.method public z(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/q;->D:Z

    return-void
.end method
