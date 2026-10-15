.class public abstract Lr3/a;
.super Lr3/p0;
.source "SourceFile"

# interfaces
.implements Lc3/e;
.implements Lr3/o;


# instance fields
.field public final c:Lc3/k;


# direct methods
.method public constructor <init>(Lc3/k;Z)V
    .locals 0

    invoke-direct {p0, p2}, Lr3/p0;-><init>(Z)V

    sget-object p2, Lr3/l;->c:Lr3/l;

    invoke-interface {p1, p2}, Lc3/k;->e(Lc3/j;)Lc3/i;

    move-result-object p2

    check-cast p2, Lr3/i0;

    invoke-virtual {p0, p2}, Lr3/p0;->v(Lr3/i0;)V

    invoke-interface {p1, p0}, Lc3/k;->x(Lc3/k;)Lc3/k;

    move-result-object p1

    iput-object p1, p0, Lr3/a;->c:Lc3/k;

    return-void
.end method


# virtual methods
.method public final C(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, Lr3/f;

    if-eqz v0, :cond_0

    check-cast p1, Lr3/f;

    iget-object p1, p1, Lr3/f;->a:Ljava/lang/Throwable;

    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 1

    invoke-super {p0}, Lr3/p0;->a()Z

    move-result v0

    return v0
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    invoke-static {p1}, Lz2/c;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lr3/f;

    invoke-direct {p1, v0}, Lr3/f;-><init>(Ljava/lang/Throwable;)V

    :goto_0
    invoke-virtual {p0, p1}, Lr3/p0;->y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr3/q;->c:Lg1/e;

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lr3/a;->i(Ljava/lang/Object;)V

    return-void
.end method

.method public final g()Lc3/k;
    .locals 1

    iget-object v0, p0, Lr3/a;->c:Lc3/k;

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, " was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Landroidx/fragment/app/p;)V
    .locals 1

    iget-object v0, p0, Lr3/a;->c:Lc3/k;

    invoke-static {v0, p1}, Lc3/h;->g1(Lc3/k;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lr3/p0;->z()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
