.class public abstract Lkotlinx/coroutines/scheduling/g;
.super Lr3/d0;
.source "SourceFile"


# instance fields
.field public final d:Lkotlinx/coroutines/scheduling/b;


# direct methods
.method public constructor <init>(IIJ)V
    .locals 7

    const-string v5, "DefaultDispatcher"

    invoke-direct {p0}, Lr3/k;-><init>()V

    new-instance v6, Lkotlinx/coroutines/scheduling/b;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move-wide v3, p3

    invoke-direct/range {v0 .. v5}, Lkotlinx/coroutines/scheduling/b;-><init>(IIJLjava/lang/String;)V

    iput-object v6, p0, Lkotlinx/coroutines/scheduling/g;->d:Lkotlinx/coroutines/scheduling/b;

    return-void
.end method


# virtual methods
.method public final z(Lc3/k;Ljava/lang/Runnable;)V
    .locals 2

    iget-object p1, p0, Lkotlinx/coroutines/scheduling/g;->d:Lkotlinx/coroutines/scheduling/b;

    sget-object v0, Lkotlinx/coroutines/scheduling/b;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    sget-object v0, Lkotlinx/coroutines/scheduling/j;->f:Lf2/e;

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Lkotlinx/coroutines/scheduling/b;->e(Ljava/lang/Runnable;Lf2/e;Z)V

    return-void
.end method
