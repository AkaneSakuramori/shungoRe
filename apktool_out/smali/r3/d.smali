.class public final Lr3/d;
.super Lr3/k0;
.source "SourceFile"

# interfaces
.implements Lr3/c;


# instance fields
.field public final f:Lr3/e;


# direct methods
.method public constructor <init>(Lr3/a;)V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/internal/f;-><init>()V

    iput-object p1, p0, Lr3/d;->f:Lr3/e;

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Throwable;)Z
    .locals 2

    iget-object v0, p0, Lr3/l0;->e:Lr3/p0;

    if-eqz v0, :cond_1

    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lr3/p0;->j(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1

    :cond_1
    const-string p1, "job"

    invoke-static {p1}, Lc3/h;->E2(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lr3/d;->m(Ljava/lang/Throwable;)V

    sget-object p1, Lz2/f;->a:Lz2/f;

    return-object p1
.end method

.method public final m(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lr3/l0;->e:Lr3/p0;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lr3/d;->f:Lr3/e;

    check-cast v0, Lr3/p0;

    invoke-virtual {v0, p1}, Lr3/p0;->j(Ljava/lang/Object;)Z

    return-void

    :cond_0
    const-string p1, "job"

    invoke-static {p1}, Lc3/h;->E2(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
