.class public Lkotlinx/coroutines/internal/o;
.super Lr3/a;
.source "SourceFile"

# interfaces
.implements Le3/d;


# instance fields
.field public final d:Lc3/e;


# direct methods
.method public constructor <init>(Lc3/e;Lc3/k;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, Lr3/a;-><init>(Lc3/k;Z)V

    iput-object p1, p0, Lkotlinx/coroutines/internal/o;->d:Lc3/e;

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lkotlinx/coroutines/internal/o;->d:Lc3/e;

    invoke-static {v0}, Lc3/h;->k1(Lc3/e;)Lc3/e;

    move-result-object v0

    invoke-static {p1}, Lc3/h;->f2(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lkotlinx/coroutines/internal/a;->d(Lc3/e;Ljava/lang/Object;Lj3/l;)V

    return-void
.end method

.method public final f()Le3/d;
    .locals 2

    iget-object v0, p0, Lkotlinx/coroutines/internal/o;->d:Lc3/e;

    instance-of v1, v0, Le3/d;

    if-eqz v1, :cond_0

    check-cast v0, Le3/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public i(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/internal/o;->d:Lc3/e;

    invoke-static {p1}, Lc3/h;->f2(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lc3/e;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final w()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
