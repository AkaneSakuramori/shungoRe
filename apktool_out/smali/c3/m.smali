.class public final Lc3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc3/e;
.implements Le3/d;


# static fields
.field public static final c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public final b:Lc3/e;

.field private volatile result:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "result"

    const-class v2, Lc3/m;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lc3/m;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lc3/e;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ld3/a;->c:Ld3/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc3/m;->b:Lc3/e;

    iput-object v0, p0, Lc3/m;->result:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lc3/m;->result:Ljava/lang/Object;

    sget-object v1, Ld3/a;->c:Ld3/a;

    if-ne v0, v1, :cond_2

    sget-object v2, Lc3/m;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    sget-object v3, Ld3/a;->b:Ld3/a;

    :cond_0
    invoke-virtual {v2, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ld3/a;->b:Ld3/a;

    return-object v0

    :cond_1
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lc3/m;->result:Ljava/lang/Object;

    :cond_2
    sget-object v1, Ld3/a;->d:Ld3/a;

    if-ne v0, v1, :cond_3

    sget-object v0, Ld3/a;->b:Ld3/a;

    goto :goto_0

    :cond_3
    instance-of v1, v0, Lz2/b;

    if-nez v1, :cond_4

    :goto_0
    return-object v0

    :cond_4
    check-cast v0, Lz2/b;

    iget-object v0, v0, Lz2/b;->b:Ljava/lang/Throwable;

    throw v0
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 4

    :goto_0
    iget-object v0, p0, Lc3/m;->result:Ljava/lang/Object;

    sget-object v1, Ld3/a;->c:Ld3/a;

    if-ne v0, v1, :cond_2

    sget-object v2, Lc3/m;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    invoke-virtual {v2, p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_2
    sget-object v1, Ld3/a;->b:Ld3/a;

    if-ne v0, v1, :cond_5

    sget-object v0, Lc3/m;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    sget-object v2, Ld3/a;->d:Ld3/a;

    :cond_3
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v0, p0, Lc3/m;->b:Lc3/e;

    invoke-interface {v0, p1}, Lc3/e;->b(Ljava/lang/Object;)V

    return-void

    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_3

    goto :goto_0

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()Le3/d;
    .locals 2

    iget-object v0, p0, Lc3/m;->b:Lc3/e;

    instance-of v1, v0, Le3/d;

    if-eqz v1, :cond_0

    check-cast v0, Le3/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final g()Lc3/k;
    .locals 1

    iget-object v0, p0, Lc3/m;->b:Lc3/e;

    invoke-interface {v0}, Lc3/e;->g()Lc3/k;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SafeContinuation for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lc3/m;->b:Lc3/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
